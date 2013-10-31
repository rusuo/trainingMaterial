package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.MainGooglePage;

import static junit.framework.Assert.assertTrue;

public class TestSelenium2Example {

    WebDriver driver;
    MainGooglePage mainGooglePage;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        mainGooglePage = new MainGooglePage(driver);
    }

    @Test
    public void verifySearch(){
        assertTrue(mainGooglePage.isSearchTextBoxVisible());
        mainGooglePage.submitText("london");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}