package com.demoqa.helper;

import com.demoqa.drivers.DriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelper {

    private WebDriver driver = DriverManager.getDriver();


    public AlertHelper(WebDriver driver){
        this.driver= driver;
    }
    public Alert getAlert(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());

        return driver.switchTo().alert();
    }
    public void accertAlert(){
        getAlert().accept();
    }

    public void dismissAlert(){
        getAlert().dismiss();
    }
    public String getAlertText (){
        return getAlert().getText();
    }
    public boolean isAlertPresent(){
        try {
            driver.switchTo().alert().accept();
            return true;
        }catch (NoAlertPresentException e){
            return false;
        }
    }
    public void acceptAlertPresented(){
       if (!isAlertPresent())
           return;
       accertAlert();
    }
    public void dismissAlertIfPresented(){
        if (!isAlertPresent())
            return;
        dismissAlert();

    }
    public void acceptPrompt(String txt){
        if (!isAlertPresent())
            return;
        Alert alert = getAlert();
        alert.sendKeys(txt);
        alert.accept();
    }

    public void dismissPrompt(String txt){
        if (!isAlertPresent())
            return;
        Alert alert = getAlert();
        alert.sendKeys(txt);
        alert.dismiss();

}}
