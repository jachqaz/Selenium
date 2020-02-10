package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.setProperty("webdriver.chrome.driver", "/home/rodolhan/Descargas/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
//        driver.get("http://google.com");
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getPageSource());
//        driver.get("http://yahoo.com/");
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.close();
//        driver.quit();

        driver.get("http://facebook.com");
//        driver.findElement(By.id("email")).sendKeys("jach_1997@hotmail.com");
//        driver.findElement(By.name("pass")).sendKeys("1234567890 ");
//        driver.findElement(By.linkText("¿Olvidaste tu cuenta?")).click();
//        driver.findElement(By.className("inputtext")).sendKeys("helloworld");
        driver.findElement(By.cssSelector("#email")).sendKeys("helloworld");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("pass");
        driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();

    }
}
