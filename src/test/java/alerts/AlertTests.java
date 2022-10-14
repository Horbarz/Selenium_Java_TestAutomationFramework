package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertspage = homePage.clickJavascriptAlerts();
        alertspage.triggerAlert();
        alertspage.alert_clickToAccept();
        assertEquals(alertspage.getResults(), "You successfully clicked an alert", "You didn't click");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertspage = homePage.clickJavascriptAlerts();
        alertspage.triggerConfirm();
        String text = alertspage.alert_getText();
        alertspage.alert_clickToDismiss();
        assertEquals(text,"I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetInputInAlert(){
        var alertsPage = homePage.clickJavascriptAlerts();
        alertsPage.triggerPrompt();
        String text = "Hey man, what's up";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResults(),"You entered: "+text,"Results text are incoherent");
    }
}
