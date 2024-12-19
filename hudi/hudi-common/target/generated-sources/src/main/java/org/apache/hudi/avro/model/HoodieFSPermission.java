/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.hudi.avro.model;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class HoodieFSPermission extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3946434119916465777L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HoodieFSPermission\",\"namespace\":\"org.apache.hudi.avro.model\",\"fields\":[{\"name\":\"version\",\"type\":[\"int\",\"null\"],\"default\":1},{\"name\":\"userAction\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"groupAction\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"otherAction\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"stickyBit\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<HoodieFSPermission> ENCODER =
      new BinaryMessageEncoder<HoodieFSPermission>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<HoodieFSPermission> DECODER =
      new BinaryMessageDecoder<HoodieFSPermission>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<HoodieFSPermission> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<HoodieFSPermission> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<HoodieFSPermission>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this HoodieFSPermission to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a HoodieFSPermission from a ByteBuffer. */
  public static HoodieFSPermission fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.Integer version;
  @Deprecated public java.lang.String userAction;
  @Deprecated public java.lang.String groupAction;
  @Deprecated public java.lang.String otherAction;
  @Deprecated public java.lang.Boolean stickyBit;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public HoodieFSPermission() {}

  /**
   * All-args constructor.
   * @param version The new value for version
   * @param userAction The new value for userAction
   * @param groupAction The new value for groupAction
   * @param otherAction The new value for otherAction
   * @param stickyBit The new value for stickyBit
   */
  public HoodieFSPermission(java.lang.Integer version, java.lang.String userAction, java.lang.String groupAction, java.lang.String otherAction, java.lang.Boolean stickyBit) {
    this.version = version;
    this.userAction = userAction;
    this.groupAction = groupAction;
    this.otherAction = otherAction;
    this.stickyBit = stickyBit;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return version;
    case 1: return userAction;
    case 2: return groupAction;
    case 3: return otherAction;
    case 4: return stickyBit;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: version = (java.lang.Integer)value$; break;
    case 1: userAction = (java.lang.String)value$; break;
    case 2: groupAction = (java.lang.String)value$; break;
    case 3: otherAction = (java.lang.String)value$; break;
    case 4: stickyBit = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'version' field.
   * @return The value of the 'version' field.
   */
  public java.lang.Integer getVersion() {
    return version;
  }

  /**
   * Sets the value of the 'version' field.
   * @param value the value to set.
   */
  public void setVersion(java.lang.Integer value) {
    this.version = value;
  }

  /**
   * Gets the value of the 'userAction' field.
   * @return The value of the 'userAction' field.
   */
  public java.lang.String getUserAction() {
    return userAction;
  }

  /**
   * Sets the value of the 'userAction' field.
   * @param value the value to set.
   */
  public void setUserAction(java.lang.String value) {
    this.userAction = value;
  }

  /**
   * Gets the value of the 'groupAction' field.
   * @return The value of the 'groupAction' field.
   */
  public java.lang.String getGroupAction() {
    return groupAction;
  }

  /**
   * Sets the value of the 'groupAction' field.
   * @param value the value to set.
   */
  public void setGroupAction(java.lang.String value) {
    this.groupAction = value;
  }

  /**
   * Gets the value of the 'otherAction' field.
   * @return The value of the 'otherAction' field.
   */
  public java.lang.String getOtherAction() {
    return otherAction;
  }

  /**
   * Sets the value of the 'otherAction' field.
   * @param value the value to set.
   */
  public void setOtherAction(java.lang.String value) {
    this.otherAction = value;
  }

  /**
   * Gets the value of the 'stickyBit' field.
   * @return The value of the 'stickyBit' field.
   */
  public java.lang.Boolean getStickyBit() {
    return stickyBit;
  }

  /**
   * Sets the value of the 'stickyBit' field.
   * @param value the value to set.
   */
  public void setStickyBit(java.lang.Boolean value) {
    this.stickyBit = value;
  }

  /**
   * Creates a new HoodieFSPermission RecordBuilder.
   * @return A new HoodieFSPermission RecordBuilder
   */
  public static org.apache.hudi.avro.model.HoodieFSPermission.Builder newBuilder() {
    return new org.apache.hudi.avro.model.HoodieFSPermission.Builder();
  }

  /**
   * Creates a new HoodieFSPermission RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new HoodieFSPermission RecordBuilder
   */
  public static org.apache.hudi.avro.model.HoodieFSPermission.Builder newBuilder(org.apache.hudi.avro.model.HoodieFSPermission.Builder other) {
    return new org.apache.hudi.avro.model.HoodieFSPermission.Builder(other);
  }

  /**
   * Creates a new HoodieFSPermission RecordBuilder by copying an existing HoodieFSPermission instance.
   * @param other The existing instance to copy.
   * @return A new HoodieFSPermission RecordBuilder
   */
  public static org.apache.hudi.avro.model.HoodieFSPermission.Builder newBuilder(org.apache.hudi.avro.model.HoodieFSPermission other) {
    return new org.apache.hudi.avro.model.HoodieFSPermission.Builder(other);
  }

  /**
   * RecordBuilder for HoodieFSPermission instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HoodieFSPermission>
    implements org.apache.avro.data.RecordBuilder<HoodieFSPermission> {

    private java.lang.Integer version;
    private java.lang.String userAction;
    private java.lang.String groupAction;
    private java.lang.String otherAction;
    private java.lang.Boolean stickyBit;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.hudi.avro.model.HoodieFSPermission.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.version)) {
        this.version = data().deepCopy(fields()[0].schema(), other.version);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userAction)) {
        this.userAction = data().deepCopy(fields()[1].schema(), other.userAction);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.groupAction)) {
        this.groupAction = data().deepCopy(fields()[2].schema(), other.groupAction);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.otherAction)) {
        this.otherAction = data().deepCopy(fields()[3].schema(), other.otherAction);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.stickyBit)) {
        this.stickyBit = data().deepCopy(fields()[4].schema(), other.stickyBit);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing HoodieFSPermission instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.hudi.avro.model.HoodieFSPermission other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.version)) {
        this.version = data().deepCopy(fields()[0].schema(), other.version);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userAction)) {
        this.userAction = data().deepCopy(fields()[1].schema(), other.userAction);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.groupAction)) {
        this.groupAction = data().deepCopy(fields()[2].schema(), other.groupAction);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.otherAction)) {
        this.otherAction = data().deepCopy(fields()[3].schema(), other.otherAction);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.stickyBit)) {
        this.stickyBit = data().deepCopy(fields()[4].schema(), other.stickyBit);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'version' field.
      * @return The value.
      */
    public java.lang.Integer getVersion() {
      return version;
    }

    /**
      * Sets the value of the 'version' field.
      * @param value The value of 'version'.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieFSPermission.Builder setVersion(java.lang.Integer value) {
      validate(fields()[0], value);
      this.version = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'version' field has been set.
      * @return True if the 'version' field has been set, false otherwise.
      */
    public boolean hasVersion() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'version' field.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieFSPermission.Builder clearVersion() {
      version = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'userAction' field.
      * @return The value.
      */
    public java.lang.String getUserAction() {
      return userAction;
    }

    /**
      * Sets the value of the 'userAction' field.
      * @param value The value of 'userAction'.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieFSPermission.Builder setUserAction(java.lang.String value) {
      validate(fields()[1], value);
      this.userAction = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'userAction' field has been set.
      * @return True if the 'userAction' field has been set, false otherwise.
      */
    public boolean hasUserAction() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'userAction' field.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieFSPermission.Builder clearUserAction() {
      userAction = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'groupAction' field.
      * @return The value.
      */
    public java.lang.String getGroupAction() {
      return groupAction;
    }

    /**
      * Sets the value of the 'groupAction' field.
      * @param value The value of 'groupAction'.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieFSPermission.Builder setGroupAction(java.lang.String value) {
      validate(fields()[2], value);
      this.groupAction = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'groupAction' field has been set.
      * @return True if the 'groupAction' field has been set, false otherwise.
      */
    public boolean hasGroupAction() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'groupAction' field.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieFSPermission.Builder clearGroupAction() {
      groupAction = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'otherAction' field.
      * @return The value.
      */
    public java.lang.String getOtherAction() {
      return otherAction;
    }

    /**
      * Sets the value of the 'otherAction' field.
      * @param value The value of 'otherAction'.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieFSPermission.Builder setOtherAction(java.lang.String value) {
      validate(fields()[3], value);
      this.otherAction = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'otherAction' field has been set.
      * @return True if the 'otherAction' field has been set, false otherwise.
      */
    public boolean hasOtherAction() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'otherAction' field.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieFSPermission.Builder clearOtherAction() {
      otherAction = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'stickyBit' field.
      * @return The value.
      */
    public java.lang.Boolean getStickyBit() {
      return stickyBit;
    }

    /**
      * Sets the value of the 'stickyBit' field.
      * @param value The value of 'stickyBit'.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieFSPermission.Builder setStickyBit(java.lang.Boolean value) {
      validate(fields()[4], value);
      this.stickyBit = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'stickyBit' field has been set.
      * @return True if the 'stickyBit' field has been set, false otherwise.
      */
    public boolean hasStickyBit() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'stickyBit' field.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieFSPermission.Builder clearStickyBit() {
      stickyBit = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public HoodieFSPermission build() {
      try {
        HoodieFSPermission record = new HoodieFSPermission();
        record.version = fieldSetFlags()[0] ? this.version : (java.lang.Integer) defaultValue(fields()[0]);
        record.userAction = fieldSetFlags()[1] ? this.userAction : (java.lang.String) defaultValue(fields()[1]);
        record.groupAction = fieldSetFlags()[2] ? this.groupAction : (java.lang.String) defaultValue(fields()[2]);
        record.otherAction = fieldSetFlags()[3] ? this.otherAction : (java.lang.String) defaultValue(fields()[3]);
        record.stickyBit = fieldSetFlags()[4] ? this.stickyBit : (java.lang.Boolean) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<HoodieFSPermission>
    WRITER$ = (org.apache.avro.io.DatumWriter<HoodieFSPermission>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<HoodieFSPermission>
    READER$ = (org.apache.avro.io.DatumReader<HoodieFSPermission>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}