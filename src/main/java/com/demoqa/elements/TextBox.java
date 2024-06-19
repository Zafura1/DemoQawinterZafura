package com.demoqa.elements;

import org.bouncycastle.asn1.dvcs.DVCSObjectIdentifiers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBox {

    WebDriver driver;

    @BeforeMethod
    void textBoxTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/user/IdeaProjects/DemoQAWinter24/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
    }

    @Test
    void testFullName() {
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Zafura");

    }

    @Test
    void testEmail() {
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("zafura25@gmail.com");
    }

    @Test
    void testCurrentAdress() {
        WebElement currentAdress = driver.findElement(By.id("currentAddress"));
        currentAdress.sendKeys("Arstanbap3911");
    }

    @Test
    void testPermanentAdress() {
        WebElement permanentAdress = driver.findElement(By.id("permanentAddress"));
        permanentAdress.sendKeys("Arstanbap391");
    }

    @Test
    void testSubmit() {
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

    }

    @AfterMethod
    void afterClose() {

        driver.close();
        driver.quit();
    }
}
