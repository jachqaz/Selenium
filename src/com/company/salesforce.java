package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {
    public static void main(String[] args) {
        // write your code here
        System.setProperty("webdriver.chrome.driver", "/home/rodolhan/Descargas/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("jach_1997@hotmail.com");
        driver.findElement(By.name("pw")).sendKeys("1234567890 ");
//        driver.findElement(By.className("button r4 wide primary")).click();
        driver.findElement(By.xpath("//*[@id='Login']")).click();
//        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
    }
}
