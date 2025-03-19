package Page_Code;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Email_Channel {
    WebDriver driver;

	@FindBy(xpath = "//div[@class='tbs']//p[contains(text(),'Email')]")
	WebElement emailSection;

	@FindBy(xpath = "/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[1]/div[2]/form/div[1]/app-selecter/div/div/input")
	WebElement emailTemplateInput;

	@FindBy(xpath = "//li[@id='0']")
	WebElement firstEmailTemplateOption;

	@FindBy(xpath = "//i[normalize-space()='radio_button_unchecked']")
	WebElement fromAddressRadio;

	@FindBy(xpath = "//div[@class='time-input']//input[@type='text']")
	WebElement emailTimerInput;

	@FindBy(xpath = "//p[normalize-space()='Add New']")
	WebElement addNew;

	@FindBy(xpath = "//input[@placeholder='Template Name']")
	WebElement templateName;

	@FindBy(xpath = "//input[@placeholder='Subject']")
	WebElement emailTemplateSubject;

	@FindBy(xpath = "/html/body/app-root/app-layout/div/app-survey-add/div[2]/div/app-email-template/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[3]/div[2]")
	WebElement mailBody;

	@FindBy(xpath = "//div[@class='note-hint-item active' and text()='SurveyLink']")
	WebElement surveyLinkOption;

	@FindBy(xpath = "/html/body/app-root/app-layout/div/app-survey-add/div[2]/div/app-email-template/div/div[1]/div/button[2]")
	WebElement save;

    public Email_Channel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public int randomnumber() {
        Random random = new Random();
        return random.nextInt(10000) + 1;  
    }
    
    public void surveyInvitationTemplate(String emailTemplateName, String emailSubject) {
        addNew.click();
        int randomNumber = randomnumber();
        templateName.sendKeys(emailTemplateName + randomNumber);
        emailTemplateSubject.sendKeys(emailSubject);
        mailBody.click();
        mailBody.sendKeys("Survey Link" + " "+ "@");
        surveyLinkOption.click();
        save.click();
    }
    
    
 
	public void email(String emailTemplateName, String emailSubject, String timerValue) {
		emailSection.click();
		emailTemplateInput.click();
		surveyInvitationTemplate(emailTemplateName, emailSubject);
		fromAddressRadio.click();
		emailTimerInput.clear();
		emailTimerInput.sendKeys(timerValue);
	}

    @Test
    public void testEmailChannel() {
        Assert.assertTrue(emailSection.isDisplayed(), "Email section is not visible");
        Assert.assertTrue(addNew.isDisplayed(), "Add New button is not visible");
        
    }
}
