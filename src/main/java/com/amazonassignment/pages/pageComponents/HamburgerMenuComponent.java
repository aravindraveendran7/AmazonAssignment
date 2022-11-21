package com.amazonassignment.pages.pageComponents;

import com.amazonassignment.locatorfactories.LocatorFactory;
import com.amazonassignment.pages.ProductListingPage;
import com.amazonassignment.utils.SeleniumUtils;

public final class HamburgerMenuComponent {
    private String mainMenu="//*[text()='%s']/parent::a";
    private String subMenuItemsByText="//*[text()='Televisions']";
    private String subMenuItemByCheckbox="//*[text()='Samsung']/parent::a//input";


    public HamburgerMenuComponent clickOnMainMenu(String locator, String value){
        SeleniumUtils.click(LocatorFactory.getLocator(locator,String.format(mainMenu,value)),value);
        return this;
    }

    public HamburgerMenuComponent clickOnSubMenuItem(String locator, String value){
        SeleniumUtils.click(LocatorFactory.getLocator(locator,String.format(subMenuItemsByText,value)),value);
        return this;
    }
    public ProductListingPage clickOnSubMenuByCheckbox(String locator, String value){
        SeleniumUtils.clickElementByJS(LocatorFactory.getLocator(locator,String.format(subMenuItemByCheckbox,value)),value);
        return new ProductListingPage();
    }
}
