import com.demoqa.drivers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProgressBarTest extends BaseTest {

    @Test(description = "Test to stop the progress bar when it reaches 52%")
    public void progressBarTest() throws InterruptedException {
        browserHelper.open("https://demoqa.com/progress-bar");
        webElementActions.click(demoQAPages.getProgressBarPage().startStopButton);
        Thread.sleep(5000);
        // Явное ожидание пока прогресс-бар достигнет 52%


        while (true) {
            String progres = demoQAPages.getProgressBarPage().aria_valuenow.getAttribute("aria_valuenow");
            if (progres != null) {
                int value = Integer.parseInt(progres);

                if (value >= 52) {
                    webElementActions.click(demoQAPages.getProgressBarPage().startStopButton);


                    break;
                }
            }


            System.out.println(demoQAPages.getProgressBarPage().aria_valuenow.getAttribute("aria-valuenow"));
            Assert.assertEquals(demoQAPages.getProgressBarPage().aria_valuenow.getAttribute("aria-valuenow"), "52");

        }


    }
}