package Pages.Elements;

import Base.ToolsQA_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TextBox extends ToolsQA_Base {

    public TextBox () {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "userName")
    public WebElement fullName;

    @FindBy (id = "userEmail")
    public WebElement userEmail;

    @FindBy (id = "currentAddress")
    public WebElement currentAddress;

    @FindBy (id = "permanentAddress")
    public WebElement permanentAddress;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy (id = "name")
    public WebElement fullNameText;

    @FindBy (id = "email")
    public WebElement emailText;

    @FindBy (className = "mb-1")
    public List<WebElement> addressText;

    @FindBy (xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/p")
    public WebElement permanentAddressText;

    //--------------------------

    public void inputFullName (String name) {
        fullName.clear();
        fullName.sendKeys(name);
    }

    public void inputEmail (String email) {
        userEmail.clear();
        userEmail.sendKeys(email);
    }

    public void inputCurrentAddress(String address1) {
        currentAddress.clear();
        currentAddress.sendKeys(address1);
    }

    public void inputPermanentAddress (String address2) {
        permanentAddress.clear();
        permanentAddress.sendKeys(address2);
    }

    public void selectSubmitButton() {
        submitButton.click();
    }

}
