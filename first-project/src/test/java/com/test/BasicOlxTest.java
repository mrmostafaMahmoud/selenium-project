package com.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasicOlxTest {
    protected static WebDriver driver; // null

    @BeforeAll
    public static void init(){
        // This driver is for chrome version 83 , do you have chrome v83?
        System.setProperty("webdriver.chrome.driver","src/test/resources/chrome/83/chromedriver.exe");
        // This driver is not for firefox 75, please make sure that u are using the correct drivers
        //System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    @AfterAll
    public static void destroy() {
        driver.close(); // will stop the session
    }
}
