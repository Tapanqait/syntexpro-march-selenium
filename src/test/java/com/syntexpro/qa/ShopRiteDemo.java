package com.syntexpro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopRiteDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.shoprite.com/");
        driver.manage().window().maximize();
        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"AccountHeaderButton\"]/span/div/div[2]/span[1]"));
        signIn.click();
    }
}
