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
public class HoodieRollbackPlan extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 919078429352352183L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HoodieRollbackPlan\",\"namespace\":\"org.apache.hudi.avro.model\",\"fields\":[{\"name\":\"instantToRollback\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"HoodieInstantInfo\",\"fields\":[{\"name\":\"commitTime\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"action\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}],\"doc\":\"Hoodie instant that needs to be rolled back\",\"default\":null},{\"name\":\"RollbackRequests\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"HoodieRollbackRequest\",\"fields\":[{\"name\":\"partitionPath\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"fileId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"latestBaseInstant\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"filesToBeDeleted\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":[]},\"default\":[]},{\"name\":\"logBlocksToBeDeleted\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"long\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null},{\"name\":\"version\",\"type\":[\"int\",\"null\"],\"default\":1}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<HoodieRollbackPlan> ENCODER =
      new BinaryMessageEncoder<HoodieRollbackPlan>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<HoodieRollbackPlan> DECODER =
      new BinaryMessageDecoder<HoodieRollbackPlan>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<HoodieRollbackPlan> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<HoodieRollbackPlan> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<HoodieRollbackPlan>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this HoodieRollbackPlan to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a HoodieRollbackPlan from a ByteBuffer. */
  public static HoodieRollbackPlan fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Hoodie instant that needs to be rolled back */
  @Deprecated public org.apache.hudi.avro.model.HoodieInstantInfo instantToRollback;
  @Deprecated public java.util.List<org.apache.hudi.avro.model.HoodieRollbackRequest> RollbackRequests;
  @Deprecated public java.lang.Integer version;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public HoodieRollbackPlan() {}

