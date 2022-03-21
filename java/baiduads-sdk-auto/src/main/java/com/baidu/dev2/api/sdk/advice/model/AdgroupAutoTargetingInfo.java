/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.advice.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.advice.model.AdgroupAutoTargetingType;
import com.baidu.dev2.api.sdk.advice.model.FieldFilter;
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
 * AdgroupAutoTargetingInfo
 */
@JsonPropertyOrder({
  AdgroupAutoTargetingInfo.JSON_PROPERTY_ITEMS,
  AdgroupAutoTargetingInfo.JSON_PROPERTY_TOTAL_COUNT,
  AdgroupAutoTargetingInfo.JSON_PROPERTY_FILTERS,
  AdgroupAutoTargetingInfo.JSON_PROPERTY_IMPROVE_CLICK_RATE,
  AdgroupAutoTargetingInfo.JSON_PROPERTY_IMPROVE_CONVERSION_RATE
})
@JsonTypeName("AdgroupAutoTargetingInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdgroupAutoTargetingInfo {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<AdgroupAutoTargetingType> items = null;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
  private Integer totalCount;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<FieldFilter> filters = null;

  public static final String JSON_PROPERTY_IMPROVE_CLICK_RATE = "improveClickRate";
  private Double improveClickRate;

  public static final String JSON_PROPERTY_IMPROVE_CONVERSION_RATE = "improveConversionRate";
  private Double improveConversionRate;

  public AdgroupAutoTargetingInfo() { 
  }

  public AdgroupAutoTargetingInfo items(List<AdgroupAutoTargetingType> items) {
    
    this.items = items;
    return this;
  }

  public AdgroupAutoTargetingInfo addItemsItem(AdgroupAutoTargetingType itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdgroupAutoTargetingType> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<AdgroupAutoTargetingType> items) {
    this.items = items;
  }


  public AdgroupAutoTargetingInfo totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalCount() {
    return totalCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public AdgroupAutoTargetingInfo filters(List<FieldFilter> filters) {
    
    this.filters = filters;
    return this;
  }

  public AdgroupAutoTargetingInfo addFiltersItem(FieldFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FieldFilter> getFilters() {
    return filters;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilters(List<FieldFilter> filters) {
    this.filters = filters;
  }


  public AdgroupAutoTargetingInfo improveClickRate(Double improveClickRate) {
    
    this.improveClickRate = improveClickRate;
    return this;
  }

   /**
   * Get improveClickRate
   * @return improveClickRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMPROVE_CLICK_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getImproveClickRate() {
    return improveClickRate;
  }


  @JsonProperty(JSON_PROPERTY_IMPROVE_CLICK_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImproveClickRate(Double improveClickRate) {
    this.improveClickRate = improveClickRate;
  }


  public AdgroupAutoTargetingInfo improveConversionRate(Double improveConversionRate) {
    
    this.improveConversionRate = improveConversionRate;
    return this;
  }

   /**
   * Get improveConversionRate
   * @return improveConversionRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMPROVE_CONVERSION_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getImproveConversionRate() {
    return improveConversionRate;
  }


  @JsonProperty(JSON_PROPERTY_IMPROVE_CONVERSION_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImproveConversionRate(Double improveConversionRate) {
    this.improveConversionRate = improveConversionRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupAutoTargetingInfo adgroupAutoTargetingInfo = (AdgroupAutoTargetingInfo) o;
    return Objects.equals(this.items, adgroupAutoTargetingInfo.items) &&
        Objects.equals(this.totalCount, adgroupAutoTargetingInfo.totalCount) &&
        Objects.equals(this.filters, adgroupAutoTargetingInfo.filters) &&
        Objects.equals(this.improveClickRate, adgroupAutoTargetingInfo.improveClickRate) &&
        Objects.equals(this.improveConversionRate, adgroupAutoTargetingInfo.improveConversionRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, totalCount, filters, improveClickRate, improveConversionRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdgroupAutoTargetingInfo {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    improveClickRate: ").append(toIndentedString(improveClickRate)).append("\n");
    sb.append("    improveConversionRate: ").append(toIndentedString(improveConversionRate)).append("\n");
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

