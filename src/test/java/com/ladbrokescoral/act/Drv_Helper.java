package com.ladbrokescoral.act;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drv_Helper {

    private WebDriver drv;
    private AppManager appM;

    //constructor
    public Drv_Helper(AppManager manager) {
        appM = manager;
        drv = manager.drv;
    }

    //methods
    public WebElement FindEl(By elem) throws InterruptedException {
        String pageLoadStatus;

        do {
            JavascriptExecutor  js = (JavascriptExecutor) appM.drv;
            pageLoadStatus = (String)js.executeScript("return document.readyState");
            System.out.print(".");
        } while ( !pageLoadStatus.equals("complete"));

        WebDriverWait wait = new WebDriverWait(appM.drv, 5);
        wait.until(ExpectedConditions.or(
                ExpectedConditions.visibilityOfElementLocated(elem),
                ExpectedConditions.elementToBeClickable(elem)
        ));

        do {
            JavascriptExecutor  js = (JavascriptExecutor) appM.drv;
            pageLoadStatus = (String)js.executeScript("return document.readyState");
            System.out.print(".");
        } while ( !pageLoadStatus.equals("complete"));
        return appM.drv.findElement(elem);

    }
}
