package com.syntexpro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TargetDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.target.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("search")).sendKeys("candy");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[6]/form/button")).submit();
        WebElement registry = driver.findElement(By.id("utilityNav-registries"));
        Thread.sleep(5000);
        registry.click();
        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[1]/div/div[1]/div[2]/button"));
       Thread.sleep(5000);
        signIn.click();

       // WebElement emailAddress = driver.findElement(By.id("username"));
        //Thread.sleep(5000);
     // emailAddress.sendKeys("tapansarker1122@yahoo.com");
      // Thread.sleep(5000);
     //   WebElement password = driver.findElement(By.id("password"));
     //  password.sendKeys("123456789");


        //WebElement signIns = driver.findElement(By.xpath("//*[@id=\"login\"]"));
      //  signIns.click();


    }










}
