// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample.proto

package org.apache.hudi.utilities.test.proto;

public interface SampleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:test.Sample)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * primitive types
   * </pre>
   *
   * <code>double primitive_double = 1;</code>
   * @return The primitiveDouble.
   */
  double getPrimitiveDouble();

  /**
   * <code>float primitive_float = 2;</code>
   * @return The primitiveFloat.
   */
  float getPrimitiveFloat();

  /**
   * <code>int32 primitive_int = 3;</code>
   * @return The primitiveInt.
   */
  int getPrimitiveInt();

  /**
   * <code>int64 primitive_long = 4;</code>
   * @return The primitiveLong.
   */
  long getPrimitiveLong();

  /**
   * <code>uint32 primitive_unsigned_int = 5;</code>
   * @return The primitiveUnsignedInt.
   */
  int getPrimitiveUnsignedInt();

  /**
   * <code>uint64 primitive_unsigned_long = 6;</code>
   * @return The primitiveUnsignedLong.
   */
  long getPrimitiveUnsignedLong();

  /**
   * <code>sint32 primitive_signed_int = 7;</code>
   * @return The primitiveSignedInt.
   */
  int getPrimitiveSignedInt();

  /**
   * <code>sint64 primitive_signed_long = 8;</code>
   * @return The primitiveSignedLong.
   */
  long getPrimitiveSignedLong();

  /**
   * <code>fixed32 primitive_fixed_int = 9;</code>
   * @return The primitiveFixedInt.
   */
  int getPrimitiveFixedInt();

  /**
   * <code>fixed64 primitive_fixed_long = 10;</code>
   * @return The primitiveFixedLong.
   */
  long getPrimitiveFixedLong();

  /**
   * <code>sfixed32 primitive_fixed_signed_int = 11;</code>
   * @return The primitiveFixedSignedInt.
   */
  int getPrimitiveFixedSignedInt();

  /**
   * <code>sfixed64 primitive_fixed_signed_long = 12;</code>
   * @return The primitiveFixedSignedLong.
   */
  long getPrimitiveFixedSignedLong();

  /**
   * <code>bool primitive_boolean = 13;</code>
   * @return The primitiveBoolean.
   */
  boolean getPrimitiveBoolean();

  /**
   * <code>string primitive_string = 14;</code>
   * @return The primitiveString.
   */
  java.lang.String getPrimitiveString();
  /**
   * <code>string primitive_string = 14;</code>
   * @return The bytes for primitiveString.
   */
  com.google.protobuf.ByteString
      getPrimitiveStringBytes();

  /**
   * <code>bytes primitive_bytes = 15;</code>
   * @return The primitiveBytes.
   */
  com.google.protobuf.ByteString getPrimitiveBytes();

  /**
   * <code>repeated int32 repeated_primitive = 16;</code>
   * @return A list containing the repeatedPrimitive.
   */
  java.util.List<java.lang.Integer> getRepeatedPrimitiveList();
  /**
   * <code>repeated int32 repeated_primitive = 16;</code>
   * @return The count of repeatedPrimitive.
   */
  int getRepeatedPrimitiveCount();
  /**
   * <code>repeated int32 repeated_primitive = 16;</code>
   * @param index The index of the element to return.
   * @return The repeatedPrimitive at the given index.
   */
  int getRepeatedPrimitive(int index);

  /**
   * <code>map&lt;string, int32&gt; map_primitive = 17;</code>
   */
  int getMapPrimitiveCount();
  /**
   * <code>map&lt;string, int32&gt; map_primitive = 17;</code>
   */
  boolean containsMapPrimitive(
      java.lang.String key);
  /**
   * Use {@link #getMapPrimitiveMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer>
  getMapPrimitive();
  /**
   * <code>map&lt;string, int32&gt; map_primitive = 17;</code>
   */
  java.util.Map<java.lang.String, java.lang.Integer>
  getMapPrimitiveMap();
  /**
   * <code>map&lt;string, int32&gt; map_primitive = 17;</code>
   */

  int getMapPrimitiveOrDefault(
      java.lang.String key,
      int defaultValue);
  /**
   * <code>map&lt;string, int32&gt; map_primitive = 17;</code>
   */

  int getMapPrimitiveOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * nested custom message
   * </pre>
   *
   * <code>.test.Nested nested_message = 18;</code>
   * @return Whether the nestedMessage field is set.
   */
  boolean hasNestedMessage();
  /**
   * <pre>
   * nested custom message
   * </pre>
   *
   * <code>.test.Nested nested_message = 18;</code>
   * @return The nestedMessage.
   */
  org.apache.hudi.utilities.test.proto.Nested getNestedMessage();
  /**
   * <pre>
   * nested custom message
   * </pre>
   *
   * <code>.test.Nested nested_message = 18;</code>
   */
  org.apache.hudi.utilities.test.proto.NestedOrBuilder getNestedMessageOrBuilder();

  /**
   * <code>repeated .test.Nested repeated_message = 19;</code>
   */
  java.util.List<org.apache.hudi.utilities.test.proto.Nested> 
      getRepeatedMessageList();
  /**
   * <code>repeated .test.Nested repeated_message = 19;</code>
   */
  org.apache.hudi.utilities.test.proto.Nested getRepeatedMessage(int index);
  /**
   * <code>repeated .test.Nested repeated_message = 19;</code>
   */
  int getRepeatedMessageCount();
  /**
   * <code>repeated .test.Nested repeated_message = 19;</code>
   */
  java.util.List<? extends org.apache.hudi.utilities.test.proto.NestedOrBuilder> 
      getRepeatedMessageOrBuilderList();
  /**
   * <code>repeated .test.Nested repeated_message = 19;</code>
   */
  org.apache.hudi.utilities.test.proto.NestedOrBuilder getRepeatedMessageOrBuilder(
      int index);

  /**
   * <code>map&lt;string, .test.Nested&gt; map_message = 20;</code>
   */
  int getMapMessageCount();
  /**
   * <code>map&lt;string, .test.Nested&gt; map_message = 20;</code>
   */
  boolean containsMapMessage(
      java.lang.String key);
  /**
   * Use {@link #getMapMessageMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.apache.hudi.utilities.test.proto.Nested>
  getMapMessage();
  /**
   * <code>map&lt;string, .test.Nested&gt; map_message = 20;</code>
   */
  java.util.Map<java.lang.String, org.apache.hudi.utilities.test.proto.Nested>
  getMapMessageMap();
  /**
   * <code>map&lt;string, .test.Nested&gt; map_message = 20;</code>
   */

  /* nullable */
