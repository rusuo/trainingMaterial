package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainGooglePage {

    private WebDriver driver;

    private By searchTextBox = By.id("gbqfq");

    public MainGooglePage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isSearchTextBoxVisible(){
        return driver.findElement(searchTextBox).isDisplayed();
    }

    public void submitText(String text){
        driver.findElement(searchTextBox).sendKeys(text);
        driver.findElement(searchTextBox).submit();
    }
}
