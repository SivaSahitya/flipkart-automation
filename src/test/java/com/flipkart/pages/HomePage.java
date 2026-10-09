
package com.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {

    WebDriver driver;

    By searchBox = By.name("q");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isSearchBoxDisplayed() {
        WebElement element = driver.findElement(searchBox);
        return element.isDisplayed();
    }


public void searchProduct(String productName) {
    WebDriverWait wait =
        new WebDriverWait(driver, Duration.ofSeconds(10));

    WebElement element = wait.until(
        ExpectedConditions.visibilityOfElementLocated(searchBox)
    );

    element.clear();
    element.sendKeys(productName);
    element.submit();
}


}
