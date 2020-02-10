package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforceE2E {
    public static void main(String[] args) {
        // write your code here
        System.setProperty("webdriver.chrome.driver", "/home/rodolhan/Descargas/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com");
        driver.findElement(By.cssSelector("a[title='Already a user? Sign in']")).click();
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
        driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
        driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
    }
}
