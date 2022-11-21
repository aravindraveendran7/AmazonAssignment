package com.amazonassignment.pages;

import com.amazonassignment.driver.DriverManager;
import com.amazonassignment.locatorfactories.LocatorFactory;
import com.amazonassignment.pages.pageComponents.PrioritySorterComponent;
import com.amazonassignment.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public final class ProductListingPage {

    private final By labelPrice = By.xpath("//div[contains(@cel_widget_id,'MAIN-SEARCH_RESULTS')]//span[@class='a-price-whole']");
    private String lnkResultFromPrice = "//span[@class='a-price-whole' and text()='%s']/../../parent::a";

    public ProductListingPage(){
        PrioritySorterComponent prioritySorterComponent=new PrioritySorterComponent();
    }

    public ProductDescriptionPage chooseSecondHighestPricedItem() {
        List<WebElement> listofPrices=(DriverManager.getDriver().findElements(labelPrice));
        String price=listofPrices
                .stream()
                .map(e -> e.getText())
                .distinct().limit(2).skip(1).findFirst().get();
        clickOnSecondHighestPricedItem(price);
        return new ProductDescriptionPage();
    }

    private ProductListingPage clickOnSecondHighestPricedItem(String price) {
        SeleniumUtils.clickElementByJS(LocatorFactory.getLocator("xpath",String.format(lnkResultFromPrice,price)),"value");
        return   this;
    }

}
