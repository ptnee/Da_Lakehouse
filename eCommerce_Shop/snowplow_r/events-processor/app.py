from confluent_kafka import Producer, Consumer, KafkaError
import snowplow_analytics_sdk.event_transformer
import snowplow_analytics_sdk.snowplow_event_transformation_exception
import json
from datetime import datetime
print("neeeeee")



kafka_consumer = Consumer({
    'bootstrap.servers': 'kafkabroker:9092',
    'group.id': 'python-consumer',
    'auto.offset.reset': 'earliest',  # "smallest" được thay bằng "earliest"
    'security.protocol': 'PLAINTEXT'  # Phù hợp với broker
})

# Đăng ký topic
kafka_consumer.subscribe(['snowplow_enriched_good'])

# Kafka Producer configuration
kafka_producer = Producer({
    'bootstrap.servers': 'kafkabroker:9092',
    'security.protocol': 'PLAINTEXT'  # Phù hợp với broker
})

print("Kafka consumer and producer are configured successfully.")

# kafka_consumer = Consumer({
#     'bootstrap.servers': "kafkabroker:9092",
#     'group.id': 'python-consumer',
#     'default.topic.config': {
#         'auto.offset.reset': 'smallest'
#     },
#     'security.protocol': 'PLAINTEXT'
#  })
# print("neeeeee")
# kafka_producer = Producer({
#     'bootstrap.servers': "kafkabroker:9092",
#  })

# kafka_consumer.subscribe(['snowplow_enriched_good'])

# print("neeeeee")

while True:
    msg = kafka_consumer.poll(1.0)

    if msg is None:
        continue
    if msg.error():
        if msg.error().code() == KafkaError._PARTITION_EOF: continue
        else:
            print(msg.error())
            break

    event = msg.value().decode('utf-8')

    try:
        json_data = snowplow_analytics_sdk.event_transformer.transform(event)
        json_data['etl_tstamp'] = (datetime.fromisoformat(json_data['etl_tstamp'].replace("Z", "+00:00"))).strftime('%Y-%m-%d %H:%M:%S')
        json_data['ts'] = (datetime.fromisoformat(json_data['dvce_created_tstamp'].replace("Z", "+00:00"))).strftime('%Y-%m-%d %H:%M:%S')
        json_data['etl_date'] = (datetime.fromisoformat(json_data['dvce_created_tstamp'].replace("Z", "+00:00"))).strftime('%Y/%m/%d')
        del json_data['dvce_created_tstamp']
        del json_data['contexts_com_snowplowanalytics_snowplow_web_page_1']
        json_data['collector_tstamp'] = (datetime.fromisoformat(json_data['collector_tstamp'].replace("Z", "+00:00"))).strftime('%Y-%m-%d %H:%M:%S')
        json_data['dvce_sent_tstamp'] = (datetime.fromisoformat(json_data['dvce_sent_tstamp'].replace("Z", "+00:00"))).strftime('%Y-%m-%d %H:%M:%S')
        json_data['derived_tstamp'] = (datetime.fromisoformat(json_data['derived_tstamp'].replace("Z", "+00:00"))).strftime('%Y-%m-%d %H:%M:%S')
        if 'page_referrer' not in json_data:
            json_data['page_referrer'] = "test"
        if 'refr_urlscheme' not in json_data:
            json_data['refr_urlscheme'] = "test"
        if 'refr_urlhost' not in json_data:
            json_data['refr_urlhost'] = "test"
        if 'refr_urlport' not in json_data:
            json_data['refr_urlport'] = 1
        if 'refr_urlpath' not in json_data:
            json_data['refr_urlpath'] = "test"
        kafka_producer.poll(0)
        kafka_producer.produce('snowplow_json_event', json.dumps(json_data, default=str).encode('utf-8'))
        kafka_producer.flush()
        print(json_data)

    except snowplow_analytics_sdk.snowplow_event_transformation_exception.SnowplowEventTransformationException as e:
        for error_message in e.error_messages:
            print("error: " + error_message)