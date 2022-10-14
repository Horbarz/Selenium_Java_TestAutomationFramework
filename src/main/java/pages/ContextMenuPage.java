package pages;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ContextMenuPage {

    private By rectBox = By.id("hot-spot");
    private WebDriver driver;
     public ContextMenuPage(WebDriver driver){
         this.driver = driver;
     }

     public void clickBox(){
         WebElement box = driver.findElement(rectBox);
         Actions actions = new Actions(driver);
         actions.contextClick(box).perform();
     }

     public String getResult(){
         return driver.switchTo().alert().getText();
     }

     public void alert_clickToDismiss(){
         driver.switchTo().alert().dismiss();
     }


}
