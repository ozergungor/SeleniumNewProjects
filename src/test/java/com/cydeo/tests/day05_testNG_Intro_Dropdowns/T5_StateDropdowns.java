package com.cydeo.tests.day05_testNG_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
public class T5_StateDropdowns {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){

        //TC #5: Selecting state from State dropdown and verifying result
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public void method(){
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='state']"));
        Select select = new Select(dropdown);

        //3. Select Illinois
        select.selectByValue("IL");

        //4. Select Virginia
        select.selectByVisibleText("Virginia");

        //5. Select California
        select.selectByIndex(5);

        //6. Verify final selected option is California.
        //Use all Select options. (visible text, value, index)

        String expectedText = "California";
        String actualText = select.getFirstSelectedOption().getText();

        if(expectedText.equals(actualText)){
            System.out.println("PASSED!");
        }else{
            System.out.println("FAILED!!!");
        }
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}
