package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.GooglePageObject;

import static junit.framework.Assert.assertTrue;

/**
 * Steps performed in the test:
 * 1. Go to google.com page
 * 2. Verify that the search text box is visible.
 * 3. Search for "london" text
 * 4. Verify that the returned first result title contains "London"
 */

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
        if (googlePageObject.isSearchTextBoxVisible()){
            googlePageObject.submitText("London");
        }
        assertTrue(googlePageObject.getTitleForFirstResult().contains("London"));
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}