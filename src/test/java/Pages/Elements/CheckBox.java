package Pages.Elements;

import Base.ToolsQA_Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckBox extends ToolsQA_Base {

    public CheckBox () {
        PageFactory.initElements(driver,this);
    }

    // List should contain { Home, Desktop, Documents, WorkSpace, Office, Downloads }
    @FindBy(xpath = "//button[@aria-label='Toggle']")
    public List<WebElement> checkBoxFolders;

    // List should contain all checkboxes
    @FindBy(className = "rct-checkbox")
    public List<WebElement> checkBoxes;

    // List of output text of checked
    @FindBy(xpath = "//div[@id='result']/span")
    public List<WebElement> checkedTextResult;

    @FindBy(id = "result")
    public WebElement result;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li[3]/span/button")
    WebElement download;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li[3]/span/label/span[3]")
    WebElement checkDownload;

    //------------------

    public void clickToOpenHomeCheckBox() {
        checkBoxFolders.get(0).click();

    }

    public void clicktoOpenDesktopCheckBox() {
        checkBoxFolders.get(1).click();
    }

    public void clickToOpenDocumentsCheckBox() {
        checkBoxFolders.get(2).click();
    }

    public void clickToOpenWorkSpaceCheckBox() {
        checkBoxFolders.get(3).click();
    }

    public void clickToOpenOfficeCheckBox() {
        checkBoxFolders.get(4).click();
    }

    public void clickToOpenDownloadsCheckBox() {
        download.click();
    }

    public void checkHomeCheckBox() {
        checkBoxes.get(0).click();
    }
    public void checkDesktopCheckBox() {
        checkBoxes.get(1).click();
    }

    public void checkDocumentsCheckBox() {
        checkBoxes.get(2).click();
    }
    public void checkWorkSpaceCheckBox() {
        checkBoxes.get(3).click();
    }
    public void checkOfficeCheckBox() {
        checkBoxes.get(4).click();
    }
    public void checkDownloadsCheckBox() {
        checkDownload.click();
    }

    public void resultMessage() {
        result.getText();
    }




}
