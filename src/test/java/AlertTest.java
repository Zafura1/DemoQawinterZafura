import com.demoqa.utils.ConfigReader;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest{

    @Test(groups = {"Smoke","UI", "1721"}, description = "Alert test")
    @Description ("Verify that alert is present")
    @Owner("Zafura")
    @Tag("Smoke")
    @Severity(SeverityLevel.CRITICAL)
    @Story("GSPINT -8877")
    @Epic("Registration")
    @Link("www.google.com")
    void alertTest() throws InterruptedException {
        browserHelper.open(ConfigReader.getValue("baseURL"));
webElementActions.click(demoQAPages.getAlertPage().confirmAlertBtn);

alertHelper.accertAlert();
webElementActions.pause(5);
    }
    @Test(groups = {"Regression","API", "1722"}, description = "Alert test1")
    void alertTest1() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        webElementActions.click(demoQAPages.getAlertPage().confirmAlertBtn);

        alertHelper.accertAlert();
    }
    @Test(groups = {"E2E","SQL", "1723"}, description = "Alert test2")
    void alertTest2() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        webElementActions.click(demoQAPages.getAlertPage().confirmAlertBtn);

        alertHelper.accertAlert();
    }

}
