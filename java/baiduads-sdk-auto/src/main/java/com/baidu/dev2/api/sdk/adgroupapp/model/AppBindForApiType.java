/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.adgroupapp.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AppBindForApiType
 */
@JsonPropertyOrder({
  AppBindForApiType.JSON_PROPERTY_CAMPAIGN_ID,
  AppBindForApiType.JSON_PROPERTY_ADGROUP_ID,
  AppBindForApiType.JSON_PROPERTY_NAME,
  AppBindForApiType.JSON_PROPERTY_VERSION,
  AppBindForApiType.JSON_PROPERTY_PLATFORM,
  AppBindForApiType.JSON_PROPERTY_CBIND_ID,
  AppBindForApiType.JSON_PROPERTY_CHANNEL_PACKAGE,
  AppBindForApiType.JSON_PROPERTY_STATUS,
  AppBindForApiType.JSON_PROPERTY_BID_RATIO,
  AppBindForApiType.JSON_PROPERTY_APP_SOURCE,
  AppBindForApiType.JSON_PROPERTY_CHANNEL_ID,
  AppBindForApiType.JSON_PROPERTY_APP_STORE_ID,
  AppBindForApiType.JSON_PROPERTY_PACKAGE_NAME
})
@JsonTypeName("AppBindForApiType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AppBindForApiType {
  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_ADGROUP_ID = "adgroupId";
  private Long adgroupId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private Integer platform;

  public static final String JSON_PROPERTY_CBIND_ID = "cbindId";
  private Long cbindId;

  public static final String JSON_PROPERTY_CHANNEL_PACKAGE = "channelPackage";
  private String channelPackage;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_BID_RATIO = "bidRatio";
  private Double bidRatio;

  public static final String JSON_PROPERTY_APP_SOURCE = "appSource";
  private Integer appSource;

  public static final String JSON_PROPERTY_CHANNEL_ID = "channelId";
  private Long channelId;

  public static final String JSON_PROPERTY_APP_STORE_ID = "appStoreId";
  private Long appStoreId;

  public static final String JSON_PROPERTY_PACKAGE_NAME = "packageName";
  private String packageName;

  public AppBindForApiType() { 
  }

  public AppBindForApiType campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Get campaignId
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public AppBindForApiType adgroupId(Long adgroupId) {
    
    this.adgroupId = adgroupId;
    return this;
  }

   /**
   * Get adgroupId
   * @return adgroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdgroupId() {
    return adgroupId;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }


  public AppBindForApiType name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public AppBindForApiType version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  public AppBindForApiType platform(Integer platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPlatform() {
    return platform;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatform(Integer platform) {
    this.platform = platform;
  }


  public AppBindForApiType cbindId(Long cbindId) {
    
    this.cbindId = cbindId;
    return this;
  }

   /**
   * Get cbindId
   * @return cbindId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CBIND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCbindId() {
    return cbindId;
  }


  @JsonProperty(JSON_PROPERTY_CBIND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCbindId(Long cbindId) {
    this.cbindId = cbindId;
  }


  public AppBindForApiType channelPackage(String channelPackage) {
    
    this.channelPackage = channelPackage;
    return this;
  }

   /**
   * Get channelPackage
   * @return channelPackage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANNEL_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannelPackage() {
    return channelPackage;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelPackage(String channelPackage) {
    this.channelPackage = channelPackage;
  }


  public AppBindForApiType status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Integer status) {
    this.status = status;
  }


  public AppBindForApiType bidRatio(Double bidRatio) {
    
    this.bidRatio = bidRatio;
    return this;
  }

   /**
   * Get bidRatio
   * @return bidRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BID_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getBidRatio() {
    return bidRatio;
  }


  @JsonProperty(JSON_PROPERTY_BID_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBidRatio(Double bidRatio) {
    this.bidRatio = bidRatio;
  }


  public AppBindForApiType appSource(Integer appSource) {
    
    this.appSource = appSource;
    return this;
  }

   /**
   * Get appSource
   * @return appSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAppSource() {
    return appSource;
  }


  @JsonProperty(JSON_PROPERTY_APP_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppSource(Integer appSource) {
    this.appSource = appSource;
  }


  public AppBindForApiType channelId(Long channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * Get channelId
   * @return channelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getChannelId() {
    return channelId;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelId(Long channelId) {
    this.channelId = channelId;
  }


  public AppBindForApiType appStoreId(Long appStoreId) {
    
    this.appStoreId = appStoreId;
    return this;
  }

   /**
   * Get appStoreId
   * @return appStoreId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAppStoreId() {
    return appStoreId;
  }


  @JsonProperty(JSON_PROPERTY_APP_STORE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppStoreId(Long appStoreId) {
    this.appStoreId = appStoreId;
  }


  public AppBindForApiType packageName(String packageName) {
    
    this.packageName = packageName;
    return this;
  }

   /**
   * Get packageName
   * @return packageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PACKAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPackageName() {
    return packageName;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppBindForApiType appBindForApiType = (AppBindForApiType) o;
    return Objects.equals(this.campaignId, appBindForApiType.campaignId) &&
        Objects.equals(this.adgroupId, appBindForApiType.adgroupId) &&
        Objects.equals(this.name, appBindForApiType.name) &&
        Objects.equals(this.version, appBindForApiType.version) &&
        Objects.equals(this.platform, appBindForApiType.platform) &&
        Objects.equals(this.cbindId, appBindForApiType.cbindId) &&
        Objects.equals(this.channelPackage, appBindForApiType.channelPackage) &&
        Objects.equals(this.status, appBindForApiType.status) &&
        Objects.equals(this.bidRatio, appBindForApiType.bidRatio) &&
        Objects.equals(this.appSource, appBindForApiType.appSource) &&
        Objects.equals(this.channelId, appBindForApiType.channelId) &&
        Objects.equals(this.appStoreId, appBindForApiType.appStoreId) &&
        Objects.equals(this.packageName, appBindForApiType.packageName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, adgroupId, name, version, platform, cbindId, channelPackage, status, bidRatio, appSource, channelId, appStoreId, packageName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppBindForApiType {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    cbindId: ").append(toIndentedString(cbindId)).append("\n");
    sb.append("    channelPackage: ").append(toIndentedString(channelPackage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    bidRatio: ").append(toIndentedString(bidRatio)).append("\n");
    sb.append("    appSource: ").append(toIndentedString(appSource)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    appStoreId: ").append(toIndentedString(appStoreId)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

