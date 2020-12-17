package com.typicode.jsonplaceholder.comments;

import com.typicode.jsonplaceholder.utils.Endpoints;
import com.utils.StatusCode;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;

@Link("https://jsonplaceholder.typicode.com/comments")
@Link(name = "JSONPlaceholder", type = "Fake Online REST API for Testing and Prototyping")

public class GetCommentTest {

    private static Response response;

    @BeforeClass
    public static void getCommentsEndpoint() {
        response = given()
                    .expect()
                    .statusCode(StatusCode.SC_OK)
                .when()
                    .get(Endpoints.COMMENTS);
    }

    @Test
    @DisplayName("Verify Content Type is JSON")
    @Description("Verify that requests content type is JSON")
    public void getCommentsAssertContentTypeIsJSON() {
        response.then()
                    .assertThat()
                    .contentType(ContentType.JSON);
    }

    @Test
    @DisplayName("Receive a specific record")
    @Description("Find and get an existing record with a specific content")
    public void getCommentsGetSpecificRecord() {
        response.then()
                    .assertThat()
                    .body("email", hasItem("Eliseo@gardner.biz"));
    }

}