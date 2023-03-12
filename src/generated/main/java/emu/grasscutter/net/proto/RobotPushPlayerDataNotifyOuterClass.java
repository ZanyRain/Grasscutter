// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RobotPushPlayerDataNotify.proto

package emu.grasscutter.net.proto;

public final class RobotPushPlayerDataNotifyOuterClass {
  private RobotPushPlayerDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RobotPushPlayerDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RobotPushPlayerDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes bin = 6;</code>
     * @return The bin.
     */
    com.google.protobuf.ByteString getBin();
  }
  /**
   * Protobuf type {@code RobotPushPlayerDataNotify}
   */
  public static final class RobotPushPlayerDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RobotPushPlayerDataNotify)
      RobotPushPlayerDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RobotPushPlayerDataNotify.newBuilder() to construct.
    private RobotPushPlayerDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RobotPushPlayerDataNotify() {
      bin_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RobotPushPlayerDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RobotPushPlayerDataNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 50: {

              bin_ = input.readBytes();
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
      return emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.internal_static_RobotPushPlayerDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.internal_static_RobotPushPlayerDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify.class, emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code RobotPushPlayerDataNotify.DELIFMCIALG}
     */
    public enum DELIFMCIALG
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 16;</code>
       */
      PEPPOHPHJOJ(1, 16),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final DELIFMCIALG DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 16;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 16;
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
      public static DELIFMCIALG valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static DELIFMCIALG forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 16: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<DELIFMCIALG>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          DELIFMCIALG> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<DELIFMCIALG>() {
              public DELIFMCIALG findValueByNumber(int number) {
                return DELIFMCIALG.forNumber(number);
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
        return emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final DELIFMCIALG[] VALUES = getStaticValuesArray();
      private static DELIFMCIALG[] getStaticValuesArray() {
        return new DELIFMCIALG[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static DELIFMCIALG valueOf(
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

      private DELIFMCIALG(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:RobotPushPlayerDataNotify.DELIFMCIALG)
    }

    public static final int BIN_FIELD_NUMBER = 6;
    private com.google.protobuf.ByteString bin_;
    /**
     * <code>bytes bin = 6;</code>
     * @return The bin.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBin() {
      return bin_;
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
      if (!bin_.isEmpty()) {
        output.writeBytes(6, bin_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!bin_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, bin_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify other = (emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify) obj;

      if (!getBin()
          .equals(other.getBin())) return false;
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
      hash = (37 * hash) + BIN_FIELD_NUMBER;
      hash = (53 * hash) + getBin().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify prototype) {
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
     * Protobuf type {@code RobotPushPlayerDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RobotPushPlayerDataNotify)
        emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.internal_static_RobotPushPlayerDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.internal_static_RobotPushPlayerDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify.class, emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify.newBuilder()
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
        bin_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.internal_static_RobotPushPlayerDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify build() {
        emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify buildPartial() {
        emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify result = new emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify(this);
        result.bin_ = bin_;
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
        if (other instanceof emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify other) {
        if (other == emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify.getDefaultInstance()) return this;
        if (other.getBin() != com.google.protobuf.ByteString.EMPTY) {
          setBin(other.getBin());
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
        emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString bin_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes bin = 6;</code>
       * @return The bin.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getBin() {
        return bin_;
      }
      /**
       * <code>bytes bin = 6;</code>
       * @param value The bin to set.
       * @return This builder for chaining.
       */
      public Builder setBin(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        bin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes bin = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearBin() {
        
        bin_ = getDefaultInstance().getBin();
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


      // @@protoc_insertion_point(builder_scope:RobotPushPlayerDataNotify)
    }

    // @@protoc_insertion_point(class_scope:RobotPushPlayerDataNotify)
    private static final emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify();
    }

    public static emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RobotPushPlayerDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<RobotPushPlayerDataNotify>() {
      @java.lang.Override
      public RobotPushPlayerDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RobotPushPlayerDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RobotPushPlayerDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RobotPushPlayerDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RobotPushPlayerDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RobotPushPlayerDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037RobotPushPlayerDataNotify.proto\032\013bytes" +
      ".proto\"x\n\031RobotPushPlayerDataNotify\022\013\n\003b" +
      "in\030\006 \001(\014\"N\n\013DELIFMCIALG\022\010\n\004NONE\020\000\022\017\n\013PEP" +
      "POHPHJOJ\020\020\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPO" +
      "EA\020\001\032\002\020\001B\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Bytes.getDescriptor(),
        });
    internal_static_RobotPushPlayerDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RobotPushPlayerDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RobotPushPlayerDataNotify_descriptor,
        new java.lang.String[] { "Bin", });
    emu.grasscutter.net.proto.Bytes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
