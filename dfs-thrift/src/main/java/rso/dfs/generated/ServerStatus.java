/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package rso.dfs.generated;

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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2014-5-26")
public class ServerStatus implements org.apache.thrift.TBase<ServerStatus, ServerStatus._Fields>, java.io.Serializable, Cloneable, Comparable<ServerStatus> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ServerStatus");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField FILES_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("filesNumber", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField FREE_SPACE_FIELD_DESC = new org.apache.thrift.protocol.TField("freeSpace", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField USED_SPACE_FIELD_DESC = new org.apache.thrift.protocol.TField("usedSpace", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ServerStatusStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ServerStatusTupleSchemeFactory());
  }

  /**
   * 
   * @see ServerType
   */
  public ServerType type; // required
  public int filesNumber; // required
  public long freeSpace; // required
  public long usedSpace; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see ServerType
     */
    TYPE((short)1, "type"),
    FILES_NUMBER((short)2, "filesNumber"),
    FREE_SPACE((short)3, "freeSpace"),
    USED_SPACE((short)4, "usedSpace");

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
        case 1: // TYPE
          return TYPE;
        case 2: // FILES_NUMBER
          return FILES_NUMBER;
        case 3: // FREE_SPACE
          return FREE_SPACE;
        case 4: // USED_SPACE
          return USED_SPACE;
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
  private static final int __FILESNUMBER_ISSET_ID = 0;
  private static final int __FREESPACE_ISSET_ID = 1;
  private static final int __USEDSPACE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ServerType.class)));
    tmpMap.put(_Fields.FILES_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("filesNumber", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.FREE_SPACE, new org.apache.thrift.meta_data.FieldMetaData("freeSpace", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.USED_SPACE, new org.apache.thrift.meta_data.FieldMetaData("usedSpace", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ServerStatus.class, metaDataMap);
  }

  public ServerStatus() {
  }

  public ServerStatus(
    ServerType type,
    int filesNumber,
    long freeSpace,
    long usedSpace)
  {
    this();
    this.type = type;
    this.filesNumber = filesNumber;
    setFilesNumberIsSet(true);
    this.freeSpace = freeSpace;
    setFreeSpaceIsSet(true);
    this.usedSpace = usedSpace;
    setUsedSpaceIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ServerStatus(ServerStatus other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetType()) {
      this.type = other.type;
    }
    this.filesNumber = other.filesNumber;
    this.freeSpace = other.freeSpace;
    this.usedSpace = other.usedSpace;
  }

  public ServerStatus deepCopy() {
    return new ServerStatus(this);
  }

  @Override
  public void clear() {
    this.type = null;
    setFilesNumberIsSet(false);
    this.filesNumber = 0;
    setFreeSpaceIsSet(false);
    this.freeSpace = 0;
    setUsedSpaceIsSet(false);
    this.usedSpace = 0;
  }

  /**
   * 
   * @see ServerType
   */
  public ServerType getType() {
    return this.type;
  }

  /**
   * 
   * @see ServerType
   */
  public ServerStatus setType(ServerType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public int getFilesNumber() {
    return this.filesNumber;
  }

  public ServerStatus setFilesNumber(int filesNumber) {
    this.filesNumber = filesNumber;
    setFilesNumberIsSet(true);
    return this;
  }

  public void unsetFilesNumber() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FILESNUMBER_ISSET_ID);
  }

  /** Returns true if field filesNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetFilesNumber() {
    return EncodingUtils.testBit(__isset_bitfield, __FILESNUMBER_ISSET_ID);
  }

  public void setFilesNumberIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FILESNUMBER_ISSET_ID, value);
  }

  public long getFreeSpace() {
    return this.freeSpace;
  }

  public ServerStatus setFreeSpace(long freeSpace) {
    this.freeSpace = freeSpace;
    setFreeSpaceIsSet(true);
    return this;
  }

  public void unsetFreeSpace() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FREESPACE_ISSET_ID);
  }

  /** Returns true if field freeSpace is set (has been assigned a value) and false otherwise */
  public boolean isSetFreeSpace() {
    return EncodingUtils.testBit(__isset_bitfield, __FREESPACE_ISSET_ID);
  }

  public void setFreeSpaceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FREESPACE_ISSET_ID, value);
  }

  public long getUsedSpace() {
    return this.usedSpace;
  }

  public ServerStatus setUsedSpace(long usedSpace) {
    this.usedSpace = usedSpace;
    setUsedSpaceIsSet(true);
    return this;
  }

  public void unsetUsedSpace() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __USEDSPACE_ISSET_ID);
  }

  /** Returns true if field usedSpace is set (has been assigned a value) and false otherwise */
  public boolean isSetUsedSpace() {
    return EncodingUtils.testBit(__isset_bitfield, __USEDSPACE_ISSET_ID);
  }

  public void setUsedSpaceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __USEDSPACE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((ServerType)value);
      }
      break;

    case FILES_NUMBER:
      if (value == null) {
        unsetFilesNumber();
      } else {
        setFilesNumber((Integer)value);
      }
      break;

    case FREE_SPACE:
      if (value == null) {
        unsetFreeSpace();
      } else {
        setFreeSpace((Long)value);
      }
      break;

    case USED_SPACE:
      if (value == null) {
        unsetUsedSpace();
      } else {
        setUsedSpace((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case FILES_NUMBER:
      return Integer.valueOf(getFilesNumber());

    case FREE_SPACE:
      return Long.valueOf(getFreeSpace());

    case USED_SPACE:
      return Long.valueOf(getUsedSpace());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case FILES_NUMBER:
      return isSetFilesNumber();
    case FREE_SPACE:
      return isSetFreeSpace();
    case USED_SPACE:
      return isSetUsedSpace();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ServerStatus)
      return this.equals((ServerStatus)that);
    return false;
  }

  public boolean equals(ServerStatus that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_filesNumber = true;
    boolean that_present_filesNumber = true;
    if (this_present_filesNumber || that_present_filesNumber) {
      if (!(this_present_filesNumber && that_present_filesNumber))
        return false;
      if (this.filesNumber != that.filesNumber)
        return false;
    }

    boolean this_present_freeSpace = true;
    boolean that_present_freeSpace = true;
    if (this_present_freeSpace || that_present_freeSpace) {
      if (!(this_present_freeSpace && that_present_freeSpace))
        return false;
      if (this.freeSpace != that.freeSpace)
        return false;
    }

    boolean this_present_usedSpace = true;
    boolean that_present_usedSpace = true;
    if (this_present_usedSpace || that_present_usedSpace) {
      if (!(this_present_usedSpace && that_present_usedSpace))
        return false;
      if (this.usedSpace != that.usedSpace)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type.getValue());

    boolean present_filesNumber = true;
    list.add(present_filesNumber);
    if (present_filesNumber)
      list.add(filesNumber);

    boolean present_freeSpace = true;
    list.add(present_freeSpace);
    if (present_freeSpace)
      list.add(freeSpace);

    boolean present_usedSpace = true;
    list.add(present_usedSpace);
    if (present_usedSpace)
      list.add(usedSpace);

    return list.hashCode();
  }

  @Override
  public int compareTo(ServerStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFilesNumber()).compareTo(other.isSetFilesNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFilesNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filesNumber, other.filesNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFreeSpace()).compareTo(other.isSetFreeSpace());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFreeSpace()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.freeSpace, other.freeSpace);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUsedSpace()).compareTo(other.isSetUsedSpace());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsedSpace()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.usedSpace, other.usedSpace);
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
    StringBuilder sb = new StringBuilder("ServerStatus(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("filesNumber:");
    sb.append(this.filesNumber);
    first = false;
    if (!first) sb.append(", ");
    sb.append("freeSpace:");
    sb.append(this.freeSpace);
    first = false;
    if (!first) sb.append(", ");
    sb.append("usedSpace:");
    sb.append(this.usedSpace);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'filesNumber' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'freeSpace' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'usedSpace' because it's a primitive and you chose the non-beans generator.
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

  private static class ServerStatusStandardSchemeFactory implements SchemeFactory {
    public ServerStatusStandardScheme getScheme() {
      return new ServerStatusStandardScheme();
    }
  }

  private static class ServerStatusStandardScheme extends StandardScheme<ServerStatus> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ServerStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = ServerType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FILES_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.filesNumber = iprot.readI32();
              struct.setFilesNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FREE_SPACE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.freeSpace = iprot.readI64();
              struct.setFreeSpaceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // USED_SPACE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.usedSpace = iprot.readI64();
              struct.setUsedSpaceIsSet(true);
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
      if (!struct.isSetFilesNumber()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'filesNumber' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetFreeSpace()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'freeSpace' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetUsedSpace()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'usedSpace' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ServerStatus struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(FILES_NUMBER_FIELD_DESC);
      oprot.writeI32(struct.filesNumber);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FREE_SPACE_FIELD_DESC);
      oprot.writeI64(struct.freeSpace);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(USED_SPACE_FIELD_DESC);
      oprot.writeI64(struct.usedSpace);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ServerStatusTupleSchemeFactory implements SchemeFactory {
    public ServerStatusTupleScheme getScheme() {
      return new ServerStatusTupleScheme();
    }
  }

  private static class ServerStatusTupleScheme extends TupleScheme<ServerStatus> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ServerStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.type.getValue());
      oprot.writeI32(struct.filesNumber);
      oprot.writeI64(struct.freeSpace);
      oprot.writeI64(struct.usedSpace);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ServerStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.type = ServerType.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
      struct.filesNumber = iprot.readI32();
      struct.setFilesNumberIsSet(true);
      struct.freeSpace = iprot.readI64();
      struct.setFreeSpaceIsSet(true);
      struct.usedSpace = iprot.readI64();
      struct.setUsedSpaceIsSet(true);
    }
  }

}

