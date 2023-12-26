package org.example;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium02 {
    public static void main(String[] args) {

        //SearchContext- Interface - findElements and findElement - GGF
        //WebDriver - Interface - Some incomplete functions - GF
        //RemoteWebDriver - Class - F
        //ChromeDriver, Edge Driver,SafariDriver,Internet Explorer - S

        //Selenium Architecture
        //Create Session,command or functions -->Behind the scenes an API Request to Browser Driver
        //Pass the commands as API

         //SearchContext driver = new ChromeDriver(); --> GGF, this is useless
        //WebDriver driver = new ChromeDriver(); --> this contains all the functions
        //RemoteWebDriver driver = new ChromeDriver(); --> Fix to remote
        //ChromeDriver driver = new ChromeDriver();


        //Scenarios
        //1.) Do you want to run on Chrome or Edge?
        //ChromeDriver driver = new ChromeDriver();
        //WebDriver driver = new ChromeDriver();


        //2.Do uou want to run on Chrome and then change to Edge?
        //Web driver = new ChromeDriver()
        //driver = new EdgeDriver()


        //3.) Do you want to run on Multiple Browsers?
        //RemoteWebDriver driver (with GRID) - Advance (Last 2 sessions on Selenium)

    }
}


