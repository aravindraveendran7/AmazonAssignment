package com.amazonassignment.pages.pageComponents;

import com.amazonassignment.driver.DriverManager;
import com.amazonassignment.locatorFactories.LocatorFactory;
import com.amazonassignment.utils.SeleniumUtils;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.assertj.core.api.Assertions.*;


import java.util.List;

public final class PrioritySorterComponent {

    private final By dropdownSort = By.xpath("//span[text()='Sort by:']");
    private static final String DROPDWN_OPTION = "//a[text()='%s']";
    private static final String HIGH_TO_LOW = "Price: High to Low";


    private PrioritySorterComponent clickSort() {
        SeleniumUtils.click(dropdownSort, "Sort");
        return this;
    }

    private PrioritySorterComponent selectSortingPriority(String locator, String value) {
        SeleniumUtils.click(LocatorFactory.getLocator(locator, String.format(DROPDWN_OPTION, value)), value);
        return this;
    }

    @SneakyThrows
    public PrioritySorterComponent sortResultsWithPriceHighToLow() {
        clickSort().selectSortingPriority("xpath", HIGH_TO_LOW);
        return this;
    }



}
