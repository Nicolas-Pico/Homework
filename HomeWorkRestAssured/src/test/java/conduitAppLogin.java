import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class conduitAppLogin {

    @Before
    public void setUp(){

        RestAssured.baseURI = "https://api.realworld.io";
        RestAssured.basePath = "/api";
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .build();
    }

    @Test
    public static Response loginTest(){
        Response response = given()
                .when()
                .body("{\n" +
                        "  \"user\": {\n" +
                        "    \"email\":\"luffy@gmail.com\",\n" +
                        "    \"password\":\"todomelo\"\n" +
                        "  }\n" +
                        "}")
                .post("/users/login")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();
        return response;
    }
}

