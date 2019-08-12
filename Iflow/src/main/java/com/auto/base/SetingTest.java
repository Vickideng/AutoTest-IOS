package com.auto.base;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.auto.base.BaseDriver.iosDriver;

public class SetingTest {
    @Test
    public void seting(){

        //点击【我的】
        iosDriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IFLOW\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTabBar/XCUIElementTypeButton[5]").click();
        iosDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //点击设置
        String set="//XCUIElementTypeButton[@name=\"grzx btn install\"]";
        iosDriver.findElementByXPath(set).click();

    }
}
