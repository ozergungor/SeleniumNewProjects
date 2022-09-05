package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    public static void sleep(int second){

        second *=1000;
        try {
            Thread.sleep(second);

        }catch (InterruptedException e){

        }
    }

    public static void switchWindowAndVerify(WebDriver driver, String expectedInURL, String expectedInTitle){

        Set<String> allWindowsHandles = driver.getWindowHandles();

        for (String each : allWindowsHandles) {

            driver.switchTo().window(each);
            System.out.println("Current URL : " + driver.getCurrentUrl());

            if(driver.getCurrentUrl().contains(expectedInURL)){
                break;
            }else{
            }
        }
        String actualTitle = driver.getTitle();
        Assert.assertTrue(driver.getTitle().contains("Etsy"));
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }
}
