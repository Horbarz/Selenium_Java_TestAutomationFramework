package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeysTests extends BaseTests {

    @Test
    public void testBackspace(){
        var keyPage = homePage.clickKeypresses();
        keyPage.enterText("Ab"+ Keys.BACK_SPACE);
        assertEquals(keyPage.getResults(),"You entered: BACK_SPACE");
    }

    @Test
    public void testEnterPi(){
        var keyPressesPage = homePage.clickKeypresses();
        keyPressesPage.enterPi();
        assertEquals(keyPressesPage.getResults(),"You entered: 4");
    }


}
