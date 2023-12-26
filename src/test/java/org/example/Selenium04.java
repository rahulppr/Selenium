package org.example;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium04 {
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver();
        driver.get("https://sdet.live");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        //driver.close(); //Close the current browser window - not the full browser window
                          //Close the window and sessionId is not equal to null,Invalid session Id


       // driver.quit(); // Close all the browser and stop the window
                         //Close all the window and session is equal to null,Error - SessionId is null.
    }
}



