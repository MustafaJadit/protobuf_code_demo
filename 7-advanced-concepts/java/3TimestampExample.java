// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/3-timestamp-example.proto

public final class 3TimestampExample {
  private 3TimestampExample() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MyMessage4OrBuilder extends
      // @@protoc_insertion_point(interface_extends:MyMessage4)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.google.protobuf.Timestamp my_field = 1;</code>
     * @return Whether the myField field is set.
     */
    boolean hasMyField();
    /**
     * <code>.google.protobuf.Timestamp my_field = 1;</code>
     * @return The myField.
     */
    com.google.protobuf.Timestamp getMyField();
    /**
     * <code>.google.protobuf.Timestamp my_field = 1;</code>
     */
    com.google.protobuf.TimestampOrBuilder getMyFieldOrBuilder();
  }
  /**
   * Protobuf type {@code MyMessage4}
   */
  public static final class MyMessage4 extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MyMessage4)
      MyMessage4OrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MyMessage4.newBuilder() to construct.
    private MyMessage4(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MyMessage4() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MyMessage4();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MyMessage4(
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
            case 10: {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (myField_ != null) {
                subBuilder = myField_.toBuilder();
              }
              myField_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(myField_);
                myField_ = subBuilder.buildPartial();
              }

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
      return 3TimestampExample.internal_static_MyMessage4_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return 3TimestampExample.internal_static_MyMessage4_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              3TimestampExample.MyMessage4.class, 3TimestampExample.MyMessage4.Builder.class);
    }

    public static final int MY_FIELD_FIELD_NUMBER = 1;
    private com.google.protobuf.Timestamp myField_;
    /**
     * <code>.google.protobuf.Timestamp my_field = 1;</code>
     * @return Whether the myField field is set.
     */
    @java.lang.Override
    public boolean hasMyField() {
      return myField_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp my_field = 1;</code>
     * @return The myField.
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getMyField() {
      return myField_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : myField_;
    }
    /**
     * <code>.google.protobuf.Timestamp my_field = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf.TimestampOrBuilder getMyFieldOrBuilder() {
      return getMyField();
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
      if (myField_ != null) {
        output.writeMessage(1, getMyField());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (myField_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getMyField());
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
      if (!(obj instanceof 3TimestampExample.MyMessage4)) {
        return super.equals(obj);
      }
      3TimestampExample.MyMessage4 other = (3TimestampExample.MyMessage4) obj;

      if (hasMyField() != other.hasMyField()) return false;
      if (hasMyField()) {
        if (!getMyField()
            .equals(other.getMyField())) return false;
      }
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
      if (hasMyField()) {
        hash = (37 * hash) + MY_FIELD_FIELD_NUMBER;
        hash = (53 * hash) + getMyField().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static 3TimestampExample.MyMessage4 parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static 3TimestampExample.MyMessage4 parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static 3TimestampExample.MyMessage4 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static 3TimestampExample.MyMessage4 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static 3TimestampExample.MyMessage4 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static 3TimestampExample.MyMessage4 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static 3TimestampExample.MyMessage4 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static 3TimestampExample.MyMessage4 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static 3TimestampExample.MyMessage4 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static 3TimestampExample.MyMessage4 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static 3TimestampExample.MyMessage4 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static 3TimestampExample.MyMessage4 parseFrom(
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
    public static Builder newBuilder(3TimestampExample.MyMessage4 prototype) {
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
     * Protobuf type {@code MyMessage4}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MyMessage4)
        3TimestampExample.MyMessage4OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return 3TimestampExample.internal_static_MyMessage4_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return 3TimestampExample.internal_static_MyMessage4_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                3TimestampExample.MyMessage4.class, 3TimestampExample.MyMessage4.Builder.class);
      }

      // Construct using 3TimestampExample.MyMessage4.newBuilder()
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
        if (myFieldBuilder_ == null) {
          myField_ = null;
        } else {
          myField_ = null;
          myFieldBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return 3TimestampExample.internal_static_MyMessage4_descriptor;
      }

      @java.lang.Override
      public 3TimestampExample.MyMessage4 getDefaultInstanceForType() {
        return 3TimestampExample.MyMessage4.getDefaultInstance();
      }

      @java.lang.Override
      public 3TimestampExample.MyMessage4 build() {
        3TimestampExample.MyMessage4 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public 3TimestampExample.MyMessage4 buildPartial() {
        3TimestampExample.MyMessage4 result = new 3TimestampExample.MyMessage4(this);
        if (myFieldBuilder_ == null) {
          result.myField_ = myField_;
        } else {
          result.myField_ = myFieldBuilder_.build();
        }
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
        if (other instanceof 3TimestampExample.MyMessage4) {
          return mergeFrom((3TimestampExample.MyMessage4)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(3TimestampExample.MyMessage4 other) {
        if (other == 3TimestampExample.MyMessage4.getDefaultInstance()) return this;
        if (other.hasMyField()) {
          mergeMyField(other.getMyField());
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
        3TimestampExample.MyMessage4 parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (3TimestampExample.MyMessage4) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.Timestamp myField_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> myFieldBuilder_;
      /**
       * <code>.google.protobuf.Timestamp my_field = 1;</code>
       * @return Whether the myField field is set.
       */
      public boolean hasMyField() {
        return myFieldBuilder_ != null || myField_ != null;
      }
      /**
       * <code>.google.protobuf.Timestamp my_field = 1;</code>
       * @return The myField.
       */
      public com.google.protobuf.Timestamp getMyField() {
        if (myFieldBuilder_ == null) {
          return myField_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : myField_;
        } else {
          return myFieldBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Timestamp my_field = 1;</code>
       */
      public Builder setMyField(com.google.protobuf.Timestamp value) {
        if (myFieldBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          myField_ = value;
          onChanged();
        } else {
          myFieldBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp my_field = 1;</code>
       */
      public Builder setMyField(
          com.google.protobuf.Timestamp.Builder builderForValue) {
        if (myFieldBuilder_ == null) {
          myField_ = builderForValue.build();
          onChanged();
        } else {
          myFieldBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp my_field = 1;</code>
       */
      public Builder mergeMyField(com.google.protobuf.Timestamp value) {
        if (myFieldBuilder_ == null) {
          if (myField_ != null) {
            myField_ =
              com.google.protobuf.Timestamp.newBuilder(myField_).mergeFrom(value).buildPartial();
          } else {
            myField_ = value;
          }
          onChanged();
        } else {
          myFieldBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp my_field = 1;</code>
       */
      public Builder clearMyField() {
        if (myFieldBuilder_ == null) {
          myField_ = null;
          onChanged();
        } else {
          myField_ = null;
          myFieldBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp my_field = 1;</code>
       */
      public com.google.protobuf.Timestamp.Builder getMyFieldBuilder() {
        
        onChanged();
        return getMyFieldFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Timestamp my_field = 1;</code>
       */
      public com.google.protobuf.TimestampOrBuilder getMyFieldOrBuilder() {
        if (myFieldBuilder_ != null) {
          return myFieldBuilder_.getMessageOrBuilder();
        } else {
          return myField_ == null ?
              com.google.protobuf.Timestamp.getDefaultInstance() : myField_;
        }
      }
      /**
       * <code>.google.protobuf.Timestamp my_field = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
          getMyFieldFieldBuilder() {
        if (myFieldBuilder_ == null) {
          myFieldBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                  getMyField(),
                  getParentForChildren(),
                  isClean());
          myField_ = null;
        }
        return myFieldBuilder_;
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


      // @@protoc_insertion_point(builder_scope:MyMessage4)
    }

    // @@protoc_insertion_point(class_scope:MyMessage4)
    private static final 3TimestampExample.MyMessage4 DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new 3TimestampExample.MyMessage4();
    }

    public static 3TimestampExample.MyMessage4 getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MyMessage4>
        PARSER = new com.google.protobuf.AbstractParser<MyMessage4>() {
      @java.lang.Override
      public MyMessage4 parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MyMessage4(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MyMessage4> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MyMessage4> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public 3TimestampExample.MyMessage4 getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MyMessage4_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MyMessage4_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037proto/3-timestamp-example.proto\032\037googl" +
      "e/protobuf/timestamp.proto\":\n\nMyMessage4" +
      "\022,\n\010my_field\030\001 \001(\0132\032.google.protobuf.Tim" +
      "estampb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_MyMessage4_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MyMessage4_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MyMessage4_descriptor,
        new java.lang.String[] { "MyField", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
