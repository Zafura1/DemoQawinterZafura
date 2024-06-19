import com.demoqa.elements.entities.PracticFormEntity;
import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest {
    @Test
    public void practiceFormTest(){
        driver.get("https://demoqa.com/automation-practice-form");

        PracticFormEntity practicFormEntity = randomUtils.generateRandomPracticeFormEntity();

       demoQAPages.getPracticeFormPage().clickPracticeForm(practicFormEntity);


    }
    @Test
    public void test123() throws InterruptedException {
        browserHelper.open("https://demoqa.com/automation-practice-form");
        demoQAPages.getPracticeFormPage().selectDateMonthYear("30 Jun 2020");
        Thread.sleep(4000);
    }

}
