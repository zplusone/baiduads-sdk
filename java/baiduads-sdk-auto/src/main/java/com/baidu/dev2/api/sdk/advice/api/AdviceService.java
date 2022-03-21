/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.advice.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.advice.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.advice.model.AcceptAdviceRequestWrapper;
import com.baidu.dev2.api.sdk.advice.model.AcceptAdviceResponseWrapper;
import com.baidu.dev2.api.sdk.advice.model.AcceptFeedAdviceRequestWrapper;
import com.baidu.dev2.api.sdk.advice.model.AcceptFeedAdviceResponseWrapper;
import com.baidu.dev2.api.sdk.advice.model.QueryDetailRequestWrapper;
import com.baidu.dev2.api.sdk.advice.model.QueryDetailResponseWrapper;
import com.baidu.dev2.api.sdk.advice.model.QueryFeedDetailRequestWrapper;
import com.baidu.dev2.api.sdk.advice.model.QueryFeedDetailResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdviceService {
  private ApiClient apiClient;

  public AdviceService() {
    this(Configuration.getDefaultApiClient());
  }

  public AdviceService(ApiClient apiClient) {
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
   * @param acceptAdviceRequestWrapper  (required)
   * @return AcceptAdviceResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public AcceptAdviceResponseWrapper acceptAdvice(AcceptAdviceRequestWrapper acceptAdviceRequestWrapper) throws ApiException {
    Object localVarPostBody = acceptAdviceRequestWrapper;
    
    // verify the required parameter 'acceptAdviceRequestWrapper' is set
    if (acceptAdviceRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'acceptAdviceRequestWrapper' when calling acceptAdvice");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/AdviceService/acceptAdvice";

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

    TypeReference<AcceptAdviceResponseWrapper> localVarReturnType = new TypeReference<AcceptAdviceResponseWrapper>() {};
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
   * @param acceptFeedAdviceRequestWrapper  (required)
   * @return AcceptFeedAdviceResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public AcceptFeedAdviceResponseWrapper acceptFeedAdvice(AcceptFeedAdviceRequestWrapper acceptFeedAdviceRequestWrapper) throws ApiException {
    Object localVarPostBody = acceptFeedAdviceRequestWrapper;
    
    // verify the required parameter 'acceptFeedAdviceRequestWrapper' is set
    if (acceptFeedAdviceRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'acceptFeedAdviceRequestWrapper' when calling acceptFeedAdvice");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/AdviceService/acceptFeedAdvice";

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

    TypeReference<AcceptFeedAdviceResponseWrapper> localVarReturnType = new TypeReference<AcceptFeedAdviceResponseWrapper>() {};
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
   * @param queryDetailRequestWrapper  (required)
   * @return QueryDetailResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public QueryDetailResponseWrapper queryDetail(QueryDetailRequestWrapper queryDetailRequestWrapper) throws ApiException {
    Object localVarPostBody = queryDetailRequestWrapper;
    
    // verify the required parameter 'queryDetailRequestWrapper' is set
    if (queryDetailRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'queryDetailRequestWrapper' when calling queryDetail");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/AdviceService/queryDetail";

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

    TypeReference<QueryDetailResponseWrapper> localVarReturnType = new TypeReference<QueryDetailResponseWrapper>() {};
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
   * @param queryFeedDetailRequestWrapper  (required)
   * @return QueryFeedDetailResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public QueryFeedDetailResponseWrapper queryFeedDetail(QueryFeedDetailRequestWrapper queryFeedDetailRequestWrapper) throws ApiException {
    Object localVarPostBody = queryFeedDetailRequestWrapper;
    
    // verify the required parameter 'queryFeedDetailRequestWrapper' is set
    if (queryFeedDetailRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'queryFeedDetailRequestWrapper' when calling queryFeedDetail");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/AdviceService/queryFeedDetail";

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

    TypeReference<QueryFeedDetailResponseWrapper> localVarReturnType = new TypeReference<QueryFeedDetailResponseWrapper>() {};
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
