package com.amazonassignment.utils;

import com.amazonassignment.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public final class ScreenShotUtil {
    private  ScreenShotUtil(){}
    public static String getScreenShot(){
        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
    }
}
