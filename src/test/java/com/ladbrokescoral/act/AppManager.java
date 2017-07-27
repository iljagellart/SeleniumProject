package com.ladbrokescoral.act;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AppManager {
    public WebDriver drv;
    public Drv_Helper drvH;
    public EventPage_Actions eventPage_act;

    //constructor
    public AppManager() {
        drv = new ChromeDriver();
        drv.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        drvH = new Drv_Helper(this);
        eventPage_act = new EventPage_Actions(this);
    }

    //getters
    public WebDriver GetDrv() {
        return drv;
    }

    public Drv_Helper getDrvH() {
        return drvH;
    }
}
