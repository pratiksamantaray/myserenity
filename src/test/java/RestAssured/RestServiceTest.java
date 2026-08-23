package RestAssured;

import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

class RestServiceTest {
    static Response response;

    @BeforeAll
    public static void instanstiateRest(){
        response =new JsonRequest().RestRequest();
    }

    @Test
    public void verifyStatusCode(){
        response.then().statusCode(200);

    }
    @Test
    public void verifyResponseBody(){
        response.then().body("userId", equalTo(1));

    }   
}
