package Page_Code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatsApp_Channel {

	 WebDriver driver;

	 @FindBy(xpath = "//p[normalize-space()='WhatsApp']")
	    WebElement whatsapp;
	 
	 @FindBy(xpath = "/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[1]/div[2]/form/div[2]/div[1]/app-input/input")
	    WebElement LinkSubstitution;
	 
	 @FindBy(xpath = "/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[1]/div[2]/form/div[2]/div[2]/app-input/input")
	    WebElement TemplateID;
	 
	 @FindBy(xpath = "//input[@placeholder='minutes']")
	    WebElement whatsappTimer;
	 
	 public WhatsApp_Channel(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

    public void whatsapp(String Substitution,String Id, String whatsAppTimer) {
    	whatsapp.click();
    	LinkSubstitution.sendKeys(Substitution);
	        TemplateID.sendKeys(Id);
	        whatsappTimer.clear();
	        whatsappTimer.sendKeys(whatsAppTimer);
    }
}
