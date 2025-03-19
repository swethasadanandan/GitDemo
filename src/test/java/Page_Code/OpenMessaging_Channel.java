package Page_Code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenMessaging_Channel {

    WebDriver driver;

    @FindBy(xpath = "//p[normalize-space()='Open Messaging']")
    WebElement op;

    @FindBy(xpath = "/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[1]/div[2]/form/div[1]/app-input/input")
    WebElement OP_Survey_Link_Label;

    @FindBy(xpath = "//input[@placeholder='minutes']")
    WebElement openTimer;

    // Constructor to initialize WebDriver and elements
    public OpenMessaging_Channel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to interact with Open Messaging elements
    public void openMessaging(String SurveyLinkLabel, String opTimer) {
        op.click();
        OP_Survey_Link_Label.sendKeys(SurveyLinkLabel);
        openTimer.clear();
        openTimer.sendKeys(opTimer);
    }

    @Test
    public void testOpenMessagingChannel() {
        // Assert that elements are displayed before interacting with them
        Assert.assertTrue(op.isDisplayed(), "Open Messaging button is not visible");
        Assert.assertTrue(OP_Survey_Link_Label.isDisplayed(), "Survey link label field is not visible");
        Assert.assertTrue(openTimer.isDisplayed(), "Timer field is not visible");
    }
}
