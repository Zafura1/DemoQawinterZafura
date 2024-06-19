package com.demoqa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PaulRestourant {


    @Test
    void paulRestoraunt() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/user/IdeaProjects/DemoQAWinter24/src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();


        driver.get("https://dostavka312.kg/category/11");


        List<WebElement> restaurants = driver.findElements(By.xpath("//div[@class='panel-heading']"));


        for (WebElement restoutant :restaurants){


        System.out.println(restoutant.getText());
            System.out.println(restoutant.getSize());


    }
        for (WebElement restaurant : restaurants) {
            if (restaurant.getText().contains("KFC Орто-Сай\n" +
                    "ул. Юнусалиева, 185\n" +
                    "(389, 45)\n")) {
                WebElement link = restaurant.findElement(By.className("//a[@href='https://dostavka312.kg/garnirygpt/kfc-7mkr']"));
               link.click();
                driver.get("https://dostavka312.kg/garnirygpt/kfc-7mkr");

                break;



    }}}}