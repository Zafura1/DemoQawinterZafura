import com.demoqa.helper.DropDownHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SelectDemo extends BaseTest{

    @Test
    void Test123() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement selectMenu = driver.findElement(By.id("oldSelectMenu"));
        DropDownHelper dropDownHelper = new DropDownHelper(driver);
        dropDownHelper.selectByVisibleText(selectMenu,"Green" );

        Thread.sleep(4000);
    }

}
