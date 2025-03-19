package Page_Code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Facebook_Channel {
	WebDriver driver;

	@FindBy(xpath = "//div[@class='tbs']//p[contains(text(),'FB Messenger')]")
	WebElement fb;

	@FindBy(xpath = "/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[1]/div[2]/form/div[2]/div[2]/div[2]/div[3]/div[2]")
	WebElement Survey_Prompt;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement Survey_Link_Label;

	@FindBy(xpath = "//input[@placeholder='minutes']")
	WebElement timerfb;

	public Facebook_Channel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void channelFacebook(String surveyPrompt, String SurveyLinkLabel, String fbTimer) {
		fb.click();

		Survey_Prompt.sendKeys(surveyPrompt);
		Survey_Link_Label.sendKeys(SurveyLinkLabel);
		timerfb.clear();
		timerfb.sendKeys(fbTimer);
		
	}

	@Test
	public void testFacebookChannel() {
		// Verify the elements are displayed before interacting
		Assert.assertTrue(fb.isDisplayed(), "Facebook button is not visible");
		Assert.assertTrue(Survey_Prompt.isDisplayed(), "Survey prompt field is not visible");
		Assert.assertTrue(Survey_Link_Label.isDisplayed(), "Survey link label field is not visible");
		Assert.assertTrue(timerfb.isDisplayed(), "Timer field is not visible");

	}
}
