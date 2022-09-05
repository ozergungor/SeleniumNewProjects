package com.cydeo.tests.day05_testNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T7_NonSelect_Dropdown {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() throws InterruptedException {

        //TC #7: Selecting value from non-select dropdown
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
        Thread.sleep(3000);
    }
    @Test
    public void method() throws InterruptedException {
        //3. Click to non-select dropdown
        WebElement nonSelectDropdown = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        nonSelectDropdown.click();
        Thread.sleep(3000);

        //4. Select Facebook from dropdown
        WebElement selectFacebook = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']"));
        selectFacebook.click();

        //5. Verify title is “Facebook - Log In or Sign Up”
        WebElement facebookTitle = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));

        String actualTitle = facebookTitle.getText();
        String expectedTitle = "Facebook – log in or sign up";
        //System.out.println(driver.getTitle());
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("PASSED!");
        } else {
            System.out.println("FAILED!!!");
        }
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}


