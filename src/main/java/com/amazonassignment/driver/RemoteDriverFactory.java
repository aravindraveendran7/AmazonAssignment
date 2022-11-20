package com.amazonassignment.driver;

import com.amazonassignment.configs.ConfigFactory;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public final class RemoteDriverFactory {

    private  RemoteDriverFactory(){}

    @SneakyThrows
    public static WebDriver getRemoteDriver(String browserName){
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        if (browserName.equalsIgnoreCase("chrome")) {
            desiredCapabilities.setBrowserName("chrome");
            desiredCapabilities.setCapability("enableVNC",true);
            desiredCapabilities.setCapability("enableVideo",true);

        } else if (browserName.equalsIgnoreCase("edge")) {
            desiredCapabilities.setBrowserName("edge");
        }
        return new RemoteWebDriver(new URL(ConfigFactory.getConfig().remoteurl()),desiredCapabilities);

    }
}
