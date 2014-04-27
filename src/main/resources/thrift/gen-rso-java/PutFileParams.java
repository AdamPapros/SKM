/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PutFileParams implements org.apache.thrift.TBase<PutFileParams, PutFileParams._Fields>, java.io.Serializable, Cloneable, Comparable<PutFileParams> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PutFileParams");

  private static final org.apache.thrift.protocol.TField CAN_PUT_FIELD_DESC = new org.apache.thrift.protocol.TField("canPut", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField SLAVE_IP_FIELD_DESC = new org.apache.thrift.protocol.TField("slaveIp", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PutFileParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PutFileParamsTupleSchemeFactory());
  }

  public boolean canPut; // required
  public int slaveIp; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CAN_PUT((short)1, "canPut"),
    SLAVE_IP((short)2, "slaveIp");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CAN_PUT
          return CAN_PUT;
        case 2: // SLAVE_IP
          return SLAVE_IP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CANPUT_ISSET_ID = 0;
  private static final int __SLAVEIP_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CAN_PUT, new org.apache.thrift.meta_data.FieldMetaData("canPut", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.SLAVE_IP, new org.apache.thrift.meta_data.FieldMetaData("slaveIp", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "IPType")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PutFileParams.class, metaDataMap);
  }

  public PutFileParams() {
  }

  public PutFileParams(
    boolean canPut,
    int slaveIp)
  {
    this();
    this.canPut = canPut;
    setCanPutIsSet(true);
    this.slaveIp = slaveIp;
    setSlaveIpIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PutFileParams(PutFileParams other) {
    __isset_bitfield = other.__isset_bitfield;
    this.canPut = other.canPut;
    this.slaveIp = other.slaveIp;
  }

  public PutFileParams deepCopy() {
    return new PutFileParams(this);
  }

  @Override
  public void clear() {
    setCanPutIsSet(false);
    this.canPut = false;
    setSlaveIpIsSet(false);
    this.slaveIp = 0;
  }

  public boolean isCanPut() {
    return this.canPut;
  }

  public PutFileParams setCanPut(boolean canPut) {
    this.canPut = canPut;
    setCanPutIsSet(true);
    return this;
  }

  public void unsetCanPut() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CANPUT_ISSET_ID);
  }

  /** Returns true if field canPut is set (has been assigned a value) and false otherwise */
  public boolean isSetCanPut() {
    return EncodingUtils.testBit(__isset_bitfield, __CANPUT_ISSET_ID);
  }

  public void setCanPutIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CANPUT_ISSET_ID, value);
  }

  public int getSlaveIp() {
    return this.slaveIp;
  }

  public PutFileParams setSlaveIp(int slaveIp) {
    this.slaveIp = slaveIp;
    setSlaveIpIsSet(true);
    return this;
  }

  public void unsetSlaveIp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SLAVEIP_ISSET_ID);
  }

  /** Returns true if field slaveIp is set (has been assigned a value) and false otherwise */
  public boolean isSetSlaveIp() {
    return EncodingUtils.testBit(__isset_bitfield, __SLAVEIP_ISSET_ID);
  }

  public void setSlaveIpIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SLAVEIP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CAN_PUT:
      if (value == null) {
        unsetCanPut();
      } else {
        setCanPut((Boolean)value);
      }
      break;

    case SLAVE_IP:
      if (value == null) {
        unsetSlaveIp();
      } else {
        setSlaveIp((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CAN_PUT:
      return Boolean.valueOf(isCanPut());

    case SLAVE_IP:
      return Integer.valueOf(getSlaveIp());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CAN_PUT:
      return isSetCanPut();
    case SLAVE_IP:
      return isSetSlaveIp();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PutFileParams)
      return this.equals((PutFileParams)that);
    return false;
  }

  public boolean equals(PutFileParams that) {
    if (that == null)
      return false;

    boolean this_present_canPut = true;
    boolean that_present_canPut = true;
    if (this_present_canPut || that_present_canPut) {
      if (!(this_present_canPut && that_present_canPut))
        return false;
      if (this.canPut != that.canPut)
        return false;
    }

    boolean this_present_slaveIp = true;
    boolean that_present_slaveIp = true;
    if (this_present_slaveIp || that_present_slaveIp) {
      if (!(this_present_slaveIp && that_present_slaveIp))
        return false;
      if (this.slaveIp != that.slaveIp)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(PutFileParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCanPut()).compareTo(other.isSetCanPut());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCanPut()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.canPut, other.canPut);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSlaveIp()).compareTo(other.isSetSlaveIp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSlaveIp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.slaveIp, other.slaveIp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PutFileParams(");
    boolean first = true;

    sb.append("canPut:");
    sb.append(this.canPut);
    first = false;
    if (!first) sb.append(", ");
    sb.append("slaveIp:");
    sb.append(this.slaveIp);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'canPut' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'slaveIp' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PutFileParamsStandardSchemeFactory implements SchemeFactory {
    public PutFileParamsStandardScheme getScheme() {
      return new PutFileParamsStandardScheme();
    }
  }

  private static class PutFileParamsStandardScheme extends StandardScheme<PutFileParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PutFileParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CAN_PUT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.canPut = iprot.readBool();
              struct.setCanPutIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SLAVE_IP
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.slaveIp = iprot.readI32();
              struct.setSlaveIpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetCanPut()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'canPut' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetSlaveIp()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'slaveIp' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PutFileParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CAN_PUT_FIELD_DESC);
      oprot.writeBool(struct.canPut);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SLAVE_IP_FIELD_DESC);
      oprot.writeI32(struct.slaveIp);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PutFileParamsTupleSchemeFactory implements SchemeFactory {
    public PutFileParamsTupleScheme getScheme() {
      return new PutFileParamsTupleScheme();
    }
  }

  private static class PutFileParamsTupleScheme extends TupleScheme<PutFileParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PutFileParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.canPut);
      oprot.writeI32(struct.slaveIp);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PutFileParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.canPut = iprot.readBool();
      struct.setCanPutIsSet(true);
      struct.slaveIp = iprot.readI32();
      struct.setSlaveIpIsSet(true);
    }
  }

}
