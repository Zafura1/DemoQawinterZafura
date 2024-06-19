package com.demoqa.pages;

import lombok.*;
import org.testng.annotations.BeforeClass;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder



public class DemoQAPages {
    protected TextBoxPage textBoxPage;
    protected AlertPage alertPage;
    protected ButtonPage buttonPage;
    protected MenuPage menuPage;
    protected ProgressBarPage progressBarPage;
    protected SelectMenuPage selectMenuPage;
    protected WebTablePage webTablePage;
    protected PracticeFormPage practiceFormPage;



    @BeforeClass(alwaysRun = true)
    public void setUp(){
        textBoxPage = new TextBoxPage();
        alertPage = new AlertPage();
        buttonPage = new ButtonPage();
        menuPage = new MenuPage();
        progressBarPage = new ProgressBarPage();
        selectMenuPage = new SelectMenuPage();
        webTablePage = new WebTablePage();
        practiceFormPage= new PracticeFormPage();
    }
}
