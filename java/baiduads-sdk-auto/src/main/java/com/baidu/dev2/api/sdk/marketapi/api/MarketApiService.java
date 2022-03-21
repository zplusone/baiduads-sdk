/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.marketapi.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.marketapi.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.marketapi.model.CancelOrderRequestWrapper;
import com.baidu.dev2.api.sdk.marketapi.model.CancelOrderResponseWrapper;
import com.baidu.dev2.api.sdk.marketapi.model.CreateOrderRequestWrapper;
import com.baidu.dev2.api.sdk.marketapi.model.CreateOrderResponseWrapper;
import com.baidu.dev2.api.sdk.marketapi.model.GetOrderInfoRequestWrapper;
import com.baidu.dev2.api.sdk.marketapi.model.GetOrderInfoResponseWrapper;
import com.baidu.dev2.api.sdk.marketapi.model.GetSiteInfoRequestWrapper;
import com.baidu.dev2.api.sdk.marketapi.model.GetSiteInfoResponseWrapper;
import com.baidu.dev2.api.sdk.marketapi.model.PreviewSiteRequestWrapper;
import com.baidu.dev2.api.sdk.marketapi.model.PreviewSiteResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MarketApiService {
  private ApiClient apiClient;

  public MarketApiService() {
    this(Configuration.getDefaultApiClient());
  }

  public MarketApiService(ApiClient apiClient) {
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
   * @param cancelOrderRequestWrapper  (required)
   * @return CancelOrderResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public CancelOrderResponseWrapper cancelOrder(CancelOrderRequestWrapper cancelOrderRequestWrapper) throws ApiException {
    Object localVarPostBody = cancelOrderRequestWrapper;
    
    // verify the required parameter 'cancelOrderRequestWrapper' is set
    if (cancelOrderRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'cancelOrderRequestWrapper' when calling cancelOrder");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/MarketApiService/cancelOrder";

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

    TypeReference<CancelOrderResponseWrapper> localVarReturnType = new TypeReference<CancelOrderResponseWrapper>() {};
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
   * @param createOrderRequestWrapper  (required)
   * @return CreateOrderResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public CreateOrderResponseWrapper createOrder(CreateOrderRequestWrapper createOrderRequestWrapper) throws ApiException {
    Object localVarPostBody = createOrderRequestWrapper;
    
    // verify the required parameter 'createOrderRequestWrapper' is set
    if (createOrderRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'createOrderRequestWrapper' when calling createOrder");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/MarketApiService/createOrder";

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

    TypeReference<CreateOrderResponseWrapper> localVarReturnType = new TypeReference<CreateOrderResponseWrapper>() {};
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
   * @param getOrderInfoRequestWrapper  (required)
   * @return GetOrderInfoResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetOrderInfoResponseWrapper getOrderInfo(GetOrderInfoRequestWrapper getOrderInfoRequestWrapper) throws ApiException {
    Object localVarPostBody = getOrderInfoRequestWrapper;
    
    // verify the required parameter 'getOrderInfoRequestWrapper' is set
    if (getOrderInfoRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getOrderInfoRequestWrapper' when calling getOrderInfo");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/MarketApiService/getOrderInfo";

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

    TypeReference<GetOrderInfoResponseWrapper> localVarReturnType = new TypeReference<GetOrderInfoResponseWrapper>() {};
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
   * @param getSiteInfoRequestWrapper  (required)
   * @return GetSiteInfoResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetSiteInfoResponseWrapper getSiteInfo(GetSiteInfoRequestWrapper getSiteInfoRequestWrapper) throws ApiException {
    Object localVarPostBody = getSiteInfoRequestWrapper;
    
    // verify the required parameter 'getSiteInfoRequestWrapper' is set
    if (getSiteInfoRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getSiteInfoRequestWrapper' when calling getSiteInfo");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/MarketApiService/getSiteInfo";

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

    TypeReference<GetSiteInfoResponseWrapper> localVarReturnType = new TypeReference<GetSiteInfoResponseWrapper>() {};
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
   * @param previewSiteRequestWrapper  (required)
   * @return PreviewSiteResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public PreviewSiteResponseWrapper previewSite(PreviewSiteRequestWrapper previewSiteRequestWrapper) throws ApiException {
    Object localVarPostBody = previewSiteRequestWrapper;
    
    // verify the required parameter 'previewSiteRequestWrapper' is set
    if (previewSiteRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'previewSiteRequestWrapper' when calling previewSite");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/MarketApiService/previewSite";

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

    TypeReference<PreviewSiteResponseWrapper> localVarReturnType = new TypeReference<PreviewSiteResponseWrapper>() {};
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
