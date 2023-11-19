package com.syntexpro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TargetFindStoresDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.target.com/");
        driver.manage().window().maximize();
        WebElement findstores = driver.findElement(By.xpath("//*[@id=\"utilityNav-findStores\"]"));
        Thread.sleep(5000);
        findstores.click();
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div/div[2]/div[1]/button")).click();
       // driver.findElement(By.id("zipcode")).sendKeys("12205");
        driver.findElement(By.id("city")).sendKeys("Colonie");
        driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("NY");
       // driver.findElement(By.xpath("/html/body/div[8]")).click();





    }

}
