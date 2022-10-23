package Tests;

import Base.ToolsExcelReader;
import Base.ToolsQA_Base;
import Pages.Elements.WebTables;
import Pages.ToolsQAMainPage;
import Pages.ToolsQASidebarPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTablesTest extends ToolsQA_Base {

    ToolsQAMainPage toolsQAMainPage;
    ToolsQASidebarPage toolsQASidebarPage;
    WebTables webTables;

    @BeforeMethod
    public void pageSetUp() {
        toolsQAMainPage = new ToolsQAMainPage();
        toolsQASidebarPage = new ToolsQASidebarPage();
        webTables = new WebTables();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }

    public void goToElemnets() {
        toolsQAMainPage.clickOnElements();
    }

    public void goToWebTables() {
        toolsQASidebarPage.clickOnWebTables();
    }

    public void deleteEntries() {
        while (!webTables.cellText(0).isBlank()) {
            webTables.clickOnDelete();
        }
    }

    public void addData() {
        for (int i = 1; i < toolsExcelReader.getLastRow("Users"); i++) {
            String firstName = toolsExcelReader.getStringData("Users", i, 0);
            String lastName = toolsExcelReader.getStringData("Users", i, 1);
            String email = toolsExcelReader.getStringData("Users", i, 2);
            int age = toolsExcelReader.getIntegerData("Users", i, 3);
            int salary = toolsExcelReader.getIntegerData("Users", i, 4);
            String department = toolsExcelReader.getStringData("Users", i, 5);
            waitForElementClickability(webTables.AddButton);
            webTables.clickOnAdd();
            webTables.inputFirstName(firstName);
            webTables.inputLastName(lastName);
            webTables.inputEmail(email);
            webTables.inputAge(age);
            webTables.inputSalary(salary);
            webTables.inputDepartment(department);
            webTables.clickOnSubmit();
        }
    }

    @Test(priority = 10)
    public void goToElemnetsPage() {
        toolsQAMainPage.clickOnElements();
    }

    @Test(priority = 20)
    public void goToWebTablesPage() {
        toolsQASidebarPage.clickOnWebTables();
    }

    @Test(priority = 30)
    public void deleteEntriesfromTable() {
        goToElemnets();
        goToWebTables();
        while (!webTables.cellText(0).isBlank()) {
            webTables.clickOnDelete();
        }
    }

    @Test(priority = 40)
    public void userCanSearchEntries() {
        goToElemnets();
        goToWebTables();
        deleteEntries();
        addData();

        String search = "John";
        webTables.inputSearch(search);
        boolean contains = false;
        int brojac = 0;
        int expected = 0;

        for (int i = 0; i < webTables.RowInfo.size(); i++) {
            if (!webTables.rowText(i).isBlank()) {
                expected++;
            }
        }

        for (int i = 0; i < webTables.RowInfo.size(); i++) {
            if (webTables.rowText(i).isBlank()) {
                break;
            } else {
                if (webTables.rowText(i).toUpperCase().contains(search.toUpperCase())) {
                    contains = true;
                    brojac++;
                } else {
                    System.out.println(webTables.rowText(i).toUpperCase());
                    contains = false;
                }
                Assert.assertTrue(contains = true);
            }
        }

        Assert.assertTrue(brojac > 0);
        Assert.assertEquals(brojac, expected);
    }


}
