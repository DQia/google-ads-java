// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/customer_client_service.proto

package com.google.ads.googleads.v1.services;

public final class CustomerClientServiceProto {
  private CustomerClientServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetCustomerClientRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetCustomerClientRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v1/services/custo" +
      "mer_client_service.proto\022 google.ads.goo" +
      "gleads.v1.services\0327google/ads/googleads" +
      "/v1/resources/customer_client.proto\032\034goo" +
      "gle/api/annotations.proto\"1\n\030GetCustomer" +
      "ClientRequest\022\025\n\rresource_name\030\001 \001(\t2\327\001\n" +
      "\025CustomerClientService\022\275\001\n\021GetCustomerCl" +
      "ient\022:.google.ads.googleads.v1.services." +
      "GetCustomerClientRequest\0321.google.ads.go" +
      "ogleads.v1.resources.CustomerClient\"9\202\323\344" +
      "\223\0023\0221/v1/{resource_name=customers/*/cust" +
      "omerClients/*}B\201\002\n$com.google.ads.google" +
      "ads.v1.servicesB\032CustomerClientServicePr" +
      "otoP\001ZHgoogle.golang.org/genproto/google" +
      "apis/ads/googleads/v1/services;services\242" +
      "\002\003GAA\252\002 Google.Ads.GoogleAds.V1.Services" +
      "\312\002 Google\\Ads\\GoogleAds\\V1\\Services\352\002$Go" +
      "ogle::Ads::GoogleAds::V1::Servicesb\006prot" +
      "o3"
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
          com.google.ads.googleads.v1.resources.CustomerClientProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetCustomerClientRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetCustomerClientRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetCustomerClientRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.CustomerClientProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}