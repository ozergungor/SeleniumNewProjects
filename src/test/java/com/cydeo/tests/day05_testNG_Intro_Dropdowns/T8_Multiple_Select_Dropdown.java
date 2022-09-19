package com.cydeo.tests.day05_testNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T8_Multiple_Select_Dropdown {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //TC #8: Selecting value from multiple select dropdown
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://practice.cydeo.com/dropdown");
    }
    @Test
    public void multipleDropdowns(){
        //3. Select all the options from multiple select dropdown.
        //4. Print out all selected values.

        List<WebElement> options = driver.findElements(By.xpath("//select[@name='Languages']/option"));

        for (WebElement option : options) {
            option.click();
            System.out.println(option.getText());
            //5. Deselect all values.
            option.click();
        }
    }
}
