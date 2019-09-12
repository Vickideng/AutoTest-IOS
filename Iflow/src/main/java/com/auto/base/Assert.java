package com.auto.base;

import org.testng.Reporter;

public class Assert {

    public static void check(String expectValue, String actual){
        //弹窗的断言：实际提示语，预期提示语，测试用例
        if (expectValue.equals(actual)){
            Reporter.log("执行结果"+"=>执行成功");
        }else {
            Reporter.log("执行结果"+"=>执行失败，期望:' "+expectValue+"'   实际值：'"+actual+"'");
        }
        org.testng.Assert.assertEquals(expectValue, actual);
    }
}
