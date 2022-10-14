package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;

    private By inputFile = By.id("file-upload");

    private By uploadBtn = By.id("file-submit");

    private By uploadedFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){
        this.driver =driver;
    }
    public void clickUpload(){
        driver.findElement(uploadBtn).click();
    }
    public void fileUpload(String absoluteFilePath){
        driver.findElement(inputFile).sendKeys(absoluteFilePath);
        clickUpload();
    }

    public String getUploadedFiles(){
        return driver.findElement(uploadedFiles).getText();
    }

}
