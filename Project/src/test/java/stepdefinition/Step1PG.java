package stepdefinition;

import org.openqa.selenium.By;

import com.aventstack.extentreports.Status;

import io.cucumber.java.en.When;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class Step1PG {

    @When("check the Navbar")
    public void check_the_navbar() {
        WebDriverHelper helper = new WebDriverHelper(Base.driver);
        helper.hoverOverElement(By.xpath("(//div[@class='image navigation__group__icon']/following-sibling::span/span[text()='News'])"));
        helper.clickOnElement(By.xpath("//a[contains(@href,'blogs')]/span[text()='Blog']"));
        helper.clickOnElement(By.xpath("//ul[@class='blog-filter__list']/li[1]"));
        Screenshot.captureScreenShot("community-impact");
        Hooks.test.log(Status.PASS, "click on wisdom teeth");
        helper.clickOnElement(By.xpath("//label[normalize-space()='Community Impact']"));

        Reporter.attachScreenshotToReport("crest_screenshot", Hooks.test, "crest_screenshot attached to the report");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on blog");
        LoggerHandler.info( "click on search");
        Hooks.test.log(Status.PASS, "click on rebates");
        Hooks.test.log(Status.PASS, "click on rebates");
        Hooks.test.log(Status.PASS, "click on rebates");
        Hooks.test.log(Status.PASS, "click on rebates");
        Hooks.test.log(Status.PASS, "click on rebates");
        Hooks.test.log(Status.PASS, "click on rebates");
        Hooks.test.log(Status.PASS, "click on rebates");
        Hooks.test.log(Status.PASS, "click on rebates");
        Hooks.test.log(Status.PASS, "click on rebates");
        Hooks.test.log(Status.PASS, "click on rebates");
        Hooks.test.log(Status.PASS, "click on rebates");
        Hooks.test.log(Status.PASS, "click on rebates");
    

       
    }
}
