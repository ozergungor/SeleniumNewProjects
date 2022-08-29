package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.tesla.com");
        Thread.sleep(3000);
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.navigate().to("https://www.google.com");
        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        driver.close();

        driver.quit();

    }
}
