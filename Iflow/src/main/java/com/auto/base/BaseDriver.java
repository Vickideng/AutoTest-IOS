package com.auto.base;

import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseDriver {

    public static IOSDriver iosDriver=null;

    @BeforeSuite
    public void initDriver() throws MalformedURLException{
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
//        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "罗玉林的 iPhone");
        desiredCapabilities.setCapability("bundleId", "cc.pelly.iflow");
        desiredCapabilities.setCapability("noReset","True");
        //罗玉林的iphone udid
        desiredCapabilities.setCapability("udid","67ffd5bac0d6d9d20e99c7a0dd2d7604dcea9831");
        //Iphone7 udid
//        desiredCapabilities.setCapability("udid","9c35410072089084117814143c0abd6ae3fd056c");
//        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/NEO/Library/Developer/Xcode/DerivedData/WebDriverAgent-hgctewdoodlffqfntrworqjqsugx/Build/Products/Debug-iphonesimulator/Pelly.app");

        desiredCapabilities.setCapability("platformVersion","11.4.1");

//        desiredCapabilities.setCapability("xcodeOrgId","84216350@qq.com");
//        desiredCapabilities.setCapability("xcodeSigningId","iPhone Developer");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        iosDriver = new IOSDriver(remoteUrl, desiredCapabilities);



    }

    @AfterSuite
    public void tearDown() {
        iosDriver.quit();
    }

}
