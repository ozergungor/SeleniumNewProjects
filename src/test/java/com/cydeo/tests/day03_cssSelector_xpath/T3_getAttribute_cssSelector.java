package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement logInButton = driver.findElement(By.cssSelector("input[value='Log In']"));

        String expectedLogInButton = "Log In";

        String actualLogInButton = logInButton.getAttribute("value");

        if(expectedLogInButton.equals(actualLogInButton)){
            System.out.println("Log in button text is as expected. PASSED!");
        }else{
            System.out.println("Log in button text is NOT as expected. FAILED!!!");
        }
    }
}
/*
TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In
PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
 */
