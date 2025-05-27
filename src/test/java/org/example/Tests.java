package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests{

    @Test(retryAnalyzer = MyRetry.class)
    public void addIntegersTest(){
        Assert.assertEquals(2+2,5,"The integer sum isn't equal to 5");
    }

    @Test(retryAnalyzer = MyRetry.class)
    public void stringEqualsTest(){
        Assert.assertTrue("Hello".equals("World"),"The strings are not equal");
    }

    @Test(retryAnalyzer = MyRetry.class)
    public void assertFailTest(){
        Assert.fail("Assert failed");
    }

    @Test(retryAnalyzer = MyRetry.class)
    public void boolEqualsTest(){
        Assert.assertEquals(false,true,"Booleans are not equal");
    }

    @Test(retryAnalyzer = MyRetry.class)
    public void floatEqualsTest(){
        Assert.assertEquals(3.55f,4.00f,"The floats are not equal");
    }
}
