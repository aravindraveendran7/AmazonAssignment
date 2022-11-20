package com.amazonassignment.pages;

import com.amazonassignment.enums.WaitType;
import com.amazonassignment.pages.pageComponents.HamburgerMenuComponent;
import com.amazonassignment.utils.SeleniumUtils;
import org.openqa.selenium.By;

public final class HomePage {

    private static final By LINK_HAMBURGERMENU=By.id("nav-hamburger-menu");
    private HamburgerMenuComponent hamburgerMenu;
    public HomePage(){
        hamburgerMenu = new HamburgerMenuComponent();
    }
    public HamburgerMenuComponent clickOnHamburgerMenu(){
        SeleniumUtils.click(LINK_HAMBURGERMENU, WaitType.CLICKABLE,"HamburgerMenu");
        return new HamburgerMenuComponent();
    }
}

