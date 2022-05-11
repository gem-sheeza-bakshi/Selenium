import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class sheeza2 {
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\sh.bakshi\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\sh.bakshi\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://techtuts.in/");
        List<WebElement> len=driver.findElements((By.tagName("iframe")));
        System.out.println(len.size());
        for(int i=0; i<=len.size(); i++){

            driver.switchTo().frame(i);
            driver.switchTo().defaultContent();
        }
        //the tag google_esf is not specified correctly on the web.
        driver.switchTo().frame("google_esf");
        driver.switchTo().frame(len.size()-1);
        driver.findElement(By.tagName("body")).click();
    }
}