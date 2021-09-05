package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RecruitmentPage extends MainPage{
    SelenideElement addCandidateBtn = $(By.id("btnAdd"));
    SelenideElement firstNameField = $(By.id("addCandidate_firstName"));
    SelenideElement lastNameField = $(By.id("addCandidate_lastName"));
    SelenideElement emailField = $(By.id("addCandidate_email"));
    SelenideElement saveBtn = $(By.id("btnSave"));

    public void addCandidate(){
        addCandidateBtn.click();
        firstNameField.sendKeys("Max");
        lastNameField.sendKeys("Max");
        emailField.sendKeys("testmail@gmail.com");
        saveBtn.click();
    }




}
