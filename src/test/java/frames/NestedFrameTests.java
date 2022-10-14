package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NestedFrameTests extends BaseTests {

    @Test
    public void testNestedFrames(){
        var nestedFrames = homePage.clickFrames().clickNestedFrame();

        assertEquals(nestedFrames.getLeftFrameText(),"LEFT","Left frame text incorrect");
        assertEquals(nestedFrames.getBottomFrameText(), "BOTTOM", "Bottom frame text incorrect");
    }
}
