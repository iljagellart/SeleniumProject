package com.ladbrokescoral.act;

import com.ladbrokescoral.act.AppManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class TestBase {
    public AppManager appM;

    @BeforeClass
    public static void Setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
    }

    @Before
    public void StartTest() {
        appM = new AppManager();
    }

    @After
    public void EndTest() {
     //  appM.drv.close();
    //   appM.drv.quit();
    }

    @AfterClass
    public static void EndTests() {


    }
}
