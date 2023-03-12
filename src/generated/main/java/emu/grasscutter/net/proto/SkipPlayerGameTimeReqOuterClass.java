// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SkipPlayerGameTimeReq.proto

package emu.grasscutter.net.proto;

public final class SkipPlayerGameTimeReqOuterClass {
  private SkipPlayerGameTimeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SkipPlayerGameTimeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SkipPlayerGameTimeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isForceSet = 3;</code>
     * @return The isForceSet.
     */
    boolean getIsForceSet();

    /**
     * <code>uint32 clientGameTime = 1;</code>
     * @return The clientGameTime.
     */
    int getClientGameTime();

    /**
     * <code>uint32 gameTime = 15;</code>
     * @return The gameTime.
     */
    int getGameTime();
  }
  /**
   * Protobuf type {@code SkipPlayerGameTimeReq}
   */
  public static final class SkipPlayerGameTimeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SkipPlayerGameTimeReq)
      SkipPlayerGameTimeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SkipPlayerGameTimeReq.newBuilder() to construct.
    private SkipPlayerGameTimeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SkipPlayerGameTimeReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SkipPlayerGameTimeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SkipPlayerGameTimeReq(
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
            case 8: {

              clientGameTime_ = input.readUInt32();
              break;
            }
            case 24: {

              isForceSet_ = input.readBool();
              break;
            }
            case 120: {

              gameTime_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.internal_static_SkipPlayerGameTimeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.internal_static_SkipPlayerGameTimeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq.class, emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq.Builder.class);
    }

    /**
     * Protobuf enum {@code SkipPlayerGameTimeReq.PPJDKEJDOGN}
     */
    public enum PPJDKEJDOGN
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 108;</code>
       */
      PEPPOHPHJOJ(1, 108),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final PPJDKEJDOGN DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final PPJDKEJDOGN EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 108;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 108;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final int EAJIABGAOCI_VALUE = 1;


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
      public static PPJDKEJDOGN valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static PPJDKEJDOGN forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 108: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<PPJDKEJDOGN>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          PPJDKEJDOGN> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<PPJDKEJDOGN>() {
              public PPJDKEJDOGN findValueByNumber(int number) {
                return PPJDKEJDOGN.forNumber(number);
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
        return emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final PPJDKEJDOGN[] VALUES = getStaticValuesArray();
      private static PPJDKEJDOGN[] getStaticValuesArray() {
        return new PPJDKEJDOGN[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static PPJDKEJDOGN valueOf(
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

      private PPJDKEJDOGN(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:SkipPlayerGameTimeReq.PPJDKEJDOGN)
    }

    public static final int ISFORCESET_FIELD_NUMBER = 3;
    private boolean isForceSet_;
    /**
     * <code>bool isForceSet = 3;</code>
     * @return The isForceSet.
     */
    @java.lang.Override
    public boolean getIsForceSet() {
      return isForceSet_;
    }

    public static final int CLIENTGAMETIME_FIELD_NUMBER = 1;
    private int clientGameTime_;
    /**
     * <code>uint32 clientGameTime = 1;</code>
     * @return The clientGameTime.
     */
    @java.lang.Override
    public int getClientGameTime() {
      return clientGameTime_;
    }

    public static final int GAMETIME_FIELD_NUMBER = 15;
    private int gameTime_;
    /**
     * <code>uint32 gameTime = 15;</code>
     * @return The gameTime.
     */
    @java.lang.Override
    public int getGameTime() {
      return gameTime_;
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
      if (clientGameTime_ != 0) {
        output.writeUInt32(1, clientGameTime_);
      }
      if (isForceSet_ != false) {
        output.writeBool(3, isForceSet_);
      }
      if (gameTime_ != 0) {
        output.writeUInt32(15, gameTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (clientGameTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, clientGameTime_);
      }
      if (isForceSet_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isForceSet_);
      }
      if (gameTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, gameTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq other = (emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq) obj;

      if (getIsForceSet()
          != other.getIsForceSet()) return false;
      if (getClientGameTime()
          != other.getClientGameTime()) return false;
      if (getGameTime()
          != other.getGameTime()) return false;
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
      hash = (37 * hash) + ISFORCESET_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsForceSet());
      hash = (37 * hash) + CLIENTGAMETIME_FIELD_NUMBER;
      hash = (53 * hash) + getClientGameTime();
      hash = (37 * hash) + GAMETIME_FIELD_NUMBER;
      hash = (53 * hash) + getGameTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq prototype) {
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
     * Protobuf type {@code SkipPlayerGameTimeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SkipPlayerGameTimeReq)
        emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.internal_static_SkipPlayerGameTimeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.internal_static_SkipPlayerGameTimeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq.class, emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq.newBuilder()
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
        isForceSet_ = false;

        clientGameTime_ = 0;

        gameTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.internal_static_SkipPlayerGameTimeReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq build() {
        emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq buildPartial() {
        emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq result = new emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq(this);
        result.isForceSet_ = isForceSet_;
        result.clientGameTime_ = clientGameTime_;
        result.gameTime_ = gameTime_;
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
        if (other instanceof emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq) {
          return mergeFrom((emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq other) {
        if (other == emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq.getDefaultInstance()) return this;
        if (other.getIsForceSet() != false) {
          setIsForceSet(other.getIsForceSet());
        }
        if (other.getClientGameTime() != 0) {
          setClientGameTime(other.getClientGameTime());
        }
        if (other.getGameTime() != 0) {
          setGameTime(other.getGameTime());
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
        emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isForceSet_ ;
      /**
       * <code>bool isForceSet = 3;</code>
       * @return The isForceSet.
       */
      @java.lang.Override
      public boolean getIsForceSet() {
        return isForceSet_;
      }
      /**
       * <code>bool isForceSet = 3;</code>
       * @param value The isForceSet to set.
       * @return This builder for chaining.
       */
      public Builder setIsForceSet(boolean value) {
        
        isForceSet_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isForceSet = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsForceSet() {
        
        isForceSet_ = false;
        onChanged();
        return this;
      }

      private int clientGameTime_ ;
      /**
       * <code>uint32 clientGameTime = 1;</code>
       * @return The clientGameTime.
       */
      @java.lang.Override
      public int getClientGameTime() {
        return clientGameTime_;
      }
      /**
       * <code>uint32 clientGameTime = 1;</code>
       * @param value The clientGameTime to set.
       * @return This builder for chaining.
       */
      public Builder setClientGameTime(int value) {
        
        clientGameTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 clientGameTime = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearClientGameTime() {
        
        clientGameTime_ = 0;
        onChanged();
        return this;
      }

      private int gameTime_ ;
      /**
       * <code>uint32 gameTime = 15;</code>
       * @return The gameTime.
       */
      @java.lang.Override
      public int getGameTime() {
        return gameTime_;
      }
      /**
       * <code>uint32 gameTime = 15;</code>
       * @param value The gameTime to set.
       * @return This builder for chaining.
       */
      public Builder setGameTime(int value) {
        
        gameTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gameTime = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearGameTime() {
        
        gameTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SkipPlayerGameTimeReq)
    }

    // @@protoc_insertion_point(class_scope:SkipPlayerGameTimeReq)
    private static final emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq();
    }

    public static emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SkipPlayerGameTimeReq>
        PARSER = new com.google.protobuf.AbstractParser<SkipPlayerGameTimeReq>() {
      @java.lang.Override
      public SkipPlayerGameTimeReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SkipPlayerGameTimeReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SkipPlayerGameTimeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SkipPlayerGameTimeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SkipPlayerGameTimeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SkipPlayerGameTimeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033SkipPlayerGameTimeReq.proto\"\266\001\n\025SkipPl" +
      "ayerGameTimeReq\022\022\n\nisForceSet\030\003 \001(\010\022\026\n\016c" +
      "lientGameTime\030\001 \001(\r\022\020\n\010gameTime\030\017 \001(\r\"_\n" +
      "\013PPJDKEJDOGN\022\010\n\004NONE\020\000\022\017\n\013PEPPOHPHJOJ\020l\022" +
      "\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJ" +
      "IABGAOCI\020\001\032\002\020\001B\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SkipPlayerGameTimeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SkipPlayerGameTimeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SkipPlayerGameTimeReq_descriptor,
        new java.lang.String[] { "IsForceSet", "ClientGameTime", "GameTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
