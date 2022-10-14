package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void EnterEmail(String email){
        driver.findElement(By.id("email")).sendKeys(email);
    }

    public void clickButton(){
        driver.findElement(By.cssSelector("#form_submit i")).click();
    }



}
