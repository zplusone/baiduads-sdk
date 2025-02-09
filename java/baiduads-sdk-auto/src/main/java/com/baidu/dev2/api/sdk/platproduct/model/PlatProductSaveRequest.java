/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.platproduct.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.platproduct.model.PlatProductDeliveryConfigVo;
import com.baidu.dev2.api.sdk.platproduct.model.PlatProductSkuVo;
import com.baidu.dev2.api.sdk.platproduct.model.ProductImageVo;
import com.baidu.dev2.api.sdk.platproduct.model.ProductPersonalizedLabelVo;
import com.baidu.dev2.api.sdk.platproduct.model.ProductSpuAttributeVo;
import com.baidu.dev2.api.sdk.platproduct.model.ProductSpuSpecificationVo;
import com.baidu.dev2.api.sdk.platproduct.model.ServiceItem;
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
 * PlatProductSaveRequest
 */
@JsonPropertyOrder({
  PlatProductSaveRequest.JSON_PROPERTY_SPU_UNIQUE_ID,
  PlatProductSaveRequest.JSON_PROPERTY_APP_ID,
  PlatProductSaveRequest.JSON_PROPERTY_SHOP_ID,
  PlatProductSaveRequest.JSON_PROPERTY_NAME,
  PlatProductSaveRequest.JSON_PROPERTY_TYPE,
  PlatProductSaveRequest.JSON_PROPERTY_SAVE_FLAG,
  PlatProductSaveRequest.JSON_PROPERTY_LAST_CATEGORY_ID,
  PlatProductSaveRequest.JSON_PROPERTY_PERSONALIZED_LABELS,
  PlatProductSaveRequest.JSON_PROPERTY_ATTRIBUTES,
  PlatProductSaveRequest.JSON_PROPERTY_SUPPORT_PAY_TYPE,
  PlatProductSaveRequest.JSON_PROPERTY_SPECIFICATIONS,
  PlatProductSaveRequest.JSON_PROPERTY_SKU_LIST,
  PlatProductSaveRequest.JSON_PROPERTY_VIRTUAL_CODE_START_TIME,
  PlatProductSaveRequest.JSON_PROPERTY_VIRTUAL_CODE_END_TIME,
  PlatProductSaveRequest.JSON_PROPERTY_IMAGE_ALBUM,
  PlatProductSaveRequest.JSON_PROPERTY_DESCRIPTION,
  PlatProductSaveRequest.JSON_PROPERTY_QUOTATION,
  PlatProductSaveRequest.JSON_PROPERTY_SERVICE_PROCESS,
  PlatProductSaveRequest.JSON_PROPERTY_SERVICE_AREA,
  PlatProductSaveRequest.JSON_PROPERTY_FREIGHT_TEMPLATE_ID,
  PlatProductSaveRequest.JSON_PROPERTY_DELIVERY_CONFIG,
  PlatProductSaveRequest.JSON_PROPERTY_PRICE,
  PlatProductSaveRequest.JSON_PROPERTY_SUB_SHOP_IDS,
  PlatProductSaveRequest.JSON_PROPERTY_SEND_EXCHANGE_CODE,
  PlatProductSaveRequest.JSON_PROPERTY_SERVICE_ITEM,
  PlatProductSaveRequest.JSON_PROPERTY_SHOP_BRAND_ID
})
@JsonTypeName("PlatProductSaveRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlatProductSaveRequest {
  public static final String JSON_PROPERTY_SPU_UNIQUE_ID = "spuUniqueId";
  private Long spuUniqueId;

  public static final String JSON_PROPERTY_APP_ID = "appId";
  private Integer appId;

  public static final String JSON_PROPERTY_SHOP_ID = "shopId";
  private Long shopId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Integer type;

  public static final String JSON_PROPERTY_SAVE_FLAG = "saveFlag";
  private Integer saveFlag;

  public static final String JSON_PROPERTY_LAST_CATEGORY_ID = "lastCategoryId";
  private Long lastCategoryId;

  public static final String JSON_PROPERTY_PERSONALIZED_LABELS = "personalizedLabels";
  private List<ProductPersonalizedLabelVo> personalizedLabels = null;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private List<ProductSpuAttributeVo> attributes = null;

  public static final String JSON_PROPERTY_SUPPORT_PAY_TYPE = "supportPayType";
  private Integer supportPayType;

  public static final String JSON_PROPERTY_SPECIFICATIONS = "specifications";
  private List<ProductSpuSpecificationVo> specifications = null;

  public static final String JSON_PROPERTY_SKU_LIST = "skuList";
  private List<PlatProductSkuVo> skuList = null;

  public static final String JSON_PROPERTY_VIRTUAL_CODE_START_TIME = "virtualCodeStartTime";
  private String virtualCodeStartTime;

  public static final String JSON_PROPERTY_VIRTUAL_CODE_END_TIME = "virtualCodeEndTime";
  private String virtualCodeEndTime;

  public static final String JSON_PROPERTY_IMAGE_ALBUM = "imageAlbum";
  private List<ProductImageVo> imageAlbum = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_QUOTATION = "quotation";
  private String quotation;

  public static final String JSON_PROPERTY_SERVICE_PROCESS = "serviceProcess";
  private String serviceProcess;

  public static final String JSON_PROPERTY_SERVICE_AREA = "serviceArea";
  private String serviceArea;

  public static final String JSON_PROPERTY_FREIGHT_TEMPLATE_ID = "freightTemplateId";
  private Long freightTemplateId;

  public static final String JSON_PROPERTY_DELIVERY_CONFIG = "deliveryConfig";
  private PlatProductDeliveryConfigVo deliveryConfig;

  public static final String JSON_PROPERTY_PRICE = "price";
  private java.math.BigDecimal price;

  public static final String JSON_PROPERTY_SUB_SHOP_IDS = "subShopIds";
  private List<Long> subShopIds = null;

  public static final String JSON_PROPERTY_SEND_EXCHANGE_CODE = "sendExchangeCode";
  private Integer sendExchangeCode;

  public static final String JSON_PROPERTY_SERVICE_ITEM = "serviceItem";
  private List<ServiceItem> serviceItem = null;

  public static final String JSON_PROPERTY_SHOP_BRAND_ID = "shopBrandId";
  private Long shopBrandId;

  public PlatProductSaveRequest() { 
  }

  public PlatProductSaveRequest spuUniqueId(Long spuUniqueId) {
    
    this.spuUniqueId = spuUniqueId;
    return this;
  }

   /**
   * Get spuUniqueId
   * @return spuUniqueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPU_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSpuUniqueId() {
    return spuUniqueId;
  }


  @JsonProperty(JSON_PROPERTY_SPU_UNIQUE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpuUniqueId(Long spuUniqueId) {
    this.spuUniqueId = spuUniqueId;
  }


  public PlatProductSaveRequest appId(Integer appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAppId() {
    return appId;
  }


  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppId(Integer appId) {
    this.appId = appId;
  }


  public PlatProductSaveRequest shopId(Long shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * Get shopId
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getShopId() {
    return shopId;
  }


  @JsonProperty(JSON_PROPERTY_SHOP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopId(Long shopId) {
    this.shopId = shopId;
  }


  public PlatProductSaveRequest name(String name) {
    
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


  public PlatProductSaveRequest type(Integer type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(Integer type) {
    this.type = type;
  }


  public PlatProductSaveRequest saveFlag(Integer saveFlag) {
    
    this.saveFlag = saveFlag;
    return this;
  }

   /**
   * Get saveFlag
   * @return saveFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SAVE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSaveFlag() {
    return saveFlag;
  }


  @JsonProperty(JSON_PROPERTY_SAVE_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSaveFlag(Integer saveFlag) {
    this.saveFlag = saveFlag;
  }


  public PlatProductSaveRequest lastCategoryId(Long lastCategoryId) {
    
    this.lastCategoryId = lastCategoryId;
    return this;
  }

   /**
   * Get lastCategoryId
   * @return lastCategoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLastCategoryId() {
    return lastCategoryId;
  }


  @JsonProperty(JSON_PROPERTY_LAST_CATEGORY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastCategoryId(Long lastCategoryId) {
    this.lastCategoryId = lastCategoryId;
  }


  public PlatProductSaveRequest personalizedLabels(List<ProductPersonalizedLabelVo> personalizedLabels) {
    
    this.personalizedLabels = personalizedLabels;
    return this;
  }

  public PlatProductSaveRequest addPersonalizedLabelsItem(ProductPersonalizedLabelVo personalizedLabelsItem) {
    if (this.personalizedLabels == null) {
      this.personalizedLabels = new ArrayList<>();
    }
    this.personalizedLabels.add(personalizedLabelsItem);
    return this;
  }

   /**
   * Get personalizedLabels
   * @return personalizedLabels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERSONALIZED_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ProductPersonalizedLabelVo> getPersonalizedLabels() {
    return personalizedLabels;
  }


  @JsonProperty(JSON_PROPERTY_PERSONALIZED_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPersonalizedLabels(List<ProductPersonalizedLabelVo> personalizedLabels) {
    this.personalizedLabels = personalizedLabels;
  }


  public PlatProductSaveRequest attributes(List<ProductSpuAttributeVo> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public PlatProductSaveRequest addAttributesItem(ProductSpuAttributeVo attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ProductSpuAttributeVo> getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributes(List<ProductSpuAttributeVo> attributes) {
    this.attributes = attributes;
  }


  public PlatProductSaveRequest supportPayType(Integer supportPayType) {
    
    this.supportPayType = supportPayType;
    return this;
  }

   /**
   * Get supportPayType
   * @return supportPayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUPPORT_PAY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSupportPayType() {
    return supportPayType;
  }


  @JsonProperty(JSON_PROPERTY_SUPPORT_PAY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupportPayType(Integer supportPayType) {
    this.supportPayType = supportPayType;
  }


  public PlatProductSaveRequest specifications(List<ProductSpuSpecificationVo> specifications) {
    
    this.specifications = specifications;
    return this;
  }

  public PlatProductSaveRequest addSpecificationsItem(ProductSpuSpecificationVo specificationsItem) {
    if (this.specifications == null) {
      this.specifications = new ArrayList<>();
    }
    this.specifications.add(specificationsItem);
    return this;
  }

   /**
   * Get specifications
   * @return specifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPECIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ProductSpuSpecificationVo> getSpecifications() {
    return specifications;
  }


  @JsonProperty(JSON_PROPERTY_SPECIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpecifications(List<ProductSpuSpecificationVo> specifications) {
    this.specifications = specifications;
  }


  public PlatProductSaveRequest skuList(List<PlatProductSkuVo> skuList) {
    
    this.skuList = skuList;
    return this;
  }

  public PlatProductSaveRequest addSkuListItem(PlatProductSkuVo skuListItem) {
    if (this.skuList == null) {
      this.skuList = new ArrayList<>();
    }
    this.skuList.add(skuListItem);
    return this;
  }

   /**
   * Get skuList
   * @return skuList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SKU_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PlatProductSkuVo> getSkuList() {
    return skuList;
  }


  @JsonProperty(JSON_PROPERTY_SKU_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkuList(List<PlatProductSkuVo> skuList) {
    this.skuList = skuList;
  }


  public PlatProductSaveRequest virtualCodeStartTime(String virtualCodeStartTime) {
    
    this.virtualCodeStartTime = virtualCodeStartTime;
    return this;
  }

   /**
   * Get virtualCodeStartTime
   * @return virtualCodeStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIRTUAL_CODE_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVirtualCodeStartTime() {
    return virtualCodeStartTime;
  }


  @JsonProperty(JSON_PROPERTY_VIRTUAL_CODE_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVirtualCodeStartTime(String virtualCodeStartTime) {
    this.virtualCodeStartTime = virtualCodeStartTime;
  }


  public PlatProductSaveRequest virtualCodeEndTime(String virtualCodeEndTime) {
    
    this.virtualCodeEndTime = virtualCodeEndTime;
    return this;
  }

   /**
   * Get virtualCodeEndTime
   * @return virtualCodeEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIRTUAL_CODE_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVirtualCodeEndTime() {
    return virtualCodeEndTime;
  }


  @JsonProperty(JSON_PROPERTY_VIRTUAL_CODE_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVirtualCodeEndTime(String virtualCodeEndTime) {
    this.virtualCodeEndTime = virtualCodeEndTime;
  }


  public PlatProductSaveRequest imageAlbum(List<ProductImageVo> imageAlbum) {
    
    this.imageAlbum = imageAlbum;
    return this;
  }

  public PlatProductSaveRequest addImageAlbumItem(ProductImageVo imageAlbumItem) {
    if (this.imageAlbum == null) {
      this.imageAlbum = new ArrayList<>();
    }
    this.imageAlbum.add(imageAlbumItem);
    return this;
  }

   /**
   * Get imageAlbum
   * @return imageAlbum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE_ALBUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ProductImageVo> getImageAlbum() {
    return imageAlbum;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_ALBUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageAlbum(List<ProductImageVo> imageAlbum) {
    this.imageAlbum = imageAlbum;
  }


  public PlatProductSaveRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public PlatProductSaveRequest quotation(String quotation) {
    
    this.quotation = quotation;
    return this;
  }

   /**
   * Get quotation
   * @return quotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQuotation() {
    return quotation;
  }


  @JsonProperty(JSON_PROPERTY_QUOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuotation(String quotation) {
    this.quotation = quotation;
  }


  public PlatProductSaveRequest serviceProcess(String serviceProcess) {
    
    this.serviceProcess = serviceProcess;
    return this;
  }

   /**
   * Get serviceProcess
   * @return serviceProcess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_PROCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceProcess() {
    return serviceProcess;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_PROCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceProcess(String serviceProcess) {
    this.serviceProcess = serviceProcess;
  }


  public PlatProductSaveRequest serviceArea(String serviceArea) {
    
    this.serviceArea = serviceArea;
    return this;
  }

   /**
   * Get serviceArea
   * @return serviceArea
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceArea() {
    return serviceArea;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceArea(String serviceArea) {
    this.serviceArea = serviceArea;
  }


  public PlatProductSaveRequest freightTemplateId(Long freightTemplateId) {
    
    this.freightTemplateId = freightTemplateId;
    return this;
  }

   /**
   * Get freightTemplateId
   * @return freightTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FREIGHT_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFreightTemplateId() {
    return freightTemplateId;
  }


  @JsonProperty(JSON_PROPERTY_FREIGHT_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFreightTemplateId(Long freightTemplateId) {
    this.freightTemplateId = freightTemplateId;
  }


  public PlatProductSaveRequest deliveryConfig(PlatProductDeliveryConfigVo deliveryConfig) {
    
    this.deliveryConfig = deliveryConfig;
    return this;
  }

   /**
   * Get deliveryConfig
   * @return deliveryConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELIVERY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlatProductDeliveryConfigVo getDeliveryConfig() {
    return deliveryConfig;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryConfig(PlatProductDeliveryConfigVo deliveryConfig) {
    this.deliveryConfig = deliveryConfig;
  }


  public PlatProductSaveRequest price(java.math.BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.math.BigDecimal getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(java.math.BigDecimal price) {
    this.price = price;
  }


  public PlatProductSaveRequest subShopIds(List<Long> subShopIds) {
    
    this.subShopIds = subShopIds;
    return this;
  }

  public PlatProductSaveRequest addSubShopIdsItem(Long subShopIdsItem) {
    if (this.subShopIds == null) {
      this.subShopIds = new ArrayList<>();
    }
    this.subShopIds.add(subShopIdsItem);
    return this;
  }

   /**
   * Get subShopIds
   * @return subShopIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUB_SHOP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getSubShopIds() {
    return subShopIds;
  }


  @JsonProperty(JSON_PROPERTY_SUB_SHOP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubShopIds(List<Long> subShopIds) {
    this.subShopIds = subShopIds;
  }


  public PlatProductSaveRequest sendExchangeCode(Integer sendExchangeCode) {
    
    this.sendExchangeCode = sendExchangeCode;
    return this;
  }

   /**
   * Get sendExchangeCode
   * @return sendExchangeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEND_EXCHANGE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSendExchangeCode() {
    return sendExchangeCode;
  }


  @JsonProperty(JSON_PROPERTY_SEND_EXCHANGE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSendExchangeCode(Integer sendExchangeCode) {
    this.sendExchangeCode = sendExchangeCode;
  }


  public PlatProductSaveRequest serviceItem(List<ServiceItem> serviceItem) {
    
    this.serviceItem = serviceItem;
    return this;
  }

  public PlatProductSaveRequest addServiceItemItem(ServiceItem serviceItemItem) {
    if (this.serviceItem == null) {
      this.serviceItem = new ArrayList<>();
    }
    this.serviceItem.add(serviceItemItem);
    return this;
  }

   /**
   * Get serviceItem
   * @return serviceItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ServiceItem> getServiceItem() {
    return serviceItem;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceItem(List<ServiceItem> serviceItem) {
    this.serviceItem = serviceItem;
  }


  public PlatProductSaveRequest shopBrandId(Long shopBrandId) {
    
    this.shopBrandId = shopBrandId;
    return this;
  }

   /**
   * Get shopBrandId
   * @return shopBrandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOP_BRAND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getShopBrandId() {
    return shopBrandId;
  }


  @JsonProperty(JSON_PROPERTY_SHOP_BRAND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopBrandId(Long shopBrandId) {
    this.shopBrandId = shopBrandId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatProductSaveRequest platProductSaveRequest = (PlatProductSaveRequest) o;
    return Objects.equals(this.spuUniqueId, platProductSaveRequest.spuUniqueId) &&
        Objects.equals(this.appId, platProductSaveRequest.appId) &&
        Objects.equals(this.shopId, platProductSaveRequest.shopId) &&
        Objects.equals(this.name, platProductSaveRequest.name) &&
        Objects.equals(this.type, platProductSaveRequest.type) &&
        Objects.equals(this.saveFlag, platProductSaveRequest.saveFlag) &&
        Objects.equals(this.lastCategoryId, platProductSaveRequest.lastCategoryId) &&
        Objects.equals(this.personalizedLabels, platProductSaveRequest.personalizedLabels) &&
        Objects.equals(this.attributes, platProductSaveRequest.attributes) &&
        Objects.equals(this.supportPayType, platProductSaveRequest.supportPayType) &&
        Objects.equals(this.specifications, platProductSaveRequest.specifications) &&
        Objects.equals(this.skuList, platProductSaveRequest.skuList) &&
        Objects.equals(this.virtualCodeStartTime, platProductSaveRequest.virtualCodeStartTime) &&
        Objects.equals(this.virtualCodeEndTime, platProductSaveRequest.virtualCodeEndTime) &&
        Objects.equals(this.imageAlbum, platProductSaveRequest.imageAlbum) &&
        Objects.equals(this.description, platProductSaveRequest.description) &&
        Objects.equals(this.quotation, platProductSaveRequest.quotation) &&
        Objects.equals(this.serviceProcess, platProductSaveRequest.serviceProcess) &&
        Objects.equals(this.serviceArea, platProductSaveRequest.serviceArea) &&
        Objects.equals(this.freightTemplateId, platProductSaveRequest.freightTemplateId) &&
        Objects.equals(this.deliveryConfig, platProductSaveRequest.deliveryConfig) &&
        Objects.equals(this.price, platProductSaveRequest.price) &&
        Objects.equals(this.subShopIds, platProductSaveRequest.subShopIds) &&
        Objects.equals(this.sendExchangeCode, platProductSaveRequest.sendExchangeCode) &&
        Objects.equals(this.serviceItem, platProductSaveRequest.serviceItem) &&
        Objects.equals(this.shopBrandId, platProductSaveRequest.shopBrandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spuUniqueId, appId, shopId, name, type, saveFlag, lastCategoryId, personalizedLabels, attributes, supportPayType, specifications, skuList, virtualCodeStartTime, virtualCodeEndTime, imageAlbum, description, quotation, serviceProcess, serviceArea, freightTemplateId, deliveryConfig, price, subShopIds, sendExchangeCode, serviceItem, shopBrandId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatProductSaveRequest {\n");
    sb.append("    spuUniqueId: ").append(toIndentedString(spuUniqueId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    saveFlag: ").append(toIndentedString(saveFlag)).append("\n");
    sb.append("    lastCategoryId: ").append(toIndentedString(lastCategoryId)).append("\n");
    sb.append("    personalizedLabels: ").append(toIndentedString(personalizedLabels)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    supportPayType: ").append(toIndentedString(supportPayType)).append("\n");
    sb.append("    specifications: ").append(toIndentedString(specifications)).append("\n");
    sb.append("    skuList: ").append(toIndentedString(skuList)).append("\n");
    sb.append("    virtualCodeStartTime: ").append(toIndentedString(virtualCodeStartTime)).append("\n");
    sb.append("    virtualCodeEndTime: ").append(toIndentedString(virtualCodeEndTime)).append("\n");
    sb.append("    imageAlbum: ").append(toIndentedString(imageAlbum)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    quotation: ").append(toIndentedString(quotation)).append("\n");
    sb.append("    serviceProcess: ").append(toIndentedString(serviceProcess)).append("\n");
    sb.append("    serviceArea: ").append(toIndentedString(serviceArea)).append("\n");
    sb.append("    freightTemplateId: ").append(toIndentedString(freightTemplateId)).append("\n");
    sb.append("    deliveryConfig: ").append(toIndentedString(deliveryConfig)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    subShopIds: ").append(toIndentedString(subShopIds)).append("\n");
    sb.append("    sendExchangeCode: ").append(toIndentedString(sendExchangeCode)).append("\n");
    sb.append("    serviceItem: ").append(toIndentedString(serviceItem)).append("\n");
    sb.append("    shopBrandId: ").append(toIndentedString(shopBrandId)).append("\n");
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

