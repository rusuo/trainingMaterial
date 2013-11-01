package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePageObject {

    private WebDriver driver;

    private By searchTextBox = By.id("gbqfq");
    private By firstReturnedResult = By.className("g");

    public GooglePageObject(WebDriver driver){
        this.driver = driver;
    }

    public boolean isSearchTextBoxVisible(){
        return driver.findElement(searchTextBox).isDisplayed();
    }

    public void submitText(String text){
        driver.findElement(searchTextBox).sendKeys(text);
        driver.findElement(searchTextBox).submit();
    }

    public String getTitleForFirstResult(){
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(firstReturnedResult));
        return driver.findElement(firstReturnedResult).getText();
    }
}
