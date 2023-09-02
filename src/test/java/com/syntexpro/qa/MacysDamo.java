package com.syntexpro.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MacysDamo {

    @Test

    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.macys.com/account/signin");
        driver.manage().window().maximize();

        WebElement emailAddress= driver.findElement(By.name("user.email_address"));
         Thread.sleep(5000);
             emailAddress.sendKeys("tapansarker1122@yahoo.com");
         WebElement password = driver.findElement(By.id("pw-input"));
         Thread.sleep(5000);
            password.sendKeys("123456789");
           WebElement logIn = driver.findElement(By.id("sign-in"));
           Thread.sleep(5000);
          logIn.click();








    }

}
