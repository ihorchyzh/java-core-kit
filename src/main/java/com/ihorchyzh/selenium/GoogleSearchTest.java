package com.ihorchyzh.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

/**
 * Created by ihorchyzh on 3/20/17.
 */
public class GoogleSearchTest {

    WebDriver driver;

    //Precondition
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/webdriver/geckodriver");
        // Init browser
        driver = new FirefoxDriver();
        // Max window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Open url
        driver.get("https://www.google.com");
    }

    @Test
    public void searchTest() {
        //Find element by name
        WebElement searchField = driver.findElement(By.name("q"));
        //Sends "Selenium" text into an input field
        searchField.sendKeys("Selenium");
        searchField.submit();
        //Find first link with specified result
        WebElement seleniumLink = driver.findElement(By.xpath(".//*[@id='rso']/div/div/div[1]/div/h3/a"));
        //Verify result
        assertTrue(seleniumLink.getText().contains("Selenium"));
    }

    @AfterClass
    public  void tearDown(){
//        driver.quit();
    }
}
