package com.amazonassignment.facade;

import com.amazonassignment.pages.HomePage;
import com.amazonassignment.pages.ProductDescriptionPage;
import com.amazonassignment.pages.ProductListingPage;
import com.github.dockerjava.core.NameParser;

public final class SearchProduct {

    public SearchProduct(){
        HomePage homePage=new HomePage();
        ProductListingPage productListingPage=new ProductListingPage();
    }

    public ProductDescriptionPage filterAsPerCustomerChoice(String category,String product,String brand){
        new HomePage()
                .clickOnHamburgerMenu()
                .clickOnMainMenu("xpath",category)
                .clickOnSubMenuItem("xpath",product)
                .clickOnSubMenuByCheckbox("xpath",brand)
                .chooseSecondHighestPricedItem();
        return new ProductDescriptionPage();
    }

}
