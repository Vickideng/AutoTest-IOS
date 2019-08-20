package com.auto.base;

import io.appium.java_client.remote.HideKeyboardStrategy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseDriver{



    @Test
    public void Login(){
        String sessionId = iosDriver.getSessionId().toString();

        System.out.println(sessionId);

        //点击【我的】
        iosDriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IFLOW\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTabBar/XCUIElementTypeButton[5]").click();
        iosDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //输入用户名和密码
        String phonenumxpath="//XCUIElementTypeApplication[@name=\"IFLOW\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField";
        String Phonenum="18512391083";
        iosDriver.findElementByXPath(phonenumxpath).clear();
        iosDriver.findElementByXPath(phonenumxpath).sendKeys(Phonenum);

        String pwdxpath="//XCUIElementTypeApplication[@name=\"IFLOW\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeSecureTextField";
        String pwd="123456";
        iosDriver.findElementByXPath(pwdxpath).sendKeys(pwd);

        //点击键盘的完成按钮
        iosDriver.findElementByAccessibilityId("Toolbar Done Button").click();;
        //登录
        iosDriver.findElementByAccessibilityId("立即登录").click();


        System.out.println("登录成功!!!!!!!!");
        iosDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }



}
