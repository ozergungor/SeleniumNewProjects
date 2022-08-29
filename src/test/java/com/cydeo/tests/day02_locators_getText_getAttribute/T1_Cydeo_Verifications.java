package day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Cydeo_Verifications {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");

        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedURL)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
        String expectedTitle = "Practice";
        if(driver.getTitle().equals(expectedTitle) ){

            System.out.println("PASSED");

        } else{
            System.out.println("FAILED");
        }
        driver.close();
        /*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
 Expected: Practice
         */
    }
}
