package com.auto.base;

import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class SetingTest extends BaseDriver{
    @Test
    public void seting() throws InterruptedException {

        //点击【我的】
        List<MobileElement> els1 = (List<MobileElement>) iosDriver.findElementsByIosNsPredicate("type==\"XCUIElementTypeButton\"");
        els1.get(4).click();

        iosDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //点击设置
        String set="grzx btn  install";
        iosDriver.findElementByAccessibilityId(set).click();
        iosDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //进入个人资料页面
        iosDriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IFLOW\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]").click();

        iosDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        iosDriver.findElementByAccessibilityId("我的昵称").click();
        List<MobileElement> nicknameid = (List<MobileElement>) iosDriver.findElementsByIosNsPredicate("type==\"XCUIElementTypeTextView\"");

        System.out.println("=========="+nicknameid.get(0));

        nicknameid.get(0).click();
//        String text;
//        text=nicknameid.get(0).getAttribute("text");

        nicknameid.get(0).clear();
        iosDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        nicknameid.get(0).setValue("可可_Tester");
//        nicknameid.get(0).sendKeys("可可_Tester");
        List<MobileElement> save=iosDriver.findElementsByIosNsPredicate("type=\"XCUIElementTypeButton\"");
        iosDriver.findElementByAccessibilityId("保存").click();

        Thread.sleep(9000);
    }
}
