package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetText_GetAttribute_Practice {
    public static void main(String[] args) {

        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.navigate().to("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password
        WebElement resetButton = driver.findElement(By.cssSelector("button[class='login-btn']"));
        String expectedResetButton = "Reset password";
        String actualResetButton = resetButton.getText();

        if(expectedResetButton.equals(actualResetButton)){
            System.out.println("PASSED!");
        }else{
            System.out.println("FAILED!!!");
            //PS: Inspect and decide which locator you should be using to locate web
            //elements.
            //PS2: Pay attention to where to get the text of this button from
        }
        // Check Authorization part.

        WebElement checkAuthorization = driver.findElement(By.xpath("//a[@href='/?login=yes']"));
        checkAuthorization.click();
    }
}
