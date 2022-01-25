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
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class getArticlesConduitAppToken {

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
    public void getArticles() {
        String Token = conduitAppLogin.loginTest().path("user.token");
        Response response = given()
                .auth().oauth2(Token)
                .when()
                .get("/articles?limit=10&offset=0")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();
        int statusCode = response.getStatusCode();
        assertThat(statusCode, equalTo(HttpStatus.SC_OK));
    }
}
