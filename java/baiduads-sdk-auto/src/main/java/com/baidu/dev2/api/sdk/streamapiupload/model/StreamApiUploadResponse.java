/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.streamapiupload.model;

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
 * StreamApiUploadResponse
 */
@JsonPropertyOrder({
  StreamApiUploadResponse.JSON_PROPERTY_ASSET_ID,
  StreamApiUploadResponse.JSON_PROPERTY_UPLOAD_ASSET_COUNT
})
@JsonTypeName("StreamApiUploadResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StreamApiUploadResponse {
  public static final String JSON_PROPERTY_ASSET_ID = "assetId";
  private Long assetId;

  public static final String JSON_PROPERTY_UPLOAD_ASSET_COUNT = "uploadAssetCount";
  private Integer uploadAssetCount;

  public StreamApiUploadResponse() { 
  }

  public StreamApiUploadResponse assetId(Long assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
   * @return assetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAssetId() {
    return assetId;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  public StreamApiUploadResponse uploadAssetCount(Integer uploadAssetCount) {
    
    this.uploadAssetCount = uploadAssetCount;
    return this;
  }

   /**
   * Get uploadAssetCount
   * @return uploadAssetCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPLOAD_ASSET_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUploadAssetCount() {
    return uploadAssetCount;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_ASSET_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadAssetCount(Integer uploadAssetCount) {
    this.uploadAssetCount = uploadAssetCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamApiUploadResponse streamApiUploadResponse = (StreamApiUploadResponse) o;
    return Objects.equals(this.assetId, streamApiUploadResponse.assetId) &&
        Objects.equals(this.uploadAssetCount, streamApiUploadResponse.uploadAssetCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, uploadAssetCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamApiUploadResponse {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    uploadAssetCount: ").append(toIndentedString(uploadAssetCount)).append("\n");
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

