package com.syntexpro.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigationDemo {
    @Test
    public void test() throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.costco.com");
        // driver.navigate().to("https://www.temu.com");
        //  Thread.sleep(5000);

        //  driver.navigate().to("https://www.bestbuy.com");


         driver.navigate().back();


        //  driver.navigate().refresh();

        //  driver.navigate().forward();


        driver.manage().window().maximize();
       // Point newPoint = new Point(300, 500);
        Point makeWindowSize   = new Point(300, 500);
        driver.manage().window().setPosition(makeWindowSize);


    }

}
