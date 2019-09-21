package com.app.automation.google.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TalentNowTest {

    private static final String TNowURL = "https://tnow-test.z-apps.io/";
    private WebDriver driver;

    @BeforeClass
    public void Setup(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sunrays\\Downloads\\geckodriver.exe");
    }

    @Test
    public void TestTalentNowPage(){
        driver = new FirefoxDriver();
        driver.navigate().to(TNowURL);
    }

    @AfterClass
    public void CleanUp(){
        driver.close();
    }
}