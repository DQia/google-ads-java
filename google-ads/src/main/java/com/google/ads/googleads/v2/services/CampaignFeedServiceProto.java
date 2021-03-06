// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/campaign_feed_service.proto

package com.google.ads.googleads.v2.services;

public final class CampaignFeedServiceProto {
  private CampaignFeedServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_GetCampaignFeedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_GetCampaignFeedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateCampaignFeedsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateCampaignFeedsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_CampaignFeedOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_CampaignFeedOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateCampaignFeedsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateCampaignFeedsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateCampaignFeedResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateCampaignFeedResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v2/services/campa" +
      "ign_feed_service.proto\022 google.ads.googl" +
      "eads.v2.services\0325google/ads/googleads/v" +
      "2/resources/campaign_feed.proto\032\034google/" +
      "api/annotations.proto\032 google/protobuf/f" +
      "ield_mask.proto\032\027google/rpc/status.proto" +
      "\032\027google/api/client.proto\"/\n\026GetCampaign" +
      "FeedRequest\022\025\n\rresource_name\030\001 \001(\t\"\256\001\n\032M" +
      "utateCampaignFeedsRequest\022\023\n\013customer_id" +
      "\030\001 \001(\t\022K\n\noperations\030\002 \003(\01327.google.ads." +
      "googleads.v2.services.CampaignFeedOperat" +
      "ion\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidate" +
      "_only\030\004 \001(\010\"\355\001\n\025CampaignFeedOperation\022/\n" +
      "\013update_mask\030\004 \001(\0132\032.google.protobuf.Fie" +
      "ldMask\022A\n\006create\030\001 \001(\0132/.google.ads.goog" +
      "leads.v2.resources.CampaignFeedH\000\022A\n\006upd" +
      "ate\030\002 \001(\0132/.google.ads.googleads.v2.reso" +
      "urces.CampaignFeedH\000\022\020\n\006remove\030\003 \001(\tH\000B\013" +
      "\n\toperation\"\235\001\n\033MutateCampaignFeedsRespo" +
      "nse\0221\n\025partial_failure_error\030\003 \001(\0132\022.goo" +
      "gle.rpc.Status\022K\n\007results\030\002 \003(\0132:.google" +
      ".ads.googleads.v2.services.MutateCampaig" +
      "nFeedResult\"1\n\030MutateCampaignFeedResult\022" +
      "\025\n\rresource_name\030\001 \001(\t2\276\003\n\023CampaignFeedS" +
      "ervice\022\265\001\n\017GetCampaignFeed\0228.google.ads." +
      "googleads.v2.services.GetCampaignFeedReq" +
      "uest\032/.google.ads.googleads.v2.resources" +
      ".CampaignFeed\"7\202\323\344\223\0021\022//v2/{resource_nam" +
      "e=customers/*/campaignFeeds/*}\022\321\001\n\023Mutat" +
      "eCampaignFeeds\022<.google.ads.googleads.v2" +
      ".services.MutateCampaignFeedsRequest\032=.g" +
      "oogle.ads.googleads.v2.services.MutateCa" +
      "mpaignFeedsResponse\"=\202\323\344\223\0027\"2/v2/custome" +
      "rs/{customer_id=*}/campaignFeeds:mutate:" +
      "\001*\032\033\312A\030googleads.googleapis.comB\377\001\n$com." +
      "google.ads.googleads.v2.servicesB\030Campai" +
      "gnFeedServiceProtoP\001ZHgoogle.golang.org/" +
      "genproto/googleapis/ads/googleads/v2/ser" +
      "vices;services\242\002\003GAA\252\002 Google.Ads.Google" +
      "Ads.V2.Services\312\002 Google\\Ads\\GoogleAds\\V" +
      "2\\Services\352\002$Google::Ads::GoogleAds::V2:" +
      ":Servicesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v2.resources.CampaignFeedProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_services_GetCampaignFeedRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_services_GetCampaignFeedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_GetCampaignFeedRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v2_services_MutateCampaignFeedsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v2_services_MutateCampaignFeedsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateCampaignFeedsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v2_services_CampaignFeedOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v2_services_CampaignFeedOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_CampaignFeedOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v2_services_MutateCampaignFeedsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v2_services_MutateCampaignFeedsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateCampaignFeedsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v2_services_MutateCampaignFeedResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v2_services_MutateCampaignFeedResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateCampaignFeedResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.resources.CampaignFeedProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
