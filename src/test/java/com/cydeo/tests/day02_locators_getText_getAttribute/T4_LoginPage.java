package day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LoginPage {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.gartner.com/account/signin");

        WebElement usernameInput = driver.findElement(By.className("gSignInInput"));

        usernameInput.sendKeys("incorrect@email.com");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("incorrect password");

        WebElement signinButton = driver.findElement(By.className("gSignInButton"));

        signinButton.click();
        /*
TC #4: Login verifications
1. Open Chrome browser
2. Go to https://www.gartner.com/account/signin
3. Enter username: “incorrect@email.com”
4. Enter password: “incorrect password”
5. Click to sign in button
6. Verify: visually “Sorry, Wrong Email or Password”
displayed
PS: Locate username input box using “className” locator
Locate password input box using “id” locator
Locate Sign in button using “tagName” locator
         */
    }
}
