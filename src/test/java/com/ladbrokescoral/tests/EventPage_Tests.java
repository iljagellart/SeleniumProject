package com.ladbrokescoral.tests;
import com.ladbrokescoral.act.*;
import com.ladbrokescoral.act.TestBase;
import com.ladbrokescoral.model.Model;
import org.junit.Test;

public class EventPage_Tests extends TestBase {

    @Test
    public void FillFirstPageTest() throws InterruptedException {
//Test Data Model
        Model model = new Model();
        model.setEventSport("Football");
        model.setEventClass("Football England");
        model.setEventType("Championship");
        model.setEventEvent("Burton vs Cardiff");
        model.setEventMarket("1st Half Burton No Bet");
        model.setEventOutcome("Cardiff");
//Test Scenario
        appM.drv.get("http://crm-dev1-grandstand.coral-epos2.co.uk/");
        appM.eventPage_act.FillEventPage(model);


    }

    @Test
    public void EndToEndTest2() {
        appM.drv.navigate().to("http://crm-dev1-grandstand.coral-epos2.co.uk/");


    }
}

