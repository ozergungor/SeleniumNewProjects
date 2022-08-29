package com.cydeo.tests.day02_locators_getText_getAttribute;

import com.sun.jna.Library;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Library_Verification_Practice {
    public static void main(String[] args) {

        // TC #4: Library verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to http://https://library1.cydeo.com/login.html
        driver.navigate().to("https://library1.cydeo.com/login.html");

        //3. Enter username: “incorrect@email.com”
        WebElement userName = driver.findElement(By.id("inputEmail"));
        userName.sendKeys("incorrect@email.com");

        //4. Enter password: “incorrect password”
        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("incorrect password");

        //5. Click on sign in button.
        WebElement clickOnSignInButton = driver.findElement(By.cssSelector("button[type='submit']"));
        clickOnSignInButton.click();

        //6. Verify: visually “Sorry, Wrong Email or Password”
        //displayed

        WebElement errorMessage = driver.findElement(By.className("alert"));
        String expectedErrorMessage = "Sorry, Wrong Email or Password";
        String actualErrorMessage = errorMessage.getText();
        System.out.println(actualErrorMessage);

        if(expectedErrorMessage.equals(actualErrorMessage)){
            System.out.println("PASSED!");
        }else{
            System.out.println("FAILED!!!");
        }
        //PS: Locate username input box using “className” locator
        //Locate password input box using “id” locator
        //Locate Sign in button using “tagName” locator
    }
}




