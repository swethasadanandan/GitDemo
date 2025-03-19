package Page_Code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SurveyForm {

    WebDriver driver;

    // Locators using @FindBy annotations
    @FindBy(xpath = "//p[normalize-space()='Survey Form']")
     WebElement surveyFormOption;
    
    @FindBy(xpath = "//input[@placeholder='Title']")
     WebElement SurveyTitle;
    
    @FindBy(xpath = "//textarea[@type='text']")
     WebElement SurveyPageDescription;

    @FindBy(xpath = "(//div[@class='note-editable' and @contenteditable='true'])[1]")
     WebElement greetingPrompt;

    @FindBy(xpath = "(//div[@class='note-editable' and @contenteditable='true'])[2]")
     WebElement closingPrompt;

    @FindBy(xpath = "(//div[@class='note-editable' and @contenteditable='true'])[3]")
     WebElement defaultPrompt;

    @FindBy(xpath = "(//div[@class='note-editable' and @contenteditable='true'])[4]")
     WebElement feedbackPrompt;

    // Constructor to initialize PageFactory elements
    public SurveyForm(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSurveyFormOption() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(surveyFormOption)).click();
    }

    public void surveyTitleandDescription(String Title, String Description) {
        
    	SurveyTitle.sendKeys(Title);
    	SurveyPageDescription.sendKeys(Description);
    }
    
    public void enterGreetingPrompt(String greetingText) {
       
        greetingPrompt.sendKeys(greetingText);
    }

    public void enterClosingPrompt(String closingText) {
        
        closingPrompt.sendKeys(closingText);
    }

    // Dedicated method for sending keys to Default Prompt
    public void enterDefaultPrompt(String defaultText) {
       
        defaultPrompt.sendKeys(defaultText);
    }

    public void enterFeedbackPrompt(String feedbackText) {
        
        feedbackPrompt.sendKeys(feedbackText);
    }

    public void setupSurveyForm(String title,String description,String greeting, String closing, String defaultMsg, String feedback) {
        clickSurveyFormOption();
        surveyTitleandDescription(title,description);
        enterGreetingPrompt(greeting);
        enterClosingPrompt(closing);
        enterDefaultPrompt(defaultMsg);
        enterFeedbackPrompt(feedback);
    }


}
