package com.demoqa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonPage extends BasePage{

    @FindBy(id ="doubleClickBtn" )
    public WebElement doubleClickBtn;

   @FindBy(id = "doubleClickMessage")
    public WebElement doubleClickMessage;
   @FindBy(id = "rightClickBtn")
    public WebElement rightClickBtn;


}
