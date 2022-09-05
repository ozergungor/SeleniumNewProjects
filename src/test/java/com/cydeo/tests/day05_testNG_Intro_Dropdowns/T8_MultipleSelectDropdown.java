package com.cydeo.tests.day05_testNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T8_MultipleSelectDropdown {

    WebDriver driver;

    @BeforeClass
    public void setup(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public void multipleSelection(){
        Select selectAllDropdowns = new Select(driver.findElement(By.name("Languages")));
        List<WebElement> allLanguageOptions =selectAllDropdowns.getOptions();

        for (WebElement each : allLanguageOptions) {
            each.click();
            System.out.println("Language Options = " + each.getText());
        }
        selectAllDropdowns.deselectAll();
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
/*
    TC #8: Selecting value from multiple select dropdown
        1. Open Chrome browser
        2. Go to https://practice.cydeo.com/dropdown
        3. Select all the options from multiple select dropdown.
        4. Print out all selected values.
        5. Deselect all values
     */