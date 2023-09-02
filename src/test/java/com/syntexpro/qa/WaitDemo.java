package com.syntexpro.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitDemo {


    // 1000 milli second = 1 sec
    //60 sec = 1 min

    @Test

    public void test() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.hubspot.com/login");
        driver.manage().window().maximize();
        //Implicitly wait
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        By emailAddresssField = By.id("username");
        //Explicit wait
        WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(5));


        WebElement emailAddress = wait.until(ExpectedConditions.presenceOfElementLocated(emailAddresssField));

       // WebElement emailAddress = driver.findElement(By.id("username"));


        emailAddress.sendKeys("tapansarker1122@yahoo.com");

        WebElement password = driver.findElement(By.className("login-password"));


        password.sendKeys("12345667");


    }


}
