package com.syntexpro.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BestBuyDemo {

    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Account
        WebElement account = driver.findElement(By.cssSelector("#account-menu-account-button > span"));
        account.click();

        //Sign in
        WebElement signIn = driver.findElement(By.linkText("Sign In"));
        signIn.click();

        //Email address
        WebElement emailAddress = driver.findElement(By.id("fld-e"));
        emailAddress.sendKeys("tapansarker1122@yahoo.com");

        //Password
        WebElement password = driver.findElement(By.id("fld-p1"));
        password.sendKeys("1234567890talO");

        //Click Sign In
        WebElement signIns = driver.findElement(By.xpath("/html/body/div[1]/div/section/main/div[2]/div/div/div[1]/div/div/div/div/div/form/div[4]/button"));
        signIns.click();



    }


    }
