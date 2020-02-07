package com.typicode.jsonplaceholder;

import com.typicode.jsonplaceholder.utils.Endpoints;
import com.typicode.jsonplaceholder.utils.StatusCodes;
import io.qameta.allure.Link;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
@Link("https://jsonplaceholder.typicode.com/comments")
@Link(name = "JSONPlaceholder", type = "Fake Online REST API for Testing and Prototyping")
public class GetCommentTest {

    private static Response response;

    @BeforeClass
    public static void getCommentsEndpoint(){
        response = given().expect().statusCode(StatusCodes.SC_OK).
                when().get(Endpoints.COMMENTS_ENDPOINT);
    }

    @Test
    @DisplayName("Verify Content Type is JSON")
    @Description("Verify that requests content type is JSON")
    public void verifyContentTypeJSON(){
        response.then().assertThat().contentType(ContentType.JSON);
    }

    @Test
    @DisplayName("Receive response in 250ms or less")
    @Description("Ensure that request response time is 250ms or less")
    public void canGetResponseInLessThan250ms(){
        response.then().assertThat().time(lessThan(2500L));
    }

    @Test
    @DisplayName("Receive a specific record")
    @Description("Find and get an existing record with a specific content")
    public void canGetSpecificRecord(){
        response.then().assertThat().body("email", hasItem("Eliseo@gardner.biz"));
    }

}