package com.test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

/**
 * Unit test for simple App.
 */
public class AppTest extends BasicOlxTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Hello(){
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("mostafa mahmoud");
    }
}
