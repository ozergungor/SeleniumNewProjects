package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
        String expectedRememberMeLabel = "Remember me on this computer";

        String actualRememberMeLabel = rememberMeLabel.getText();

        if(expectedRememberMeLabel.equals(actualRememberMeLabel)){
            System.out.println("Remember Me Label is verified. PASSED!" );
        }else{
            System.out.println("Remember Me Label is NOT verified. FAILED!!!");
        }
        WebElement forgotPasswordLabel = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPasswordLabel = "forgot your password?";
        String actulForgotPasswordLabel = forgotPasswordLabel.getText();

        if(expectedForgotPasswordLabel.equals(actulForgotPasswordLabel)){
            System.out.println("Forgot Password Label is verified. PASSED!");
        }else{

            System.out.println("expectedForgotPasswordLabel = " + expectedForgotPasswordLabel);
            System.out.println("actulForgotPasswordLabel = " + actulForgotPasswordLabel);
            System.out.println("Forgot Password Label is NOT verified. FAILED!!!");
        }
        String expectedInhref = "forgot_password=yes";
        String actualHrefAttributeValue = forgotPasswordLabel.getAttribute("href");
        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);

        if(expectedInhref.equals(actualHrefAttributeValue)){
            System.out.println("Href attribute value verification PASSED!" );
        }else{
            System.out.println("Href attribute value verification FAILED!!!");
        }
    }
}
/*
TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify ???remember me??? label text is as expected:
Expected: Remember me on this computer
4- Verify ???forgot password??? link text is as expected:
Expected: Forgot your password?
5- Verify ???forgot password??? href attribute???s value contains expected:
Expected: forgot_password=yes
PS: Inspect and decide which locator you should be using to locate web
elements.
 */
