package Page_Code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Instagram_Channel {
    
    WebDriver driver;

    @FindBy(xpath = "//p[normalize-space()='Instagram']")
    WebElement insta;

    @FindBy(xpath = "/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[1]/div[2]/form/div[2]/div[2]/div[2]/div[3]/div[2]")
    WebElement Survey_Prompt;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    WebElement Survey_Link_Label;

    @FindBy(xpath = "//input[@placeholder='minutes']")
    WebElement timerinsta;

    // Constructor to initialize WebDriver and PageFactory elements
    public Instagram_Channel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to interact with Instagram elements
    public void instagram(String surveyPrompt, String surveyLinkLabel, String instaTimer) {
        insta.click();
        Survey_Prompt.sendKeys(surveyPrompt);
        Survey_Link_Label.sendKeys(surveyLinkLabel);
        timerinsta.clear();
        timerinsta.sendKeys(instaTimer);
    }

    @Test
    public void testInstagramChannel() {
        // Assert that elements are displayed before interacting with them
        Assert.assertTrue(insta.isDisplayed(), "Instagram button is not visible");
        Assert.assertTrue(Survey_Prompt.isDisplayed(), "Survey prompt field is not visible");
        Assert.assertTrue(Survey_Link_Label.isDisplayed(), "Survey link label field is not visible");
        Assert.assertTrue(timerinsta.isDisplayed(), "Timer field is not visible");

       
    }
}