  /**
   * All-args constructor.
   * @param instantToRollback Hoodie instant that needs to be rolled back
   * @param RollbackRequests The new value for RollbackRequests
   * @param version The new value for version
   */
  public HoodieRollbackPlan(org.apache.hudi.avro.model.HoodieInstantInfo instantToRollback, java.util.List<org.apache.hudi.avro.model.HoodieRollbackRequest> RollbackRequests, java.lang.Integer version) {
    this.instantToRollback = instantToRollback;
    this.RollbackRequests = RollbackRequests;
    this.version = version;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return instantToRollback;
    case 1: return RollbackRequests;
    case 2: return version;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: instantToRollback = (org.apache.hudi.avro.model.HoodieInstantInfo)value$; break;
    case 1: RollbackRequests = (java.util.List<org.apache.hudi.avro.model.HoodieRollbackRequest>)value$; break;
    case 2: version = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'instantToRollback' field.
   * @return Hoodie instant that needs to be rolled back
   */
  public org.apache.hudi.avro.model.HoodieInstantInfo getInstantToRollback() {
    return instantToRollback;
  }

  /**
   * Sets the value of the 'instantToRollback' field.
   * Hoodie instant that needs to be rolled back
   * @param value the value to set.
   */
  public void setInstantToRollback(org.apache.hudi.avro.model.HoodieInstantInfo value) {
    this.instantToRollback = value;
  }

  /**
   * Gets the value of the 'RollbackRequests' field.
   * @return The value of the 'RollbackRequests' field.
   */
  public java.util.List<org.apache.hudi.avro.model.HoodieRollbackRequest> getRollbackRequests() {
    return RollbackRequests;
  }

  /**
   * Sets the value of the 'RollbackRequests' field.
   * @param value the value to set.
   */
  public void setRollbackRequests(java.util.List<org.apache.hudi.avro.model.HoodieRollbackRequest> value) {
    this.RollbackRequests = value;
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
   * Creates a new HoodieRollbackPlan RecordBuilder.
   * @return A new HoodieRollbackPlan RecordBuilder
   */
  public static org.apache.hudi.avro.model.HoodieRollbackPlan.Builder newBuilder() {
    return new org.apache.hudi.avro.model.HoodieRollbackPlan.Builder();
  }

  /**
   * Creates a new HoodieRollbackPlan RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new HoodieRollbackPlan RecordBuilder
   */
  public static org.apache.hudi.avro.model.HoodieRollbackPlan.Builder newBuilder(org.apache.hudi.avro.model.HoodieRollbackPlan.Builder other) {
    return new org.apache.hudi.avro.model.HoodieRollbackPlan.Builder(other);
  }

  /**
   * Creates a new HoodieRollbackPlan RecordBuilder by copying an existing HoodieRollbackPlan instance.
   * @param other The existing instance to copy.
   * @return A new HoodieRollbackPlan RecordBuilder
   */
  public static org.apache.hudi.avro.model.HoodieRollbackPlan.Builder newBuilder(org.apache.hudi.avro.model.HoodieRollbackPlan other) {
    return new org.apache.hudi.avro.model.HoodieRollbackPlan.Builder(other);
  }

  /**
   * RecordBuilder for HoodieRollbackPlan instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HoodieRollbackPlan>
    implements org.apache.avro.data.RecordBuilder<HoodieRollbackPlan> {

    /** Hoodie instant that needs to be rolled back */
    private org.apache.hudi.avro.model.HoodieInstantInfo instantToRollback;
    private org.apache.hudi.avro.model.HoodieInstantInfo.Builder instantToRollbackBuilder;
    private java.util.List<org.apache.hudi.avro.model.HoodieRollbackRequest> RollbackRequests;
    private java.lang.Integer version;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.hudi.avro.model.HoodieRollbackPlan.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.instantToRollback)) {
        this.instantToRollback = data().deepCopy(fields()[0].schema(), other.instantToRollback);
        fieldSetFlags()[0] = true;
      }
      if (other.hasInstantToRollbackBuilder()) {
        this.instantToRollbackBuilder = org.apache.hudi.avro.model.HoodieInstantInfo.newBuilder(other.getInstantToRollbackBuilder());
      }
      if (isValidValue(fields()[1], other.RollbackRequests)) {
        this.RollbackRequests = data().deepCopy(fields()[1].schema(), other.RollbackRequests);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.version)) {
        this.version = data().deepCopy(fields()[2].schema(), other.version);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing HoodieRollbackPlan instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.hudi.avro.model.HoodieRollbackPlan other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.instantToRollback)) {
        this.instantToRollback = data().deepCopy(fields()[0].schema(), other.instantToRollback);
        fieldSetFlags()[0] = true;
      }
      this.instantToRollbackBuilder = null;
      if (isValidValue(fields()[1], other.RollbackRequests)) {
        this.RollbackRequests = data().deepCopy(fields()[1].schema(), other.RollbackRequests);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.version)) {
        this.version = data().deepCopy(fields()[2].schema(), other.version);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'instantToRollback' field.
      * Hoodie instant that needs to be rolled back
      * @return The value.
      */
    public org.apache.hudi.avro.model.HoodieInstantInfo getInstantToRollback() {
      return instantToRollback;
    }

    /**
      * Sets the value of the 'instantToRollback' field.
      * Hoodie instant that needs to be rolled back
      * @param value The value of 'instantToRollback'.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieRollbackPlan.Builder setInstantToRollback(org.apache.hudi.avro.model.HoodieInstantInfo value) {
      validate(fields()[0], value);
      this.instantToRollbackBuilder = null;
      this.instantToRollback = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'instantToRollback' field has been set.
      * Hoodie instant that needs to be rolled back
      * @return True if the 'instantToRollback' field has been set, false otherwise.
      */
    public boolean hasInstantToRollback() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'instantToRollback' field and creates one if it doesn't exist yet.
     * Hoodie instant that needs to be rolled back
     * @return This builder.
     */
    public org.apache.hudi.avro.model.HoodieInstantInfo.Builder getInstantToRollbackBuilder() {
      if (instantToRollbackBuilder == null) {
        if (hasInstantToRollback()) {
          setInstantToRollbackBuilder(org.apache.hudi.avro.model.HoodieInstantInfo.newBuilder(instantToRollback));
        } else {
          setInstantToRollbackBuilder(org.apache.hudi.avro.model.HoodieInstantInfo.newBuilder());
        }
      }
      return instantToRollbackBuilder;
    }

    /**
     * Sets the Builder instance for the 'instantToRollback' field
     * Hoodie instant that needs to be rolled back
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public org.apache.hudi.avro.model.HoodieRollbackPlan.Builder setInstantToRollbackBuilder(org.apache.hudi.avro.model.HoodieInstantInfo.Builder value) {
      clearInstantToRollback();
      instantToRollbackBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'instantToRollback' field has an active Builder instance
     * Hoodie instant that needs to be rolled back
     * @return True if the 'instantToRollback' field has an active Builder instance
     */
    public boolean hasInstantToRollbackBuilder() {
      return instantToRollbackBuilder != null;
    }

    /**
      * Clears the value of the 'instantToRollback' field.
      * Hoodie instant that needs to be rolled back
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieRollbackPlan.Builder clearInstantToRollback() {
      instantToRollback = null;
      instantToRollbackBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'RollbackRequests' field.
      * @return The value.
      */
    public java.util.List<org.apache.hudi.avro.model.HoodieRollbackRequest> getRollbackRequests() {
      return RollbackRequests;
    }

    /**
      * Sets the value of the 'RollbackRequests' field.
      * @param value The value of 'RollbackRequests'.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieRollbackPlan.Builder setRollbackRequests(java.util.List<org.apache.hudi.avro.model.HoodieRollbackRequest> value) {
      validate(fields()[1], value);
      this.RollbackRequests = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'RollbackRequests' field has been set.
      * @return True if the 'RollbackRequests' field has been set, false otherwise.
      */
    public boolean hasRollbackRequests() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'RollbackRequests' field.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieRollbackPlan.Builder clearRollbackRequests() {
      RollbackRequests = null;
      fieldSetFlags()[1] = false;
      return this;
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
    public org.apache.hudi.avro.model.HoodieRollbackPlan.Builder setVersion(java.lang.Integer value) {
      validate(fields()[2], value);
      this.version = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'version' field has been set.
      * @return True if the 'version' field has been set, false otherwise.
      */
    public boolean hasVersion() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'version' field.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieRollbackPlan.Builder clearVersion() {
      version = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public HoodieRollbackPlan build() {
      try {
        HoodieRollbackPlan record = new HoodieRollbackPlan();
        if (instantToRollbackBuilder != null) {
          record.instantToRollback = this.instantToRollbackBuilder.build();
        } else {
          record.instantToRollback = fieldSetFlags()[0] ? this.instantToRollback : (org.apache.hudi.avro.model.HoodieInstantInfo) defaultValue(fields()[0]);
        }
        record.RollbackRequests = fieldSetFlags()[1] ? this.RollbackRequests : (java.util.List<org.apache.hudi.avro.model.HoodieRollbackRequest>) defaultValue(fields()[1]);
        record.version = fieldSetFlags()[2] ? this.version : (java.lang.Integer) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<HoodieRollbackPlan>
    WRITER$ = (org.apache.avro.io.DatumWriter<HoodieRollbackPlan>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<HoodieRollbackPlan>
    READER$ = (org.apache.avro.io.DatumReader<HoodieRollbackPlan>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}