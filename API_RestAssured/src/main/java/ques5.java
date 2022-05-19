import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class ques5 {

    public static void main(String[] args) {

        RestAssured.baseURI="https://restcountries.com";
        RestAssured.basePath="/v2/all";

        Response resp= given().headers("Content-Type","application/json").get();

        JsonPath json = resp.jsonPath();
        ArrayList<JsonPath> country = json.get("independent");
        ArrayList<JsonPath> numericCode = json.get("numericCode");
        ArrayList<JsonPath> population = json.get("population");
        ArrayList<JsonPath> namingCode = json.get("callingCodes");

        for(int p=0;p<country.size();p++){
            Object obj =  country.get(p);
            if(obj.toString().equalsIgnoreCase("false")){
                System.out.println("Numeric Code is "+numericCode.get(p));
                System.out.println("Population is "+population.get(p));
                System.out.println("Calling Code is "+namingCode.get(p));
            }
        }
    }
}