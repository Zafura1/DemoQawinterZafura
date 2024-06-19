import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SelectMenuTest extends BaseTest {



    @Test(description = "selectValueTest")
    public void selectValue() throws InterruptedException {
        browserHelper.open("https://demoqa.com/select-menu");
       webElementActions.click(demoQAPages.getSelectMenuPage().fillUpSelectMenu().selectValueClick);

        Thread.sleep(5000);

    }

}