package com.auto.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

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
        String pwd="111111";
        iosDriver.findElementByXPath(pwdxpath).sendKeys(pwd);


        String login="//XCUIElementTypeButton[@name=\"立即登录\"]";
        WebElement webElement = iosDriver.findElementByIosUIAutomation(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Display\"))");


        WebElement ele=iosDriver.findElementByXPath("//XCUIElementTypeButton[@name=\"立即登录\"]");
        JavascriptExecutor dj=(JavascriptExecutor)iosDriver;//将Driver实例化为js对象
        dj.executeScript("arguments[0].scrollIntoViewIfNeeded(true);", ele);//滑动到上面定位到的元素的位置
        ele.click();
        System.out.println("111111111"+iosDriver.findElementByXPath(login));


        System.out.println("登录成功!!!!!!!!");
        iosDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }



}
