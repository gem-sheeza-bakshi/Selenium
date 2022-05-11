import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sheeza {
    WebDriver driver;
    @Test
    @Parameters("gateway")
    public void verifyPageTable(String browserName) throws Exception {
        if(browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","C:\\Users\\sh.bakshi\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
            driver=new FirefoxDriver();
        }
        else if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\sh.bakshi\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver=new ChromeDriver();
        }
        else{
            throw new Exception("Browser not found");
        }
        driver.manage().window().maximize();
        driver.get("https://www.geminisolutions.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
