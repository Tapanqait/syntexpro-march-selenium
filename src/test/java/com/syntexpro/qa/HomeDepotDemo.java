package com.syntexpro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepotDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.homedepot.com/");
        driver.manage().window().maximize();
        WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"headerMyAccountTitle\"]/div"));
        Thread.sleep(5000);
        myAccount.click();
        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"SPSOSignIn\"]/a/span"));
        Thread.sleep(5000);
        signIn.click();

        WebElement emailAddress = driver.findElement(By.name("email"));
        Thread.sleep(5000);
        emailAddress.sendKeys("tapansarker1122@yahoo.com");

       WebElement contiune = driver.findElement(By.xpath("//*[@id=\"single-signin__body\"]/div/div[2]/form/button/span"));
        Thread.sleep(5000);
        contiune.click();
     //   WebElement password = driver.findElement(By.id("passCode"));
      //  Thread.sleep(5000);
     //   password.sendKeys("123456");
     //   WebElement verift = driver.findElement(By.xpath("//*[@id=\"single-signin__body\"]/div[1]/div[1]/div[2]/form/button[1]/span"));
      //  verift.click();


    }
}
