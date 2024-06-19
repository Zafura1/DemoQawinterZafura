package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SelectMenuPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"withOptGroup\"]/div/div[2]/div/svg")
    public WebElement selectValueClick;
    @FindBy(xpath = "//div[text()='Group 1, option 1']")
    public WebElement selectGroup1Option1;
    @FindBy(xpath = "//div[text()='Group 1, option 2']")
    public WebElement selectGroup1Option2;
    @FindBy(xpath = "//div[text()='Group 2, option 1']")
    public WebElement selectGroup2Option1;
    @FindBy(xpath = "//div[text()='Group 2, option 2']")
    public WebElement selectGroup2Option2;

    @FindBy(xpath = "//div[text()='Select Title']")
    public WebElement selectTitleClick;
    @FindBy(xpath = "//*[@id=\"selectOne\"]/div/div[1]/div[1]")
    public WebElement drClick;
    @FindBy(xpath = "//div[text()='Mr.' ]")
    public WebElement mr;
    @FindBy(xpath = "//div[text()='Mrs.' ]")
    public WebElement mrs;
    @FindBy(xpath = "//div[text()='Ms.' ]")
    public WebElement ms;
    @FindBy(xpath = "//*[@id=\"selectOne\"]/div/div[1]/div[1]")
    public WebElement prof;

    @FindBy(id = "oldSelectMenu")
    public WebElement selectMenuClick;
    @FindBy(xpath= "//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[2]/div")
    public WebElement multiSelectDropDownClick;
    @FindBy(xpath = "//div[text()='Green']")
    public WebElement green;
    @FindBy(xpath = "//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[1]/div/div[1]")
    public WebElement blue;
    @FindBy(xpath = "//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[1]/div/div[1]")
    public WebElement red;
    @FindBy(xpath = "//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[1]/div/div[1]")
    public WebElement black;

    @FindBy(id = "cars")
    public WebElement standardMultiSelectClick;


    public SelectMenuPage fillUpSelectMenu(){
        webElementActions.click(selectValueClick)
                .click(selectGroup1Option1)
                .click(selectTitleClick)
                .click(drClick);
        String selectValue = selectGroup1Option1.getText();
        String selectTitle = drClick.getText();
        dropDownHelper.selectByIndex(selectMenuClick, 3);
        webElementActions.click(multiSelectDropDownClick)
                .click(black)
                .click(blue)
                .click(red)
                .click(green);
        String multiDownClick = black.getText() +  green.getText() +  blue.getText() +  red.getText();
        dropDownHelper.selectByValueText(standardMultiSelectClick, "volvo");

        System.out.println("\nSelect value:   "+ selectValue + "\nSelect one  "+selectTitle + "\n Old Style Select Menu   "+ selectMenuClick + "\n Multi select Drop Down  "+ multiSelectDropDownClick + "\nStandart multi select  " + standardMultiSelectClick);
        return  this;



    }
    public String getSelectedOption(WebElement element) {
        Select select = new Select(element);
        return select.getFirstSelectedOption().getText();

    }}
