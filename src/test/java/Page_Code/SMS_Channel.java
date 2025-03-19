package Page_Code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SMS_Channel {

	   WebDriver driver;

	    // Find SMS element and other fields using XPath
	    @FindBy(xpath = "//p[normalize-space()='SMS']")
	    WebElement smsElement;

	    @FindBy(xpath = "/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[1]/div[2]/form/div[1]/app-input/input")
	    WebElement smsInputField;

	    @FindBy(xpath = "//input[@placeholder='minutes']")
	    WebElement smsTimer;

	    public SMS_Channel(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void channelSMS(String surveyText, String timerValue) {

	        // Wait for the SMS element to be clickable and click it
	        smsElement.click();

	        // Wait for the SMS input field and send the survey text
	        smsInputField.sendKeys(surveyText);

	        // Wait for the SMS Timer input field, clear it, and send the timer value
	     smsTimer.clear();
	        smsTimer.sendKeys(timerValue);
	    }
}
