// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/5-options-example.proto

package com.google.protobuf;

public interface Duration2OrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.protobuf.Duration2)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Signed seconds of the span of time. Must be from -315,576,000,000
   * to +315,576,000,000 inclusive. Note: these bounds are computed from:
   * 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
   * </pre>
   *
   * <code>int64 seconds = 1;</code>
   * @return The seconds.
   */
  long getSeconds();

  /**
   * <pre>
   * Signed fractions of a second at nanosecond resolution of the span
   * of time. Durations less than one second are represented with a 0
   * `seconds` field and a positive or negative `nanos` field. For durations
   * of one second or more, a non-zero value for the `nanos` field must be
   * of the same sign as the `seconds` field. Must be from -999,999,999
   * to +999,999,999 inclusive.
   * </pre>
   *
   * <code>int32 nanos = 2;</code>
   * @return The nanos.
   */
  int getNanos();
}
