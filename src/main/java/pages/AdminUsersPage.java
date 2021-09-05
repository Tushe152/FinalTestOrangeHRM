package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AdminUsersPage extends MainPage{
    public String password = "Testpass1234";
    SelenideElement addNewUserBtn = $(By.id("btnAdd"));
    SelenideElement roleUserfield = $(By.id("systemUser_userType"));
    SelenideElement employeeNameField = $(By.id("systemUser_employeeName_empName"));
    SelenideElement usernameField = $(By.id("systemUser_userName"));
    SelenideElement statusField = $(By.id("systemUser_status"));
    SelenideElement passwordField = $(By.id("systemUser_password"));
    SelenideElement confirmPasswordField = $(By.id("systemUser_confirmPassword"));
    SelenideElement saveBtn = $(By.id("btnSave"));
    public SelenideElement resultTable = $(By.id("resultTable"));


    public void addNewUser() {
        addNewUserBtn.click();
        employeeNameField.sendKeys("Odis Adalwin");
        usernameField.sendKeys("TestUsername");
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(password);
        saveBtn.click();
    }

}
