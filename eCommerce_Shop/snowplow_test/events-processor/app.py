from confluent_kafka import Producer, Consumer, KafkaError
import snowplow_analytics_sdk.event_transformer
import snowplow_analytics_sdk.snowplow_event_transformation_exception
import json
from datetime import datetime

kafka_consumer = Consumer({
    'bootstrap.servers': "kafka:29092",
    'group.id': 'python-consumer',
    'default.topic.config': {
        'auto.offset.reset': 'smallest'
    }
 })

kafka_producer = Producer({
    'bootstrap.servers': "kafka:29092",
 })

kafka_consumer.subscribe(['snowplow_enriched_good'])

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
        # {'app_id': 'testApp', 
        # 'platform': 'web', 
        # 'etl_tstamp': '2024-07-25T06:49:10.878Z', 
        # 'collector_tstamp': '2024-07-25T06:49:09.097Z', 
        # 'dvce_created_tstamp': '2024-07-25T06:48:47.317Z', 
        # 'event': 'page_view', 
        # 'event_id': 'ec7e67b2-17d4-4c09-be3e-d8d08285ba8a', 
        # 'name_tracker': 'cf', 
        # 'v_tracker': 'js-2.18.2', 
        # 'v_collector': 'ssc-2.9.2-kafka', 
        # 'v_etl': 'snowplow-stream-enrich-3.8.0', 
        # 'user_ipaddress': '192.168.65.1', 
        # 'domain_userid': '08a6d4ae-1a0a-489c-b086-b0dbc206ddb6', 
        # 'domain_sessionidx': 1, 
        # 'network_userid': '0b72220b-db09-4be0-b76a-2af88ee49793', 
        # 'page_url': 'http://localhost/', 
        # 'page_title': 'Snowplow test', 
        # 'page_urlscheme': 'http', 
        # 'page_urlhost': 'localhost', 
        # 'page_urlport': 80, 
        # 'page_urlpath': '/', 
        # 'useragent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/15.4 Safari/605.1.15', 
        # 'br_lang': 'vi-VN', 
        # 'br_features_pdf': True, 
        # 'br_features_flash': False, 
        # 'br_features_java': False, 
        # 'br_features_director': False, 
        # 'br_features_quicktime': False, 
        # 'br_features_realplayer': False, 
        # 'br_features_windowsmedia': False, 
        # 'br_features_gears': False, 
        # 'br_features_silverlight': False, 
        # 'br_cookies': True, 
        # 'br_colordepth': '24', 
        # 'br_viewwidth': 1324, 
        # 'br_viewheight': 698, 
        # 'os_timezone': 'Asia/Jakarta', 
        # 'dvce_screenwidth': 1440, 
        # 'dvce_screenheight': 900, 
        # 'doc_charset': 'UTF-8', 
        # 'doc_width': 1324, 
        # 'doc_height': 698, 
        # 'dvce_sent_tstamp': '2024-07-25T06:48:57.324Z', 
        # 'domain_sessionid': '20f084fe-7b25-424d-a3fa-261be3017e8c', 
        # 'derived_tstamp': '2024-07-25T06:48:59.090Z', 
        # 'event_vendor': 'com.snowplowanalytics.snowplow', 
        # 'event_name': 'page_view', 
        # 'event_format': 'jsonschema', 
        # 'event_version': '1-0-0'}
        # (datetime.strptime(json_data['etl_tstamp'].replace("Z", ""), '%Y-%m-%dT%H:%M:%S.%f')).strftime('%d-%m-%Y %H:%M:%S')
        json_data['etl_tstamp'] = (datetime.fromisoformat(json_data['etl_tstamp'].replace("Z", "+00:00"))).strftime('%Y-%m-%d %H:%M:%S')
        json_data['ts'] = (datetime.fromisoformat(json_data['dvce_created_tstamp'].replace("Z", "+00:00"))).strftime('%Y-%m-%d %H:%M:%S')
        json_data['etl_date'] = (datetime.fromisoformat(json_data['dvce_created_tstamp'].replace("Z", "+00:00"))).strftime('%Y/%m/%d')
        del json_data['dvce_created_tstamp']
        json_data['collector_tstamp'] = (datetime.fromisoformat(json_data['collector_tstamp'].replace("Z", "+00:00"))).strftime('%Y-%m-%d %H:%M:%S')
        json_data['dvce_sent_tstamp'] = (datetime.fromisoformat(json_data['dvce_sent_tstamp'].replace("Z", "+00:00"))).strftime('%Y-%m-%d %H:%M:%S')
        json_data['derived_tstamp'] = (datetime.fromisoformat(json_data['derived_tstamp'].replace("Z", "+00:00"))).strftime('%Y-%m-%d %H:%M:%S')
        kafka_producer.poll(0)
        kafka_producer.produce('snowplow_json_event', json.dumps(json_data, default=str).encode('utf-8'))
        kafka_producer.flush()
        print(json_data)

    except snowplow_analytics_sdk.snowplow_event_transformation_exception.SnowplowEventTransformationException as e:
        for error_message in e.error_messages:
            print("error: " + error_message)