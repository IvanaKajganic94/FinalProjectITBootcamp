package Tests;

import Base.ToolsQA_Base;
import Pages.Elements.CheckBox;
import Pages.ToolsQAMainPage;
import Pages.ToolsQASidebarPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxTest extends ToolsQA_Base {
    ToolsQAMainPage toolsQAMainPage;
    ToolsQASidebarPage toolsQASidebarPage;
    CheckBox checkBox;

    @BeforeMethod
    public void pageSetUp() {
        toolsQAMainPage = new ToolsQAMainPage();
        toolsQASidebarPage = new ToolsQASidebarPage();
        checkBox = new CheckBox();
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

    public void goToCheckBox() {
        toolsQASidebarPage.clickOnCheckBox();
    }

    public void clickOnHome() {
        checkBox.clickToOpenHomeCheckBox();
    }

    public void clickOnDeskTop() {
        checkBox.clicktoOpenDesktopCheckBox();
    }

    public void clickOnDocuments() {
        checkBox.clickToOpenDocumentsCheckBox();
    }

    public void clickOnWorkSpace() {
        checkBox.clickToOpenWorkSpaceCheckBox();
    }

    public void clickOnOffice() {
        checkBox.clickToOpenOfficeCheckBox();
    }

    public void clickOnDownloads() {
        checkBox.clickToOpenDownloadsCheckBox();
    }


    @Test(priority = 10)
    public void goToElemnetsPage() {
        toolsQAMainPage.clickOnElements();
    }

    @Test (priority = 20)
    public void goToCheckBoxPage() {
        goToElemnets();
        toolsQASidebarPage.clickOnCheckBox();
    }

    @Test(priority = 30)
    public void clickOnHomeCheckBoxToOpenManu() {
        goToElemnets();
        goToCheckBoxPage();
        checkBox.clickToOpenHomeCheckBox();
    }
    @Test(priority = 40)
    public void clickOnDesktopCheckBoxToOpenManu() {
        goToElemnets();
        goToCheckBoxPage();
        clickOnHome();
        checkBox.clicktoOpenDesktopCheckBox();

    }

    @Test(priority = 50)
    public void checkingOnDesktopCheckBox() {
        goToElemnets();
        goToCheckBoxPage();
        clickOnHome();
        checkBox.clicktoOpenDesktopCheckBox();
        checkBox.checkDesktopCheckBox();
        Assert.assertTrue(checkBox.result.isDisplayed());

    }

    @Test(priority = 60)
    public void clickOnDocumentsCheckBoxToOpenManu() {
        goToElemnets();
        goToCheckBoxPage();
        clickOnHome();
        checkBox.clickToOpenDocumentsCheckBox();
    }

    @Test(priority = 70)
    public void checkingOnDocumentsCheckBox() {
        goToElemnets();
        goToCheckBoxPage();
        clickOnHome();
        clickOnDeskTop();
        checkBox.checkDesktopCheckBox();
        Assert.assertTrue(checkBox.result.isDisplayed());

    }

    @Test(priority = 80)
    public void clickOnWorkSpaceCheckBoxToOpenManu() {
        goToElemnets();
        goToCheckBoxPage();
        clickOnHome();
        clickOnDocuments();
        checkBox.clickToOpenWorkSpaceCheckBox();
    }

    @Test(priority = 90)
    public void checkingOnWorkSpaceCheckBox() {
        goToElemnets();
        goToCheckBoxPage();
        clickOnHome();
        clickOnDeskTop();
        checkBox.checkWorkSpaceCheckBox();
        Assert.assertTrue(checkBox.result.isDisplayed());

    }

    @Test(priority = 100)
    public void clickOnOfficeCheckBoxToOpenManu() {
        goToElemnets();
        goToCheckBoxPage();
        clickOnHome();
        clickOnDocuments();
        checkBox.clickToOpenOfficeCheckBox();
    }

    @Test(priority = 110)
    public void checkingOnOfficeCheckBox() {
        goToElemnets();
        goToCheckBoxPage();
        clickOnHome();
        clickOnDeskTop();
        checkBox.checkOfficeCheckBox();
        Assert.assertTrue(checkBox.result.isDisplayed());

    }

    @Test(priority = 120)
    public void checkDesktopCheckBoxToSeeIfHomeAndAllDesktopCheckBoxesAreSelected() {
        goToElemnets();
        goToCheckBoxPage();
        clickOnHome();
        clickOnDeskTop();
        checkBox.checkDocumentsCheckBox();
        Assert.assertTrue(checkBox.result.isDisplayed());
    }

    @Test(priority = 130)
    public void clickOnDownloadCheckBoxToOpenManu() {
        goToElemnets();
        goToCheckBoxPage();
        clickOnHome();
        checkBox.clickToOpenDownloadsCheckBox();
    }

    @Test(priority = 140)
    public void checkingOnDownloadCheckBoxToSelect() {
        goToElemnets();
        goToCheckBoxPage();
        clickOnHome();
        checkBox.checkDownloadsCheckBox();
        Assert.assertTrue(checkBox.result.isDisplayed());
    }

    @Test (priority = 150)
    public void chekingAllCheckBoxes() {
        goToElemnets();
        goToCheckBoxPage();
        clickOnHome();
        clickOnDeskTop();
        clickOnDocuments();
        clickOnWorkSpace();
        clickOnOffice();
        clickOnDownloads();
        checkBox.checkHomeCheckBox();
        Assert.assertTrue(checkBox.result.isDisplayed());

    }





}
