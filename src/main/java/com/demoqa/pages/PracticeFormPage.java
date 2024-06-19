package com.demoqa.pages;

import com.demoqa.drivers.DriverManager;
import com.demoqa.elements.entities.PracticFormEntity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class PracticeFormPage extends BasePage {


    @FindBy(id = "firstName")
    public WebElement firstNameInput;
    @FindBy(id = "lastName")
    public WebElement lastNameInput;
    @FindBy(id = "userEmail")
    public WebElement emailInput;


    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")
    public WebElement genderMale;

    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")
    public WebElement genderFemale;
    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[3]/label")
    public WebElement genderOther;
    @FindBy(id = "userNumber")
    public WebElement mobileNumberInput;
    @FindBy(id = "subjectsContainer")
    public WebElement subjectInput;
    @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")
    public WebElement hobbiesSport;
    @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")
    public WebElement hobbiesReading;
    @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")
    public WebElement hobbiesMusic;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;
    @FindBy(id = "state")
    public WebElement stateInput;

    @FindBy(xpath = "//*[@id=\"state\"]/div/div[1]/div[1]")
    public WebElement stateButton;
    @FindBy(id = "city")
    public WebElement cityInput;
    @FindBy(id = "submit")
    public WebElement submitButton;

    public List<WebElement> genderOptions = List.of(genderFemale, genderOther, genderOther);
    public List<WebElement> hobbiesOption = List.of(hobbiesMusic, hobbiesReading, hobbiesSport);
    Random random = new Random();
    WebElement randomGender = genderOptions.get(random.nextInt(genderOptions.size()));
    WebElement randomHobbies = hobbiesOption.get(random.nextInt(hobbiesOption.size()));


    public PracticeFormPage clickPracticeForm(PracticFormEntity practicFormEntity) {
        webElementActions.sendKeys(firstNameInput, practicFormEntity.getFullName())
                .sendKeys(lastNameInput, practicFormEntity.getLastName())
                .sendKeys(emailInput, practicFormEntity.getEmail())
                .click(randomGender)
                .scrollToElement(mobileNumberInput);

        webElementActions.sendKeys(mobileNumberInput, String.valueOf((practicFormEntity.getMobileNumber())))
                .click(randomHobbies)
                .sendKeys(currentAddressInput, practicFormEntity.getCurrentAddress())
                .click(submitButton);
        return this;

    }

    @FindBy(className = "react-datepicker__input-container")
    public WebElement datePickerBtn;


    public PracticeFormPage selectDateMonthYear(String dateMonthYear){ //04 Jun 2024
        String [] dateMonthYearParts = dateMonthYear.split(" ");
        String date = dateMonthYearParts[0];
        String month = dateMonthYearParts[1];
        String year = dateMonthYearParts[2];

        webElementActions.click(datePickerBtn);
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        WebElement monthDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-datepicker__month-select")));
        WebElement yearDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-datepicker__year-select")));
        dropDownHelper.selectByVisibleText(monthDropDown,month)
                .selectByVisibleText(yearDropDown,year);
        WebElement day= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'react-datepicker__day') and not (contains(@class,'react-datepicker__day--outside-month')) and text()='"+date +"']")));
        webElementActions.click(day);
return  this;
    }

}


