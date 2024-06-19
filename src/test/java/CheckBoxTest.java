import com.demoqa.pages.BasePage;
import com.demoqa.pages.ChekBoxPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {

    @Test
    public void checkBoxTest() throws InterruptedException {
        driver.get("https://demoqa.com/checkbox");

        chekBoxPage.clickCheckBox();


        String value ="You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";

        Assert.assertEquals(value,chekBoxPage.fullResult.getText());


    }
}
