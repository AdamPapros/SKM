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
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2014-6-2")
public class NewSlaveRequest implements org.apache.thrift.TBase<NewSlaveRequest, NewSlaveRequest._Fields>, java.io.Serializable, Cloneable, Comparable<NewSlaveRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NewSlaveRequest");

  private static final org.apache.thrift.protocol.TField SLAVE_IP_FIELD_DESC = new org.apache.thrift.protocol.TField("slaveIP", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField FILE_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("fileIds", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField FILE_SIZES_FIELD_DESC = new org.apache.thrift.protocol.TField("fileSizes", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NewSlaveRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new NewSlaveRequestTupleSchemeFactory());
  }

  public String slaveIP; // required
  public List<Integer> fileIds; // required
  public List<Long> fileSizes; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SLAVE_IP((short)1, "slaveIP"),
    FILE_IDS((short)2, "fileIds"),
    FILE_SIZES((short)3, "fileSizes");

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
        case 1: // SLAVE_IP
          return SLAVE_IP;
        case 2: // FILE_IDS
          return FILE_IDS;
        case 3: // FILE_SIZES
          return FILE_SIZES;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SLAVE_IP, new org.apache.thrift.meta_data.FieldMetaData("slaveIP", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "IPType")));
    tmpMap.put(_Fields.FILE_IDS, new org.apache.thrift.meta_data.FieldMetaData("fileIds", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32            , "int"))));
    tmpMap.put(_Fields.FILE_SIZES, new org.apache.thrift.meta_data.FieldMetaData("fileSizes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64            , "long"))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NewSlaveRequest.class, metaDataMap);
  }

  public NewSlaveRequest() {
  }

  public NewSlaveRequest(
    String slaveIP,
    List<Integer> fileIds,
    List<Long> fileSizes)
  {
    this();
    this.slaveIP = slaveIP;
    this.fileIds = fileIds;
    this.fileSizes = fileSizes;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NewSlaveRequest(NewSlaveRequest other) {
    if (other.isSetSlaveIP()) {
      this.slaveIP = other.slaveIP;
    }
    if (other.isSetFileIds()) {
      List<Integer> __this__fileIds = new ArrayList<Integer>(other.fileIds.size());
      for (Integer other_element : other.fileIds) {
        __this__fileIds.add(other_element);
      }
      this.fileIds = __this__fileIds;
    }
    if (other.isSetFileSizes()) {
      List<Long> __this__fileSizes = new ArrayList<Long>(other.fileSizes.size());
      for (Long other_element : other.fileSizes) {
        __this__fileSizes.add(other_element);
      }
      this.fileSizes = __this__fileSizes;
    }
  }

  public NewSlaveRequest deepCopy() {
    return new NewSlaveRequest(this);
  }

  @Override
  public void clear() {
    this.slaveIP = null;
    this.fileIds = null;
    this.fileSizes = null;
  }

  public String getSlaveIP() {
    return this.slaveIP;
  }

  public NewSlaveRequest setSlaveIP(String slaveIP) {
    this.slaveIP = slaveIP;
    return this;
  }

  public void unsetSlaveIP() {
    this.slaveIP = null;
  }

  /** Returns true if field slaveIP is set (has been assigned a value) and false otherwise */
  public boolean isSetSlaveIP() {
    return this.slaveIP != null;
  }

  public void setSlaveIPIsSet(boolean value) {
    if (!value) {
      this.slaveIP = null;
    }
  }

  public int getFileIdsSize() {
    return (this.fileIds == null) ? 0 : this.fileIds.size();
  }

  public java.util.Iterator<Integer> getFileIdsIterator() {
    return (this.fileIds == null) ? null : this.fileIds.iterator();
  }

  public void addToFileIds(int elem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<Integer>();
    }
    this.fileIds.add(elem);
  }

  public List<Integer> getFileIds() {
    return this.fileIds;
  }

  public NewSlaveRequest setFileIds(List<Integer> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public void unsetFileIds() {
    this.fileIds = null;
  }

  /** Returns true if field fileIds is set (has been assigned a value) and false otherwise */
  public boolean isSetFileIds() {
    return this.fileIds != null;
  }

  public void setFileIdsIsSet(boolean value) {
    if (!value) {
      this.fileIds = null;
    }
  }

  public int getFileSizesSize() {
    return (this.fileSizes == null) ? 0 : this.fileSizes.size();
  }

  public java.util.Iterator<Long> getFileSizesIterator() {
    return (this.fileSizes == null) ? null : this.fileSizes.iterator();
  }

  public void addToFileSizes(long elem) {
    if (this.fileSizes == null) {
      this.fileSizes = new ArrayList<Long>();
    }
    this.fileSizes.add(elem);
  }

  public List<Long> getFileSizes() {
    return this.fileSizes;
  }

  public NewSlaveRequest setFileSizes(List<Long> fileSizes) {
    this.fileSizes = fileSizes;
    return this;
  }

  public void unsetFileSizes() {
    this.fileSizes = null;
  }

  /** Returns true if field fileSizes is set (has been assigned a value) and false otherwise */
  public boolean isSetFileSizes() {
    return this.fileSizes != null;
  }

  public void setFileSizesIsSet(boolean value) {
    if (!value) {
      this.fileSizes = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SLAVE_IP:
      if (value == null) {
        unsetSlaveIP();
      } else {
        setSlaveIP((String)value);
      }
      break;

    case FILE_IDS:
      if (value == null) {
        unsetFileIds();
      } else {
        setFileIds((List<Integer>)value);
      }
      break;

    case FILE_SIZES:
      if (value == null) {
        unsetFileSizes();
      } else {
        setFileSizes((List<Long>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SLAVE_IP:
      return getSlaveIP();

    case FILE_IDS:
      return getFileIds();

    case FILE_SIZES:
      return getFileSizes();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SLAVE_IP:
      return isSetSlaveIP();
    case FILE_IDS:
      return isSetFileIds();
    case FILE_SIZES:
      return isSetFileSizes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NewSlaveRequest)
      return this.equals((NewSlaveRequest)that);
    return false;
  }

  public boolean equals(NewSlaveRequest that) {
    if (that == null)
      return false;

    boolean this_present_slaveIP = true && this.isSetSlaveIP();
    boolean that_present_slaveIP = true && that.isSetSlaveIP();
    if (this_present_slaveIP || that_present_slaveIP) {
      if (!(this_present_slaveIP && that_present_slaveIP))
        return false;
      if (!this.slaveIP.equals(that.slaveIP))
        return false;
    }

    boolean this_present_fileIds = true && this.isSetFileIds();
    boolean that_present_fileIds = true && that.isSetFileIds();
    if (this_present_fileIds || that_present_fileIds) {
      if (!(this_present_fileIds && that_present_fileIds))
        return false;
      if (!this.fileIds.equals(that.fileIds))
        return false;
    }

    boolean this_present_fileSizes = true && this.isSetFileSizes();
    boolean that_present_fileSizes = true && that.isSetFileSizes();
    if (this_present_fileSizes || that_present_fileSizes) {
      if (!(this_present_fileSizes && that_present_fileSizes))
        return false;
      if (!this.fileSizes.equals(that.fileSizes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_slaveIP = true && (isSetSlaveIP());
    list.add(present_slaveIP);
    if (present_slaveIP)
      list.add(slaveIP);

    boolean present_fileIds = true && (isSetFileIds());
    list.add(present_fileIds);
    if (present_fileIds)
      list.add(fileIds);

    boolean present_fileSizes = true && (isSetFileSizes());
    list.add(present_fileSizes);
    if (present_fileSizes)
      list.add(fileSizes);

    return list.hashCode();
  }

  @Override
  public int compareTo(NewSlaveRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSlaveIP()).compareTo(other.isSetSlaveIP());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSlaveIP()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.slaveIP, other.slaveIP);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFileIds()).compareTo(other.isSetFileIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFileIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fileIds, other.fileIds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFileSizes()).compareTo(other.isSetFileSizes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFileSizes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fileSizes, other.fileSizes);
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
    StringBuilder sb = new StringBuilder("NewSlaveRequest(");
    boolean first = true;

    sb.append("slaveIP:");
    if (this.slaveIP == null) {
      sb.append("null");
    } else {
      sb.append(this.slaveIP);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("fileIds:");
    if (this.fileIds == null) {
      sb.append("null");
    } else {
      sb.append(this.fileIds);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("fileSizes:");
    if (this.fileSizes == null) {
      sb.append("null");
    } else {
      sb.append(this.fileSizes);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (slaveIP == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'slaveIP' was not present! Struct: " + toString());
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class NewSlaveRequestStandardSchemeFactory implements SchemeFactory {
    public NewSlaveRequestStandardScheme getScheme() {
      return new NewSlaveRequestStandardScheme();
    }
  }

  private static class NewSlaveRequestStandardScheme extends StandardScheme<NewSlaveRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NewSlaveRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SLAVE_IP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.slaveIP = iprot.readString();
              struct.setSlaveIPIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FILE_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.fileIds = new ArrayList<Integer>(_list16.size);
                for (int _i17 = 0; _i17 < _list16.size; ++_i17)
                {
                  int _elem18;
                  _elem18 = iprot.readI32();
                  struct.fileIds.add(_elem18);
                }
                iprot.readListEnd();
              }
              struct.setFileIdsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FILE_SIZES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list19 = iprot.readListBegin();
                struct.fileSizes = new ArrayList<Long>(_list19.size);
                for (int _i20 = 0; _i20 < _list19.size; ++_i20)
                {
                  long _elem21;
                  _elem21 = iprot.readI64();
                  struct.fileSizes.add(_elem21);
                }
                iprot.readListEnd();
              }
              struct.setFileSizesIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, NewSlaveRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.slaveIP != null) {
        oprot.writeFieldBegin(SLAVE_IP_FIELD_DESC);
        oprot.writeString(struct.slaveIP);
        oprot.writeFieldEnd();
      }
      if (struct.fileIds != null) {
        oprot.writeFieldBegin(FILE_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.fileIds.size()));
          for (int _iter22 : struct.fileIds)
          {
            oprot.writeI32(_iter22);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.fileSizes != null) {
        oprot.writeFieldBegin(FILE_SIZES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.fileSizes.size()));
          for (long _iter23 : struct.fileSizes)
          {
            oprot.writeI64(_iter23);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NewSlaveRequestTupleSchemeFactory implements SchemeFactory {
    public NewSlaveRequestTupleScheme getScheme() {
      return new NewSlaveRequestTupleScheme();
    }
  }

  private static class NewSlaveRequestTupleScheme extends TupleScheme<NewSlaveRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NewSlaveRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.slaveIP);
      BitSet optionals = new BitSet();
      if (struct.isSetFileIds()) {
        optionals.set(0);
      }
      if (struct.isSetFileSizes()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetFileIds()) {
        {
          oprot.writeI32(struct.fileIds.size());
          for (int _iter24 : struct.fileIds)
          {
            oprot.writeI32(_iter24);
          }
        }
      }
      if (struct.isSetFileSizes()) {
        {
          oprot.writeI32(struct.fileSizes.size());
          for (long _iter25 : struct.fileSizes)
          {
            oprot.writeI64(_iter25);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NewSlaveRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.slaveIP = iprot.readString();
      struct.setSlaveIPIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list26 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.fileIds = new ArrayList<Integer>(_list26.size);
          for (int _i27 = 0; _i27 < _list26.size; ++_i27)
          {
            int _elem28;
            _elem28 = iprot.readI32();
            struct.fileIds.add(_elem28);
          }
        }
        struct.setFileIdsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.fileSizes = new ArrayList<Long>(_list29.size);
          for (int _i30 = 0; _i30 < _list29.size; ++_i30)
          {
            long _elem31;
            _elem31 = iprot.readI64();
            struct.fileSizes.add(_elem31);
          }
        }
        struct.setFileSizesIsSet(true);
      }
    }
  }

}

