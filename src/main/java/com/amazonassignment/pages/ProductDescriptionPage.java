package com.amazonassignment.pages;

import com.amazonassignment.utils.SeleniumUtils;
import org.openqa.selenium.By;

public final class ProductDescriptionPage {
    private final By txtItemHeading = By.xpath("//div[@id='feature-bullets']//h1");

    private ProductDescriptionPage switchWindow(){
        SeleniumUtils.switchWindow();
        return this;
    }


    public String getAboutItemHeading(){
        switchWindow();
        return SeleniumUtils.getText(txtItemHeading);

    }
}
