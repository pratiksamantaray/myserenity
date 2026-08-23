package RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.request;

public class RestService {

    public static void main(String[] args){

        Response res =given().when().
                get("https://jsonplaceholder.typicode.com/todos/2");



    }

    static <T> void print(T str){
        System.out.println(str);
    }
}





