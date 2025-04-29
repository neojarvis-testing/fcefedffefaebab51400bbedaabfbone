package stepdefinition;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utils.Base;
import utils.Reporter;

public class Hooks extends Base {
    static ExtentReports reports;
    static ExtentTest test;
    @BeforeAll
    public static void genrep(){
        reports=Reporter.generateExtentReport("Reliancetest");
    }
    @Before
    public void startBrowser(Scenario scenario){
        openBrowser();
        test=reports.createTest(scenario.getName());
    }
    @After
    public void quitBrowser(){
        driver.quit();
    }
    @AfterAll
    public static void flushRep(){
        reports.flush();
    }
}
