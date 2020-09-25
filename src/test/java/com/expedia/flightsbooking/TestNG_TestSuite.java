package com.expedia.flightsbooking;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageclasses.SearchPage;

import java.util.concurrent.TimeUnit;

public class TestNG_TestSuite {
    //static Logger log = Logger.getLogger(TestNG_TestSuite.class);
    private WebDriver driver;
    private String baseUrl;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\fermin.mireles\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.expedia.com/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PropertyConfigurator.configure("log4j.properties");
        driver.get(baseUrl);
    }

    @Test
    public void fillBasicInfo() throws Exception {
        SearchPage.navigateToFLightsTab(driver);
        SearchPage.fillOriginTextBox(driver, "New York");
        SearchPage.fillDestinationTextBox(driver, "Chicago");
        //SearchPage.fillDepartureDateTextBox(driver,"12/25/2015");
        //SearchPage.fillReturnDateTextBox(driver,"12/31/2015");
        SearchPage.clickOnSearchButton(driver);
    }

    @AfterClass
    public void afterClass() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
