import com.demoqa.drivers.DriverManager;
import com.demoqa.helper.*;
import com.demoqa.pages.*;
import com.demoqa.utils.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;

    protected RandomUtils randomUtils;

    protected WebElementActions webElementActions;
    protected AlertHelper alertHelper;
    protected BrowserHelper browserHelper;
    protected ChekBoxPage chekBoxPage;
    protected PracticeFormPage practiceFormPage;

    protected WebTablePage webTablePage;
    protected DemoQAPages demoQAPages;
    protected DropDownHelper dropDownHelper;
    protected IFrameHelper iFrameHelper;

    @BeforeClass(alwaysRun = true)
    public void setUp(){
        driver = DriverManager.getDriver();

        randomUtils = new RandomUtils();

        webElementActions = new WebElementActions();
        alertHelper = new AlertHelper(driver);
        browserHelper =  new BrowserHelper(driver);
      chekBoxPage = new ChekBoxPage();
      practiceFormPage = new PracticeFormPage();

      webTablePage =  new WebTablePage();
      demoQAPages =  new DemoQAPages();
      demoQAPages.setUp();
      dropDownHelper = new DropDownHelper(driver);
      iFrameHelper= new IFrameHelper(driver);


    }
    @AfterClass(alwaysRun = true)
   public void tearDown(){
      DriverManager.closeDriver();
    }}

