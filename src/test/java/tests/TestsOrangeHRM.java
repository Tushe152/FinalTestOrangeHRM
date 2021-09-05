package tests;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import pages.*;
import pages.AdminUsersPage;
import utils.Log;
import java.io.IOException;

import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Condition.visible;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("General tests OrangeHRM")
public class TestsOrangeHRM extends Configuration{
    @Test
    @Order(1)
    public void loginTest() throws IOException {
        Log.info("--Logging In--");
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login();
        loginPage.welcome.shouldBe(visible);
    }
    @Test
    @Order(2)
    public void addUserTest() throws IOException {
        Log.info("--adding new user test--");
        LoginPage loginPage = new LoginPage();
        MainPage main = new MainPage();
        AdminUsersPage adminUser = new AdminUsersPage();
        loginPage.openLoginPage();
        loginPage.login();
        main.adminBtn.click();
        adminUser.addNewUser();
        //adminUser.resultTable.shouldBe(visible);


    }
    @Test
    @Order(3)
    public void addJobTitleTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = new MainPage();
        JobTitles jobTitles = new JobTitles();
        loginPage.openLoginPage();
        loginPage.login();
        mainPage.adminBtn.click();
        jobTitles.addFirstJobTitle();
    }
    @Test
    @Order(4)
    public void addSecondJobTitleTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = new MainPage();
        JobTitles jobTitles = new JobTitles();
        loginPage.openLoginPage();
        loginPage.login();
        mainPage.adminBtn.click();
        jobTitles.addSecondJobTitle();
    }
    @Test
    @Order(5)
    public void addThirdJobTitleTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = new MainPage();
        JobTitles jobTitles = new JobTitles();
        loginPage.openLoginPage();
        loginPage.login();
        mainPage.adminBtn.click();
        jobTitles.addThirdJobTitle();
    }
    @Test
    @Order(6)
    public void deleteJobTitleTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = new MainPage();
        JobTitles jobTitles = new JobTitles();
        loginPage.openLoginPage();
        loginPage.login();
        mainPage.adminBtn.click();
//        jobTitles.deleteJobTitle();
        ElementsCollection jtCollection = jobTitles.tableBody.$$("tr");
        int SizeBefore = jtCollection.size();
        jtCollection.first().$(By.name("chkSelectRow[]")).click();
    }
    @Test
    @Order(7)
    public void deleteSecondJobTitleTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = new MainPage();
        JobTitles jobTitles = new JobTitles();
        loginPage.openLoginPage();
        loginPage.login();
        mainPage.adminBtn.click();
//        jobTitles.deleteJobTitle();
        ElementsCollection jtCollection = jobTitles.tableBody.$$("tr");
        int SizeBefore = jtCollection.size();
        jtCollection.first().$(By.name("chkSelectRow[]")).click();
    }
    @Test
    @Order(8)
    public void deleteLastTitleTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = new MainPage();
        JobTitles jobTitles = new JobTitles();
        loginPage.openLoginPage();
        loginPage.login();
        mainPage.adminBtn.click();
//        jobTitles.deleteJobTitle();
        ElementsCollection jtCollection = jobTitles.tableBody.$$("tr");
        int SizeBefore = jtCollection.size();
        jtCollection.first().$(By.name("chkSelectRow[]")).click();
    }
    @Test
    @Order(9)
    public void addCandidateTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = new MainPage();
        RecruitmentPage recruitmentPage = new RecruitmentPage();
        loginPage.openLoginPage();
        loginPage.login();
        mainPage.recruitmentBtn.click();
        Log.info("--adding candidate--");
        recruitmentPage.addCandidate();
    }
    @Test
    @Order(10)
    public void assignLeaveTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = new MainPage();
        LeaveAssignPage leaveAssignPage = new LeaveAssignPage();
        loginPage.openLoginPage();
        loginPage.login();
        mainPage.leaveBtn.click();
        Log.info("--checking the form--");
        leaveAssignPage.leaveAssign();
    }
    @Test
    @Order(11)
    public void dashboardTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = new MainPage();
        DashboardPage dashboard = new DashboardPage();
        loginPage.openLoginPage();
        loginPage.login();
        mainPage.DashboardBtn.click();
        Log.info("--checking elements of DASHBOARD--");
        dashboard.checkElementsOnPage();
    }
    @Test
    @Order(12)
    public void PIMTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = new MainPage();
        PIMPage pimPage = new PIMPage();
        loginPage.openLoginPage();
        loginPage.login();
        mainPage.pimBtn.click();
        pimPage.checkSalesOptionForm();
    }
    @Test
    @Order(13)
    public void logoutTest() throws IOException {
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = new MainPage();
        loginPage.openLoginPage();
        loginPage.login();
        loginPage.welcome.shouldBe(visible);
        Log.info("--Logging out--");
        mainPage.logout();
        mainPage.loginForm.shouldBe(visible);
    }

}

