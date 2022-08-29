package day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");

        String expectedTitle = "yahoo";
        String actualTitle = driver.getTitle();

        System.out.println("actualTitle = " + actualTitle);



        /*
TC #1: Yahoo Title Verification
1.Open Chrome browser
2.Go to https://www.yahoo.com
3.Verify title:
Expected: Yahoo
     */
    }


}
