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
/** Individual Hudi record to delete */
@org.apache.avro.specific.AvroGenerated
public class HoodieDeleteRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6101972997259271613L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HoodieDeleteRecord\",\"namespace\":\"org.apache.hudi.avro.model\",\"doc\":\"Individual Hudi record to delete\",\"fields\":[{\"name\":\"recordKey\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Record key in String\",\"default\":null},{\"name\":\"partitionPath\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Partition path in String\",\"default\":null},{\"name\":\"orderingVal\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"BooleanWrapper\",\"doc\":\"A record wrapping boolean type to be able to be used it w/in Avro's Union\",\"fields\":[{\"name\":\"value\",\"type\":\"boolean\"}]},{\"type\":\"record\",\"name\":\"IntWrapper\",\"doc\":\"A record wrapping int type to be able to be used it w/in Avro's Union\",\"fields\":[{\"name\":\"value\",\"type\":\"int\"}]},{\"type\":\"record\",\"name\":\"LongWrapper\",\"doc\":\"A record wrapping long type to be able to be used it w/in Avro's Union\",\"fields\":[{\"name\":\"value\",\"type\":\"long\"}]},{\"type\":\"record\",\"name\":\"FloatWrapper\",\"doc\":\"A record wrapping float type to be able to be used it w/in Avro's Union\",\"fields\":[{\"name\":\"value\",\"type\":\"float\"}]},{\"type\":\"record\",\"name\":\"DoubleWrapper\",\"doc\":\"A record wrapping double type to be able to be used it w/in Avro's Union\",\"fields\":[{\"name\":\"value\",\"type\":\"double\"}]},{\"type\":\"record\",\"name\":\"BytesWrapper\",\"doc\":\"A record wrapping bytes type to be able to be used it w/in Avro's Union\",\"fields\":[{\"name\":\"value\",\"type\":\"bytes\"}]},{\"type\":\"record\",\"name\":\"StringWrapper\",\"doc\":\"A record wrapping string type to be able to be used it w/in Avro's Union\",\"fields\":[{\"name\":\"value\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"DateWrapper\",\"doc\":\"A record wrapping Date logical type to be able to be used it w/in Avro's Union\",\"fields\":[{\"name\":\"value\",\"type\":\"int\"}]},{\"type\":\"record\",\"name\":\"DecimalWrapper\",\"doc\":\"A record wrapping Decimal logical type to be able to be used it w/in Avro's Union\",\"fields\":[{\"name\":\"value\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":30,\"scale\":15}}]},{\"type\":\"record\",\"name\":\"TimeMicrosWrapper\",\"doc\":\"A record wrapping Time-micros logical type to be able to be used it w/in Avro's Union\",\"fields\":[{\"name\":\"value\",\"type\":{\"type\":\"long\",\"logicalType\":\"time-micros\"}}]},{\"type\":\"record\",\"name\":\"TimestampMicrosWrapper\",\"doc\":\"A record wrapping Timestamp-micros logical type to be able to be used it w/in Avro's Union\",\"fields\":[{\"name\":\"value\",\"type\":\"long\"}]}],\"doc\":\"Ordering value determining the order of merging on the same key\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<HoodieDeleteRecord> ENCODER =
      new BinaryMessageEncoder<HoodieDeleteRecord>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<HoodieDeleteRecord> DECODER =
      new BinaryMessageDecoder<HoodieDeleteRecord>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<HoodieDeleteRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<HoodieDeleteRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<HoodieDeleteRecord>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this HoodieDeleteRecord to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a HoodieDeleteRecord from a ByteBuffer. */
  public static HoodieDeleteRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Record key in String */
  @Deprecated public java.lang.String recordKey;
  /** Partition path in String */
  @Deprecated public java.lang.String partitionPath;
  /** Ordering value determining the order of merging on the same key */
  @Deprecated public java.lang.Object orderingVal;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public HoodieDeleteRecord() {}

  /**
   * All-args constructor.
   * @param recordKey Record key in String
   * @param partitionPath Partition path in String
   * @param orderingVal Ordering value determining the order of merging on the same key
   */
  public HoodieDeleteRecord(java.lang.String recordKey, java.lang.String partitionPath, java.lang.Object orderingVal) {
    this.recordKey = recordKey;
    this.partitionPath = partitionPath;
    this.orderingVal = orderingVal;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return recordKey;
    case 1: return partitionPath;
    case 2: return orderingVal;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: recordKey = (java.lang.String)value$; break;
    case 1: partitionPath = (java.lang.String)value$; break;
    case 2: orderingVal = (java.lang.Object)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'recordKey' field.
   * @return Record key in String
   */
  public java.lang.String getRecordKey() {
    return recordKey;
  }

  /**
   * Sets the value of the 'recordKey' field.
   * Record key in String
   * @param value the value to set.
   */
  public void setRecordKey(java.lang.String value) {
    this.recordKey = value;
  }

  /**
   * Gets the value of the 'partitionPath' field.
   * @return Partition path in String
   */
  public java.lang.String getPartitionPath() {
    return partitionPath;
  }

  /**
   * Sets the value of the 'partitionPath' field.
   * Partition path in String
   * @param value the value to set.
   */
  public void setPartitionPath(java.lang.String value) {
    this.partitionPath = value;
  }

  /**
   * Gets the value of the 'orderingVal' field.
   * @return Ordering value determining the order of merging on the same key
   */
  public java.lang.Object getOrderingVal() {
    return orderingVal;
  }

  /**
   * Sets the value of the 'orderingVal' field.
   * Ordering value determining the order of merging on the same key
   * @param value the value to set.
   */
  public void setOrderingVal(java.lang.Object value) {
    this.orderingVal = value;
  }

  /**
   * Creates a new HoodieDeleteRecord RecordBuilder.
   * @return A new HoodieDeleteRecord RecordBuilder
   */
  public static org.apache.hudi.avro.model.HoodieDeleteRecord.Builder newBuilder() {
    return new org.apache.hudi.avro.model.HoodieDeleteRecord.Builder();
  }

  /**
   * Creates a new HoodieDeleteRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new HoodieDeleteRecord RecordBuilder
   */
  public static org.apache.hudi.avro.model.HoodieDeleteRecord.Builder newBuilder(org.apache.hudi.avro.model.HoodieDeleteRecord.Builder other) {
    return new org.apache.hudi.avro.model.HoodieDeleteRecord.Builder(other);
  }

  /**
   * Creates a new HoodieDeleteRecord RecordBuilder by copying an existing HoodieDeleteRecord instance.
   * @param other The existing instance to copy.
   * @return A new HoodieDeleteRecord RecordBuilder
   */
  public static org.apache.hudi.avro.model.HoodieDeleteRecord.Builder newBuilder(org.apache.hudi.avro.model.HoodieDeleteRecord other) {
    return new org.apache.hudi.avro.model.HoodieDeleteRecord.Builder(other);
  }

  /**
   * RecordBuilder for HoodieDeleteRecord instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HoodieDeleteRecord>
    implements org.apache.avro.data.RecordBuilder<HoodieDeleteRecord> {

    /** Record key in String */
    private java.lang.String recordKey;
    /** Partition path in String */
    private java.lang.String partitionPath;
    /** Ordering value determining the order of merging on the same key */
    private java.lang.Object orderingVal;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.hudi.avro.model.HoodieDeleteRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.recordKey)) {
        this.recordKey = data().deepCopy(fields()[0].schema(), other.recordKey);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.partitionPath)) {
        this.partitionPath = data().deepCopy(fields()[1].schema(), other.partitionPath);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.orderingVal)) {
        this.orderingVal = data().deepCopy(fields()[2].schema(), other.orderingVal);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing HoodieDeleteRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.hudi.avro.model.HoodieDeleteRecord other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.recordKey)) {
        this.recordKey = data().deepCopy(fields()[0].schema(), other.recordKey);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.partitionPath)) {
        this.partitionPath = data().deepCopy(fields()[1].schema(), other.partitionPath);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.orderingVal)) {
        this.orderingVal = data().deepCopy(fields()[2].schema(), other.orderingVal);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'recordKey' field.
      * Record key in String
      * @return The value.
      */
    public java.lang.String getRecordKey() {
      return recordKey;
    }

    /**
      * Sets the value of the 'recordKey' field.
      * Record key in String
      * @param value The value of 'recordKey'.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieDeleteRecord.Builder setRecordKey(java.lang.String value) {
      validate(fields()[0], value);
      this.recordKey = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'recordKey' field has been set.
      * Record key in String
      * @return True if the 'recordKey' field has been set, false otherwise.
      */
    public boolean hasRecordKey() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'recordKey' field.
      * Record key in String
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieDeleteRecord.Builder clearRecordKey() {
      recordKey = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'partitionPath' field.
      * Partition path in String
      * @return The value.
      */
    public java.lang.String getPartitionPath() {
      return partitionPath;
    }

    /**
      * Sets the value of the 'partitionPath' field.
      * Partition path in String
      * @param value The value of 'partitionPath'.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieDeleteRecord.Builder setPartitionPath(java.lang.String value) {
      validate(fields()[1], value);
      this.partitionPath = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'partitionPath' field has been set.
      * Partition path in String
      * @return True if the 'partitionPath' field has been set, false otherwise.
      */
    public boolean hasPartitionPath() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'partitionPath' field.
      * Partition path in String
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieDeleteRecord.Builder clearPartitionPath() {
      partitionPath = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'orderingVal' field.
      * Ordering value determining the order of merging on the same key
      * @return The value.
      */
    public java.lang.Object getOrderingVal() {
      return orderingVal;
    }

    /**
      * Sets the value of the 'orderingVal' field.
      * Ordering value determining the order of merging on the same key
      * @param value The value of 'orderingVal'.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieDeleteRecord.Builder setOrderingVal(java.lang.Object value) {
      validate(fields()[2], value);
      this.orderingVal = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'orderingVal' field has been set.
      * Ordering value determining the order of merging on the same key
      * @return True if the 'orderingVal' field has been set, false otherwise.
      */
    public boolean hasOrderingVal() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'orderingVal' field.
      * Ordering value determining the order of merging on the same key
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieDeleteRecord.Builder clearOrderingVal() {
      orderingVal = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public HoodieDeleteRecord build() {
      try {
        HoodieDeleteRecord record = new HoodieDeleteRecord();
        record.recordKey = fieldSetFlags()[0] ? this.recordKey : (java.lang.String) defaultValue(fields()[0]);
        record.partitionPath = fieldSetFlags()[1] ? this.partitionPath : (java.lang.String) defaultValue(fields()[1]);
        record.orderingVal = fieldSetFlags()[2] ? this.orderingVal : (java.lang.Object) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<HoodieDeleteRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<HoodieDeleteRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<HoodieDeleteRecord>
    READER$ = (org.apache.avro.io.DatumReader<HoodieDeleteRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
