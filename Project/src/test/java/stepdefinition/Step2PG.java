package stepdefinition;

import org.openqa.selenium.By;

import com.aventstack.extentreports.Status;

import io.cucumber.java.en.When;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class Step2PG {
    WebDriverHelper helper = new WebDriverHelper(Base.driver);

    @When("check the Rewards")
    public void check_the_rewards() throws InterruptedException {
        helper.clickOnElement(By.xpath("//div[@class='image navigation__group__icon']/following-sibling::span[text()='Rewards & Offers']"));
        helper.switchToNewWindow();

        Thread.sleep(3000);
        
        helper.pageTitle();

        helper.clickOnElement(By.xpath("(//a[.='Rebates'])[1]"));
        helper.javascriptScroll(By.xpath("//footer"));
        helper.clickOnElement(By.xpath("(//a[.='EXPLORE REWARDS'])[1]"));
        
        
    }

}
