package com.cydeo.tests.day04_findElements_checkBoxes_radioButtons;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Xpath_Practice {

    public static void main(String[] args) {
        //    XPATH Practice
        //    DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //    TC #6: XPATH LOCATOR practice
        //    1. Open Chrome browser
        //    2. Go to http://practice.cydeo.com/multiple_buttons
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/multiple_buttons");

        //    3. Click on Button 1
        WebElement clickButton1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        clickButton1.click();
        //    4. Verify text displayed is as expected:
        //    Expected: “Clicked on button one!”
        String expectedText = "Clicked on button one!";
        String actualText = driver.findElement(By.xpath("//p[@id='result']")).getText();

        if(expectedText.equals(actualText)){
            System.out.println("PASSED!");
        }else{
            System.out.println("FAILED!!!");
        }
    }
}
