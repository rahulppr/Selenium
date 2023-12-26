package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium05 {
    public static void main(String[] args) throws MalformedURLException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://bing.com");
        //No back or forward in the case of get

        driver.navigate().to("https://app.vwo.com");
        driver.navigate().to(new URL("https://google.com"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.quit();
    }
}
