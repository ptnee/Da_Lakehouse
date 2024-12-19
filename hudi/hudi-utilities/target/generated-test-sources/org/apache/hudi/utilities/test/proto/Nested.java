// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample.proto

package org.apache.hudi.utilities.test.proto;

/**
 * Protobuf type {@code test.Nested}
 */
public final class Nested extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:test.Nested)
    NestedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Nested.newBuilder() to construct.
  private Nested(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Nested() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Nested();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.hudi.utilities.test.proto.SampleOuterClass.internal_static_test_Nested_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.hudi.utilities.test.proto.SampleOuterClass.internal_static_test_Nested_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.hudi.utilities.test.proto.Nested.class, org.apache.hudi.utilities.test.proto.Nested.Builder.class);
  }

  public static final int NESTED_INT_FIELD_NUMBER = 1;
  private int nestedInt_;
  /**
   * <code>int32 nested_int = 1;</code>
   * @return The nestedInt.
   */
  @java.lang.Override
  public int getNestedInt() {
    return nestedInt_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (nestedInt_ != 0) {
      output.writeInt32(1, nestedInt_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nestedInt_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, nestedInt_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.hudi.utilities.test.proto.Nested)) {
      return super.equals(obj);
    }
    org.apache.hudi.utilities.test.proto.Nested other = (org.apache.hudi.utilities.test.proto.Nested) obj;

    if (getNestedInt()
        != other.getNestedInt()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NESTED_INT_FIELD_NUMBER;
    hash = (53 * hash) + getNestedInt();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.hudi.utilities.test.proto.Nested parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.hudi.utilities.test.proto.Nested parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.hudi.utilities.test.proto.Nested parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.hudi.utilities.test.proto.Nested parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.hudi.utilities.test.proto.Nested parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.hudi.utilities.test.proto.Nested parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.hudi.utilities.test.proto.Nested parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.hudi.utilities.test.proto.Nested parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.hudi.utilities.test.proto.Nested parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.hudi.utilities.test.proto.Nested parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.hudi.utilities.test.proto.Nested parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.hudi.utilities.test.proto.Nested parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.apache.hudi.utilities.test.proto.Nested prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code test.Nested}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:test.Nested)
      org.apache.hudi.utilities.test.proto.NestedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hudi.utilities.test.proto.SampleOuterClass.internal_static_test_Nested_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hudi.utilities.test.proto.SampleOuterClass.internal_static_test_Nested_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hudi.utilities.test.proto.Nested.class, org.apache.hudi.utilities.test.proto.Nested.Builder.class);
    }

    // Construct using org.apache.hudi.utilities.test.proto.Nested.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      nestedInt_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.hudi.utilities.test.proto.SampleOuterClass.internal_static_test_Nested_descriptor;
    }

    @java.lang.Override
    public org.apache.hudi.utilities.test.proto.Nested getDefaultInstanceForType() {
      return org.apache.hudi.utilities.test.proto.Nested.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.hudi.utilities.test.proto.Nested build() {
      org.apache.hudi.utilities.test.proto.Nested result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.hudi.utilities.test.proto.Nested buildPartial() {
      org.apache.hudi.utilities.test.proto.Nested result = new org.apache.hudi.utilities.test.proto.Nested(this);
      result.nestedInt_ = nestedInt_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.apache.hudi.utilities.test.proto.Nested) {
        return mergeFrom((org.apache.hudi.utilities.test.proto.Nested)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.hudi.utilities.test.proto.Nested other) {
      if (other == org.apache.hudi.utilities.test.proto.Nested.getDefaultInstance()) return this;
      if (other.getNestedInt() != 0) {
        setNestedInt(other.getNestedInt());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              nestedInt_ = input.readInt32();

              break;
            } // case 8
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int nestedInt_ ;
    /**
     * <code>int32 nested_int = 1;</code>
     * @return The nestedInt.
     */
    @java.lang.Override
    public int getNestedInt() {
      return nestedInt_;
    }
    /**
     * <code>int32 nested_int = 1;</code>
     * @param value The nestedInt to set.
     * @return This builder for chaining.
     */
    public Builder setNestedInt(int value) {
      
      nestedInt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 nested_int = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNestedInt() {
      
      nestedInt_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:test.Nested)
  }

  // @@protoc_insertion_point(class_scope:test.Nested)
  private static final org.apache.hudi.utilities.test.proto.Nested DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.hudi.utilities.test.proto.Nested();
  }

  public static org.apache.hudi.utilities.test.proto.Nested getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Nested>
      PARSER = new com.google.protobuf.AbstractParser<Nested>() {
    @java.lang.Override
    public Nested parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Nested> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Nested> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.hudi.utilities.test.proto.Nested getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
