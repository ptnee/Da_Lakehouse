// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample.proto

package org.apache.hudi.utilities.test.proto;

/**
 * Protobuf type {@code test.WithOneOf}
 */
public final class WithOneOf extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:test.WithOneOf)
    WithOneOfOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WithOneOf.newBuilder() to construct.
  private WithOneOf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WithOneOf() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WithOneOf();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.hudi.utilities.test.proto.SampleOuterClass.internal_static_test_WithOneOf_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.hudi.utilities.test.proto.SampleOuterClass.internal_static_test_WithOneOf_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.hudi.utilities.test.proto.WithOneOf.class, org.apache.hudi.utilities.test.proto.WithOneOf.Builder.class);
  }

  private int someValueCase_ = 0;
  private java.lang.Object someValue_;
  public enum SomeValueCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    INT(1),
    LONG(2),
    MESSAGE(3),
    SOMEVALUE_NOT_SET(0);
    private final int value;
    private SomeValueCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SomeValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static SomeValueCase forNumber(int value) {
      switch (value) {
        case 1: return INT;
        case 2: return LONG;
        case 3: return MESSAGE;
        case 0: return SOMEVALUE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SomeValueCase
  getSomeValueCase() {
    return SomeValueCase.forNumber(
        someValueCase_);
  }

  public static final int INT_FIELD_NUMBER = 1;
  /**
   * <code>int32 int = 1;</code>
   * @return Whether the int field is set.
   */
  @java.lang.Override
  public boolean hasInt() {
    return someValueCase_ == 1;
  }
  /**
   * <code>int32 int = 1;</code>
   * @return The int.
   */
  @java.lang.Override
  public int getInt() {
    if (someValueCase_ == 1) {
      return (java.lang.Integer) someValue_;
    }
    return 0;
  }

  public static final int LONG_FIELD_NUMBER = 2;
  /**
   * <code>int64 long = 2;</code>
   * @return Whether the long field is set.
   */
  @java.lang.Override
  public boolean hasLong() {
    return someValueCase_ == 2;
  }
  /**
   * <code>int64 long = 2;</code>
   * @return The long.
   */
  @java.lang.Override
  public long getLong() {
    if (someValueCase_ == 2) {
      return (java.lang.Long) someValue_;
    }
    return 0L;
  }

  public static final int MESSAGE_FIELD_NUMBER = 3;
  /**
   * <code>.test.Nested message = 3;</code>
   * @return Whether the message field is set.
   */
  @java.lang.Override
  public boolean hasMessage() {
    return someValueCase_ == 3;
  }
  /**
   * <code>.test.Nested message = 3;</code>
   * @return The message.
   */
  @java.lang.Override
  public org.apache.hudi.utilities.test.proto.Nested getMessage() {
    if (someValueCase_ == 3) {
       return (org.apache.hudi.utilities.test.proto.Nested) someValue_;
    }
    return org.apache.hudi.utilities.test.proto.Nested.getDefaultInstance();
  }
  /**
   * <code>.test.Nested message = 3;</code>
   */
  @java.lang.Override
  public org.apache.hudi.utilities.test.proto.NestedOrBuilder getMessageOrBuilder() {
    if (someValueCase_ == 3) {
       return (org.apache.hudi.utilities.test.proto.Nested) someValue_;
    }
    return org.apache.hudi.utilities.test.proto.Nested.getDefaultInstance();
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
    if (someValueCase_ == 1) {
      output.writeInt32(
          1, (int)((java.lang.Integer) someValue_));
    }
    if (someValueCase_ == 2) {
      output.writeInt64(
          2, (long)((java.lang.Long) someValue_));
    }
    if (someValueCase_ == 3) {
      output.writeMessage(3, (org.apache.hudi.utilities.test.proto.Nested) someValue_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (someValueCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            1, (int)((java.lang.Integer) someValue_));
    }
    if (someValueCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(
            2, (long)((java.lang.Long) someValue_));
    }
    if (someValueCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (org.apache.hudi.utilities.test.proto.Nested) someValue_);
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
    if (!(obj instanceof org.apache.hudi.utilities.test.proto.WithOneOf)) {
      return super.equals(obj);
    }
    org.apache.hudi.utilities.test.proto.WithOneOf other = (org.apache.hudi.utilities.test.proto.WithOneOf) obj;

    if (!getSomeValueCase().equals(other.getSomeValueCase())) return false;
    switch (someValueCase_) {
      case 1:
        if (getInt()
            != other.getInt()) return false;
        break;
      case 2:
        if (getLong()
            != other.getLong()) return false;
        break;
      case 3:
        if (!getMessage()
            .equals(other.getMessage())) return false;
        break;
      case 0:
      default:
    }
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
    switch (someValueCase_) {
      case 1:
        hash = (37 * hash) + INT_FIELD_NUMBER;
        hash = (53 * hash) + getInt();
        break;
      case 2:
        hash = (37 * hash) + LONG_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getLong());
        break;
      case 3:
        hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMessage().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.hudi.utilities.test.proto.WithOneOf parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.hudi.utilities.test.proto.WithOneOf parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.hudi.utilities.test.proto.WithOneOf parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.hudi.utilities.test.proto.WithOneOf parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.hudi.utilities.test.proto.WithOneOf parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.hudi.utilities.test.proto.WithOneOf parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.hudi.utilities.test.proto.WithOneOf parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.hudi.utilities.test.proto.WithOneOf parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.hudi.utilities.test.proto.WithOneOf parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.hudi.utilities.test.proto.WithOneOf parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.hudi.utilities.test.proto.WithOneOf parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.hudi.utilities.test.proto.WithOneOf parseFrom(
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
  public static Builder newBuilder(org.apache.hudi.utilities.test.proto.WithOneOf prototype) {
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
   * Protobuf type {@code test.WithOneOf}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:test.WithOneOf)
      org.apache.hudi.utilities.test.proto.WithOneOfOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hudi.utilities.test.proto.SampleOuterClass.internal_static_test_WithOneOf_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hudi.utilities.test.proto.SampleOuterClass.internal_static_test_WithOneOf_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hudi.utilities.test.proto.WithOneOf.class, org.apache.hudi.utilities.test.proto.WithOneOf.Builder.class);
    }

    // Construct using org.apache.hudi.utilities.test.proto.WithOneOf.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (messageBuilder_ != null) {
        messageBuilder_.clear();
      }
      someValueCase_ = 0;
      someValue_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.hudi.utilities.test.proto.SampleOuterClass.internal_static_test_WithOneOf_descriptor;
    }

    @java.lang.Override
    public org.apache.hudi.utilities.test.proto.WithOneOf getDefaultInstanceForType() {
      return org.apache.hudi.utilities.test.proto.WithOneOf.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.hudi.utilities.test.proto.WithOneOf build() {
      org.apache.hudi.utilities.test.proto.WithOneOf result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.hudi.utilities.test.proto.WithOneOf buildPartial() {
      org.apache.hudi.utilities.test.proto.WithOneOf result = new org.apache.hudi.utilities.test.proto.WithOneOf(this);
      if (someValueCase_ == 1) {
        result.someValue_ = someValue_;
      }
      if (someValueCase_ == 2) {
        result.someValue_ = someValue_;
      }
      if (someValueCase_ == 3) {
        if (messageBuilder_ == null) {
          result.someValue_ = someValue_;
        } else {
          result.someValue_ = messageBuilder_.build();
        }
      }
      result.someValueCase_ = someValueCase_;
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
      if (other instanceof org.apache.hudi.utilities.test.proto.WithOneOf) {
        return mergeFrom((org.apache.hudi.utilities.test.proto.WithOneOf)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.hudi.utilities.test.proto.WithOneOf other) {
      if (other == org.apache.hudi.utilities.test.proto.WithOneOf.getDefaultInstance()) return this;
      switch (other.getSomeValueCase()) {
        case INT: {
          setInt(other.getInt());
          break;
        }
        case LONG: {
          setLong(other.getLong());
          break;
        }
        case MESSAGE: {
          mergeMessage(other.getMessage());
          break;
        }
        case SOMEVALUE_NOT_SET: {
          break;
        }
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
              someValue_ = input.readInt32();
              someValueCase_ = 1;
              break;
            } // case 8
            case 16: {
              someValue_ = input.readInt64();
              someValueCase_ = 2;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getMessageFieldBuilder().getBuilder(),
                  extensionRegistry);
              someValueCase_ = 3;
              break;
            } // case 26
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
    private int someValueCase_ = 0;
    private java.lang.Object someValue_;
    public SomeValueCase
        getSomeValueCase() {
      return SomeValueCase.forNumber(
          someValueCase_);
    }

    public Builder clearSomeValue() {
      someValueCase_ = 0;
      someValue_ = null;
      onChanged();
      return this;
    }


    /**
     * <code>int32 int = 1;</code>
     * @return Whether the int field is set.
     */
    public boolean hasInt() {
      return someValueCase_ == 1;
    }
    /**
     * <code>int32 int = 1;</code>
     * @return The int.
     */
    public int getInt() {
      if (someValueCase_ == 1) {
        return (java.lang.Integer) someValue_;
      }
      return 0;
    }
    /**
     * <code>int32 int = 1;</code>
     * @param value The int to set.
     * @return This builder for chaining.
     */
    public Builder setInt(int value) {
      someValueCase_ = 1;
      someValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 int = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearInt() {
      if (someValueCase_ == 1) {
        someValueCase_ = 0;
        someValue_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>int64 long = 2;</code>
     * @return Whether the long field is set.
     */
    public boolean hasLong() {
      return someValueCase_ == 2;
    }
    /**
     * <code>int64 long = 2;</code>
     * @return The long.
     */
    public long getLong() {
      if (someValueCase_ == 2) {
        return (java.lang.Long) someValue_;
      }
      return 0L;
    }
    /**
     * <code>int64 long = 2;</code>
     * @param value The long to set.
     * @return This builder for chaining.
     */
    public Builder setLong(long value) {
      someValueCase_ = 2;
      someValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 long = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLong() {
      if (someValueCase_ == 2) {
        someValueCase_ = 0;
        someValue_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.hudi.utilities.test.proto.Nested, org.apache.hudi.utilities.test.proto.Nested.Builder, org.apache.hudi.utilities.test.proto.NestedOrBuilder> messageBuilder_;
    /**
     * <code>.test.Nested message = 3;</code>
     * @return Whether the message field is set.
     */
    @java.lang.Override
    public boolean hasMessage() {
      return someValueCase_ == 3;
    }
    /**
     * <code>.test.Nested message = 3;</code>
     * @return The message.
     */
    @java.lang.Override
    public org.apache.hudi.utilities.test.proto.Nested getMessage() {
      if (messageBuilder_ == null) {
        if (someValueCase_ == 3) {
          return (org.apache.hudi.utilities.test.proto.Nested) someValue_;
        }
        return org.apache.hudi.utilities.test.proto.Nested.getDefaultInstance();
      } else {
        if (someValueCase_ == 3) {
          return messageBuilder_.getMessage();
        }
        return org.apache.hudi.utilities.test.proto.Nested.getDefaultInstance();
      }
    }
    /**
     * <code>.test.Nested message = 3;</code>
     */
    public Builder setMessage(org.apache.hudi.utilities.test.proto.Nested value) {
      if (messageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        someValue_ = value;
        onChanged();
      } else {
        messageBuilder_.setMessage(value);
      }
      someValueCase_ = 3;
      return this;
    }
    /**
     * <code>.test.Nested message = 3;</code>
     */
    public Builder setMessage(
        org.apache.hudi.utilities.test.proto.Nested.Builder builderForValue) {
      if (messageBuilder_ == null) {
        someValue_ = builderForValue.build();
        onChanged();
      } else {
        messageBuilder_.setMessage(builderForValue.build());
      }
      someValueCase_ = 3;
      return this;
    }
    /**
     * <code>.test.Nested message = 3;</code>
     */
    public Builder mergeMessage(org.apache.hudi.utilities.test.proto.Nested value) {
      if (messageBuilder_ == null) {
        if (someValueCase_ == 3 &&
            someValue_ != org.apache.hudi.utilities.test.proto.Nested.getDefaultInstance()) {
          someValue_ = org.apache.hudi.utilities.test.proto.Nested.newBuilder((org.apache.hudi.utilities.test.proto.Nested) someValue_)
              .mergeFrom(value).buildPartial();
        } else {
          someValue_ = value;
        }
        onChanged();
      } else {
        if (someValueCase_ == 3) {
          messageBuilder_.mergeFrom(value);
        } else {
          messageBuilder_.setMessage(value);
        }
      }
      someValueCase_ = 3;
      return this;
    }
    /**
     * <code>.test.Nested message = 3;</code>
     */
    public Builder clearMessage() {
      if (messageBuilder_ == null) {
        if (someValueCase_ == 3) {
          someValueCase_ = 0;
          someValue_ = null;
          onChanged();
        }
      } else {
        if (someValueCase_ == 3) {
          someValueCase_ = 0;
          someValue_ = null;
        }
        messageBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.test.Nested message = 3;</code>
     */
    public org.apache.hudi.utilities.test.proto.Nested.Builder getMessageBuilder() {
      return getMessageFieldBuilder().getBuilder();
    }
    /**
     * <code>.test.Nested message = 3;</code>
     */
    @java.lang.Override
    public org.apache.hudi.utilities.test.proto.NestedOrBuilder getMessageOrBuilder() {
      if ((someValueCase_ == 3) && (messageBuilder_ != null)) {
        return messageBuilder_.getMessageOrBuilder();
      } else {
        if (someValueCase_ == 3) {
          return (org.apache.hudi.utilities.test.proto.Nested) someValue_;
        }
        return org.apache.hudi.utilities.test.proto.Nested.getDefaultInstance();
      }
    }
    /**
     * <code>.test.Nested message = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.hudi.utilities.test.proto.Nested, org.apache.hudi.utilities.test.proto.Nested.Builder, org.apache.hudi.utilities.test.proto.NestedOrBuilder> 
        getMessageFieldBuilder() {
      if (messageBuilder_ == null) {
        if (!(someValueCase_ == 3)) {
          someValue_ = org.apache.hudi.utilities.test.proto.Nested.getDefaultInstance();
        }
        messageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.apache.hudi.utilities.test.proto.Nested, org.apache.hudi.utilities.test.proto.Nested.Builder, org.apache.hudi.utilities.test.proto.NestedOrBuilder>(
                (org.apache.hudi.utilities.test.proto.Nested) someValue_,
                getParentForChildren(),
                isClean());
        someValue_ = null;
      }
      someValueCase_ = 3;
      onChanged();;
      return messageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:test.WithOneOf)
  }

  // @@protoc_insertion_point(class_scope:test.WithOneOf)
  private static final org.apache.hudi.utilities.test.proto.WithOneOf DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.hudi.utilities.test.proto.WithOneOf();
  }

  public static org.apache.hudi.utilities.test.proto.WithOneOf getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WithOneOf>
      PARSER = new com.google.protobuf.AbstractParser<WithOneOf>() {
    @java.lang.Override
    public WithOneOf parsePartialFrom(
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

  public static com.google.protobuf.Parser<WithOneOf> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WithOneOf> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.hudi.utilities.test.proto.WithOneOf getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

