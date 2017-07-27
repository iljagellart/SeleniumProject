package com.ladbrokescoral.act;

import com.ladbrokescoral.model.Model;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EventPage_Actions {
    private WebDriver drv;
    private AppManager appM;

    //constructor
    public EventPage_Actions(AppManager manager) {
        appM = manager;
        drv = manager.drv;
    }

    //Fill step 1 page with dropdown selections
    public void FillEventPage(Model model) throws InterruptedException {
        appM.drvH.FindEl(By.xpath("//*[@id='Sport']/option[text()='" + model.getEventSport() + "']")).click();
        appM.drvH.FindEl(By.xpath("//*[@id='Class']/option[text()='" + model.getEventClass() + "']")).click();
        appM.drvH.FindEl(By.xpath("//*[@id='Type']/option[text()='" + model.getEventType() + "']")).click();
        appM.drvH.FindEl(By.xpath("//*[@id='Event']/option[text()='" + model.getEventEvent() + "']")).click();
        appM.drvH.FindEl(By.xpath("//*[@id='Market']/option[text()='" + model.getEventMarket() + "']")).click();
        appM.drvH.FindEl(By.xpath("//*[@id='Outcome/Participant']/option[text()='" + model.getEventOutcome() + "']")).click();
    }
}
