package com.syntexpro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        WebElement signIn  = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        signIn.click();
        Thread.sleep(5000);
        WebElement emailAddress = driver.findElement(By.id("ap_email"));
        emailAddress.sendKeys("tapansarker1122@yahoo.com");
        Thread.sleep(5000);
        WebElement Continue = driver.findElement(By.id("continue"));
        Continue.click();
        Thread.sleep(5000);
       WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123456");
        Thread.sleep(5000);
        WebElement signIns = driver.findElement(By.xpath("/html/body"));
        signIns.click();




    }
}
