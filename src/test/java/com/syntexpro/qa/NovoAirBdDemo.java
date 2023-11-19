package com.syntexpro.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NovoAirBdDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flynovoair.com/");
        driver.manage().window().maximize();
        WebElement plenatrip = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[1]/a"));
        Thread.sleep(5000);
        plenatrip.click();
     WebElement bookflights = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[1]/ul/li/div/div/div[1]/div[1]/a/span"));
        Thread.sleep(5000);
     bookflights.click();
     WebElement oneway = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/form/ul/li[2]/label/span"));
        Thread.sleep(5000);
     oneway.click();
    WebElement departurecity = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/form/div[2]/div[1]/div/div/div/div/div[1]/div/input[3]"));
        Thread.sleep(5000);
    departurecity.sendKeys("Dhaka");
    WebElement arrivalcity = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/form/div[2]/div[1]/div/div/div/div/div[2]/div/input[3]"));
        Thread.sleep(5000);
    arrivalcity.sendKeys("Chattogram");
    WebElement departuredate = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/form/div[2]/div[1]/div/div/div/div/div[3]/span/input"));
        Thread.sleep(5000);
    departuredate.sendKeys("21-Oct");
        driver.findElement(By.xpath("//input[@placeholder='Departure Date']")).sendKeys("21-Oct");
        Select select = new Select(driver.findElement(By.id("CX")));
        select.selectByValue("Y");
        WebElement gender = driver.findElement(By.name("PA"));
        gender.sendKeys("1");
       // select.selectByValue("1");

       // WebElement children = driver.findElement(By.name("PC"));
    //children.sendKeys("2");
   // WebElement infants = driver.findElement(By.name("PI"));
  //  infants.sendKeys("2");
    WebElement search = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/form/div[2]/div[2]/div[3]/button/span"));
    search.click();



    }
}
