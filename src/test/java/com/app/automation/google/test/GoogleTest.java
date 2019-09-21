package com.app.automation.google.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleTest {

    private WebDriver driver;
    private String URL = "http://google.com";


    @BeforeClass
    public void Initialize(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sunrays\\Downloads\\geckodriver.exe");
    }

    @Test
    public void GooglePageTest(){
        driver = new FirefoxDriver();
        driver.navigate().to(URL);
    }

    @AfterClass
    public void Cleanup(){
        driver.close();
    }
}