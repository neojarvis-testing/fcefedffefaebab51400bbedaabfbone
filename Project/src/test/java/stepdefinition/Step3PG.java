package stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.When;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class Step3PG extends Base {


            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    WebDriverHelper helper=new WebDriverHelper(Base.driver);
     @When("check the search")
    public void check_the_search() throws InterruptedException {
        helper.clickOnElement(By.xpath("//label[@for='6ksJIHiOacMiUIGWiIs68M']"));
        helper.sendKeys(By.xpath("//input[@id='6ksJIHiOacMiUIGWiIs68M']"),"Careers");
        helper.enterAction(By.xpath("//input[@id='6ksJIHiOacMiUIGWiIs68M']"));
        Thread.sleep(3000); 

    //    driver.navigate().to("https://us.pg.com/search-results/?query=careers");
      
    //    WebElement IN= driver.findElement(By.xpath("//input[@id='34fKuk9yvY402ymiim8qiG']"));
    //    IN.sendKeys("Careers");
    //    IN.sendKeys(Keys.ENTER);
       Thread.sleep(3000);

        List<WebElement> footwear_list= wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='search-result search-result--card']/a/h2")));
        LoggerHandler.info("List of webElement");
        System.out.println(" "+footwear_list.size());
        for (int ctr = 0; ctr < footwear_list.size(); ctr++) {

            String currentXpath = "(//li[@class='search-result search-result--card']/a/h2)[" + (ctr + 1) + "]";
            
                        WebElement product=driver.findElement(By.xpath(currentXpath));
                        String ProductTitle=product.getText();
                        System.out.println("Product Title: "+ProductTitle);

                        if (ProductTitle.contains("Marketing")) {
                                            System.out.println("✅ Element " + (ctr + 1) + "Marketing");

                                            //  String priceXpath = currentXpath + "/following::div[1]]";
                                            // WebElement tvPrice=driver.findElement(By.xpath(priceXpath));
                                        //    System.out.println("Price: "+tvPrice.getText());
   // Scroll to footer using Actions
   Actions actions = new Actions(driver);
   actions.moveToElement(product).perform();
                                            // product.click();
                                            break;
                                        } else {
                                            System.out.println("❌ Element " + (ctr + 1) + " does not contain 'Marketing '");
                                        }
                                    }



        Screenshot.captureScreenShot("suggestions");
        // helper.waitForElementToBeVisible(By.xpath("(//h2)[1]"), 15);
        // helper.clickOnElement(By.xpath("(//h2)[1]"));
        // helper.waitForElementToBeVisible(By.xpath("//a[contains(@href,'consumers')]"),15);
        // helper.javascriptScroll(By.xpath("//a[contains(@href,'consumers')]"));
        // helper.clickOnElement(By.xpath("//a[contains(@href,'employees/')]"));
        Reporter.attachScreenshotToReport("Procter_Gamble", Hooks.test, "Employees screnshot has been attached to report");
        

    }
    
}
