import com.demoqa.elements.entities.TextBoxEntity;
import com.demoqa.enams.Endpoints;
import com.demoqa.utils.ConfigReader;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    @Test
    public void textBoxTest (){
        browserHelper.open(ConfigReader.getValue("baseURL")+ Endpoints.TEXTBOX.getEndpoint());


        TextBoxEntity textBoxEntity = randomUtils.generateRandomTextBoxEntity();
        demoQAPages.getTextBoxPage().fillUpTextBoxForm(textBoxEntity);

    }
}
