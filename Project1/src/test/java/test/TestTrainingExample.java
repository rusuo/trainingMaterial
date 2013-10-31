package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.GooglePageObject;

import static junit.framework.Assert.assertTrue;

public class TestTrainingExample {

    WebDriver driver;
    GooglePageObject googlePageObject;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        googlePageObject = new GooglePageObject(driver);
    }

    @Test
    public void verifySearch(){
        assertTrue(googlePageObject.isSearchTextBoxVisible());
        googlePageObject.submitText("london");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}