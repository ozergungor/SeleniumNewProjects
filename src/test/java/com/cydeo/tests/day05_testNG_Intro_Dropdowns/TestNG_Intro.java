package com.cydeo.tests.day05_testNG_Intro_Dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupMethod(){
        System.out.println("----->BeforeClass is running!");
    }

    @AfterClass
    public void tearDownClass(){

        System.out.println("----->AfterClass is running!");

    }

    @BeforeMethod
    public void setUpMethod(){

        System.out.println("----> BeforeMethod is running!");
    }

    @AfterMethod
    public void tearDownMethod(){

        System.out.println("----> AfterMethod is running!");
    }

    @Test (priority = 1)
    public void test1(){
        System.out.println("Test1 is running ...");

        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual, expected);
    }

    @Test (priority = 2)
    public void test2(){
        System.out.println("Test2 is running ...");

        String actual = "apple";
        String expected = "apple1";

        Assert.assertTrue(actual.equals(expected));

    }


}
