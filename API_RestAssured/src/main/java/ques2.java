import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class ques2 {

    public static void main(String[] args) {


        RestAssured.baseURI="https://restcountries.com";
        RestAssured.basePath="/v2/currency/eur";

        ArrayList<String> a = given().contentType(ContentType.JSON).log().all().get().then().extract().path("name");
        for(String s:a){
            System.out.println(s+" is a country whose currency code is 'EUR'");
        }

    }
}
