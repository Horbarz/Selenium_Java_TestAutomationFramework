package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.fileUpload("/Users/horbarz/Documents/Codes/TestAutomation/JavaSelenium/webdriver_java/resources/chromedriver");
        assertEquals(uploadPage.getUploadedFiles(),"chromedriver", "Uploaded file is wrong");
    }
}
