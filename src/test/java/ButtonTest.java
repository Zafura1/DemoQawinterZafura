import com.demoqa.helper.WebElementActions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonTest extends BaseTest{

    @Test(description = "Verify double click button is working propertly")
    public void doubleClick(){
        browserHelper.open("https://demoqa.com/buttons");
        webElementActions.doubleClick(demoQAPages.getButtonPage().doubleClickBtn);
        Assert.assertEquals(demoQAPages.getButtonPage().doubleClickMessage.getText(),"You have done a double click");
    }

}
