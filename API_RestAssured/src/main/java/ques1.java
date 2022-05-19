import io.restassured.RestAssured;
import io.restassured.http.ContentType;


import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class ques1 {
    public static void main(String[] args) {


        RestAssured.baseURI = "https://restcountries.com";
        RestAssured.basePath = "/v2/all";


        ArrayList<String> area = given().contentType(ContentType.JSON).log().all().get()
                .then().extract().path("subregion");


        int total = 0;
        for (String s : area) {
            if (s.contains("America")) {
                total++;
            }
        }

        System.out.println("total number of countries lying in the 'AMERICAS' region are " + total);
    }
}
