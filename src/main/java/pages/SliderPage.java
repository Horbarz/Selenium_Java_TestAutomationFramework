package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SliderPage{

    private WebDriver driver;

    private By sliderContainer = By.className("sliderContainer");

    private By horizontalSlider = By.xpath("//*[@id=\'content\']/div/div/input");
    private By sliderResult = By.id("range");

    public SliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void moveSlider(int sliderDepth){
        for(int i= 0; i<sliderDepth; i++){
            driver.findElement(horizontalSlider).sendKeys(Keys.ARROW_RIGHT);
        }

    }

    public String getResult(){
        return driver.findElement(sliderResult).getText();
    }


}
