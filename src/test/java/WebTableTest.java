import com.demoqa.elements.entities.Employee;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest extends BaseTest {

    @Test(description = "Web Table page")
    public void test123() {
        driver.get("https://demoqa.com/webtables");
        demoQAPages.getWebTablePage().addNewEmployee(randomUtils.createMockEmployee());
        List<Employee> employees = demoQAPages.getWebTablePage().getEmployeesFromTable();
        for (Employee employee : employees) {
            System.out.println(employee);
        }


    }

    @Test(description = "replace Employee")
    public void replaceTest() {
        driver.get("https://demoqa.com/webtables");
        demoQAPages.getWebTablePage().replace(randomUtils.createMockEmployee());

    }
}
