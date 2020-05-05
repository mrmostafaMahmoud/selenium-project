package com.udemy;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

/**
 * Unit test for simple App.
 */
public class AppTest extends WritingATweet
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Twittertest(){
        writingatweet();
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/header/div/div/div/div[2]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div/div/div/div/a[2]/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div[3]/div[2]/div/span/span")).click();

    }
}
