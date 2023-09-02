package com.syntexpro.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ActionsDemo {
    @Test
    public void browserTest() throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/account/about");

        driver.manage().window().maximize();
        Thread.sleep(5000);
        WebElement createAccount = driver.findElement(By.linkText("Create an account"));
      createAccount.click();
      WebElement firstName = driver.findElement(By.id("firstName"));

      WebElement lastName = driver.findElement(By.id("lastName"));
      firstName.sendKeys("Tapan");
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.CONTROL).build().perform();
        actions.keyDown(Keys.CONTROL).sendKeys("c").sendKeys(Keys.CONTROL).build().perform();
        Thread.sleep(5000);
        lastName.click();
        actions.keyDown(Keys.CONTROL).sendKeys("v").sendKeys(Keys.CONTROL).build().perform();


    }
}
