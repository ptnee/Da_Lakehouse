FROM openjdk:8-jre-alpine

ENV SCALA_COLLECTOR=20170708 \
BUILD_PACKAGES='ca-certificates gettext' \
COLLECTOR_VERSION="0.9.0"
# These need a separation to be able to use COLLECTOR_VERSION
ENV ARTIFACT="snowplow-stream-collector-${COLLECTOR_VERSION}" \
ARCHIVE="snowplow_scala_stream_collector_${COLLECTOR_VERSION}.zip"

WORKDIR /usr/local/scalacollector

RUN apk update && apk upgrade \
  && apk add --update $BUILD_PACKAGES \
  && rm -rf /var/cache/apk/* \
  && wget -q http://dl.bintray.com/snowplow/snowplow-generic/${ARCHIVE} \
  && unzip ${ARCHIVE} \
  && rm ${ARCHIVE} \
  && mv ${ARTIFACT} scala-stream-collector

COPY assets /assets

EXPOSE 80

CMD ["/assets/start.sh" ]

# https://docs.snowplow.io/docs/pipeline-components-and-applications/stream-collector/setup/
# https://github.com/WebHostingCoopTeam/snowplow-scala-collector
# https://github.com/wirelessr/snowplow-pipeline