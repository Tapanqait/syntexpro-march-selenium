package com.syntexpro.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CostcoDemo {


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.costco.com/");
        driver.manage().window().maximize();

        WebElement signIn = driver.findElement(By.linkText("Sign In / Register"));
        signIn.click();
        Thread.sleep(5000);
        WebElement emailAddress = driver.findElement(By.name("Sign in name"));
        Thread.sleep(5000);
        emailAddress.sendKeys("tapansarker1122@yahoo.com");



        WebElement password = driver.findElement(By.id("password"));

        password.sendKeys("123456789");
        Thread.sleep(5000);
        driver.close();

    }


}
