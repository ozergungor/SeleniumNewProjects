package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework_3_BackAndForthNavigation {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://google.com");

        Thread.sleep(3000);

        WebElement clickGmail = driver.findElement(By.className("gb_d"));
        clickGmail.click();

        String expectedGmail = "Gmail";
        String actualGmail = driver.getTitle();

        if(expectedGmail.equals(actualGmail)){
            System.out.println("Verification PASSED!");
        }else{
            System.out.println("Verification FAILED!!!");
        }
        Thread.sleep(3000);
        driver.navigate().back();

        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();

        if(expectedGoogleTitle.equals(actualGoogleTitle)){
            System.out.println("Title verification is as expected. PASSED!");
        }else{
            System.out.println("Title verification is NOT as expected. FAILED!");
        }
        Thread.sleep(3000);
        driver.close();
    }
}
/*
TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
 */
