package com.demoqa.utils;

import com.demoqa.elements.entities.Employee;
import com.demoqa.elements.entities.PracticFormEntity;
import com.demoqa.elements.entities.TextBoxEntity;
import com.github.javafaker.Faker;

public class RandomUtils {
Faker faker = new Faker();

public TextBoxEntity generateRandomTextBoxEntity(){
    TextBoxEntity textBoxEntity = new TextBoxEntity();
    textBoxEntity.setFullName(faker.name().fullName());
    textBoxEntity.setEmail(faker.internet().emailAddress());
    textBoxEntity.setCurrentAddress(faker.address().fullAddress());
    textBoxEntity.setPermanentAddress(faker.address().secondaryAddress());
    return textBoxEntity;
}

public PracticFormEntity generateRandomPracticeFormEntity(){
    PracticFormEntity practicFormEntity = new PracticFormEntity();
    practicFormEntity.setFullName(faker.name().fullName());
    practicFormEntity.setLastName(faker.name().lastName());
    practicFormEntity.setEmail(faker.internet().emailAddress());
    practicFormEntity.setMobileNumber(Integer.parseInt(faker.phoneNumber().subscriberNumber(10)));
    practicFormEntity.setSubject(faker.superhero().name());
    practicFormEntity.setCurrentAddress(faker.address().fullAddress());
    return practicFormEntity;
}

public Employee createMockEmployee(){
    Employee employee = new Employee();
    employee.setFirstName(faker.name().firstName());
    employee.setLastName(faker.name().lastName());
    employee.setAge(faker.number().numberBetween(18,100));
    employee.setEmail(faker.internet().emailAddress());
    employee.setSalary(faker.number().numberBetween(1000000L, 2000000000L));
    employee.setDepartment(faker.job().position());
return employee;
}
}
