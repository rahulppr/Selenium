package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.

public class Selenium07 {


    public void negative() throws InterruptedException {

        //Create session via the API and the session Id is generated
        ChromeDriver driver = new ChromeDriver();

        //Launch the Browser with the URL Mentioned
        driver.get("https://app.vwo.com");

        //Print the URL
        System.out.println(driver.getCurrentUrl());

        //Print the Title
        System.out.println(driver.getTitle());

        //Page load strategy - Normal in Nature, which all the resources will load, we will wait for all resources to load


        //Navigate to URL
        //Flow to Automate
        //Find the first element username and enter the Email Id
        //Find the second element username and enter the password
        //Find the third element username and click submit
        //Verify the error should come

        //1. <input type="email" class="text-input W(100%)" name="username" id="login-username"
        // data-qa="hocewoqisi" fdprocessedid="rzwt86">

       //2.  <input type="password" class="text-input W(100%)" name="password"
        // id="login-password" data-qa="jobodapuxe" fdprocessedid="k4t948">

        //3. <button type="submit" id="js-login-btn" class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)" onclick="login.login(event)" data-qa="sibequkica" fdprocessedid="uksbhi">
        //									<span class="icon loader hidden" data-qa="zuyezasugu"></span>
        //									<span data-qa="ezazsuguuy">Sign in</span>
        //								</button>


        //4. <div class="notification-box-description" id="js-notification-box-msg"
        // data-qa="rixawilomi">Your email, password, IP address or location did not match</div>
        driver.manage().window().maximize();

       WebElement username = driver.findElement(By.id("login-username"));
       username.sendKeys("abc@gmail.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("123");

        WebElement button_submit = driver.findElement(By.id("js-login-btn"));
        button_submit.click();

        Thread.sleep(3000);

        WebElement error_msg = driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(error_msg.getText());


        driver.quit();

         }
    }

