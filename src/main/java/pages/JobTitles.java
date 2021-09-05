package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class JobTitles extends MainPage{
    public String JobTitle1="AA Tester";
    public String JobTitle2="AAa Tester";
    public String JobTitle3="AAv Tester";

    SelenideElement adminJobBtn = $(By.id("menu_admin_Job"));
    SelenideElement jobTitle = $(By.id("menu_admin_viewJobTitleList"));
    SelenideElement addJobTitleBtn = $(By.id("btnAdd"));
    SelenideElement addJobTitleField = $(By.id("jobTitle_jobTitle"));
    SelenideElement addJobTitleDescriptionField = $(By.id("jobTitle_jobDescription"));
    SelenideElement addJobTitleFile = $(By.id("jobTitle_jobSpec"));
    SelenideElement addJobTitleNote = $(By.id("jobTitle_note"));
    SelenideElement saveBtn = $(By.id("btnSave"));
    SelenideElement deleteBtn = $(By.id("btnDelete"));
    public SelenideElement elementForDelete = $("input[type='checkbox', value='1']");
    public SelenideElement tableBody = $("tbody");

    public void addFirstJobTitle() {
        adminJobBtn.click();
        jobTitle.click();
        addJobTitleBtn.click();
        addJobTitleField.sendKeys(JobTitle1);
        addJobTitleDescriptionField.sendKeys("Test descr");
        addJobTitleFile.uploadFile(new File("src/main/resources/testFile.txt"));
        addJobTitleNote.sendKeys("Some note");
        saveBtn.click();
    }
    public void addSecondJobTitle() {
        adminJobBtn.click();
        jobTitle.click();
        addJobTitleBtn.click();
        addJobTitleField.sendKeys(JobTitle2);
        addJobTitleDescriptionField.sendKeys("Test descr");
        addJobTitleFile.uploadFile(new File("src/main/resources/testFile.txt"));
        addJobTitleNote.sendKeys("Some note");
        saveBtn.click();
    }
    public void addThirdJobTitle() {
        adminJobBtn.click();
        jobTitle.click();
        addJobTitleBtn.click();
        addJobTitleField.sendKeys(JobTitle3);
        addJobTitleDescriptionField.sendKeys("Test descr");
        addJobTitleFile.uploadFile(new File("src/main/resources/testFile.txt"));
        addJobTitleNote.sendKeys("Some note");
        saveBtn.click();
    }
    public void deleteJobTitle(){
        adminJobBtn.click();
        jobTitle.click();
        elementForDelete.click();
        deleteBtn.click();


    }



}
