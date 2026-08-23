package com.practice.api;

import com.practice.utils.ConfigReader;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class CrudApiPractice {

    private static final String BASE_URL = ConfigReader.getProperty("api.base.url");

    @Test
    void getTodoById() {
        given()
            .baseUri(BASE_URL)
            .contentType(ContentType.JSON)
        .when()
            .get("/todos/1")
        .then()
            .statusCode(200)
            .body("id", equalTo(1))
            .body("title", notNullValue());
    }

    @Test
    void createTodo() {
        String payload = "{\n" +
                "  \"userId\": 1,\n" +
                "  \"title\": \"SDET Practice Post\",\n" +
                "  \"completed\": false\n" +
                "}";

        given()
            .baseUri(BASE_URL)
            .contentType(ContentType.JSON)
            .body(payload)
        .when()
            .post("/todos")
        .then()
            .statusCode(201)
            .body("title", equalTo("SDET Practice Post"))
            .body("id", notNullValue());
    }

    @Test
    void updateTodo() {
        String payload = "{\n" +
                "  \"userId\": 2,\n" +
                "  \"title\": \"Updated by SDET\",\n" +
                "  \"completed\": true\n" +
                "}";

        given()
            .baseUri(BASE_URL)
            .contentType(ContentType.JSON)
            .body(payload)
        .when()
            .put("/todos/1")
        .then()
            .statusCode(200)
            .body("title", equalTo("Updated by SDET"))
            .body("completed", equalTo(true));
    }

    @Test
    void deleteTodo() {
        given()
            .baseUri(BASE_URL)
        .when()
            .delete("/todos/1")
        .then()
            .statusCode(200);
    }
}
