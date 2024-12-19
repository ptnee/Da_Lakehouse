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
public class HoodieCompactionStrategy extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8264073142057426607L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HoodieCompactionStrategy\",\"namespace\":\"org.apache.hudi.avro.model\",\"fields\":[{\"name\":\"compactorClassName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The class name that is provided here should extend CompactionExecutionStrategy abstract class, idea is that the plan generator will also provide the execution strategy to use.\",\"default\":null},{\"name\":\"strategyParams\",\"type\":[\"null\",{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"}],\"doc\":\"These parameters play a key role in determining which action type it is i.e. compaction or logcompaction and it will also include configs that determine how compaction needs to be executed.\",\"default\":null},{\"name\":\"version\",\"type\":[\"int\",\"null\"],\"default\":1}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<HoodieCompactionStrategy> ENCODER =
      new BinaryMessageEncoder<HoodieCompactionStrategy>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<HoodieCompactionStrategy> DECODER =
      new BinaryMessageDecoder<HoodieCompactionStrategy>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<HoodieCompactionStrategy> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<HoodieCompactionStrategy> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<HoodieCompactionStrategy>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this HoodieCompactionStrategy to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a HoodieCompactionStrategy from a ByteBuffer. */
  public static HoodieCompactionStrategy fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The class name that is provided here should extend CompactionExecutionStrategy abstract class, idea is that the plan generator will also provide the execution strategy to use. */
  @Deprecated public java.lang.String compactorClassName;
  /** These parameters play a key role in determining which action type it is i.e. compaction or logcompaction and it will also include configs that determine how compaction needs to be executed. */
  @Deprecated public java.util.Map<java.lang.String,java.lang.String> strategyParams;
  @Deprecated public java.lang.Integer version;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public HoodieCompactionStrategy() {}

  /**
   * All-args constructor.
   * @param compactorClassName The class name that is provided here should extend CompactionExecutionStrategy abstract class, idea is that the plan generator will also provide the execution strategy to use.
   * @param strategyParams These parameters play a key role in determining which action type it is i.e. compaction or logcompaction and it will also include configs that determine how compaction needs to be executed.
   * @param version The new value for version
   */
  public HoodieCompactionStrategy(java.lang.String compactorClassName, java.util.Map<java.lang.String,java.lang.String> strategyParams, java.lang.Integer version) {
    this.compactorClassName = compactorClassName;
    this.strategyParams = strategyParams;
    this.version = version;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return compactorClassName;
    case 1: return strategyParams;
    case 2: return version;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: compactorClassName = (java.lang.String)value$; break;
    case 1: strategyParams = (java.util.Map<java.lang.String,java.lang.String>)value$; break;
    case 2: version = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'compactorClassName' field.
   * @return The class name that is provided here should extend CompactionExecutionStrategy abstract class, idea is that the plan generator will also provide the execution strategy to use.
   */
  public java.lang.String getCompactorClassName() {
    return compactorClassName;
  }

  /**
   * Sets the value of the 'compactorClassName' field.
   * The class name that is provided here should extend CompactionExecutionStrategy abstract class, idea is that the plan generator will also provide the execution strategy to use.
   * @param value the value to set.
   */
  public void setCompactorClassName(java.lang.String value) {
    this.compactorClassName = value;
  }

  /**
   * Gets the value of the 'strategyParams' field.
   * @return These parameters play a key role in determining which action type it is i.e. compaction or logcompaction and it will also include configs that determine how compaction needs to be executed.
   */
  public java.util.Map<java.lang.String,java.lang.String> getStrategyParams() {
    return strategyParams;
  }

  /**
   * Sets the value of the 'strategyParams' field.
   * These parameters play a key role in determining which action type it is i.e. compaction or logcompaction and it will also include configs that determine how compaction needs to be executed.
   * @param value the value to set.
   */
  public void setStrategyParams(java.util.Map<java.lang.String,java.lang.String> value) {
    this.strategyParams = value;
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
   * Creates a new HoodieCompactionStrategy RecordBuilder.
   * @return A new HoodieCompactionStrategy RecordBuilder
   */
  public static org.apache.hudi.avro.model.HoodieCompactionStrategy.Builder newBuilder() {
    return new org.apache.hudi.avro.model.HoodieCompactionStrategy.Builder();
  }

  /**
   * Creates a new HoodieCompactionStrategy RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new HoodieCompactionStrategy RecordBuilder
   */
  public static org.apache.hudi.avro.model.HoodieCompactionStrategy.Builder newBuilder(org.apache.hudi.avro.model.HoodieCompactionStrategy.Builder other) {
    return new org.apache.hudi.avro.model.HoodieCompactionStrategy.Builder(other);
  }

  /**
   * Creates a new HoodieCompactionStrategy RecordBuilder by copying an existing HoodieCompactionStrategy instance.
   * @param other The existing instance to copy.
   * @return A new HoodieCompactionStrategy RecordBuilder
   */
  public static org.apache.hudi.avro.model.HoodieCompactionStrategy.Builder newBuilder(org.apache.hudi.avro.model.HoodieCompactionStrategy other) {
    return new org.apache.hudi.avro.model.HoodieCompactionStrategy.Builder(other);
  }

  /**
   * RecordBuilder for HoodieCompactionStrategy instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HoodieCompactionStrategy>
    implements org.apache.avro.data.RecordBuilder<HoodieCompactionStrategy> {

    /** The class name that is provided here should extend CompactionExecutionStrategy abstract class, idea is that the plan generator will also provide the execution strategy to use. */
    private java.lang.String compactorClassName;
    /** These parameters play a key role in determining which action type it is i.e. compaction or logcompaction and it will also include configs that determine how compaction needs to be executed. */
    private java.util.Map<java.lang.String,java.lang.String> strategyParams;
    private java.lang.Integer version;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.hudi.avro.model.HoodieCompactionStrategy.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.compactorClassName)) {
        this.compactorClassName = data().deepCopy(fields()[0].schema(), other.compactorClassName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.strategyParams)) {
        this.strategyParams = data().deepCopy(fields()[1].schema(), other.strategyParams);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.version)) {
        this.version = data().deepCopy(fields()[2].schema(), other.version);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing HoodieCompactionStrategy instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.hudi.avro.model.HoodieCompactionStrategy other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.compactorClassName)) {
        this.compactorClassName = data().deepCopy(fields()[0].schema(), other.compactorClassName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.strategyParams)) {
        this.strategyParams = data().deepCopy(fields()[1].schema(), other.strategyParams);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.version)) {
        this.version = data().deepCopy(fields()[2].schema(), other.version);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'compactorClassName' field.
      * The class name that is provided here should extend CompactionExecutionStrategy abstract class, idea is that the plan generator will also provide the execution strategy to use.
      * @return The value.
      */
    public java.lang.String getCompactorClassName() {
      return compactorClassName;
    }

    /**
      * Sets the value of the 'compactorClassName' field.
      * The class name that is provided here should extend CompactionExecutionStrategy abstract class, idea is that the plan generator will also provide the execution strategy to use.
      * @param value The value of 'compactorClassName'.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieCompactionStrategy.Builder setCompactorClassName(java.lang.String value) {
      validate(fields()[0], value);
      this.compactorClassName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'compactorClassName' field has been set.
      * The class name that is provided here should extend CompactionExecutionStrategy abstract class, idea is that the plan generator will also provide the execution strategy to use.
      * @return True if the 'compactorClassName' field has been set, false otherwise.
      */
    public boolean hasCompactorClassName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'compactorClassName' field.
      * The class name that is provided here should extend CompactionExecutionStrategy abstract class, idea is that the plan generator will also provide the execution strategy to use.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieCompactionStrategy.Builder clearCompactorClassName() {
      compactorClassName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'strategyParams' field.
      * These parameters play a key role in determining which action type it is i.e. compaction or logcompaction and it will also include configs that determine how compaction needs to be executed.
      * @return The value.
      */
    public java.util.Map<java.lang.String,java.lang.String> getStrategyParams() {
      return strategyParams;
    }

    /**
      * Sets the value of the 'strategyParams' field.
      * These parameters play a key role in determining which action type it is i.e. compaction or logcompaction and it will also include configs that determine how compaction needs to be executed.
      * @param value The value of 'strategyParams'.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieCompactionStrategy.Builder setStrategyParams(java.util.Map<java.lang.String,java.lang.String> value) {
      validate(fields()[1], value);
      this.strategyParams = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'strategyParams' field has been set.
      * These parameters play a key role in determining which action type it is i.e. compaction or logcompaction and it will also include configs that determine how compaction needs to be executed.
      * @return True if the 'strategyParams' field has been set, false otherwise.
      */
    public boolean hasStrategyParams() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'strategyParams' field.
      * These parameters play a key role in determining which action type it is i.e. compaction or logcompaction and it will also include configs that determine how compaction needs to be executed.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieCompactionStrategy.Builder clearStrategyParams() {
      strategyParams = null;
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
    public org.apache.hudi.avro.model.HoodieCompactionStrategy.Builder setVersion(java.lang.Integer value) {
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
    public org.apache.hudi.avro.model.HoodieCompactionStrategy.Builder clearVersion() {
      version = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public HoodieCompactionStrategy build() {
      try {
        HoodieCompactionStrategy record = new HoodieCompactionStrategy();
        record.compactorClassName = fieldSetFlags()[0] ? this.compactorClassName : (java.lang.String) defaultValue(fields()[0]);
        record.strategyParams = fieldSetFlags()[1] ? this.strategyParams : (java.util.Map<java.lang.String,java.lang.String>) defaultValue(fields()[1]);
        record.version = fieldSetFlags()[2] ? this.version : (java.lang.Integer) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<HoodieCompactionStrategy>
    WRITER$ = (org.apache.avro.io.DatumWriter<HoodieCompactionStrategy>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<HoodieCompactionStrategy>
    READER$ = (org.apache.avro.io.DatumReader<HoodieCompactionStrategy>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
