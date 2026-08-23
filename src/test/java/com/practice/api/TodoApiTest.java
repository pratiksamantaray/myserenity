package com.practice.api;

import com.practice.utils.ConfigReader;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class TodoApiTest {

    private static final String BASE_URL = ConfigReader.getProperty("api.base.url");

    @Test
    void shouldGetTodoById1() {
        given()
            .baseUri(BASE_URL)
            .contentType(ContentType.JSON)
        .when()
            .get("/todos/1")
        .then()
            .statusCode(200)
            .body("userId", equalTo(1))
            .body("id", equalTo(1))
            .body("title", notNullValue());
    }
    @Test
    void shouldGetTodoById2() {
        given()
                .baseUri(BASE_URL)
                .contentType(ContentType.JSON)
                .when()
                .get("/todos/1")
                .then()
                .statusCode(200)
                .body("userId", equalTo(1))
                .body("id", equalTo(1))
                .body("title", notNullValue());
    }

    @Test
    void shouldCreateTodo() {
        String payload = "{\n" +
                "  \"userId\": 1,\n" +
                "  \"title\": \"Learn RestAssured\",\n" +
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
            .body("title", equalTo("Learn RestAssured"))
            .body("id", notNullValue());
    }
}
