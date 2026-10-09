
package com.flipkart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.flipkart.base.BaseTest;
import com.flipkart.pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    public void verifySearchBoxIsDisplayed() {
        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(
            homePage.isSearchBoxDisplayed(),
            "Search box is not displayed"
        );
    }

    @Test
    public void verifyProductSearch() {
        HomePage homePage = new HomePage(driver);

        homePage.searchProduct("laptop");

        Assert.assertTrue(
            driver.getCurrentUrl().toLowerCase().contains("search"),
            "Product search was not performed"
        );

        Assert.assertTrue(
            driver.getPageSource().toLowerCase().contains("laptop"),
            "Search results page does not contain laptop"
        );
    }
}
