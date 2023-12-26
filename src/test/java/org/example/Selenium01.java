package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium01 {
    public static void main(String[] args) {

        //If we are using the Selenium < 4.6 or selenium 3.14 (40%)
       // System.setProperty("webdriver.chrome.driver","path/to/chromdriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--window-size=800,600");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        driver.quit();

        //Selenium 4.10 - Selenium Manager - it will automatically download the Driver all
        // when needed when you start the selenium Manager

    }
}



