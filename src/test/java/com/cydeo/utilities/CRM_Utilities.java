package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    public static void crm_login(WebDriver driver){

        //3. Enter valid username
        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        usernameInput.sendKeys("helpdesk1@cybertekschool.com");

        //4. Enter valid password
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordInput.sendKeys("UserUser");

        //5. Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();
    }
}
