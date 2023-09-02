package com.syntexpro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamsClubDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.samsclub.com/");
        driver.manage().window().maximize();
        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"flyout-wrapper\"]/div/div[2]/button/span/span"));
        signIn.click();

        Thread.sleep(5000);
        WebElement emailAddress = driver.findElement(By.name("email"));
        emailAddress.sendKeys("tapansarker1122@yahoo.com");
        Thread.sleep(5000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123456");





    }
}
