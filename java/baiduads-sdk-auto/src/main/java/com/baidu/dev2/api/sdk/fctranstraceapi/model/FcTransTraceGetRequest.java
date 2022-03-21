/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.fctranstraceapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * FcTransTraceGetRequest
 */
@JsonPropertyOrder({
  FcTransTraceGetRequest.JSON_PROPERTY_TRANS_NAME,
  FcTransTraceGetRequest.JSON_PROPERTY_TRACE_TARGET_LIST,
  FcTransTraceGetRequest.JSON_PROPERTY_TRANS_MODE_LIST,
  FcTransTraceGetRequest.JSON_PROPERTY_TRANS_STATUS_LIST,
  FcTransTraceGetRequest.JSON_PROPERTY_LIMIT
})
@JsonTypeName("FcTransTraceGetRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FcTransTraceGetRequest {
  public static final String JSON_PROPERTY_TRANS_NAME = "transName";
  private String transName;

  public static final String JSON_PROPERTY_TRACE_TARGET_LIST = "traceTargetList";
  private List<Integer> traceTargetList = null;

  public static final String JSON_PROPERTY_TRANS_MODE_LIST = "transModeList";
  private List<Integer> transModeList = null;

  public static final String JSON_PROPERTY_TRANS_STATUS_LIST = "transStatusList";
  private List<Integer> transStatusList = null;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private List<Integer> limit = null;

  public FcTransTraceGetRequest() { 
  }

  public FcTransTraceGetRequest transName(String transName) {
    
    this.transName = transName;
    return this;
  }

   /**
   * Get transName
   * @return transName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransName() {
    return transName;
  }


  @JsonProperty(JSON_PROPERTY_TRANS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransName(String transName) {
    this.transName = transName;
  }


  public FcTransTraceGetRequest traceTargetList(List<Integer> traceTargetList) {
    
    this.traceTargetList = traceTargetList;
    return this;
  }

  public FcTransTraceGetRequest addTraceTargetListItem(Integer traceTargetListItem) {
    if (this.traceTargetList == null) {
      this.traceTargetList = new ArrayList<>();
    }
    this.traceTargetList.add(traceTargetListItem);
    return this;
  }

   /**
   * Get traceTargetList
   * @return traceTargetList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRACE_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getTraceTargetList() {
    return traceTargetList;
  }


  @JsonProperty(JSON_PROPERTY_TRACE_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTraceTargetList(List<Integer> traceTargetList) {
    this.traceTargetList = traceTargetList;
  }


  public FcTransTraceGetRequest transModeList(List<Integer> transModeList) {
    
    this.transModeList = transModeList;
    return this;
  }

  public FcTransTraceGetRequest addTransModeListItem(Integer transModeListItem) {
    if (this.transModeList == null) {
      this.transModeList = new ArrayList<>();
    }
    this.transModeList.add(transModeListItem);
    return this;
  }

   /**
   * Get transModeList
   * @return transModeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANS_MODE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getTransModeList() {
    return transModeList;
  }


  @JsonProperty(JSON_PROPERTY_TRANS_MODE_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransModeList(List<Integer> transModeList) {
    this.transModeList = transModeList;
  }


  public FcTransTraceGetRequest transStatusList(List<Integer> transStatusList) {
    
    this.transStatusList = transStatusList;
    return this;
  }

  public FcTransTraceGetRequest addTransStatusListItem(Integer transStatusListItem) {
    if (this.transStatusList == null) {
      this.transStatusList = new ArrayList<>();
    }
    this.transStatusList.add(transStatusListItem);
    return this;
  }

   /**
   * Get transStatusList
   * @return transStatusList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANS_STATUS_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getTransStatusList() {
    return transStatusList;
  }


  @JsonProperty(JSON_PROPERTY_TRANS_STATUS_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransStatusList(List<Integer> transStatusList) {
    this.transStatusList = transStatusList;
  }


  public FcTransTraceGetRequest limit(List<Integer> limit) {
    
    this.limit = limit;
    return this;
  }

  public FcTransTraceGetRequest addLimitItem(Integer limitItem) {
    if (this.limit == null) {
      this.limit = new ArrayList<>();
    }
    this.limit.add(limitItem);
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(List<Integer> limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FcTransTraceGetRequest fcTransTraceGetRequest = (FcTransTraceGetRequest) o;
    return Objects.equals(this.transName, fcTransTraceGetRequest.transName) &&
        Objects.equals(this.traceTargetList, fcTransTraceGetRequest.traceTargetList) &&
        Objects.equals(this.transModeList, fcTransTraceGetRequest.transModeList) &&
        Objects.equals(this.transStatusList, fcTransTraceGetRequest.transStatusList) &&
        Objects.equals(this.limit, fcTransTraceGetRequest.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transName, traceTargetList, transModeList, transStatusList, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FcTransTraceGetRequest {\n");
    sb.append("    transName: ").append(toIndentedString(transName)).append("\n");
    sb.append("    traceTargetList: ").append(toIndentedString(traceTargetList)).append("\n");
    sb.append("    transModeList: ").append(toIndentedString(transModeList)).append("\n");
    sb.append("    transStatusList: ").append(toIndentedString(transStatusList)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

