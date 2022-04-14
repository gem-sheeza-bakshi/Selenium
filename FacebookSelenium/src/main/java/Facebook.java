package com.selenium_for_intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {

    public static void main(String[] args) throws InterruptedException {
        // write your code here
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver obj=new ChromeDriver();
        obj.get("http://www.facebook.com/r.php?locale=en_GB&display=page");

        Actions act=new Actions(obj);
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        WebElement fn= obj.findElement(By.xpath("//*[@id='fullname_field']//input[@name='firstname']"));
        act.moveToElement(fn)
                .sendKeys(fn,"Sheeza").build().perform();
        act.moveToElement(fn);
        Thread.sleep(2000);




        //first select the text crlt+a
        act.keyDown(Keys.CONTROL).sendKeys("a");
        act.sendKeys("c");

        //click inside the surname and press crlt+v
        WebElement ln =obj.findElement (By.xpath("//*[@id='fullname_field']//input[@name='lastname']"));
        act.moveToElement(ln);
        // act.contextClick(ln).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ENTER).build().perform();

        // act.contextClick(ln).build().perform();
        //Thread.sleep(2000);
        ///WebElement elementOpen = obj.findElement(By.linkText("Paste")); /*This will select menu after right click */

        //  elementOpen.click();
        act.moveToElement(ln).click().keyDown(Keys.CONTROL).sendKeys("v");

        //releasde the key
        act.keyUp(Keys.CONTROL).build().perform();



        //phone
        WebElement pn= obj.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
        act.moveToElement(pn)
                .sendKeys(pn,"6289756478").build().perform();



       /* obj.findElement(By.xpath("//*[@id='fullname_field']//input[@name='firstname']")).sendKeys(Keys.chord(Keys.CONTROL,"c"));

// now apply the command to paste
        WebElement ln =obj.findElement (By.xpath("//*[@id='fullname_field']//input[@name='lastname']"));

        act.moveToElement(ln).sendKeys(Keys.chord(Keys.CONTROL, "v"))
                .build().perform();
        //paste
        //.sendKeys(Keys.chord(Keys.CONTROL, "v"))
       /* m.click();
        obj.findElement(By.xpath("//input[@id='u_b_b_5W']")).sendKeys("rahul");*/
    }
}