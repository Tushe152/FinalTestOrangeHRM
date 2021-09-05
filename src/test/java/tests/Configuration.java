package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import utils.Log;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Configuration {

    @BeforeEach
    public void setUp(TestInfo testInfo){
        Log.info("------- Started test: " + testInfo.getDisplayName() + " -------");
            com.codeborne.selenide.Configuration.startMaximized = true;
        }
    @AfterEach
    public void tearDown(TestInfo testInfo) {
        Log.info("------- Finished test: " + testInfo.getDisplayName() + " -------");
        closeWebDriver();

    }
}
