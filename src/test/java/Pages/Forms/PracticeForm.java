package Pages.Forms;

import Base.ToolsQA_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PracticeForm extends ToolsQA_Base {

    public PracticeForm() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstName")
    public WebElement inputFirstName;

    @FindBy (id = "lastName")
    public WebElement inputLastName;

    @FindBy (id = "userEmail")
    public WebElement inputEmail;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/div[1]/label[1]")
    public WebElement selectMale;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/div[2]/label[1]")
    public WebElement selectFemale;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/div[2]/div[3]/label[1]")
    public WebElement selectOther;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[1]")
    public WebElement sportsWeb;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[2]")
    public WebElement readingWeb;

    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[3]")
    public WebElement musicWeb;

    @FindBy (css = ".custom-control.custom-radio.custom-control-inline")
    public List<WebElement> radioButtonGender;

    @FindBy (id = "userNumber")
    public WebElement inputMobileNumber;  //required 10 digits

    @FindBy (id = "currentAddress")
    public WebElement inputCurrentAddress;


    //-----------------------------------------------

    public void insertFirstName(String firstName) {
        inputFirstName.clear();
        inputFirstName.sendKeys(firstName);
    }

    public void insertLastName (String lastName) {
        inputLastName.clear();
        inputLastName.sendKeys(lastName);
    }

    public void insertEmail (String email) {
        inputEmail.clear();
        inputEmail.sendKeys(email);
    }

    public void selectGender (String gender) {

        if (gender.toLowerCase().equals(("male").toLowerCase())) {
            selectMale.click();
        }
        if (gender.toLowerCase().equals(("female").toLowerCase())) {
            selectFemale.click();
        }
        if (gender.toLowerCase().equals(("other").toLowerCase())){
            selectOther.click();
        }
    }

    public void insertMobileNumber(int mobileNumber) {
        inputMobileNumber.clear();
        inputMobileNumber.sendKeys(String.valueOf(mobileNumber));
    }


    public void select1Hobbie(String hobbies) {

           if (hobbies.toLowerCase().equals(("sports").toLowerCase())) {
            sportsWeb.click();
        }
        if (hobbies.toLowerCase().equals(("reading").toLowerCase())) {
            readingWeb.click();
        }
        if (hobbies.toLowerCase().equals(("music").toLowerCase())) {
            musicWeb.click();
        }
    }
    public void select2Hobbies(String hobbies, String hobbies2) {

        WebElement sportsWeb = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[1]"));
        WebElement readingWeb = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[2]"));
        WebElement musicWeb = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[3]"));
        if (hobbies.toLowerCase().equals(("sports").toLowerCase())) {
            sportsWeb.click();
        }
        else if (hobbies.toLowerCase().equals(("reading").toLowerCase())) {
            readingWeb.click();
        }
        else if (hobbies.toLowerCase().equals(("music").toLowerCase())) {
            musicWeb.click();
        }
    }
    public void select3Hobbies(String hobbies, String hobbies2, String hobbies3) {

        WebElement sportsWeb = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[1]"));
        WebElement readingWeb = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[2]"));
        WebElement musicWeb = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[7]/div[2]/div[3]"));
        if (hobbies.toLowerCase().equals(("sports").toLowerCase())) {
            sportsWeb.click();
        }
        else if (hobbies.toLowerCase().equals(("reading").toLowerCase())) {
            readingWeb.click();
        }
        else if (hobbies.toLowerCase().equals(("music").toLowerCase())) {
            musicWeb.click();
        }
    }


    public void insertCurrentAddress(String currentAddress) {
        inputCurrentAddress.clear();
        inputCurrentAddress.sendKeys(currentAddress);
    }


}
