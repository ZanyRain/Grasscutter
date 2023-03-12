// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GroupSuiteNotify.proto

package emu.grasscutter.net.proto;

public final class GroupSuiteNotifyOuterClass {
  private GroupSuiteNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GroupSuiteNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GroupSuiteNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; groupMap = 12;</code>
     */
    int getGroupMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; groupMap = 12;</code>
     */
    boolean containsGroupMap(
        int key);
    /**
     * Use {@link #getGroupMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getGroupMap();
    /**
     * <code>map&lt;uint32, uint32&gt; groupMap = 12;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getGroupMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; groupMap = 12;</code>
     */

    int getGroupMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; groupMap = 12;</code>
     */

    int getGroupMapOrThrow(
        int key);
  }
  /**
   * Protobuf type {@code GroupSuiteNotify}
   */
  public static final class GroupSuiteNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GroupSuiteNotify)
      GroupSuiteNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GroupSuiteNotify.newBuilder() to construct.
    private GroupSuiteNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GroupSuiteNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GroupSuiteNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GroupSuiteNotify(
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
            case 98: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                groupMap_ = com.google.protobuf.MapField.newMapField(
                    GroupMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              groupMap__ = input.readMessage(
                  GroupMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              groupMap_.getMutableMap().put(
                  groupMap__.getKey(), groupMap__.getValue());
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.internal_static_GroupSuiteNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 12:
          return internalGetGroupMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.internal_static_GroupSuiteNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify.class, emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code GroupSuiteNotify.CABLEKMACEB}
     */
    public enum CABLEKMACEB
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 3115;</code>
       */
      PEPPOHPHJOJ(1, 3115),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final CABLEKMACEB DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 3115;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 3115;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static CABLEKMACEB valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static CABLEKMACEB forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 3115: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<CABLEKMACEB>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          CABLEKMACEB> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CABLEKMACEB>() {
              public CABLEKMACEB findValueByNumber(int number) {
                return CABLEKMACEB.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final CABLEKMACEB[] VALUES = getStaticValuesArray();
      private static CABLEKMACEB[] getStaticValuesArray() {
        return new CABLEKMACEB[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static CABLEKMACEB valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private CABLEKMACEB(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:GroupSuiteNotify.CABLEKMACEB)
    }

    public static final int GROUPMAP_FIELD_NUMBER = 12;
    private static final class GroupMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.internal_static_GroupSuiteNotify_GroupMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> groupMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetGroupMap() {
      if (groupMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            GroupMapDefaultEntryHolder.defaultEntry);
      }
      return groupMap_;
    }

    public int getGroupMapCount() {
      return internalGetGroupMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; groupMap = 12;</code>
     */

    @java.lang.Override
    public boolean containsGroupMap(
        int key) {
      
      return internalGetGroupMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getGroupMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getGroupMap() {
      return getGroupMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; groupMap = 12;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getGroupMapMap() {
      return internalGetGroupMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; groupMap = 12;</code>
     */
    @java.lang.Override

    public int getGroupMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetGroupMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; groupMap = 12;</code>
     */
    @java.lang.Override

    public int getGroupMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetGroupMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetGroupMap(),
          GroupMapDefaultEntryHolder.defaultEntry,
          12);
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetGroupMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        groupMap__ = GroupMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(12, groupMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify other = (emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify) obj;

      if (!internalGetGroupMap().equals(
          other.internalGetGroupMap())) return false;
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
      if (!internalGetGroupMap().getMap().isEmpty()) {
        hash = (37 * hash) + GROUPMAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetGroupMap().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify prototype) {
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
     * Protobuf type {@code GroupSuiteNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GroupSuiteNotify)
        emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.internal_static_GroupSuiteNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 12:
            return internalGetGroupMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 12:
            return internalGetMutableGroupMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.internal_static_GroupSuiteNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify.class, emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify.newBuilder()
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
        internalGetMutableGroupMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.internal_static_GroupSuiteNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify build() {
        emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify buildPartial() {
        emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify result = new emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify(this);
        int from_bitField0_ = bitField0_;
        result.groupMap_ = internalGetGroupMap();
        result.groupMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify other) {
        if (other == emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify.getDefaultInstance()) return this;
        internalGetMutableGroupMap().mergeFrom(
            other.internalGetGroupMap());
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
        emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> groupMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetGroupMap() {
        if (groupMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              GroupMapDefaultEntryHolder.defaultEntry);
        }
        return groupMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableGroupMap() {
        onChanged();;
        if (groupMap_ == null) {
          groupMap_ = com.google.protobuf.MapField.newMapField(
              GroupMapDefaultEntryHolder.defaultEntry);
        }
        if (!groupMap_.isMutable()) {
          groupMap_ = groupMap_.copy();
        }
        return groupMap_;
      }

      public int getGroupMapCount() {
        return internalGetGroupMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; groupMap = 12;</code>
       */

      @java.lang.Override
      public boolean containsGroupMap(
          int key) {
        
        return internalGetGroupMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getGroupMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getGroupMap() {
        return getGroupMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; groupMap = 12;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getGroupMapMap() {
        return internalGetGroupMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; groupMap = 12;</code>
       */
      @java.lang.Override

      public int getGroupMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetGroupMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; groupMap = 12;</code>
       */
      @java.lang.Override

      public int getGroupMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetGroupMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearGroupMap() {
        internalGetMutableGroupMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; groupMap = 12;</code>
       */

      public Builder removeGroupMap(
          int key) {
        
        internalGetMutableGroupMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableGroupMap() {
        return internalGetMutableGroupMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; groupMap = 12;</code>
       */
      public Builder putGroupMap(
          int key,
          int value) {
        
        
        internalGetMutableGroupMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; groupMap = 12;</code>
       */

      public Builder putAllGroupMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableGroupMap().getMutableMap()
            .putAll(values);
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


      // @@protoc_insertion_point(builder_scope:GroupSuiteNotify)
    }

    // @@protoc_insertion_point(class_scope:GroupSuiteNotify)
    private static final emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify();
    }

    public static emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GroupSuiteNotify>
        PARSER = new com.google.protobuf.AbstractParser<GroupSuiteNotify>() {
      @java.lang.Override
      public GroupSuiteNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GroupSuiteNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GroupSuiteNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GroupSuiteNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GroupSuiteNotifyOuterClass.GroupSuiteNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GroupSuiteNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GroupSuiteNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GroupSuiteNotify_GroupMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GroupSuiteNotify_GroupMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026GroupSuiteNotify.proto\"\307\001\n\020GroupSuiteN" +
      "otify\0221\n\010groupMap\030\014 \003(\0132\037.GroupSuiteNoti" +
      "fy.GroupMapEntry\032/\n\rGroupMapEntry\022\013\n\003key" +
      "\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001\"O\n\013CABLEKMACEB" +
      "\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\253\030\022\017\n\013DCDNILFD" +
      "FLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001B\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GroupSuiteNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GroupSuiteNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GroupSuiteNotify_descriptor,
        new java.lang.String[] { "GroupMap", });
    internal_static_GroupSuiteNotify_GroupMapEntry_descriptor =
      internal_static_GroupSuiteNotify_descriptor.getNestedTypes().get(0);
    internal_static_GroupSuiteNotify_GroupMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GroupSuiteNotify_GroupMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
