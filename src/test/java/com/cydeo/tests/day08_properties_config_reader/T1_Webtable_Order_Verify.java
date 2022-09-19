package com.cydeo.tests.day08_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Webtable_Order_Verify {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        //TC #1: Web table practice
        //1. Go to: https://practice.cydeo.com/web-tables
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }
    @Test
    public void order_name_verify_test(){

        //2. Verify Bob’s name is listed as expected.
        //Expected: “Bob Martin”
        WebElement bobMartinCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        String expectedBobMartinCell = "Bob Martin";
        String actualBobMartinCell = bobMartinCell.getText();

        if(expectedBobMartinCell.equals(actualBobMartinCell)){
            System.out.println("PASSED!");
        }else {
            System.out.println("FAILED!!!");
        }
        //3. Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021
        WebElement bobMartinOrderDate = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        String expectedBobMartinOrderDate = "12/31/2021";
        String actualBobMartinOrderDate = bobMartinOrderDate.getText();
        Assert.assertEquals(expectedBobMartinOrderDate, actualBobMartinOrderDate);
    }
}



