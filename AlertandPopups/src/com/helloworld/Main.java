package com.helloworld;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.*;
import java.awt.event.InputEvent;

public class Main {

    public static void main(String[] args) throws InterruptedException, AWTException {
        //Point 1
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        driver.manage().window().maximize();

//Point 2
        WebElement alertBtn = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/div/div/div/div[2]/input[1]"));
        Thread.sleep(1000);
        alertBtn.click();
        //driver.switchTo().alert().accept();
        Alert alert1 = driver.switchTo().alert();
        Thread.sleep(1000);
        alert1.accept();


//Point 3
        Thread.sleep(1000);
        WebElement confirmationBtn = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/div/div/div/div[2]/input[2]"));
        confirmationBtn.click();
        Thread.sleep(1000);
//
//        String s = driver.switchTo().alert().getText();
//        System.out.println(s);
        Alert alert2 = driver.switchTo().alert();
        String s = alert2.getText();
        System.out.println(s);
        Thread.sleep(1000);
        alert2.dismiss();


        //Point 4
        Thread.sleep(1000);
        WebElement promptBtn = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div/div/div/div/div/div[2]/input[3]"));
        promptBtn.click();
        Thread.sleep(1000);
        //driver.switchTo().alert().sendKeys("Hello").accept();
        Alert alert3 = driver.switchTo().alert();
        Thread.sleep(1000);
        alert3.sendKeys("Testing Selenium");
        Thread.sleep(1000);
        alert3.accept();


        //Point 5
        Thread.sleep(1000);
        WebElement doubleBtn = driver.findElement(By.xpath("//*[@id=\"double-click\"]"));
        Thread.sleep(1000);
        Actions act = new Actions(driver);
        act.doubleClick(doubleBtn).perform();
        Alert alert4 = driver.switchTo().alert();
        Thread.sleep(1000);
        String s2 = alert4.getText();
        System.out.println(s2);
        Thread.sleep(1000);
        alert4.accept();



        //Point 6
        Robot robot = new Robot();
        robot.mouseMove(275,400);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(1000);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Actions a = new Actions(driver);
        driver.findElement(By.xpath("//*[@id=\"link1\"]")).sendKeys(Keys.TAB);
        a.sendKeys(Keys.ENTER).perform();

    }
}

