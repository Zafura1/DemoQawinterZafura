package com.demoqa.helper;

import org.checkerframework.checker.units.qual.N;
import org.openqa.selenium.WebDriver;

import java.util.LinkedList;
import java.util.Set;




public class BrowserHelper {
    private WebDriver driver;

    public BrowserHelper(WebDriver driver){
        this.driver=driver;
    }
    public void open(String url){
        driver.navigate().to(url);

    }
    public void goBack(){
        driver.navigate().back();
    }
 public void goForward(){
    driver.navigate().refresh();
}
public void refreshThePage(){
    driver.navigate().refresh();}

public Set<String> getWindowHendels(){

    return driver.getWindowHandles();
}
public void switchTowindow(int index){
    LinkedList<String> windowsId =new LinkedList<>(getWindowHendels());
    if (index<0 || index>windowsId.size()) {
        throw new IllegalArgumentException("invalid index:" + index);
    }
        driver.switchTo().window(windowsId.get(index));
    }
 public void switchToParentWindow(){
        LinkedList <String> windowsId = new LinkedList<>(getWindowHendels());
        driver.switchTo().window(windowsId.get(0));
 }
 public void switchToParentWithChildClose(){
        switchToParentWindow();
        LinkedList <String> windowsId = new LinkedList<>(getWindowHendels());
        for (int i =1; i< windowsId.size();i++){
            driver.switchTo().window(windowsId.get(i));
            driver.close();
        }
        switchToParentWindow();
 }
}