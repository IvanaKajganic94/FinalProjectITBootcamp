package Tests;

import Base.ToolsQA_Base;
import Pages.Elements.TextBox;
import Pages.ToolsQAMainPage;
import Pages.ToolsQASidebarPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTest extends ToolsQA_Base {

    ToolsQAMainPage toolsQAMainPage;
    ToolsQASidebarPage toolsQASidebarPage;
    TextBox textBox;

    @BeforeMethod
    public void pageSetUp() {
        toolsQAMainPage = new ToolsQAMainPage();
        toolsQASidebarPage = new ToolsQASidebarPage();
        textBox = new TextBox();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }

    @AfterMethod
    public void pageCleanup() {
        driver.manage().deleteAllCookies();
    }

    public void goToElemnets() {
        toolsQAMainPage.clickOnElements();
    }

    public void goToTextBox() {
        toolsQASidebarPage.clickOnTextBox();
    }

    String name = "Ivana Kajganic";
    String email = "mail@mail.com";
    String currentAddress = "Current Address 1";
    String permanentAddress = "Permanent Address 1";

    @Test (priority = 10)
    public void goToElemnetsPage() {
        toolsQAMainPage.clickOnElements();
    }

    @Test (priority = 20)
    public void goToTextBoxPage() {
        goToElemnets();
        toolsQASidebarPage.clickOnTextBox();
    }

    @Test (priority = 30)
    public void inputFullNameAndChachText() {
        goToElemnets();
        goToTextBoxPage();
        textBox.inputFullName(name);
        textBox.selectSubmitButton();
        Assert.assertTrue(textBox.fullNameText.isDisplayed());
    }

    @Test (priority = 40)
    public void inputEmalAndChachText() {
        goToElemnets();
        goToTextBoxPage();
        textBox.inputEmail(email);
        textBox.selectSubmitButton();
        Assert.assertTrue(textBox.emailText.isDisplayed());
    }

    @Test (priority = 50)
    public void inputCurrentAddressAndChachText() {
        goToElemnets();
        goToTextBoxPage();
        textBox.inputCurrentAddress(currentAddress);
        textBox.selectSubmitButton();
        Assert.assertTrue(textBox.addressText.get(0).isDisplayed());
    }

    @Test (priority = 60)
    public void inputPermanentAddressAndChachText() {
        goToElemnets();
        goToTextBoxPage();
        textBox.inputPermanentAddress(permanentAddress);
        textBox.selectSubmitButton();
        Assert.assertTrue(textBox.permanentAddressText.isDisplayed());
    }

    @Test (priority = 70)
    public void inputAllFieldsAndChechTexts() {
        goToElemnets();
        goToTextBoxPage();
        textBox.inputFullName(name);
        textBox.inputEmail(email);
        textBox.inputCurrentAddress(currentAddress);
        textBox.inputPermanentAddress(permanentAddress);
        textBox.selectSubmitButton();

        Assert.assertTrue(textBox.fullNameText.isDisplayed());
        Assert.assertTrue(textBox.emailText.isDisplayed());
        Assert.assertTrue(textBox.addressText.get(0).isDisplayed());
        Assert.assertTrue(textBox.permanentAddressText.isDisplayed());
    }
}
