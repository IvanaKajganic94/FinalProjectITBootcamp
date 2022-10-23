package Pages;

import Base.ToolsQA_Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ToolsQASidebarPage extends ToolsQA_Base {

    public ToolsQASidebarPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".btn.btn-light")
    public List<WebElement> sidebarButtons;

    //----------------------------

    public void clickOnTextBox() {
        for (int i = 0; i < sidebarButtons.size(); i++) {
            if ( sidebarButtons.get(i).getText().equals("Text Box")) {
                sidebarButtons.get(i).click();
                break;
            }
        }
    }

    public void clickOnCheckBox() {
        for (int i = 0; i < sidebarButtons.size(); i++) {
            if ( sidebarButtons.get(i).getText().equals("Check Box")) {
                sidebarButtons.get(i).click();
                break;
            }
        }
    }

    public void clickOnRadioButton() {
        for (int i = 0; i < sidebarButtons.size(); i++) {
            if ( sidebarButtons.get(i).getText().equals("Radio Button")) {
                sidebarButtons.get(i).click();
                break;
            }
        }
    }

    public void clickOnWebTables() {
        for (int i = 0; i < sidebarButtons.size(); i++) {
            if ( sidebarButtons.get(i).getText().equals("Web Tables")) {
                sidebarButtons.get(i).click();
                break;
            }
        }
    }

    public void clickOnButtons() {
        for (int i = 0; i < sidebarButtons.size(); i++) {
            if ( sidebarButtons.get(i).getText().equals("Buttons")) {
                sidebarButtons.get(i).click();
                break;
            }
        }
    }

    public void clickOnPracticeForm() {
        for (int i = 0; i < sidebarButtons.size(); i++) {
            if ( sidebarButtons.get(i).getText().equals("Practice Form")) {
                sidebarButtons.get(i).click();
                break;
            }
        }
    }


}
