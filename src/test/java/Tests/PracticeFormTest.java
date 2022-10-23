package Tests;

import Base.ToolsQA_Base;
import Pages.Elements.WebTables;
import Pages.Forms.PracticeForm;
import Pages.ToolsQAMainPage;
import Pages.ToolsQASidebarPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTest extends ToolsQA_Base {

    ToolsQAMainPage toolsQAMainPage;
    ToolsQASidebarPage toolsQASidebarPage;
    PracticeForm practiceForm;

    @BeforeMethod
    public void pageSetUp() {
        toolsQAMainPage = new ToolsQAMainPage();
        toolsQASidebarPage = new ToolsQASidebarPage();
        practiceForm = new PracticeForm();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }

    @AfterMethod
    public void pageCleanup() {
        driver.manage().deleteAllCookies();
    }

    public void goToForms() {
        toolsQAMainPage.clickOnForms();
    }

    public void goToPracticeForm() {
        toolsQASidebarPage.clickOnPracticeForm();
    }

    @Test (priority = 10)
    public void goToFormsPage() {
        toolsQAMainPage.clickOnForms();
    }

    @Test (priority = 20)
    public void goToPracticeFormPage() {
        toolsQASidebarPage.clickOnPracticeForm();
    }

    @Test(priority = 30)
    public void inputAllFields() {
        goToForms();
        goToPracticeForm();

        String fname = "Ivana";
        String lname = "Kajganic";
        String email = "mail@mail.com";
        String gender = "female";
        int mobilePhone = 1234567890;
        String hobbiesSport = "sports";
        String hobbiesReading = "reading";
        String hobbiesMusic = "music";
        String address = "Address 1";


        practiceForm.insertFirstName(fname);
        practiceForm.insertLastName(lname);
        practiceForm.insertEmail(email);
        practiceForm.selectGender(gender);
        practiceForm.insertMobileNumber(mobilePhone);
        practiceForm.select1Hobbie(hobbiesReading);
        practiceForm.insertCurrentAddress(address);

        Assert.assertTrue(practiceForm.inputFirstName.isDisplayed());
        Assert.assertTrue(practiceForm.inputLastName.isDisplayed());
        Assert.assertTrue(practiceForm.inputEmail.isDisplayed());
        Assert.assertTrue(practiceForm.selectFemale.isEnabled());
        Assert.assertTrue(practiceForm.inputMobileNumber.isDisplayed());
        Assert.assertTrue(practiceForm.readingWeb.isEnabled());
        Assert.assertTrue(practiceForm.inputCurrentAddress.isDisplayed());

    }

}
