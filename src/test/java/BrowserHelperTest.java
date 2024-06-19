import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BrowserHelperTest extends  BaseTest {
    @Test
    void test123() throws InterruptedException {
        browserHelper.open("https://demoqa.com/browser-windows");
       Thread.sleep(2000);
       driver.findElement(By.id("tabButton")).click();
        Thread.sleep(3000);
        browserHelper.switchTowindow(0);
        Thread.sleep(5000);
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(3000);
        browserHelper.switchTowindow(0);
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(3000);
        browserHelper.switchTowindow(0);
        driver.findElement(By.id("tabButton")).click();

        browserHelper.switchToParentWithChildClose();
        Thread.sleep(4000);
    }
}
