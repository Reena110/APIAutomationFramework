package com.thetestingacademy.tests.Crud;

import com.thetestingacademy.Base.BaseTest;
import endpoints.ApiConstant;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class TestHealthCheck extends BaseTest {
    @Test
    @Description("TC#3  - Verify Health")
    public void testGETHealthCheck() {
        requestSpecification.basePath(ApiConstant.PING_URL);

        response = RestAssured.given(requestSpecification).when().get();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(201);


    }
}