package com.syntexpro.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTopics {


    @Test

    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.hubspot.com/login");
        driver.manage().window().maximize();
        //  Thread.sleep(5000);
        // WebElement singUp = driver.findElement(By.partialLinkText("up"));
        //singUp.click();

        //className:
        //form-control private-form__control login-email
        //form-control private-form__control login-password m-bottom-3


        WebElement emailAddress = driver.findElement(By.className("login-email"));
        Thread.sleep(5000);
        emailAddress.sendKeys("tapansarker1122@yahoo.com");

        // id -1(username email address)
        // name -2 (username0
        // depends on situation
        // classNane -3
        // link text -4
        // partoal link text -5
        // tagName -6
        // css selector -7
        //xpath -8


        WebElement password = driver.findElement(By.className("login-password"));
        Thread.sleep(5000);
        password.sendKeys("12345667");

        // WebElement logIn = driver.findElement(By.id("loginBtn"));
        // Thread.sleep(5000);
        // logIn.click();

        //   @Test

        //    public  void  test() throws InterruptedException {
        //     WebDriver driver = new ChromeDriver();
        //   driver.get("https://www.macys.com/account/signin");
        // driver.manage().window().maximize();
        //   Thread.sleep(5000);
        //   WebElement signUp = driver.findElement(By.id("standard-sign-up"));
        //    signUp.click();


        //  WebElement emailAddress= driver.findElement(By.name("user.email_address"));
        //  Thread.sleep(5000);
        //      emailAddress.sendKeys("tapansarker1122@yahoo.com");
        //   WebElement password = driver.findElement(By.id("pw-input"));
        //  Thread.sleep(5000);
        //     password.sendKeys("123456789");
        //    WebElement logIn = driver.findElement(By.id("sign-in"));
        //    Thread.sleep(5000);
        //    logIn.click();



    }
}

















































