package com.vytrack.test.base;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Testbase {

    @BeforeMethod
    public void setUp(){
       // Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        System.out.println("Test is started");

    }
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}
