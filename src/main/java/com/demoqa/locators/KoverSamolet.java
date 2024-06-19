package com.demoqa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class KoverSamolet {
    @Test
    void koverSamolet(){
        System.setProperty("webdriver.chrome.driver","C:/Users/user/IdeaProjects/DemoQAWinter24/src/main/resources/drivers/chromedriver.exe");
        WebDriver drivernamba= new ChromeDriver();
        drivernamba.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        drivernamba.manage().window().maximize();
        drivernamba.get("https://dostavka312.kg/garnirygpt/restoran-pishpek");

        WebElement vybor = drivernamba.findElement(By.xpath("//*[@id=\"WWMainPage\"]/div[1]/div[1]/div/div[2]/form/button"));
        vybor.click();
        drivernamba.get("https://dostavka312.kg/cart");

        WebElement findName = drivernamba.findElement(By.xpath("//*[@id=\"form_cart\"]/div[1]/div[1]/div[1]/input"));
        findName.sendKeys("Марк");

        WebElement findAdress = drivernamba.findElement(By.xpath("//*[@id=\"form_cart\"]/div[1]/div[1]/div[2]/input"));
        findAdress.sendKeys("Markoba312");

        WebElement findPhone = drivernamba.findElement(By.xpath("//*[@id=\"form_cart\"]/div[1]/div[1]/div[3]/input"));
        findPhone.sendKeys("996555555555");

        WebElement findSdacha = drivernamba.findElement(By.xpath("//*[@id=\"form_cart\"]/div[1]/div[1]/div[4]/input"));
        findSdacha.sendKeys("100000");

        WebElement zakaz = drivernamba.findElement(By.xpath("//*[@id=\"form_cart\"]/button[1]"));
        zakaz.click();




    }
}
