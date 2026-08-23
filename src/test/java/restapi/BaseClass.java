package restapi;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


public class BaseClass {
    public Response getResponse(){
        String URL = "https://jsonplaceholder.typicode.com/todos";
        return given().when().
                get(URL);
    }


}
