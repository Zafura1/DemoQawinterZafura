package com.demoqa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class BasicLocators {

    @Test(description = "find by Id")
    void findByIdTest(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/user/IdeaProjects/DemoQAWinter24/src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

       // WebElement fullNameInput = driver.findElement(By.tagName("input"));
       // fullNameInput.sendKeys("zafura");

      //  String textBoxtext = driver.findElement(By.tagName("h1")).getText();
       // System.out.println(textBoxtext);

        WebElement homelink = driver.findElement(By.xpath("(//textarea[@class='form-control'])[1]"));
        homelink.sendKeys("dhgfgdd");
        String permanenttxt=driver.findElement(By.xpath("//label[text()='Permanent Address']")).getText();
        System.out.println(permanenttxt);
        Assert.assertEquals(permanenttxt,"Permanent address","Текст элемента не совпадает с ожидаемым значением!");

    }
}
