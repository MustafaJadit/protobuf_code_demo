// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

public final class PersonOuterClass {
  private PersonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PersonOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Person)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string first_name = 1;</code>
     * @return The firstName.
     */
    java.lang.String getFirstName();
    /**
     * <code>string first_name = 1;</code>
     * @return The bytes for firstName.
     */
    com.google.protobuf.ByteString
        getFirstNameBytes();

    /**
     * <code>repeated string middle_names = 2;</code>
     * @return A list containing the middleNames.
     */
    java.util.List<java.lang.String>
        getMiddleNamesList();
    /**
     * <code>repeated string middle_names = 2;</code>
     * @return The count of middleNames.
     */
    int getMiddleNamesCount();
    /**
     * <code>repeated string middle_names = 2;</code>
     * @param index The index of the element to return.
     * @return The middleNames at the given index.
     */
    java.lang.String getMiddleNames(int index);
    /**
     * <code>repeated string middle_names = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the middleNames at the given index.
     */
    com.google.protobuf.ByteString
        getMiddleNamesBytes(int index);

    /**
     * <code>string last_name = 3;</code>
     * @return The lastName.
     */
    java.lang.String getLastName();
    /**
     * <code>string last_name = 3;</code>
     * @return The bytes for lastName.
     */
    com.google.protobuf.ByteString
        getLastNameBytes();
  }
  /**
   * Protobuf type {@code Person}
   */
  public static final class Person extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Person)
      PersonOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Person.newBuilder() to construct.
    private Person(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Person() {
      firstName_ = "";
      middleNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      lastName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Person();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Person(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              firstName_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                middleNames_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              middleNames_.add(s);
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              lastName_ = s;
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
          middleNames_ = middleNames_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PersonOuterClass.internal_static_Person_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PersonOuterClass.internal_static_Person_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PersonOuterClass.Person.class, PersonOuterClass.Person.Builder.class);
    }

    public static final int FIRST_NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object firstName_;
    /**
     * <code>string first_name = 1;</code>
     * @return The firstName.
     */
    @java.lang.Override
    public java.lang.String getFirstName() {
      java.lang.Object ref = firstName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        firstName_ = s;
        return s;
      }
    }
    /**
     * <code>string first_name = 1;</code>
     * @return The bytes for firstName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFirstNameBytes() {
      java.lang.Object ref = firstName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        firstName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MIDDLE_NAMES_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList middleNames_;
    /**
     * <code>repeated string middle_names = 2;</code>
     * @return A list containing the middleNames.
     */
    public com.google.protobuf.ProtocolStringList
        getMiddleNamesList() {
      return middleNames_;
    }
    /**
     * <code>repeated string middle_names = 2;</code>
     * @return The count of middleNames.
     */
    public int getMiddleNamesCount() {
      return middleNames_.size();
    }
    /**
     * <code>repeated string middle_names = 2;</code>
     * @param index The index of the element to return.
     * @return The middleNames at the given index.
     */
    public java.lang.String getMiddleNames(int index) {
      return middleNames_.get(index);
    }
    /**
     * <code>repeated string middle_names = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the middleNames at the given index.
     */
    public com.google.protobuf.ByteString
        getMiddleNamesBytes(int index) {
      return middleNames_.getByteString(index);
    }

    public static final int LAST_NAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object lastName_;
    /**
     * <code>string last_name = 3;</code>
     * @return The lastName.
     */
    @java.lang.Override
    public java.lang.String getLastName() {
      java.lang.Object ref = lastName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lastName_ = s;
        return s;
      }
    }
    /**
     * <code>string last_name = 3;</code>
     * @return The bytes for lastName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getLastNameBytes() {
      java.lang.Object ref = lastName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lastName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getFirstNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, firstName_);
      }
      for (int i = 0; i < middleNames_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, middleNames_.getRaw(i));
      }
      if (!getLastNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, lastName_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getFirstNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, firstName_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < middleNames_.size(); i++) {
          dataSize += computeStringSizeNoTag(middleNames_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getMiddleNamesList().size();
      }
      if (!getLastNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, lastName_);
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
      if (!(obj instanceof PersonOuterClass.Person)) {
        return super.equals(obj);
      }
      PersonOuterClass.Person other = (PersonOuterClass.Person) obj;

      if (!getFirstName()
          .equals(other.getFirstName())) return false;
      if (!getMiddleNamesList()
          .equals(other.getMiddleNamesList())) return false;
      if (!getLastName()
          .equals(other.getLastName())) return false;
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
      hash = (37 * hash) + FIRST_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getFirstName().hashCode();
      if (getMiddleNamesCount() > 0) {
        hash = (37 * hash) + MIDDLE_NAMES_FIELD_NUMBER;
        hash = (53 * hash) + getMiddleNamesList().hashCode();
      }
      hash = (37 * hash) + LAST_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getLastName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static PersonOuterClass.Person parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PersonOuterClass.Person parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PersonOuterClass.Person parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PersonOuterClass.Person parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PersonOuterClass.Person parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PersonOuterClass.Person parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PersonOuterClass.Person parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PersonOuterClass.Person parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static PersonOuterClass.Person parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static PersonOuterClass.Person parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static PersonOuterClass.Person parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PersonOuterClass.Person parseFrom(
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
    public static Builder newBuilder(PersonOuterClass.Person prototype) {
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
     * Protobuf type {@code Person}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Person)
        PersonOuterClass.PersonOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return PersonOuterClass.internal_static_Person_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return PersonOuterClass.internal_static_Person_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                PersonOuterClass.Person.class, PersonOuterClass.Person.Builder.class);
      }

      // Construct using PersonOuterClass.Person.newBuilder()
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
        firstName_ = "";

        middleNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        lastName_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return PersonOuterClass.internal_static_Person_descriptor;
      }

      @java.lang.Override
      public PersonOuterClass.Person getDefaultInstanceForType() {
        return PersonOuterClass.Person.getDefaultInstance();
      }

      @java.lang.Override
      public PersonOuterClass.Person build() {
        PersonOuterClass.Person result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public PersonOuterClass.Person buildPartial() {
        PersonOuterClass.Person result = new PersonOuterClass.Person(this);
        int from_bitField0_ = bitField0_;
        result.firstName_ = firstName_;
        if (((bitField0_ & 0x00000001) != 0)) {
          middleNames_ = middleNames_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.middleNames_ = middleNames_;
        result.lastName_ = lastName_;
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
        if (other instanceof PersonOuterClass.Person) {
          return mergeFrom((PersonOuterClass.Person)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(PersonOuterClass.Person other) {
        if (other == PersonOuterClass.Person.getDefaultInstance()) return this;
        if (!other.getFirstName().isEmpty()) {
          firstName_ = other.firstName_;
          onChanged();
        }
        if (!other.middleNames_.isEmpty()) {
          if (middleNames_.isEmpty()) {
            middleNames_ = other.middleNames_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMiddleNamesIsMutable();
            middleNames_.addAll(other.middleNames_);
          }
          onChanged();
        }
        if (!other.getLastName().isEmpty()) {
          lastName_ = other.lastName_;
          onChanged();
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
        PersonOuterClass.Person parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (PersonOuterClass.Person) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object firstName_ = "";
      /**
       * <code>string first_name = 1;</code>
       * @return The firstName.
       */
      public java.lang.String getFirstName() {
        java.lang.Object ref = firstName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          firstName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string first_name = 1;</code>
       * @return The bytes for firstName.
       */
      public com.google.protobuf.ByteString
          getFirstNameBytes() {
        java.lang.Object ref = firstName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          firstName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string first_name = 1;</code>
       * @param value The firstName to set.
       * @return This builder for chaining.
       */
      public Builder setFirstName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        firstName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string first_name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFirstName() {
        
        firstName_ = getDefaultInstance().getFirstName();
        onChanged();
        return this;
      }
      /**
       * <code>string first_name = 1;</code>
       * @param value The bytes for firstName to set.
       * @return This builder for chaining.
       */
      public Builder setFirstNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        firstName_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList middleNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureMiddleNamesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          middleNames_ = new com.google.protobuf.LazyStringArrayList(middleNames_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated string middle_names = 2;</code>
       * @return A list containing the middleNames.
       */
      public com.google.protobuf.ProtocolStringList
          getMiddleNamesList() {
        return middleNames_.getUnmodifiableView();
      }
      /**
       * <code>repeated string middle_names = 2;</code>
       * @return The count of middleNames.
       */
      public int getMiddleNamesCount() {
        return middleNames_.size();
      }
      /**
       * <code>repeated string middle_names = 2;</code>
       * @param index The index of the element to return.
       * @return The middleNames at the given index.
       */
      public java.lang.String getMiddleNames(int index) {
        return middleNames_.get(index);
      }
      /**
       * <code>repeated string middle_names = 2;</code>
       * @param index The index of the value to return.
       * @return The bytes of the middleNames at the given index.
       */
      public com.google.protobuf.ByteString
          getMiddleNamesBytes(int index) {
        return middleNames_.getByteString(index);
      }
      /**
       * <code>repeated string middle_names = 2;</code>
       * @param index The index to set the value at.
       * @param value The middleNames to set.
       * @return This builder for chaining.
       */
      public Builder setMiddleNames(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureMiddleNamesIsMutable();
        middleNames_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string middle_names = 2;</code>
       * @param value The middleNames to add.
       * @return This builder for chaining.
       */
      public Builder addMiddleNames(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureMiddleNamesIsMutable();
        middleNames_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string middle_names = 2;</code>
       * @param values The middleNames to add.
       * @return This builder for chaining.
       */
      public Builder addAllMiddleNames(
          java.lang.Iterable<java.lang.String> values) {
        ensureMiddleNamesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, middleNames_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string middle_names = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMiddleNames() {
        middleNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string middle_names = 2;</code>
       * @param value The bytes of the middleNames to add.
       * @return This builder for chaining.
       */
      public Builder addMiddleNamesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureMiddleNamesIsMutable();
        middleNames_.add(value);
        onChanged();
        return this;
      }

      private java.lang.Object lastName_ = "";
      /**
       * <code>string last_name = 3;</code>
       * @return The lastName.
       */
      public java.lang.String getLastName() {
        java.lang.Object ref = lastName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          lastName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string last_name = 3;</code>
       * @return The bytes for lastName.
       */
      public com.google.protobuf.ByteString
          getLastNameBytes() {
        java.lang.Object ref = lastName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          lastName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string last_name = 3;</code>
       * @param value The lastName to set.
       * @return This builder for chaining.
       */
      public Builder setLastName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        lastName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string last_name = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLastName() {
        
        lastName_ = getDefaultInstance().getLastName();
        onChanged();
        return this;
      }
      /**
       * <code>string last_name = 3;</code>
       * @param value The bytes for lastName to set.
       * @return This builder for chaining.
       */
      public Builder setLastNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        lastName_ = value;
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


      // @@protoc_insertion_point(builder_scope:Person)
    }

    // @@protoc_insertion_point(class_scope:Person)
    private static final PersonOuterClass.Person DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new PersonOuterClass.Person();
    }

    public static PersonOuterClass.Person getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Person>
        PARSER = new com.google.protobuf.AbstractParser<Person>() {
      @java.lang.Override
      public Person parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Person(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Person> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Person> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public PersonOuterClass.Person getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Person_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014person.proto\"E\n\006Person\022\022\n\nfirst_name\030\001" +
      " \001(\t\022\024\n\014middle_names\030\002 \003(\t\022\021\n\tlast_name\030" +
      "\003 \001(\tb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Person_descriptor,
        new java.lang.String[] { "FirstName", "MiddleNames", "LastName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
