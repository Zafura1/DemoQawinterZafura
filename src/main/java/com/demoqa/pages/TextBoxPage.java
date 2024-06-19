package com.demoqa.pages;

import com.demoqa.elements.entities.TextBoxEntity;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class  TextBoxPage extends BasePage {


    @FindBy(id = "userName")
    public WebElement fullNameInput;

    @FindBy(id = "userEmail" )
    public WebElement emailInput;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressInput;
    @FindBy(id ="submit" )
    public WebElement submitBtn;

    public TextBoxPage fillUpTextBoxForm(String fullname,String email,String currenAddress, String permanentAddress){
        webElementActions.sendKeys(fullNameInput,fullname)
                .sendKeys(currentAddressInput,currenAddress)
                .sendKeys(emailInput,email)
                .sendKeys(permanentAddressInput,permanentAddress)
                .click(submitBtn);
        return this;

    }
    public TextBoxPage fillUpTextBoxForm (TextBoxEntity textBoxEntity){
       webElementActions.sendKeys(fullNameInput, textBoxEntity.getFullName())
               .sendKeys(emailInput, textBoxEntity.getEmail())
               .sendKeys(permanentAddressInput, textBoxEntity.getPermanentAddress())
               .sendKeys(currentAddressInput,textBoxEntity.getCurrentAddress())
               .click(submitBtn);
       return this;
    }
}
