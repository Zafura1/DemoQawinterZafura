package com.demoqa.pages;

import com.demoqa.drivers.DriverManager;
import com.demoqa.elements.entities.Employee;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class WebTablePage  extends BasePage {
    @FindBy(id = "addNewRecordButton")
    public WebElement addNewBtn;
    @FindBy(id = "firstName")
    public WebElement firstNameInput1;
    @FindBy(id = "lastName")
    public WebElement lastNameInput1;
    @FindBy(id = "age")
    public WebElement ageInput;
    @FindBy(id = "userEmail")
    public WebElement emailInput1;
    @FindBy(id = "salary")
    public WebElement salaryInput;
    @FindBy(id = "department")
    public WebElement departmentInput;
    @FindBy(id = "submit")
    public WebElement submit;

    public WebTablePage addNewEmployee(Employee employee) {
        try {
            if (isEmailDuplicate(employee.getEmail())) {
                throw new Exception("Электронная почта уже существует: " + employee.getEmail());
            }


            webElementActions.click(addNewBtn)
                    .sendKeys(firstNameInput1, employee.getFirstName())
                    .sendKeys(lastNameInput1, employee.getLastName())
                    .sendKeys(ageInput, String.valueOf(employee.getAge()))
                    .sendKeys(emailInput1, employee.getEmail())
                    .sendKeys(salaryInput, String.valueOf(employee.getSalary()))
                    .sendKeys(departmentInput, employee.getDepartment())
                    .click(submit);


        } catch (Exception e) {
            e.printStackTrace();

        }
        return  this;
    }

    private boolean isEmailDuplicate(String email) {
        ArrayList<Employee> employees = getEmployeesFromTable();
        for (Employee em : employees) {
            if (em.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Employee> getEmployeesFromTable() {
        List<WebElement> rows = DriverManager.getDriver().findElements(By.cssSelector(".ReactTable .rt-tr-group"));
        ArrayList<Employee> employees = new ArrayList<>();
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
            String firstName = cells.get(0).getText();
            String lastName = cells.get(1).getText();
            String ageText = cells.get(2).getText().replaceAll("[^0-9]", "");
            String email = cells.get(3).getText();
            String salaryText = cells.get(4).getText().replaceAll("[^0-9]", "");
            String department = cells.get(5).getText();
            if (firstName.isEmpty() || lastName.isEmpty() || ageText.isEmpty() || email.isEmpty() || salaryText.isEmpty() || department.isEmpty()) {
                continue;
            }
            int age = Integer.parseInt(ageText.trim());
            long salary = Long.parseLong(salaryText.trim());

            employees.add(new Employee(firstName, lastName, age, email, salary, department));
        }


        return employees;
    }


    @FindBy(id = "firstName")
    public WebElement firstNameInputRep;
    @FindBy(id = "lastName")
    public WebElement lastNameInputRep;
    @FindBy(id = "age")
    public WebElement ageInputRep;
    @FindBy(id = "userEmail")
    public WebElement emailInputRep;
    @FindBy(id = "salary")
    public WebElement salaryInputRep;
    @FindBy(id = "department")
    public WebElement departmentInputRep;
    @FindBy(id = "submit")
    public WebElement submitRep;
    @FindBy(id = "edit-record-1")
    public WebElement edit;


    public WebTablePage replace(Employee employee) {
        webElementActions.click(edit);
        firstNameInput1.clear();
        webElementActions.sendKeys(firstNameInputRep, employee.getFirstName());
        lastNameInput1.clear();
        webElementActions.sendKeys(lastNameInputRep, employee.getLastName());
        ageInput.clear();
        webElementActions.sendKeys(ageInputRep, String.valueOf(employee.getAge()));
        emailInput1.clear();
        webElementActions.sendKeys(emailInputRep, employee.getEmail());
        salaryInput.clear();
        webElementActions.sendKeys(salaryInputRep, String.valueOf(employee.getSalary()));
        departmentInput.clear();
        webElementActions.sendKeys(departmentInputRep, employee.getDepartment());
        webElementActions.click(submitRep);
        return this;

    }
}




