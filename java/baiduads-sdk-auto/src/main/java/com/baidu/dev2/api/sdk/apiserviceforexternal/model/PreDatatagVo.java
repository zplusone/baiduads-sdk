/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.apiserviceforexternal.model;

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
 * PreDatatagVo
 */
@JsonPropertyOrder({
  PreDatatagVo.JSON_PROPERTY_CROWD_ID,
  PreDatatagVo.JSON_PROPERTY_TAG_NAME,
  PreDatatagVo.JSON_PROPERTY_CROWD_NAME
})
@JsonTypeName("PreDatatagVo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PreDatatagVo {
  public static final String JSON_PROPERTY_CROWD_ID = "crowdId";
  private Long crowdId;

  public static final String JSON_PROPERTY_TAG_NAME = "tagName";
  private String tagName;

  public static final String JSON_PROPERTY_CROWD_NAME = "crowdName";
  private String crowdName;

  public PreDatatagVo() { 
  }

  public PreDatatagVo crowdId(Long crowdId) {
    
    this.crowdId = crowdId;
    return this;
  }

   /**
   * Get crowdId
   * @return crowdId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CROWD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCrowdId() {
    return crowdId;
  }


  @JsonProperty(JSON_PROPERTY_CROWD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrowdId(Long crowdId) {
    this.crowdId = crowdId;
  }


  public PreDatatagVo tagName(String tagName) {
    
    this.tagName = tagName;
    return this;
  }

   /**
   * Get tagName
   * @return tagName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTagName() {
    return tagName;
  }


  @JsonProperty(JSON_PROPERTY_TAG_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTagName(String tagName) {
    this.tagName = tagName;
  }


  public PreDatatagVo crowdName(String crowdName) {
    
    this.crowdName = crowdName;
    return this;
  }

   /**
   * Get crowdName
   * @return crowdName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CROWD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCrowdName() {
    return crowdName;
  }


  @JsonProperty(JSON_PROPERTY_CROWD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrowdName(String crowdName) {
    this.crowdName = crowdName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreDatatagVo preDatatagVo = (PreDatatagVo) o;
    return Objects.equals(this.crowdId, preDatatagVo.crowdId) &&
        Objects.equals(this.tagName, preDatatagVo.tagName) &&
        Objects.equals(this.crowdName, preDatatagVo.crowdName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crowdId, tagName, crowdName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreDatatagVo {\n");
    sb.append("    crowdId: ").append(toIndentedString(crowdId)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    crowdName: ").append(toIndentedString(crowdName)).append("\n");
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

