package com.syntexpro.qa;

import com.google.common.util.concurrent.Service;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepotServicesPage {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.homedepot.com/");
        driver.manage().window().maximize();
        WebElement installationservices = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[4]/div/ul/li[5]/a"));
        Thread.sleep(5000);
        installationservices.click();
      driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[1]/div[2]/form/input")).sendKeys("Carpet Installation");
        Thread.sleep(5000);
      driver.findElement(By.className("BUTTON")).submit();




    }


}
