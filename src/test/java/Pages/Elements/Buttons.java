package Pages.Elements;

import Base.ToolsQA_Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buttons extends ToolsQA_Base {

    public Buttons() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickButton;

    @FindBy(id = "rightClickBtn")
    public WebElement rightClickButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button")
    public WebElement clickMeButton;

    @FindBy(id = "doubleClickMessage")
    public WebElement doubleClickOutputMessage;

    @FindBy(id = "rightClickMessage")
    public WebElement rightClickOutputMessage;

    @FindBy(id = "dynamicClickMessage")
    public WebElement clickMeOutputMessage;

    //----------------------------------------

    public void clickOnDoubleClickMe(){
        actions.doubleClick(doubleClickButton).perform();
    }

    public void clickOnRightClickMe(){

        actions.contextClick(rightClickButton).perform();
    }

    public void  clickOnClickMe(){
        clickMeButton.click();
    }

    public String getDoubleClickMeMessage() {
        clickOnDoubleClickMe();
        return doubleClickOutputMessage.getText();
    }

    public String getRightClickMeMessage() {
        clickOnRightClickMe();
        return rightClickOutputMessage.getText();
    }
    public String getClickMeMessage() {
        clickOnClickMe();
        return clickMeOutputMessage.getText();
    }


}
