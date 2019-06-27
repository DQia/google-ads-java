// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/campaign_extension_setting_service.proto

package com.google.ads.googleads.v2.services;

public final class CampaignExtensionSettingServiceProto {
  private CampaignExtensionSettingServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_GetCampaignExtensionSettingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_GetCampaignExtensionSettingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateCampaignExtensionSettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateCampaignExtensionSettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_CampaignExtensionSettingOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_CampaignExtensionSettingOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateCampaignExtensionSettingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateCampaignExtensionSettingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_services_MutateCampaignExtensionSettingResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_services_MutateCampaignExtensionSettingResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIgoogle/ads/googleads/v2/services/campa" +
      "ign_extension_setting_service.proto\022 goo" +
      "gle.ads.googleads.v2.services\032Bgoogle/ad" +
      "s/googleads/v2/resources/campaign_extens" +
      "ion_setting.proto\032\034google/api/annotation" +
      "s.proto\032 google/protobuf/field_mask.prot" +
      "o\032\027google/rpc/status.proto\032\027google/api/c" +
      "lient.proto\";\n\"GetCampaignExtensionSetti" +
      "ngRequest\022\025\n\rresource_name\030\001 \001(\t\"\306\001\n&Mut" +
      "ateCampaignExtensionSettingsRequest\022\023\n\013c" +
      "ustomer_id\030\001 \001(\t\022W\n\noperations\030\002 \003(\0132C.g" +
      "oogle.ads.googleads.v2.services.Campaign" +
      "ExtensionSettingOperation\022\027\n\017partial_fai" +
      "lure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\221\002\n!Ca" +
      "mpaignExtensionSettingOperation\022/\n\013updat" +
      "e_mask\030\004 \001(\0132\032.google.protobuf.FieldMask" +
      "\022M\n\006create\030\001 \001(\0132;.google.ads.googleads." +
      "v2.resources.CampaignExtensionSettingH\000\022" +
      "M\n\006update\030\002 \001(\0132;.google.ads.googleads.v" +
      "2.resources.CampaignExtensionSettingH\000\022\020" +
      "\n\006remove\030\003 \001(\tH\000B\013\n\toperation\"\265\001\n\'Mutate" +
      "CampaignExtensionSettingsResponse\0221\n\025par" +
      "tial_failure_error\030\003 \001(\0132\022.google.rpc.St" +
      "atus\022W\n\007results\030\002 \003(\0132F.google.ads.googl" +
      "eads.v2.services.MutateCampaignExtension" +
      "SettingResult\"=\n$MutateCampaignExtension" +
      "SettingResult\022\025\n\rresource_name\030\001 \001(\t2\252\004\n" +
      "\037CampaignExtensionSettingService\022\345\001\n\033Get" +
      "CampaignExtensionSetting\022D.google.ads.go" +
      "ogleads.v2.services.GetCampaignExtension" +
      "SettingRequest\032;.google.ads.googleads.v2" +
      ".resources.CampaignExtensionSetting\"C\202\323\344" +
      "\223\002=\022;/v2/{resource_name=customers/*/camp" +
      "aignExtensionSettings/*}\022\201\002\n\037MutateCampa" +
      "ignExtensionSettings\022H.google.ads.google" +
      "ads.v2.services.MutateCampaignExtensionS" +
      "ettingsRequest\032I.google.ads.googleads.v2" +
      ".services.MutateCampaignExtensionSetting" +
      "sResponse\"I\202\323\344\223\002C\">/v2/customers/{custom" +
      "er_id=*}/campaignExtensionSettings:mutat" +
      "e:\001*\032\033\312A\030googleads.googleapis.comB\213\002\n$co" +
      "m.google.ads.googleads.v2.servicesB$Camp" +
      "aignExtensionSettingServiceProtoP\001ZHgoog" +
      "le.golang.org/genproto/googleapis/ads/go" +
      "ogleads/v2/services;services\242\002\003GAA\252\002 Goo" +
      "gle.Ads.GoogleAds.V2.Services\312\002 Google\\A" +
      "ds\\GoogleAds\\V2\\Services\352\002$Google::Ads::" +
      "GoogleAds::V2::Servicesb\006proto3"
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
          com.google.ads.googleads.v2.resources.CampaignExtensionSettingProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_services_GetCampaignExtensionSettingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_services_GetCampaignExtensionSettingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_GetCampaignExtensionSettingRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v2_services_MutateCampaignExtensionSettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v2_services_MutateCampaignExtensionSettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateCampaignExtensionSettingsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v2_services_CampaignExtensionSettingOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v2_services_CampaignExtensionSettingOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_CampaignExtensionSettingOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v2_services_MutateCampaignExtensionSettingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v2_services_MutateCampaignExtensionSettingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateCampaignExtensionSettingsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v2_services_MutateCampaignExtensionSettingResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v2_services_MutateCampaignExtensionSettingResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_services_MutateCampaignExtensionSettingResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.resources.CampaignExtensionSettingProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}