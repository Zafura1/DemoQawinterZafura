package com.demoqa.drivers;

import com.demoqa.utils.ConfigReader;
import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver==null){
            switch (ConfigReader.getValue("browser").toLowerCase()){
                case "chrome":
                    driver=ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                default:
                    throw  new IllegalArgumentException("Вы указали неправильный драйвер");
            }
        }
        return driver;
    }
    public static void closeDriver(){
        try {
            if (driver!=null){
                driver.close();
                driver.quit();
                driver=null;
            }
        }catch (Exception e){
            System.err.println("Ошибка закрытия драйвера");
        }
    }
}
