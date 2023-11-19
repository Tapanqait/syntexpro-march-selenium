package com.syntexpro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KahootDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://create.kahoot.it/auth/login");
        driver.manage().window().maximize();
        WebElement emailAddress = driver.findElement(By.name("username"));
        Thread.sleep(5000);
        emailAddress.sendKeys("tapansarker1122@yahoo.com");
        WebElement password = driver.findElement(By.id("password"));
        Thread.sleep(5000);
        password.sendKeys("123456789");
        WebElement logIn = driver.findElement(By.id("login-submit-btn"));
        Thread.sleep(5000);
        logIn.click();















    }
}
