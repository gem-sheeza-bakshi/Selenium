import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class ques3 {

    public static void main(String[] args) {


        RestAssured.baseURI="https://restcountries.com";
        RestAssured.basePath="/v2/regionalbloc/saarc";

        ArrayList<String> capital = given().contentType(ContentType.JSON).log().all().get()
                .then().extract().path("capital");

        for(String s:capital){
            System.out.println(s +"  the capital of countries who are a part of 'SAARC' regional bloc");
        }
    }
}