org.apache.hudi.utilities.test.proto.Nested getMapMessageOrDefault(
      java.lang.String key,
      /* nullable */
org.apache.hudi.utilities.test.proto.Nested defaultValue);
  /**
   * <code>map&lt;string, .test.Nested&gt; map_message = 20;</code>
   */

  org.apache.hudi.utilities.test.proto.Nested getMapMessageOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * well known types
   * </pre>
   *
   * <code>.google.protobuf.StringValue wrapped_string = 21;</code>
   * @return Whether the wrappedString field is set.
   */
  boolean hasWrappedString();
  /**
   * <pre>
   * well known types
   * </pre>
   *
   * <code>.google.protobuf.StringValue wrapped_string = 21;</code>
   * @return The wrappedString.
   */
  com.google.protobuf.StringValue getWrappedString();
  /**
   * <pre>
   * well known types
   * </pre>
   *
   * <code>.google.protobuf.StringValue wrapped_string = 21;</code>
   */
  com.google.protobuf.StringValueOrBuilder getWrappedStringOrBuilder();

  /**
   * <code>.google.protobuf.Int32Value wrapped_int = 22;</code>
   * @return Whether the wrappedInt field is set.
   */
  boolean hasWrappedInt();
  /**
   * <code>.google.protobuf.Int32Value wrapped_int = 22;</code>
   * @return The wrappedInt.
   */
  com.google.protobuf.Int32Value getWrappedInt();
  /**
   * <code>.google.protobuf.Int32Value wrapped_int = 22;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getWrappedIntOrBuilder();

  /**
   * <code>.google.protobuf.Int64Value wrapped_long = 23;</code>
   * @return Whether the wrappedLong field is set.
   */
  boolean hasWrappedLong();
  /**
   * <code>.google.protobuf.Int64Value wrapped_long = 23;</code>
   * @return The wrappedLong.
   */
  com.google.protobuf.Int64Value getWrappedLong();
  /**
   * <code>.google.protobuf.Int64Value wrapped_long = 23;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getWrappedLongOrBuilder();

  /**
   * <code>.google.protobuf.UInt32Value wrapped_unsigned_int = 24;</code>
   * @return Whether the wrappedUnsignedInt field is set.
   */
  boolean hasWrappedUnsignedInt();
  /**
   * <code>.google.protobuf.UInt32Value wrapped_unsigned_int = 24;</code>
   * @return The wrappedUnsignedInt.
   */
  com.google.protobuf.UInt32Value getWrappedUnsignedInt();
  /**
   * <code>.google.protobuf.UInt32Value wrapped_unsigned_int = 24;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getWrappedUnsignedIntOrBuilder();

  /**
   * <code>.google.protobuf.UInt64Value wrapped_unsigned_long = 25;</code>
   * @return Whether the wrappedUnsignedLong field is set.
   */
  boolean hasWrappedUnsignedLong();
  /**
   * <code>.google.protobuf.UInt64Value wrapped_unsigned_long = 25;</code>
   * @return The wrappedUnsignedLong.
   */
  com.google.protobuf.UInt64Value getWrappedUnsignedLong();
  /**
   * <code>.google.protobuf.UInt64Value wrapped_unsigned_long = 25;</code>
   */
  com.google.protobuf.UInt64ValueOrBuilder getWrappedUnsignedLongOrBuilder();

  /**
   * <code>.google.protobuf.DoubleValue wrapped_double = 26;</code>
   * @return Whether the wrappedDouble field is set.
   */
  boolean hasWrappedDouble();
  /**
   * <code>.google.protobuf.DoubleValue wrapped_double = 26;</code>
   * @return The wrappedDouble.
   */
  com.google.protobuf.DoubleValue getWrappedDouble();
  /**
   * <code>.google.protobuf.DoubleValue wrapped_double = 26;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getWrappedDoubleOrBuilder();

  /**
   * <code>.google.protobuf.FloatValue wrapped_float = 27;</code>
   * @return Whether the wrappedFloat field is set.
   */
  boolean hasWrappedFloat();
  /**
   * <code>.google.protobuf.FloatValue wrapped_float = 27;</code>
   * @return The wrappedFloat.
   */
  com.google.protobuf.FloatValue getWrappedFloat();
  /**
   * <code>.google.protobuf.FloatValue wrapped_float = 27;</code>
   */
  com.google.protobuf.FloatValueOrBuilder getWrappedFloatOrBuilder();

  /**
   * <code>.google.protobuf.BoolValue wrapped_boolean = 28;</code>
   * @return Whether the wrappedBoolean field is set.
   */
  boolean hasWrappedBoolean();
  /**
   * <code>.google.protobuf.BoolValue wrapped_boolean = 28;</code>
   * @return The wrappedBoolean.
   */
  com.google.protobuf.BoolValue getWrappedBoolean();
  /**
   * <code>.google.protobuf.BoolValue wrapped_boolean = 28;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getWrappedBooleanOrBuilder();

  /**
   * <code>.google.protobuf.BytesValue wrapped_bytes = 29;</code>
   * @return Whether the wrappedBytes field is set.
   */
  boolean hasWrappedBytes();
  /**
   * <code>.google.protobuf.BytesValue wrapped_bytes = 29;</code>
   * @return The wrappedBytes.
   */
  com.google.protobuf.BytesValue getWrappedBytes();
  /**
   * <code>.google.protobuf.BytesValue wrapped_bytes = 29;</code>
   */
  com.google.protobuf.BytesValueOrBuilder getWrappedBytesOrBuilder();

  /**
   * <pre>
   * enum
   * </pre>
   *
   * <code>.test.SampleEnum enum = 30;</code>
   * @return The enum numeric value on the wire for enum.
   */
  int getEnumValue();
  /**
   * <pre>
   * enum
   * </pre>
   *
   * <code>.test.SampleEnum enum = 30;</code>
   * @return The enum.
   */
  org.apache.hudi.utilities.test.proto.SampleEnum getEnum();

  /**
   * <pre>
   * timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 31;</code>
   * @return Whether the timestamp field is set.
   */
  boolean hasTimestamp();
  /**
   * <pre>
   * timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 31;</code>
   * @return The timestamp.
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <pre>
   * timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 31;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();
}