package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class ChekBoxPage extends BasePage {


        @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div/ol/li/span/button/svg/path")
        public WebElement openHome;


        @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div/ol/li/ol/li[1]/span/button/svg")

        public WebElement openDesktop;

        @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]")
       public WebElement notes;
       @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/ol/li/ol/li[1]/ol/li[2]/span/label/span[1]/svg/path")
        public WebElement commands;
       @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/ol/li/ol/li[1]/span/label/span[1]/svg")
       public WebElement desktopButton;
        @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button/svg")
        public WebElement openDocuments;
        @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/ol/li/ol/li[2]/ol/li[1]/span/label/span[1]/svg")
       public WebElement workSpace;

        @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/ol/li/ol/li[2]/ol/li[2]/span/label/span[1]/svg/path")
        public WebElement office;
        @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/ol/li/ol/li[2]/span/label/span[1]/svg")
       public WebElement documentButton;
        @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/ol/li/ol/li[3]/span/button/svg")
       public WebElement openDownload;
        @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/ol/li/ol/li[3]/ol/li[1]/span/label/span[1]/svg/path")
        public WebElement wordFile;
       @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/ol/li/ol/li[3]/ol/li[2]/span/label/span[1]/svg")
        public WebElement excelFile;
       @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[1]")
       public WebElement downloadButton;
       @FindBy(xpath = "\"//div[@class='display-result mt-4']\"")
        public WebElement fullResult;




    public ChekBoxPage clickCheckBox() {

                webElementActions.click(openHome)
                        .click(openDesktop)
                        .click(notes)
                        .click(commands)
                        .click(desktopButton)
                        .click(openDocuments)
                        .click(workSpace)
                        .click(office)
                       .click(documentButton)
                        .click(openDownload)
                        .click(wordFile)
                       .click(excelFile)
                        .click(downloadButton);
return this;

        }
}



