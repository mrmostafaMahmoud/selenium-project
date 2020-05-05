package com.udemy;

import org.openqa.selenium.By;

public class WritingATweet extends LoginHappyCase{
    public void writingatweet(){
        login();
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/header/div/div/div/div[1]/div[3]/a/div/span/div/div/span/span")).click();
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div/div/div/div[1]/div/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div[2]/div"))
                .sendKeys("لا إله إلا أنت سبحانك إني كنت من الظالمين.");
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/span/span")).click();

    }

}
