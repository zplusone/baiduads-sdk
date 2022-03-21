/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.imagemanage.model;

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
 * ModImageResponse
 */
@JsonPropertyOrder({
  ModImageResponse.JSON_PROPERTY_URL,
  ModImageResponse.JSON_PROPERTY_COLLECT,
  ModImageResponse.JSON_PROPERTY_FIELD,
  ModImageResponse.JSON_PROPERTY_PIC_ID,
  ModImageResponse.JSON_PROPERTY_IMAGE_ID,
  ModImageResponse.JSON_PROPERTY_IMAGE_NAME
})
@JsonTypeName("ModImageResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModImageResponse {
  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_COLLECT = "collect";
  private Boolean collect;

  public static final String JSON_PROPERTY_FIELD = "field";
  private java.util.Map field;

  public static final String JSON_PROPERTY_PIC_ID = "picId";
  private Long picId;

  public static final String JSON_PROPERTY_IMAGE_ID = "imageId";
  private Long imageId;

  public static final String JSON_PROPERTY_IMAGE_NAME = "imageName";
  private String imageName;

  public ModImageResponse() { 
  }

  public ModImageResponse url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public ModImageResponse collect(Boolean collect) {
    
    this.collect = collect;
    return this;
  }

   /**
   * Get collect
   * @return collect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COLLECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCollect() {
    return collect;
  }


  @JsonProperty(JSON_PROPERTY_COLLECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollect(Boolean collect) {
    this.collect = collect;
  }


  public ModImageResponse field(java.util.Map field) {
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Map getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setField(java.util.Map field) {
    this.field = field;
  }


  public ModImageResponse picId(Long picId) {
    
    this.picId = picId;
    return this;
  }

   /**
   * Get picId
   * @return picId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPicId() {
    return picId;
  }


  @JsonProperty(JSON_PROPERTY_PIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPicId(Long picId) {
    this.picId = picId;
  }


  public ModImageResponse imageId(Long imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getImageId() {
    return imageId;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageId(Long imageId) {
    this.imageId = imageId;
  }


  public ModImageResponse imageName(String imageName) {
    
    this.imageName = imageName;
    return this;
  }

   /**
   * Get imageName
   * @return imageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageName() {
    return imageName;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageName(String imageName) {
    this.imageName = imageName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModImageResponse modImageResponse = (ModImageResponse) o;
    return Objects.equals(this.url, modImageResponse.url) &&
        Objects.equals(this.collect, modImageResponse.collect) &&
        Objects.equals(this.field, modImageResponse.field) &&
        Objects.equals(this.picId, modImageResponse.picId) &&
        Objects.equals(this.imageId, modImageResponse.imageId) &&
        Objects.equals(this.imageName, modImageResponse.imageName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, collect, field, picId, imageId, imageName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModImageResponse {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    collect: ").append(toIndentedString(collect)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    picId: ").append(toIndentedString(picId)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
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

