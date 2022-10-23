package Pages.Elements;

import Base.ToolsQA_Base;
import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTables extends ToolsQA_Base {

    public WebTables() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = "span[title=Delete]")
    public WebElement DeleteRecord;

    @FindBy(className = "rt-td")
    public List<WebElement> CellInfo;

    @FindBy(className = "rt-tr-group")
    public List<WebElement> RowInfo;

    public @FindBy (id = "addNewRecordButton")
    WebElement AddButton;

    public @FindBy (id = "searchBox")
    WebElement SearchBox;

    public @FindBy(id = "firstName")
    WebElement FirstName;

    public @FindBy(id = "lastName")
    WebElement LastName;

    public @FindBy(id = "userEmail")
    WebElement Email;

    public @FindBy(id = "age")
    WebElement Age;

    public @FindBy(id = "salary")
    WebElement Salary;

    public @FindBy(id = "department")
    WebElement Department;

    public @FindBy(id = "submit")
    WebElement SubmitButton;

    //-------------------------

    public void clickOnDelete() {
        DeleteRecord.click();
    }

    public String cellText(int i) {
        return CellInfo.get(i).getText();
    }

    public String rowText(int i) {return RowInfo.get(i).getText();}

    public void clickOnAdd() {
        AddButton.click();
    }

    public void inputFirstName (String fname) {
        FirstName.clear();
        FirstName.sendKeys(fname);
    }

    public void inputLastName (String lname) {
        LastName.clear();
        LastName.sendKeys(lname);
    }

    public void inputEmail (String email) {
        Email.clear();
        Email.sendKeys(email);
    }

    public void inputAge (int age) {
        Age.clear();
        Age.sendKeys(String.valueOf(age));
    }

    public void inputSalary (int salary) {
        Salary.clear();
        Salary.sendKeys(String.valueOf(salary));
    }

    public void inputDepartment (String department) {
        Department.clear();
        Department.sendKeys(department);
    }

    public void clickOnSubmit() {
        SubmitButton.click();
    }

    public void inputSearch(String search) {
        SearchBox.clear();
        SearchBox.sendKeys(search);
    }


}
