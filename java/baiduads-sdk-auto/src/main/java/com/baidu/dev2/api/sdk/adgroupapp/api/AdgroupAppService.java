/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.adgroupapp.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.adgroupapp.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.adgroupapp.model.AddAdgroupAppBindRequestWrapper;
import com.baidu.dev2.api.sdk.adgroupapp.model.AddAdgroupAppBindResponseWrapper;
import com.baidu.dev2.api.sdk.adgroupapp.model.DeleteAdgroupAppBindRequestWrapper;
import com.baidu.dev2.api.sdk.adgroupapp.model.DeleteAdgroupAppBindResponseWrapper;
import com.baidu.dev2.api.sdk.adgroupapp.model.GetAdgroupAppBindRequestWrapper;
import com.baidu.dev2.api.sdk.adgroupapp.model.GetAdgroupAppBindResponseWrapper;
import com.baidu.dev2.api.sdk.adgroupapp.model.UpdateAdgroupAppBindRequestWrapper;
import com.baidu.dev2.api.sdk.adgroupapp.model.UpdateAdgroupAppBindResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdgroupAppService {
  private ApiClient apiClient;

  public AdgroupAppService() {
    this(Configuration.getDefaultApiClient());
  }

  public AdgroupAppService(ApiClient apiClient) {
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
   * @param addAdgroupAppBindRequestWrapper  (required)
   * @return AddAdgroupAppBindResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public AddAdgroupAppBindResponseWrapper addAdgroupAppBind(AddAdgroupAppBindRequestWrapper addAdgroupAppBindRequestWrapper) throws ApiException {
    Object localVarPostBody = addAdgroupAppBindRequestWrapper;
    
    // verify the required parameter 'addAdgroupAppBindRequestWrapper' is set
    if (addAdgroupAppBindRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'addAdgroupAppBindRequestWrapper' when calling addAdgroupAppBind");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/AdgroupAppService/addAdgroupAppBind";

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

    TypeReference<AddAdgroupAppBindResponseWrapper> localVarReturnType = new TypeReference<AddAdgroupAppBindResponseWrapper>() {};
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
   * @param deleteAdgroupAppBindRequestWrapper  (required)
   * @return DeleteAdgroupAppBindResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public DeleteAdgroupAppBindResponseWrapper deleteAdgroupAppBind(DeleteAdgroupAppBindRequestWrapper deleteAdgroupAppBindRequestWrapper) throws ApiException {
    Object localVarPostBody = deleteAdgroupAppBindRequestWrapper;
    
    // verify the required parameter 'deleteAdgroupAppBindRequestWrapper' is set
    if (deleteAdgroupAppBindRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'deleteAdgroupAppBindRequestWrapper' when calling deleteAdgroupAppBind");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/AdgroupAppService/deleteAdgroupAppBind";

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

    TypeReference<DeleteAdgroupAppBindResponseWrapper> localVarReturnType = new TypeReference<DeleteAdgroupAppBindResponseWrapper>() {};
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
   * @param getAdgroupAppBindRequestWrapper  (required)
   * @return GetAdgroupAppBindResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetAdgroupAppBindResponseWrapper getAdgroupAppBind(GetAdgroupAppBindRequestWrapper getAdgroupAppBindRequestWrapper) throws ApiException {
    Object localVarPostBody = getAdgroupAppBindRequestWrapper;
    
    // verify the required parameter 'getAdgroupAppBindRequestWrapper' is set
    if (getAdgroupAppBindRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getAdgroupAppBindRequestWrapper' when calling getAdgroupAppBind");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/AdgroupAppService/getAdgroupAppBind";

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

    TypeReference<GetAdgroupAppBindResponseWrapper> localVarReturnType = new TypeReference<GetAdgroupAppBindResponseWrapper>() {};
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
   * @param updateAdgroupAppBindRequestWrapper  (required)
   * @return UpdateAdgroupAppBindResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UpdateAdgroupAppBindResponseWrapper updateAdgroupAppBind(UpdateAdgroupAppBindRequestWrapper updateAdgroupAppBindRequestWrapper) throws ApiException {
    Object localVarPostBody = updateAdgroupAppBindRequestWrapper;
    
    // verify the required parameter 'updateAdgroupAppBindRequestWrapper' is set
    if (updateAdgroupAppBindRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'updateAdgroupAppBindRequestWrapper' when calling updateAdgroupAppBind");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/AdgroupAppService/updateAdgroupAppBind";

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

    TypeReference<UpdateAdgroupAppBindResponseWrapper> localVarReturnType = new TypeReference<UpdateAdgroupAppBindResponseWrapper>() {};
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
