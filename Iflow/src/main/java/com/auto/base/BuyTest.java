package com.auto.base;

import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BuyTest extends BaseDriver {

    @Test(enabled = false)
    public void Buyproduct(){
        //点击【商城】
        String mall="//XCUIElementTypeApplication[@name=\"IFLOW\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTabBar/XCUIElementTypeButton[2]";
        iosDriver.findElementByXPath(mall).click();
        iosDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //搜索
        MobileElement el1 = (MobileElement) iosDriver.findElementByAccessibilityId("  输入搜索的商品名称");
        el1.click();
        MobileElement el2 = (MobileElement) iosDriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IFLOW\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField");
        el2.sendKeys("可可洗护");
        MobileElement Search = (MobileElement) iosDriver.findElementByAccessibilityId("Search");
        Search.click();
        iosDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //点击商品进入商品详情
        MobileElement el4 = (MobileElement) iosDriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IFLOW\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell\n");
        el4.click();
        iosDriver.findElementByAccessibilityId("立即购买").click();
        iosDriver.findElementByAccessibilityId("确定").click();
        iosDriver.findElementByAccessibilityId("提交订单").click();
        iosDriver.findElementByAccessibilityId("确认提交").click();
        iosDriver.findElementByAccessibilityId("立即支付").click();
        iosDriver.findElementByXPath("//XCUIElementTypeApplication[@name='IFLOW']/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther").sendKeys("123456");
        iosDriver.findElementByAccessibilityId("确定").click();
        try {
            iosDriver.findElementByAccessibilityId("查看订单") .click();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        String actual=iosDriver.findElementByAccessibilityId("商品待发货").getText();
        check(actual,"商品待发货");
    }
    public static void check(String expectValue, String actual){
        //弹窗的断言：实际提示语，预期提示语，测试用例
        if (expectValue.equals(actual)){
            Reporter.log("执行结果"+"=>执行成功");
        }else {
            Reporter.log("执行结果"+"=>执行失败，期望:' "+expectValue+"'   实际值：'"+actual+"'");
        }
        Assert.assertEquals(expectValue, actual);
    }
}
