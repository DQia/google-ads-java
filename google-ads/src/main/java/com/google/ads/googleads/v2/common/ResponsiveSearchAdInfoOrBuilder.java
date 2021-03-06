// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/ad_type_infos.proto

package com.google.ads.googleads.v2.common;

public interface ResponsiveSearchAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.common.ResponsiveSearchAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of text assets for headlines. When the ad serves the headlines will
   * be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.AdTextAsset headlines = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v2.common.AdTextAsset> 
      getHeadlinesList();
  /**
   * <pre>
   * List of text assets for headlines. When the ad serves the headlines will
   * be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.AdTextAsset headlines = 1;</code>
   */
  com.google.ads.googleads.v2.common.AdTextAsset getHeadlines(int index);
  /**
   * <pre>
   * List of text assets for headlines. When the ad serves the headlines will
   * be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.AdTextAsset headlines = 1;</code>
   */
  int getHeadlinesCount();
  /**
   * <pre>
   * List of text assets for headlines. When the ad serves the headlines will
   * be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.AdTextAsset headlines = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v2.common.AdTextAssetOrBuilder> 
      getHeadlinesOrBuilderList();
  /**
   * <pre>
   * List of text assets for headlines. When the ad serves the headlines will
   * be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.AdTextAsset headlines = 1;</code>
   */
  com.google.ads.googleads.v2.common.AdTextAssetOrBuilder getHeadlinesOrBuilder(
      int index);

  /**
   * <pre>
   * List of text assets for descriptions. When the ad serves the descriptions
   * will be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.AdTextAsset descriptions = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v2.common.AdTextAsset> 
      getDescriptionsList();
  /**
   * <pre>
   * List of text assets for descriptions. When the ad serves the descriptions
   * will be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.AdTextAsset descriptions = 2;</code>
   */
  com.google.ads.googleads.v2.common.AdTextAsset getDescriptions(int index);
  /**
   * <pre>
   * List of text assets for descriptions. When the ad serves the descriptions
   * will be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.AdTextAsset descriptions = 2;</code>
   */
  int getDescriptionsCount();
  /**
   * <pre>
   * List of text assets for descriptions. When the ad serves the descriptions
   * will be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.AdTextAsset descriptions = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v2.common.AdTextAssetOrBuilder> 
      getDescriptionsOrBuilderList();
  /**
   * <pre>
   * List of text assets for descriptions. When the ad serves the descriptions
   * will be selected from this list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.common.AdTextAsset descriptions = 2;</code>
   */
  com.google.ads.googleads.v2.common.AdTextAssetOrBuilder getDescriptionsOrBuilder(
      int index);

  /**
   * <pre>
   * First part of text that may appear appended to the url displayed in the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue path1 = 3;</code>
   */
  boolean hasPath1();
  /**
   * <pre>
   * First part of text that may appear appended to the url displayed in the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue path1 = 3;</code>
   */
  com.google.protobuf.StringValue getPath1();
  /**
   * <pre>
   * First part of text that may appear appended to the url displayed in the ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue path1 = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPath1OrBuilder();

  /**
   * <pre>
   * Second part of text that may appear appended to the url displayed in the
   * ad. This field can only be set when path1 is also set.
   * </pre>
   *
   * <code>.google.protobuf.StringValue path2 = 4;</code>
   */
  boolean hasPath2();
  /**
   * <pre>
   * Second part of text that may appear appended to the url displayed in the
   * ad. This field can only be set when path1 is also set.
   * </pre>
   *
   * <code>.google.protobuf.StringValue path2 = 4;</code>
   */
  com.google.protobuf.StringValue getPath2();
  /**
   * <pre>
   * Second part of text that may appear appended to the url displayed in the
   * ad. This field can only be set when path1 is also set.
   * </pre>
   *
   * <code>.google.protobuf.StringValue path2 = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPath2OrBuilder();
}
