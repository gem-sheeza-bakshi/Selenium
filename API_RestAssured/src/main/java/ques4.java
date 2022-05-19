import io.restassured.RestAssured;
import io.restassured.http.ContentType;


import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class ques4 {

    public static void main(String[] args) {

        RestAssured.baseURI="https://restcountries.com";
        RestAssured.basePath="/v2/all";

        ArrayList<String> land = given().contentType(ContentType.JSON).log().all().get()
                .then().extract().path("name");

        ArrayList<Integer> population = given().contentType(ContentType.JSON).log().all().get()
                .then().extract().path("population");
        ArrayList<String> capital = given().contentType(ContentType.JSON).log().all().get()
                .then().extract().path("capital");

        ArrayList<String> nativeName = given().contentType(ContentType.JSON).log().all().get()
                .then().extract().path("nativeName");




        int mini=Integer.MAX_VALUE;
        int count=0;
        for(int k=0;k<population.size();k++){
            if(population.get(k)<=mini && population.get(k)!=0){
                mini=population.get(k);
                count=k;
            }
        }
        String url = "https://restcountries.com/v2/name/south georgia";

        ArrayList<ArrayList<String>> currencyCode = given().contentType(ContentType.JSON).log().all().get(url)
                .then().extract().path("currencies.code");


        System.out.println("Name of the least populated country: "+land.get(count));
        System.out.println("Native Name of the least populated country: "+nativeName.get(count));
        System.out.println("Capital Name of the least populated country: "+capital.get(count));
        System.out.println("Currency code of the least populated country: "+currencyCode.get(0).get(0));
    }
}