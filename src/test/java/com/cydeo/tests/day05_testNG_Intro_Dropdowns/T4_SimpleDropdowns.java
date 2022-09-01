package com.cydeo.tests.day05_testNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdowns {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){

        //TC#4: Verifying “Simple dropdown” and “State selection” dropdown
        //default values
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }
    @Test
    public void simpleDropdownTest(){

        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        Select simpleDropdowns = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentlySelectedOption = simpleDropdowns.getFirstSelectedOption();
        String actualSimpleDropdownText = currentlySelectedOption.getText();
        String expectedSimpleDropdownText = "Please select an option";
        Assert.assertEquals(actualSimpleDropdownText, expectedSimpleDropdownText, "Test failed");

        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”

        Select stateSelectionText = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String expectedStateSelectionText = "Select a State";
        String actualStateSelectionText = stateSelectionText.getFirstSelectedOption().getText();
        Assert.assertEquals(actualStateSelectionText, expectedStateSelectionText, "Text failed");
    }
}
