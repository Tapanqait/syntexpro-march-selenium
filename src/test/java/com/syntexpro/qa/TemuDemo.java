package com.syntexpro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TemuDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.temu.com/");
        driver.manage().window().maximize();
        WebElement yourorders = driver.findElement(By.xpath("//*[@id=\"mainHeader\"]/div/div/div[2]/div[1]/div[2]/div[2]/div/div[2]/div"));
      yourorders.click();
      // WebElement emailAddress = driver.findElement(By.id("user-account"));
     //  emailAddress.sendKeys("tapansarker1122@yahoo.com");









    }
}
