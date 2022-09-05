package com.cydeo.tests.day05_testNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T6_SelectDate_Dropdowns {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //TC #6: Selecting date on dropdown and verifying
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }
    @Test
    public void method(){
        WebElement dropdown = driver.findElement(By.id("year"));
        Select s1 = new Select(dropdown);
        s1.selectByVisibleText("1923");
        WebElement dropdown2 = driver.findElement(By.id("month"));
        Select s2 = new Select(dropdown2);
        s2.selectByValue("11");
        WebElement dropdown3 = driver.findElement(By.id("day"));
        Select s3 = new Select(dropdown3);
        s3.selectByIndex(0);

        String expectedYear = "1923";
        String actualYear = s1.getFirstSelectedOption().getText();
        if (expectedYear.equals(actualYear)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        String expectedMonth = "December";
        String actualMonth = s2.getFirstSelectedOption().getText();
        if (expectedMonth.equals(actualMonth)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        String expectedDay =  "1";
        String actualDay = s3.getFirstSelectedOption().getText();
        if (expectedDay.equals(actualDay)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}