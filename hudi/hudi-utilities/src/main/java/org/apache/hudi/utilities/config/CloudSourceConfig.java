/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.hudi.utilities.config;

import org.apache.hudi.common.config.ConfigClassProperty;
import org.apache.hudi.common.config.ConfigGroups;
import org.apache.hudi.common.config.ConfigProperty;
import org.apache.hudi.common.config.HoodieConfig;

import javax.annotation.concurrent.Immutable;

import static org.apache.hudi.common.util.ConfigUtils.DELTA_STREAMER_CONFIG_PREFIX;
import static org.apache.hudi.common.util.ConfigUtils.STREAMER_CONFIG_PREFIX;

/**
 * Cloud Source Configs
 */
@Immutable
@ConfigClassProperty(name = "Cloud Source Configs",
    groupName = ConfigGroups.Names.HUDI_STREAMER,
    subGroupName = ConfigGroups.SubGroupNames.DELTA_STREAMER_SOURCE,
    description = "Configs that are common during ingestion across different cloud stores")
public class CloudSourceConfig extends HoodieConfig {

  public static final ConfigProperty<Integer> BATCH_SIZE_CONF = ConfigProperty
      .key(STREAMER_CONFIG_PREFIX + "source.cloud.meta.batch.size")
      /*
       * Provide a reasonable setting to use for default batch size when fetching File Metadata as part of Cloud Ingestion.
       * If batch size is too big, two possible issues can happen:
       * i) Acknowledgement takes too long (given that Hudi needs to commit first).
       * ii) In the case of Google Cloud Pubsub:
       *   a) it will keep delivering the same message since it wasn't acknowledged in time.
       *   b) The size of the request that acknowledges outstanding messages may exceed the limit,
       *      which is 512KB as per Google's docs. See: https://cloud.google.com/pubsub/quotas#resource_limits
       */
      .defaultValue(10)
      .withAlternatives(DELTA_STREAMER_CONFIG_PREFIX + "source.cloud.meta.batch.size")
      .markAdvanced()
      .withDocumentation("Number of metadata messages to pull at a time");

  public static final ConfigProperty<Boolean> ACK_MESSAGES = ConfigProperty
      .key(STREAMER_CONFIG_PREFIX + "source.cloud.meta.ack")
      .defaultValue(true)
      .withAlternatives(DELTA_STREAMER_CONFIG_PREFIX + "source.cloud.meta.ack")
      .markAdvanced()
      .withDocumentation("Whether to acknowledge Metadata messages during Cloud Ingestion or not. This is useful during dev and testing.\n "
          + "In Prod this should always be true. In case of Cloud Pubsub, not acknowledging means Pubsub will keep redelivering the same messages.");

  public static final ConfigProperty<Boolean> ENABLE_EXISTS_CHECK = ConfigProperty
      .key(STREAMER_CONFIG_PREFIX + "source.cloud.data.check.file.exists")
      .defaultValue(false)
      .withAlternatives(DELTA_STREAMER_CONFIG_PREFIX + "source.cloud.data.check.file.exists")
      .markAdvanced()
      .withDocumentation("If true, checks whether file exists before attempting to pull it");

  public static final ConfigProperty<String> SELECT_RELATIVE_PATH_PREFIX = ConfigProperty
      .key(STREAMER_CONFIG_PREFIX + "source.cloud.data.select.relpath.prefix")
      .noDefaultValue()
      .withAlternatives(DELTA_STREAMER_CONFIG_PREFIX + "source.cloud.data.select.relpath.prefix")
      .markAdvanced()
      .withDocumentation("Only selects objects in the bucket whose relative path matches this prefix");

  public static final ConfigProperty<String> IGNORE_RELATIVE_PATH_PREFIX = ConfigProperty
      .key(STREAMER_CONFIG_PREFIX + "source.cloud.data.ignore.relpath.prefix")
      .noDefaultValue()
      .withAlternatives(DELTA_STREAMER_CONFIG_PREFIX + "source.cloud.data.ignore.relpath.prefix")
      .markAdvanced()
      .withDocumentation("Ignore objects in the bucket whose relative path matches this prefix");

  public static final ConfigProperty<String> IGNORE_RELATIVE_PATH_SUBSTR = ConfigProperty
      .key(STREAMER_CONFIG_PREFIX + "source.cloud.data.ignore.relpath.substring")
      .noDefaultValue()
      .withAlternatives(DELTA_STREAMER_CONFIG_PREFIX + "source.cloud.data.ignore.relpath.substring")
      .markAdvanced()
      .withDocumentation("Ignore objects in the bucket whose relative path contains this substring");

  public static final ConfigProperty<String> SPARK_DATASOURCE_OPTIONS = ConfigProperty
      .key(STREAMER_CONFIG_PREFIX + "source.cloud.data.datasource.options")
      .noDefaultValue()
      .withAlternatives(DELTA_STREAMER_CONFIG_PREFIX + "source.cloud.data.datasource.options")
      .markAdvanced()
      .withDocumentation("A JSON string passed to the Spark DataFrameReader while loading the dataset. "
          + "Example: hoodie.streamer.gcp.spark.datasource.options={\"header\":\"true\",\"encoding\":\"UTF-8\"}\n");

  public static final ConfigProperty<String> CLOUD_DATAFILE_EXTENSION = ConfigProperty
      .key(STREAMER_CONFIG_PREFIX + "source.cloud.data.select.file.extension")
      .noDefaultValue()
      .withAlternatives(DELTA_STREAMER_CONFIG_PREFIX + "source.cloud.data.select.file.extension")
      .markAdvanced()
      .withDocumentation("Only match files with this extension. By default, this is the same as hoodie.streamer.source.hoodieincr.file.format");

  public static final ConfigProperty<String> DATAFILE_FORMAT = ConfigProperty
      .key(STREAMER_CONFIG_PREFIX + "source.cloud.data.datafile.format")
      .defaultValue("parquet")
      .withAlternatives(DELTA_STREAMER_CONFIG_PREFIX + "source.cloud.data.datafile.format")
      .markAdvanced()
      .withDocumentation("Format of the data file. By default, this will be the same as hoodie.streamer.source.hoodieincr.file.format");

  public static final ConfigProperty<String> PATH_BASED_PARTITION_FIELDS = ConfigProperty
      .key(STREAMER_CONFIG_PREFIX + "source.cloud.data.partition.fields.from.path")
      .noDefaultValue()
      .withAlternatives(DELTA_STREAMER_CONFIG_PREFIX + "source.cloud.data.partition.fields.from.path")
      .markAdvanced()
      .sinceVersion("0.14.0")
      .withDocumentation("A comma delimited list of path-based partition fields in the source file structure.");

}
