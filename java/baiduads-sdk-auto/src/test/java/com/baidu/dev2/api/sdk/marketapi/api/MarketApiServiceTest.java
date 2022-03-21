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

import com.baidu.dev2.api.sdk.invoke.ApiException;
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
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MarketApiService
 */
@Ignore
public class MarketApiServiceTest {

    private final MarketApiService api = new MarketApiService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelOrderTest() throws ApiException {
        CancelOrderRequestWrapper cancelOrderRequestWrapper = null;
        CancelOrderResponseWrapper response = api.cancelOrder(cancelOrderRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrderTest() throws ApiException {
        CreateOrderRequestWrapper createOrderRequestWrapper = null;
        CreateOrderResponseWrapper response = api.createOrder(createOrderRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderInfoTest() throws ApiException {
        GetOrderInfoRequestWrapper getOrderInfoRequestWrapper = null;
        GetOrderInfoResponseWrapper response = api.getOrderInfo(getOrderInfoRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSiteInfoTest() throws ApiException {
        GetSiteInfoRequestWrapper getSiteInfoRequestWrapper = null;
        GetSiteInfoResponseWrapper response = api.getSiteInfo(getSiteInfoRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void previewSiteTest() throws ApiException {
        PreviewSiteRequestWrapper previewSiteRequestWrapper = null;
        PreviewSiteResponseWrapper response = api.previewSite(previewSiteRequestWrapper);

        // TODO: test validations
    }
}
