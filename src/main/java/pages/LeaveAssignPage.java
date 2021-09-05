package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LeaveAssignPage extends MainPage{
    SelenideElement assignLeaveBtn = $(By.id("menu_leave_assignLeave"));
    public SelenideElement employeeNameField = $(By.id("assignleave_txtEmployee_empName"));
    public SelenideElement typeField = $(By.id("assignleave_txtLeaveType"));
    public SelenideElement assignLeaveDateFrom = $(By.id("assignleave_txtFromDate"));
    public SelenideElement assignLeaveDateTo = $(By.id("assignleave_txtToDate"));
    SelenideElement vacationOption =$(By.xpath("//*[@id=\"assignleave_txtLeaveType\"]/option[11]"));
    SelenideElement assignBtn = $(By.id("assignBtn"));

    public void leaveAssign(){
        assignLeaveBtn.click();
        employeeNameField.shouldBe(visible);
        typeField.shouldBe(visible);
        assignLeaveDateFrom.shouldBe(visible);
        assignLeaveDateTo.shouldBe(visible);
        employeeNameField.sendKeys("Max");
        typeField.click();
        vacationOption.click();
        assignLeaveDateFrom.sendKeys("2021-09-10");
        assignLeaveDateTo.sendKeys("2021-09-11");
        assignBtn.click();
    }

}
