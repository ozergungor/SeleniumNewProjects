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

public class T1_Information_Alert_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        //TC #1: Information alert practice
        // 1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }
    @Test
    public void alertMethod(){
        //3. Click to “Click for JS Alert” button
        WebElement alertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        alertButton.click();

        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed
        WebElement resultText = driver.findElement(By.xpath("//p[.='You successfully clicked an alert']"));
        Assert.assertTrue(resultText.isDisplayed());
        String expectedText = "You successfully clicked an alert";
        String actualText = resultText.getText();

        Assert.assertEquals(expectedText, actualText, "Actual result test is NOT displayed!!!");
    }
        @AfterMethod
        public void tearDownMethod(){
        driver.close();
    }
}






