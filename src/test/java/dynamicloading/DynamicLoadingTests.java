package dynamicloading;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DynamicLoadingTests extends BaseTests {

    @Test
    public void testsDynamicLoading(){
        var dynamicLoadingExample2 = homePage.clickDynamicLoading().clickExample2();
        dynamicLoadingExample2.clickStart();
        assertEquals(dynamicLoadingExample2.getLoadedText(),"Hello World!", "Text doesn't correspond");
    }
}
