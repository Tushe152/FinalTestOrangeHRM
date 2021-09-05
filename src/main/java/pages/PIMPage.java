package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.Log;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class PIMPage extends MainPage{
    SelenideElement subUnitSales = $(By.id("empsearch_sub_unit"));
    SelenideElement salesOption = $(By.xpath("//*[@id=\"empsearch_sub_unit\"]/option[8]"));
    SelenideElement searchBtn = $(By.id("searchBtn"));
    SelenideElement tBody = $("tbody");

    public void checkSalesOptionForm(){
        subUnitSales.click();
        salesOption.click();
        searchBtn.click();
        Log.info("--checking if table exists--");
        tBody.shouldBe(visible);

    }

}
