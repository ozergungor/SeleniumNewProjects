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

public class T2_Confirmation_Alert_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        //TC #2: Confirmation alert practice
        //1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://practice.cydeo.com/javascript_alerts");
    }
    @Test
    public void confirmationAlertMethod(){

        //3. Click to “Click for JS Confirm” button
        WebElement clickJSConfirmButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        clickJSConfirmButton.click();

        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //5. Verify “You clicked: Ok” text is displayed
        WebElement resultText = driver.findElement(By.xpath("//p[@style='color:green']"));
        String actualAlertText = resultText.getText();
        String expectedAlertText = "You clicked: Ok";

        Assert.assertEquals(expectedAlertText, actualAlertText, "Alert Text is not as expected");
    }
        @AfterMethod
        public void tearDownMethod(){
        driver.close();
    }
}




