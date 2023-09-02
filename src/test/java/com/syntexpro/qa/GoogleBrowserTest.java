package com.syntexpro.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class GoogleBrowserTest {


    @Test
    public void browserTest() throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("New York");
        Thread.sleep(5000);
        driver.findElement(By.name("btnK")).submit();



    }
}
