package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class MobileBankAPITest {
    @Test
    void test() {
        given()
                .baseUri("https://postman-echo.com")
                .body("balance: 123")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("balance: 123"));




    }
}
