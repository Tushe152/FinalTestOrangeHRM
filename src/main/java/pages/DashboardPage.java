package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPage extends MainPage{
    SelenideElement elementLegend =$(By.id("panel_resizable_1_1"));
    SelenideElement diagramElement =$(By.id("panel_resizable_1_0"));
    SelenideElement requestElement =$(By.id("panel_resizable_1_2"));
    SelenideElement panelElement =$(By.id("panel_resizable_0_0"));

    public void checkElementsOnPage(){
        elementLegend.shouldBe(visible);
        diagramElement.shouldBe(visible);
        requestElement.shouldBe(visible);
        panelElement.shouldBe(visible);
    }
}
