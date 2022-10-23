package Tests;

import Base.ToolsQA_Base;
import Pages.Elements.Buttons;
import Pages.ToolsQAMainPage;
import Pages.ToolsQASidebarPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTest extends ToolsQA_Base {

    ToolsQAMainPage toolsQAMainPage;
    ToolsQASidebarPage toolsQASidebarPage;
    Buttons buttons;

    @BeforeMethod
    public void pageSetUp() {
        toolsQAMainPage = new ToolsQAMainPage();
        toolsQASidebarPage = new ToolsQASidebarPage();
        buttons = new Buttons();
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

    public void goToButtons() {
        toolsQASidebarPage.clickOnButtons();
    }

    @Test(priority = 10)
    public void goToElemnetsPage() {
        toolsQAMainPage.clickOnElements();
    }

    @Test(priority = 20)
    public void goToButtonsPage() {
        goToElemnets();
        toolsQASidebarPage.clickOnButtons();
    }

    @Test (priority = 30)
    public void clickabillityOfDoubleClickMeButton() {
        goToElemnets();
        goToButtons();
        buttons.clickOnDoubleClickMe();
        buttons.getDoubleClickMeMessage();
        Assert.assertTrue(buttons.doubleClickOutputMessage.isDisplayed());
    }

    @Test (priority = 40)
    public void clickabillityOfRightClickMeButton() {
        goToElemnets();
        goToButtons();
        buttons.clickOnRightClickMe();
        buttons.getRightClickMeMessage();
        Assert.assertTrue(buttons.rightClickOutputMessage.isDisplayed());
    }

    @Test(priority = 50)
    public void clickabillityOfClickMeButton() {
        goToElemnets();
        goToButtons();
        buttons.clickOnClickMe();
        buttons.waitForElementVisibility(buttons.clickMeOutputMessage);
        buttons.getClickMeMessage();
        Assert.assertTrue(buttons.clickMeOutputMessage.isDisplayed());
    }



}
