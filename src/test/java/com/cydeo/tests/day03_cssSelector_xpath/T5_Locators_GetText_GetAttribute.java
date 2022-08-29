package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_Locators_GetText_GetAttribute {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement userName = driver.findElement(By.cssSelector("input[class='login-inp']"));
        userName.sendKeys("incorrect username");

        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));
        resetPasswordButton.click();

        WebElement errorLabel = driver.findElement(By.cssSelector("div[class='errortext']"));

        String expectedErrorLabel = "login or E-mail not found";
        String actualErrorLabel = errorLabel.getText();

        if(expectedErrorLabel.equals(actualErrorLabel)){
            System.out.println("PASSED!");
        }else{
            System.out.println("FAILED!!!");
        }
    }
}
/*
TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Enter incorrect username into login box:
4- Click to `Reset password` button
5- Verify “error” label is as expected
Expected: Login or E-mail not found
PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
 */
