/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.crowd.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.crowd.model.AddCrowdRequestWrapper;
import com.baidu.dev2.api.sdk.crowd.model.AddCrowdResponseWrapper;
import com.baidu.dev2.api.sdk.crowd.model.DeleteCrowdRequestWrapper;
import com.baidu.dev2.api.sdk.crowd.model.DeleteCrowdResponseWrapper;
import com.baidu.dev2.api.sdk.crowd.model.GetCrowdRequestWrapper;
import com.baidu.dev2.api.sdk.crowd.model.GetCrowdResponseWrapper;
import com.baidu.dev2.api.sdk.crowd.model.UpdateCrowdRequestWrapper;
import com.baidu.dev2.api.sdk.crowd.model.UpdateCrowdResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CrowdService
 */
@Ignore
public class CrowdServiceTest {

    private final CrowdService api = new CrowdService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCrowdTest() throws ApiException {
        AddCrowdRequestWrapper addCrowdRequestWrapper = null;
        AddCrowdResponseWrapper response = api.addCrowd(addCrowdRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCrowdTest() throws ApiException {
        DeleteCrowdRequestWrapper deleteCrowdRequestWrapper = null;
        DeleteCrowdResponseWrapper response = api.deleteCrowd(deleteCrowdRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCrowdTest() throws ApiException {
        GetCrowdRequestWrapper getCrowdRequestWrapper = null;
        GetCrowdResponseWrapper response = api.getCrowd(getCrowdRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCrowdTest() throws ApiException {
        UpdateCrowdRequestWrapper updateCrowdRequestWrapper = null;
        UpdateCrowdResponseWrapper response = api.updateCrowd(updateCrowdRequestWrapper);

        // TODO: test validations
    }
}
