// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetWidgetSlotRsp.proto

package emu.grasscutter.net.proto;

public final class SetWidgetSlotRspOuterClass {
  private SetWidgetSlotRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetWidgetSlotRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetWidgetSlotRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 material_id = 12;</code>
     * @return The materialId.
     */
    int getMaterialId();

    /**
     * <code>repeated .WidgetSlotTag tag_list = 15;</code>
     * @return A list containing the tagList.
     */
    java.util.List<emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag> getTagListList();
    /**
     * <code>repeated .WidgetSlotTag tag_list = 15;</code>
     * @return The count of tagList.
     */
    int getTagListCount();
    /**
     * <code>repeated .WidgetSlotTag tag_list = 15;</code>
     * @param index The index of the element to return.
     * @return The tagList at the given index.
     */
    emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag getTagList(int index);
    /**
     * <code>repeated .WidgetSlotTag tag_list = 15;</code>
     * @return A list containing the enum numeric values on the wire for tagList.
     */
    java.util.List<java.lang.Integer>
    getTagListValueList();
    /**
     * <code>repeated .WidgetSlotTag tag_list = 15;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of tagList at the given index.
     */
    int getTagListValue(int index);

    /**
     * <code>.WidgetSlotOp op = 2;</code>
     * @return The enum numeric value on the wire for op.
     */
    int getOpValue();
    /**
     * <code>.WidgetSlotOp op = 2;</code>
     * @return The op.
     */
    emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp getOp();

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * Name: MHKKIGIOHPP
   * CmdId: 4270
   * </pre>
   *
   * Protobuf type {@code SetWidgetSlotRsp}
   */
  public static final class SetWidgetSlotRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetWidgetSlotRsp)
      SetWidgetSlotRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetWidgetSlotRsp.newBuilder() to construct.
    private SetWidgetSlotRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetWidgetSlotRsp() {
      tagList_ = java.util.Collections.emptyList();
      op_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetWidgetSlotRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetWidgetSlotRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 16: {
              int rawValue = input.readEnum();

              op_ = rawValue;
              break;
            }
            case 56: {

              retcode_ = input.readInt32();
              break;
            }
            case 96: {

              materialId_ = input.readUInt32();
              break;
            }
            case 120: {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                tagList_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              tagList_.add(rawValue);
              break;
            }
            case 122: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int rawValue = input.readEnum();
                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                  tagList_ = new java.util.ArrayList<java.lang.Integer>();
                  mutable_bitField0_ |= 0x00000001;
                }
                tagList_.add(rawValue);
              }
              input.popLimit(oldLimit);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          tagList_ = java.util.Collections.unmodifiableList(tagList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.internal_static_SetWidgetSlotRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.internal_static_SetWidgetSlotRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp.class, emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp.Builder.class);
    }

    public static final int MATERIAL_ID_FIELD_NUMBER = 12;
    private int materialId_;
    /**
     * <code>uint32 material_id = 12;</code>
     * @return The materialId.
     */
    @java.lang.Override
    public int getMaterialId() {
      return materialId_;
    }

    public static final int TAG_LIST_FIELD_NUMBER = 15;
    private java.util.List<java.lang.Integer> tagList_;
    private static final com.google.protobuf.Internal.ListAdapter.Converter<
        java.lang.Integer, emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag> tagList_converter_ =
            new com.google.protobuf.Internal.ListAdapter.Converter<
                java.lang.Integer, emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag>() {
              public emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag convert(java.lang.Integer from) {
                @SuppressWarnings("deprecation")
                emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag result = emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag.valueOf(from);
                return result == null ? emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag.UNRECOGNIZED : result;
              }
            };
    /**
     * <code>repeated .WidgetSlotTag tag_list = 15;</code>
     * @return A list containing the tagList.
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag> getTagListList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag>(tagList_, tagList_converter_);
    }
    /**
     * <code>repeated .WidgetSlotTag tag_list = 15;</code>
     * @return The count of tagList.
     */
    @java.lang.Override
    public int getTagListCount() {
      return tagList_.size();
    }
    /**
     * <code>repeated .WidgetSlotTag tag_list = 15;</code>
     * @param index The index of the element to return.
     * @return The tagList at the given index.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag getTagList(int index) {
      return tagList_converter_.convert(tagList_.get(index));
    }
    /**
     * <code>repeated .WidgetSlotTag tag_list = 15;</code>
     * @return A list containing the enum numeric values on the wire for tagList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
    getTagListValueList() {
      return tagList_;
    }
    /**
     * <code>repeated .WidgetSlotTag tag_list = 15;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of tagList at the given index.
     */
    @java.lang.Override
    public int getTagListValue(int index) {
      return tagList_.get(index);
    }
    private int tagListMemoizedSerializedSize;

    public static final int OP_FIELD_NUMBER = 2;
    private int op_;
    /**
     * <code>.WidgetSlotOp op = 2;</code>
     * @return The enum numeric value on the wire for op.
     */
    @java.lang.Override public int getOpValue() {
      return op_;
    }
    /**
     * <code>.WidgetSlotOp op = 2;</code>
     * @return The op.
     */
    @java.lang.Override public emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp getOp() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp result = emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp.valueOf(op_);
      return result == null ? emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp.UNRECOGNIZED : result;
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      getSerializedSize();
      if (op_ != emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp.WIDGET_SLOT_OP_ATTACH.getNumber()) {
        output.writeEnum(2, op_);
      }
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      if (materialId_ != 0) {
        output.writeUInt32(12, materialId_);
      }
      if (getTagListList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(tagListMemoizedSerializedSize);
      }
      for (int i = 0; i < tagList_.size(); i++) {
        output.writeEnumNoTag(tagList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (op_ != emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp.WIDGET_SLOT_OP_ATTACH.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, op_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
      }
      if (materialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, materialId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < tagList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeEnumSizeNoTag(tagList_.get(i));
        }
        size += dataSize;
        if (!getTagListList().isEmpty()) {  size += 1;
          size += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(dataSize);
        }tagListMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp other = (emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp) obj;

      if (getMaterialId()
          != other.getMaterialId()) return false;
      if (!tagList_.equals(other.tagList_)) return false;
      if (op_ != other.op_) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MATERIAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialId();
      if (getTagListCount() > 0) {
        hash = (37 * hash) + TAG_LIST_FIELD_NUMBER;
        hash = (53 * hash) + tagList_.hashCode();
      }
      hash = (37 * hash) + OP_FIELD_NUMBER;
      hash = (53 * hash) + op_;
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp prototype) {
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
     * <pre>
     * Name: MHKKIGIOHPP
     * CmdId: 4270
     * </pre>
     *
     * Protobuf type {@code SetWidgetSlotRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetWidgetSlotRsp)
        emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.internal_static_SetWidgetSlotRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.internal_static_SetWidgetSlotRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp.class, emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        materialId_ = 0;

        tagList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        op_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.internal_static_SetWidgetSlotRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp build() {
        emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp buildPartial() {
        emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp result = new emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp(this);
        int from_bitField0_ = bitField0_;
        result.materialId_ = materialId_;
        if (((bitField0_ & 0x00000001) != 0)) {
          tagList_ = java.util.Collections.unmodifiableList(tagList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tagList_ = tagList_;
        result.op_ = op_;
        result.retcode_ = retcode_;
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
        if (other instanceof emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp) {
          return mergeFrom((emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp other) {
        if (other == emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp.getDefaultInstance()) return this;
        if (other.getMaterialId() != 0) {
          setMaterialId(other.getMaterialId());
        }
        if (!other.tagList_.isEmpty()) {
          if (tagList_.isEmpty()) {
            tagList_ = other.tagList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTagListIsMutable();
            tagList_.addAll(other.tagList_);
          }
          onChanged();
        }
        if (other.op_ != 0) {
          setOpValue(other.getOpValue());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        this.mergeUnknownFields(other.unknownFields);
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
        emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int materialId_ ;
      /**
       * <code>uint32 material_id = 12;</code>
       * @return The materialId.
       */
      @java.lang.Override
      public int getMaterialId() {
        return materialId_;
      }
      /**
       * <code>uint32 material_id = 12;</code>
       * @param value The materialId to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialId(int value) {
        
        materialId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 material_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialId() {
        
        materialId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Integer> tagList_ =
        java.util.Collections.emptyList();
      private void ensureTagListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          tagList_ = new java.util.ArrayList<java.lang.Integer>(tagList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated .WidgetSlotTag tag_list = 15;</code>
       * @return A list containing the tagList.
       */
      public java.util.List<emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag> getTagListList() {
        return new com.google.protobuf.Internal.ListAdapter<
            java.lang.Integer, emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag>(tagList_, tagList_converter_);
      }
      /**
       * <code>repeated .WidgetSlotTag tag_list = 15;</code>
       * @return The count of tagList.
       */
      public int getTagListCount() {
        return tagList_.size();
      }
      /**
       * <code>repeated .WidgetSlotTag tag_list = 15;</code>
       * @param index The index of the element to return.
       * @return The tagList at the given index.
       */
      public emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag getTagList(int index) {
        return tagList_converter_.convert(tagList_.get(index));
      }
      /**
       * <code>repeated .WidgetSlotTag tag_list = 15;</code>
       * @param index The index to set the value at.
       * @param value The tagList to set.
       * @return This builder for chaining.
       */
      public Builder setTagList(
          int index, emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagListIsMutable();
        tagList_.set(index, value.getNumber());
        onChanged();
        return this;
      }
      /**
       * <code>repeated .WidgetSlotTag tag_list = 15;</code>
       * @param value The tagList to add.
       * @return This builder for chaining.
       */
      public Builder addTagList(emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagListIsMutable();
        tagList_.add(value.getNumber());
        onChanged();
        return this;
      }
      /**
       * <code>repeated .WidgetSlotTag tag_list = 15;</code>
       * @param values The tagList to add.
       * @return This builder for chaining.
       */
      public Builder addAllTagList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag> values) {
        ensureTagListIsMutable();
        for (emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag value : values) {
          tagList_.add(value.getNumber());
        }
        onChanged();
        return this;
      }
      /**
       * <code>repeated .WidgetSlotTag tag_list = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearTagList() {
        tagList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .WidgetSlotTag tag_list = 15;</code>
       * @return A list containing the enum numeric values on the wire for tagList.
       */
      public java.util.List<java.lang.Integer>
      getTagListValueList() {
        return java.util.Collections.unmodifiableList(tagList_);
      }
      /**
       * <code>repeated .WidgetSlotTag tag_list = 15;</code>
       * @param index The index of the value to return.
       * @return The enum numeric value on the wire of tagList at the given index.
       */
      public int getTagListValue(int index) {
        return tagList_.get(index);
      }
      /**
       * <code>repeated .WidgetSlotTag tag_list = 15;</code>
       * @param index The index of the value to return.
       * @return The enum numeric value on the wire of tagList at the given index.
       * @return This builder for chaining.
       */
      public Builder setTagListValue(
          int index, int value) {
        ensureTagListIsMutable();
        tagList_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .WidgetSlotTag tag_list = 15;</code>
       * @param value The enum numeric value on the wire for tagList to add.
       * @return This builder for chaining.
       */
      public Builder addTagListValue(int value) {
        ensureTagListIsMutable();
        tagList_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .WidgetSlotTag tag_list = 15;</code>
       * @param values The enum numeric values on the wire for tagList to add.
       * @return This builder for chaining.
       */
      public Builder addAllTagListValue(
          java.lang.Iterable<java.lang.Integer> values) {
        ensureTagListIsMutable();
        for (int value : values) {
          tagList_.add(value);
        }
        onChanged();
        return this;
      }

      private int op_ = 0;
      /**
       * <code>.WidgetSlotOp op = 2;</code>
       * @return The enum numeric value on the wire for op.
       */
      @java.lang.Override public int getOpValue() {
        return op_;
      }
      /**
       * <code>.WidgetSlotOp op = 2;</code>
       * @param value The enum numeric value on the wire for op to set.
       * @return This builder for chaining.
       */
      public Builder setOpValue(int value) {
        
        op_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.WidgetSlotOp op = 2;</code>
       * @return The op.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp getOp() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp result = emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp.valueOf(op_);
        return result == null ? emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp.UNRECOGNIZED : result;
      }
      /**
       * <code>.WidgetSlotOp op = 2;</code>
       * @param value The op to set.
       * @return This builder for chaining.
       */
      public Builder setOp(emu.grasscutter.net.proto.WidgetSlotOpOuterClass.WidgetSlotOp value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        op_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.WidgetSlotOp op = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearOp() {
        
        op_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SetWidgetSlotRsp)
    }

    // @@protoc_insertion_point(class_scope:SetWidgetSlotRsp)
    private static final emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp();
    }

    public static emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetWidgetSlotRsp>
        PARSER = new com.google.protobuf.AbstractParser<SetWidgetSlotRsp>() {
      @java.lang.Override
      public SetWidgetSlotRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetWidgetSlotRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SetWidgetSlotRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetWidgetSlotRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SetWidgetSlotRspOuterClass.SetWidgetSlotRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetWidgetSlotRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetWidgetSlotRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026SetWidgetSlotRsp.proto\032\022WidgetSlotOp.p" +
      "roto\032\023WidgetSlotTag.proto\"u\n\020SetWidgetSl" +
      "otRsp\022\023\n\013material_id\030\014 \001(\r\022 \n\010tag_list\030\017" +
      " \003(\0162\016.WidgetSlotTag\022\031\n\002op\030\002 \001(\0162\r.Widge" +
      "tSlotOp\022\017\n\007retcode\030\007 \001(\005B\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.WidgetSlotOpOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.WidgetSlotTagOuterClass.getDescriptor(),
        });
    internal_static_SetWidgetSlotRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetWidgetSlotRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetWidgetSlotRsp_descriptor,
        new java.lang.String[] { "MaterialId", "TagList", "Op", "Retcode", });
    emu.grasscutter.net.proto.WidgetSlotOpOuterClass.getDescriptor();
    emu.grasscutter.net.proto.WidgetSlotTagOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
