package com.cydeo.tests.day04_findElements_checkBoxes_radioButtons;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1And2_xpath_cssSelector_practice {

    public static void main(String[] args) {

        //XPATH and CSS Selector PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.navigate().to("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        // Locate home link using sccSelector
        WebElement homeLink1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeLink2 = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink3 = driver.findElement(By.cssSelector("a[href='/']"));

        //b. “Forgot password” header
        // Locate header using cssSelector: Locate parent element and move down to h2.
        WebElement header1 = driver.findElement(By.cssSelector("div.example > h2"));
        // By using xpath
        // WebElement header2 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        WebElement header2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        //c. “E-mail” text
        WebElement emailText = driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        WebElement emailInputBox1 = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement emailInputBox2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z0-')]"));

        //e. “Retrieve password” button
        WebElement retrievePasswordButton1 = driver.findElement(By.xpath("//button[@id='form_submit']"));
        WebElement retrievePasswordButton2 = driver.findElement(By.xpath("//button[@class='radius']"));
        WebElement retrievePasswordButton3 = driver.findElement(By.xpath("//button[@type='submit']"));

        //f. “Powered by Cydeo" text
        WebElement poweredByCydeo1 = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        WebElement poweredByCydeo2 = driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));

        //4. Verify all web elements are displayed.
        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("header1.isDisplayed() = " + header1.isDisplayed());
        System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());
        System.out.println("emailInputBox1.isDisplayed() = " + emailInputBox1.isDisplayed());
        System.out.println("retrievePasswordButton1.isDisplayed() = " + retrievePasswordButton1.isDisplayed());
        System.out.println("poweredByCydeo1.isDisplayed() = " + poweredByCydeo1.isDisplayed());

        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible
    }
}
