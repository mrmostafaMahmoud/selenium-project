package com.udemy;

import org.openqa.selenium.By;

public class LoginHappyCase extends BasicTwitterTest{

    public void login(){
        driver.get("https://twitter.com/");
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/header/div[2]/div[1]/div/div[2]/div[1]/div[1]/a/div/span/span")).click();
       // driver.findElement(By.name("session[username_or_email]")).sendKeys("darshfc");
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/form/div/div[1]/label/div/div[2]/div/input")).sendKeys("darshfc");
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/form/div/div[2]/label/div/div[2]/div/input")).sendKeys("0108659217*");
      //  driver.findElement(By.name("session[password]")).sendKeys("0108659217*");
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/form/div/div[3]/div/div")).click();

    }
}
