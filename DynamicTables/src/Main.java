

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.sql.SQLOutput;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\sh.bakshi\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");



        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
        List<WebElement> tableCol = driver.findElements(By.xpath("//table[@id='customers']//td"));

        String start = "//table[@id='customers']//tr[";
        String mid = "]//td[";
        String end = "]";
        int headSize = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
        int rowSize = tableRows.size();
        //System.out.println(headSize +" "+rowSize);


               for(int i=1;i<= headSize;i++){
            for(int j=2;j< rowSize;j++){
                System.out.print(driver.findElement(By.xpath(start+j+mid+i+end)).getText()+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=2;i<= rowSize;i++){
            for(int j=1;j< headSize;j++){
                System.out.print(driver.findElement(By.xpath(start+i+mid+j+end)).getText()+" ");
            }
            System.out.println();
        }
        System.out.println();


        String s ="";
        String s2="";
        for(int j=2;j<rowSize;j++){
            String check = driver.findElement(By.xpath(start+j+mid+2+end)).getText();
            if(check.equals("Roland Mendel")){
                s = driver.findElement(By.xpath(start+j+mid+1+end)).getText();
                s2 = driver.findElement(By.xpath(start+j+mid+3+end)).getText();
            }
        }
        if(s.equals("Microsoft") && s2.equals("Austria")){
            System.out.println("Yes");
        }
        else
            System.out.println("No");



    }
}
