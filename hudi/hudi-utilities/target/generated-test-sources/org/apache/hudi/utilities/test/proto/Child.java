// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recursive.proto

package org.apache.hudi.utilities.test.proto;

/**
 * Protobuf type {@code test.Child}
 */
public final class Child extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:test.Child)
    ChildOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Child.newBuilder() to construct.
  private Child(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Child() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Child();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.hudi.utilities.test.proto.Recursive.internal_static_test_Child_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.hudi.utilities.test.proto.Recursive.internal_static_test_Child_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.hudi.utilities.test.proto.Child.class, org.apache.hudi.utilities.test.proto.Child.Builder.class);
  }

  public static final int BASIC_FIELD_FIELD_NUMBER = 1;
  private int basicField_;
  /**
   * <code>int32 basic_field = 1;</code>
   * @return The basicField.
   */
  @java.lang.Override
  public int getBasicField() {
    return basicField_;
  }

  public static final int RECURSE_FIELD_FIELD_NUMBER = 2;
  private org.apache.hudi.utilities.test.proto.Child recurseField_;
  /**
   * <code>.test.Child recurse_field = 2;</code>
   * @return Whether the recurseField field is set.
   */
  @java.lang.Override
  public boolean hasRecurseField() {
    return recurseField_ != null;
  }
  /**
   * <code>.test.Child recurse_field = 2;</code>
   * @return The recurseField.
   */
  @java.lang.Override
  public org.apache.hudi.utilities.test.proto.Child getRecurseField() {
    return recurseField_ == null ? org.apache.hudi.utilities.test.proto.Child.getDefaultInstance() : recurseField_;
  }
  /**
   * <code>.test.Child recurse_field = 2;</code>
   */
  @java.lang.Override
  public org.apache.hudi.utilities.test.proto.ChildOrBuilder getRecurseFieldOrBuilder() {
    return getRecurseField();
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
    if (basicField_ != 0) {
      output.writeInt32(1, basicField_);
    }
    if (recurseField_ != null) {
      output.writeMessage(2, getRecurseField());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (basicField_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, basicField_);
    }
    if (recurseField_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRecurseField());
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
    if (!(obj instanceof org.apache.hudi.utilities.test.proto.Child)) {
      return super.equals(obj);
    }
    org.apache.hudi.utilities.test.proto.Child other = (org.apache.hudi.utilities.test.proto.Child) obj;

    if (getBasicField()
        != other.getBasicField()) return false;
    if (hasRecurseField() != other.hasRecurseField()) return false;
    if (hasRecurseField()) {
      if (!getRecurseField()
          .equals(other.getRecurseField())) return false;
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
    hash = (37 * hash) + BASIC_FIELD_FIELD_NUMBER;
    hash = (53 * hash) + getBasicField();
    if (hasRecurseField()) {
      hash = (37 * hash) + RECURSE_FIELD_FIELD_NUMBER;
      hash = (53 * hash) + getRecurseField().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.hudi.utilities.test.proto.Child parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.hudi.utilities.test.proto.Child parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.hudi.utilities.test.proto.Child parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.hudi.utilities.test.proto.Child parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.hudi.utilities.test.proto.Child parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.hudi.utilities.test.proto.Child parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.hudi.utilities.test.proto.Child parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.hudi.utilities.test.proto.Child parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.hudi.utilities.test.proto.Child parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.hudi.utilities.test.proto.Child parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.hudi.utilities.test.proto.Child parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.hudi.utilities.test.proto.Child parseFrom(
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
  public static Builder newBuilder(org.apache.hudi.utilities.test.proto.Child prototype) {
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
   * Protobuf type {@code test.Child}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:test.Child)
      org.apache.hudi.utilities.test.proto.ChildOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hudi.utilities.test.proto.Recursive.internal_static_test_Child_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hudi.utilities.test.proto.Recursive.internal_static_test_Child_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hudi.utilities.test.proto.Child.class, org.apache.hudi.utilities.test.proto.Child.Builder.class);
    }

    // Construct using org.apache.hudi.utilities.test.proto.Child.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      basicField_ = 0;

      if (recurseFieldBuilder_ == null) {
        recurseField_ = null;
      } else {
        recurseField_ = null;
        recurseFieldBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.hudi.utilities.test.proto.Recursive.internal_static_test_Child_descriptor;
    }

    @java.lang.Override
    public org.apache.hudi.utilities.test.proto.Child getDefaultInstanceForType() {
      return org.apache.hudi.utilities.test.proto.Child.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.hudi.utilities.test.proto.Child build() {
      org.apache.hudi.utilities.test.proto.Child result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.hudi.utilities.test.proto.Child buildPartial() {
      org.apache.hudi.utilities.test.proto.Child result = new org.apache.hudi.utilities.test.proto.Child(this);
      result.basicField_ = basicField_;
      if (recurseFieldBuilder_ == null) {
        result.recurseField_ = recurseField_;
      } else {
        result.recurseField_ = recurseFieldBuilder_.build();
      }
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
      if (other instanceof org.apache.hudi.utilities.test.proto.Child) {
        return mergeFrom((org.apache.hudi.utilities.test.proto.Child)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.hudi.utilities.test.proto.Child other) {
      if (other == org.apache.hudi.utilities.test.proto.Child.getDefaultInstance()) return this;
      if (other.getBasicField() != 0) {
        setBasicField(other.getBasicField());
      }
      if (other.hasRecurseField()) {
        mergeRecurseField(other.getRecurseField());
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
              basicField_ = input.readInt32();

              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getRecurseFieldFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
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

    private int basicField_ ;
    /**
     * <code>int32 basic_field = 1;</code>
     * @return The basicField.
     */
    @java.lang.Override
    public int getBasicField() {
      return basicField_;
    }
    /**
     * <code>int32 basic_field = 1;</code>
     * @param value The basicField to set.
     * @return This builder for chaining.
     */
    public Builder setBasicField(int value) {
      
      basicField_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 basic_field = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBasicField() {
      
      basicField_ = 0;
      onChanged();
      return this;
    }

    private org.apache.hudi.utilities.test.proto.Child recurseField_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.hudi.utilities.test.proto.Child, org.apache.hudi.utilities.test.proto.Child.Builder, org.apache.hudi.utilities.test.proto.ChildOrBuilder> recurseFieldBuilder_;
    /**
     * <code>.test.Child recurse_field = 2;</code>
     * @return Whether the recurseField field is set.
     */
    public boolean hasRecurseField() {
      return recurseFieldBuilder_ != null || recurseField_ != null;
    }
    /**
     * <code>.test.Child recurse_field = 2;</code>
     * @return The recurseField.
     */
    public org.apache.hudi.utilities.test.proto.Child getRecurseField() {
      if (recurseFieldBuilder_ == null) {
        return recurseField_ == null ? org.apache.hudi.utilities.test.proto.Child.getDefaultInstance() : recurseField_;
      } else {
        return recurseFieldBuilder_.getMessage();
      }
    }
    /**
     * <code>.test.Child recurse_field = 2;</code>
     */
    public Builder setRecurseField(org.apache.hudi.utilities.test.proto.Child value) {
      if (recurseFieldBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        recurseField_ = value;
        onChanged();
      } else {
        recurseFieldBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.test.Child recurse_field = 2;</code>
     */
    public Builder setRecurseField(
        org.apache.hudi.utilities.test.proto.Child.Builder builderForValue) {
      if (recurseFieldBuilder_ == null) {
        recurseField_ = builderForValue.build();
        onChanged();
      } else {
        recurseFieldBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.test.Child recurse_field = 2;</code>
     */
    public Builder mergeRecurseField(org.apache.hudi.utilities.test.proto.Child value) {
      if (recurseFieldBuilder_ == null) {
        if (recurseField_ != null) {
          recurseField_ =
            org.apache.hudi.utilities.test.proto.Child.newBuilder(recurseField_).mergeFrom(value).buildPartial();
        } else {
          recurseField_ = value;
        }
        onChanged();
      } else {
        recurseFieldBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.test.Child recurse_field = 2;</code>
     */
    public Builder clearRecurseField() {
      if (recurseFieldBuilder_ == null) {
        recurseField_ = null;
        onChanged();
      } else {
        recurseField_ = null;
        recurseFieldBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.test.Child recurse_field = 2;</code>
     */
    public org.apache.hudi.utilities.test.proto.Child.Builder getRecurseFieldBuilder() {
      
      onChanged();
      return getRecurseFieldFieldBuilder().getBuilder();
    }
    /**
     * <code>.test.Child recurse_field = 2;</code>
     */
    public org.apache.hudi.utilities.test.proto.ChildOrBuilder getRecurseFieldOrBuilder() {
      if (recurseFieldBuilder_ != null) {
        return recurseFieldBuilder_.getMessageOrBuilder();
      } else {
        return recurseField_ == null ?
            org.apache.hudi.utilities.test.proto.Child.getDefaultInstance() : recurseField_;
      }
    }
    /**
     * <code>.test.Child recurse_field = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.hudi.utilities.test.proto.Child, org.apache.hudi.utilities.test.proto.Child.Builder, org.apache.hudi.utilities.test.proto.ChildOrBuilder> 
        getRecurseFieldFieldBuilder() {
      if (recurseFieldBuilder_ == null) {
        recurseFieldBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.apache.hudi.utilities.test.proto.Child, org.apache.hudi.utilities.test.proto.Child.Builder, org.apache.hudi.utilities.test.proto.ChildOrBuilder>(
                getRecurseField(),
                getParentForChildren(),
                isClean());
        recurseField_ = null;
      }
      return recurseFieldBuilder_;
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


    // @@protoc_insertion_point(builder_scope:test.Child)
  }

  // @@protoc_insertion_point(class_scope:test.Child)
  private static final org.apache.hudi.utilities.test.proto.Child DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.hudi.utilities.test.proto.Child();
  }

  public static org.apache.hudi.utilities.test.proto.Child getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Child>
      PARSER = new com.google.protobuf.AbstractParser<Child>() {
    @java.lang.Override
    public Child parsePartialFrom(
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

  public static com.google.protobuf.Parser<Child> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Child> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.hudi.utilities.test.proto.Child getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

