package Page_Code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WebMessaging_Channel {

    WebDriver driver;

    @FindBy(xpath = "//div[@class='tbs']//p[contains(text(),'Web Messaging')]")
     WebElement webMessagingOption;

    @FindBy(xpath = "/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[1]/div[2]/form/div[2]/div/app-input/input")
    WebElement webMessagingInputField;

    // Constructor to initialize the WebDriver and PageFactory
    public WebMessaging_Channel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // Initialize elements using PageFactory
    }

    
    public void WebMessaging(String SurveyLinkLabel) {

      webMessagingOption.click();
      webMessagingInputField.sendKeys(SurveyLinkLabel);
    }
}
