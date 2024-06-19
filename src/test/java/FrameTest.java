import com.demoqa.enams.Endpoints;
import com.demoqa.utils.ConfigReader;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest{

    @Test(description = "Verify that driver can switch to another frame")
    public void doubleclickTest(){
        browserHelper.open(ConfigReader.getValue("baseURL")+ Endpoints.FRAMES.getEndpoint());
        iFrameHelper.switchToFrame("frame1");
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        iFrameHelper.switchToParentFrame();
        System.out.println(driver.findElement(By.tagName("hi")).getText());
    }

}
