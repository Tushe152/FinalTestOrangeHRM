package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
     public SelenideElement adminBtn = $(By.id("menu_admin_viewAdminModule"));
    public SelenideElement pimBtn = $(By.id("menu_pim_viewPimModule"));
    public SelenideElement leaveBtn = $(By.id("menu_leave_viewLeaveModule"));
    public SelenideElement recruitmentBtn = $(By.id("menu_recruitment_viewRecruitmentModule"));
    public SelenideElement DashboardBtn = $(By.id("menu_dashboard_index"));
    public SelenideElement logOutBtn = $("a[href*=\"/index.php/auth/logout\"]");
    public SelenideElement welcome = $(By.id("welcome"));
    public SelenideElement loginForm = $(By.id("frmLogin"));
    //SelenideElement mainMenuBtn = $(By.id(""));

    public void logout(){
        welcome.click();
        logOutBtn.click();
    }


}
