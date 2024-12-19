#!/bin/bash

# Run setup command
setup --config /snowplow/config/config.hocon

# Start the server
exec snowplow/iglu-server:0.10.1 --config /snowplow/config/config.hocon
