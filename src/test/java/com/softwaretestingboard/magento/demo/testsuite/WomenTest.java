package com.softwaretestingboard.magento.demo.testsuite;

import com.softwaretestingboard.magento.demo.testbase.TestBase;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ProductPage;
import org.testng.annotations.Test;

public class WomenTest extends TestBase {
    HomePage homepage = new HomePage();
    ProductPage productPage = new ProductPage();

    @Test
    public void verifyTheSortByProductNameFilter(){
        //MouseHover on Women Menu
        homepage.mouseHoverOnWomenTab();
        //MouseHover on Tops
        homepage.mouseHoverOnTopsInWomenTab();
        //Click on Jackets
        homepage.mouseHoverAndClickOnJacketsInWomen();
        //* Select Sort By filter “Product Name”
        //* Verify the products name display in alphabetical order
        productPage.verifySortingOfProductsInAscendingOrder("Product Name");
    }
    @Test
    public void verifyTheSortByPriceFilter(){
        //* Mouse Hover on Women Menu
        homepage.mouseHoverOnWomenTab();
        //* Mouse Hover on Tops
        homepage.mouseHoverOnTopsInWomenTab();
        //* Click on Jackets
        homepage.mouseHoverAndClickOnJacketsInWomen();
        //* Select Sort By filter “Price”
        //* Verify the products price display in Low to High
        productPage.verifySortingOfPriceInAscendingOrder("Price");
    }
}
