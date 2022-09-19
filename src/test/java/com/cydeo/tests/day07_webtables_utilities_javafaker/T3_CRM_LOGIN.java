package com.cydeo.tests.day07_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        //TC #3: Login scenario
        //1. Create new test and make set ups
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void crm_login_test(){

        driver.get("http://login1.nextbasecrm.com/");
        //2. Go to : http://login1.nextbasecrm.com/

        //3. Enter valid username
        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        usernameInput.sendKeys("helpdesk1@cybertekschool.com");

        //4. Enter valid password
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordInput.sendKeys("UserUser");

        //5. Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver, "Portal");
    }
    @Test
    public void crm_login_test_2(){

        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

        // Create utility about CRM
        CRM_Utilities.crm_login(driver);

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver, "Portal");
    }
}
