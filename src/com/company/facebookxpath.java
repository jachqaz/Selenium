package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {
    public static void main(String[] args) {
        // write your code here
        System.setProperty("webdriver.chrome.driver", "/home/rodolhan/Descargas/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://facebook.com");
//        driver.findElement(By.xpath("//*[@type='email']")).sendKeys("myown xpath");
//        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
//        driver.findElement(By.xpath("//input[@value='Iniciar sesión']")).click();
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myowncss");
        driver.findElement(By.cssSelector("[value='Iniciar sesión']")).click();
    }
}
