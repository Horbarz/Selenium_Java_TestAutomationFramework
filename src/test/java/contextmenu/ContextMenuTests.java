package contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.clickBox();
        String text = contextMenuPage.getResult();
        contextMenuPage.alert_clickToDismiss();
        assertEquals(text,"You selected a context menu","Wrong text clicked");
    }
}
