package com.cydeo.tests.day06_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_Alert_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        //TC #3: Information alert practice
        //1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }
    @Test
    public void alertMethod(){

        //3. Click to “Click for JS Prompt” button
        WebElement clickJSPrompt = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        clickJSPrompt.click();

        //4. Send “hello” text to alert
        //5. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");
        alert.accept();

        //6. Verify “You entered: hello” text is displayed
        WebElement helloText = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        Assert.assertTrue(helloText.isDisplayed());
    }
    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }
}



