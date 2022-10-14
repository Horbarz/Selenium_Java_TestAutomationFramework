package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.SliderPage;
import static org.testng.Assert.*;

public class SliderTests extends BaseTests {

    @Test
    public void testHorizontalSlider(){
        var sliderDepth = 8;
        var sliderPage = homePage.clickSlider();
        sliderPage.moveSlider(sliderDepth);
        //System.out.println(sliderPage.getResult());
        assertEquals(sliderDepth/2, Integer.parseInt(sliderPage.getResult()),"Result is wrong" );
    }
}
