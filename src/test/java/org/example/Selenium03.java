package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class Selenium03 {
    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addExtensions(new File("src/main/java/org/example/Unconfirmed 788454.crdownload"));

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://youtube.com");

    }
}

