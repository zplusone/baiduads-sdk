/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.crowdfeed.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.crowdfeed.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.crowdfeed.model.GetBindAdgroupRequestWrapper;
import com.baidu.dev2.api.sdk.crowdfeed.model.GetBindAdgroupResponseWrapper;
import com.baidu.dev2.api.sdk.crowdfeed.model.GetEshopEldsCrowdsRequestWrapper;
import com.baidu.dev2.api.sdk.crowdfeed.model.GetEshopEldsCrowdsResponseWrapper;
import com.baidu.dev2.api.sdk.crowdfeed.model.GetEshopTradeCrowdsRequestWrapper;
import com.baidu.dev2.api.sdk.crowdfeed.model.GetEshopTradeCrowdsResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CrowdFeedService {
  private ApiClient apiClient;

  public CrowdFeedService() {
    this(Configuration.getDefaultApiClient());
  }

  public CrowdFeedService(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * 
   * @param getBindAdgroupRequestWrapper  (required)
   * @return GetBindAdgroupResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetBindAdgroupResponseWrapper getBindAdgroup(GetBindAdgroupRequestWrapper getBindAdgroupRequestWrapper) throws ApiException {
    Object localVarPostBody = getBindAdgroupRequestWrapper;
    
    // verify the required parameter 'getBindAdgroupRequestWrapper' is set
    if (getBindAdgroupRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getBindAdgroupRequestWrapper' when calling getBindAdgroup");
    }
    
    // create path and map variables
    String localVarPath = "/json/feed/v1/CrowdFeedService/getBindAdgroup";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GetBindAdgroupResponseWrapper> localVarReturnType = new TypeReference<GetBindAdgroupResponseWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 
   * 
   * @param getEshopEldsCrowdsRequestWrapper  (required)
   * @return GetEshopEldsCrowdsResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetEshopEldsCrowdsResponseWrapper getEshopEldsCrowds(GetEshopEldsCrowdsRequestWrapper getEshopEldsCrowdsRequestWrapper) throws ApiException {
    Object localVarPostBody = getEshopEldsCrowdsRequestWrapper;
    
    // verify the required parameter 'getEshopEldsCrowdsRequestWrapper' is set
    if (getEshopEldsCrowdsRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getEshopEldsCrowdsRequestWrapper' when calling getEshopEldsCrowds");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/CrowdFeedService/getEshopEldsCrowds";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GetEshopEldsCrowdsResponseWrapper> localVarReturnType = new TypeReference<GetEshopEldsCrowdsResponseWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
  /**
   * 
   * 
   * @param getEshopTradeCrowdsRequestWrapper  (required)
   * @return GetEshopTradeCrowdsResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetEshopTradeCrowdsResponseWrapper getEshopTradeCrowds(GetEshopTradeCrowdsRequestWrapper getEshopTradeCrowdsRequestWrapper) throws ApiException {
    Object localVarPostBody = getEshopTradeCrowdsRequestWrapper;
    
    // verify the required parameter 'getEshopTradeCrowdsRequestWrapper' is set
    if (getEshopTradeCrowdsRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getEshopTradeCrowdsRequestWrapper' when calling getEshopTradeCrowds");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/CrowdFeedService/getEshopTradeCrowds";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GetEshopTradeCrowdsResponseWrapper> localVarReturnType = new TypeReference<GetEshopTradeCrowdsResponseWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
}
