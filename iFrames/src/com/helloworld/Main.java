import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="http://demo.automationtesting.in/Frames.html";
        driver.get(url);


        driver.findElement(By.xpath("//a[@href='#Multiple']")).click();

        WebElement outerFrame=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(outerFrame);
        WebElement innerFrame=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));

        driver.switchTo().frame(innerFrame);

        WebElement text=driver.findElement(By.xpath("//input[@type='text']"));
        text.sendKeys("Sheeza");

        Thread.sleep(2000);

        driver.switchTo().defaultContent();


        WebElement otherframe=driver.findElement(By.xpath("//a[@href='#Single']"));//button click
        otherframe.click();

        driver.switchTo().frame("singleframe");
        Thread.sleep(1000);
        WebElement input=driver.findElement(By.xpath("//input[@type='text']"));
        input.sendKeys("Sheeza");

        driver.switchTo().defaultContent();

        Thread.sleep(3000);
        driver.close();
    }
}
