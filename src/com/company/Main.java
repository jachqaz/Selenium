package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.setProperty("webdriver.chrome.driver", "/home/rodolhan/Descargas/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        driver.get("http://yahoo.com/");
        driver.navigate().back();
    }
}
