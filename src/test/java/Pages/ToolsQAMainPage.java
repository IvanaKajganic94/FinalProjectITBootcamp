package Pages;

import Base.ToolsQA_Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ToolsQAMainPage extends ToolsQA_Base {

    public ToolsQAMainPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy (css = ".card.mt-4.top-card")
    public List<WebElement> cards;

    //---------------------------------

    public void clickOnElements() {
        for (int i = 0; i < cards.size(); i++){
            if(cards.get(i).getText().equals("Elements")) {
                cards.get(i).click();
                break;
            }
        }
    }
    public void clickOnForms() {
        for (int i = 0; i < cards.size(); i++){
            if(cards.get(i).getText().equals("Forms")) {
                cards.get(i).click();
                break;
            }
        }
    }
}

