package Page_Code;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

public class Voice_Channel {
    
    WebDriver driver;

    // Page Elements with @FindBy
//    @FindBy(xpath = "//p[normalize-space()='TTS']")
//    private WebElement ttsButton;
//
//    @FindBy(xpath = "//input[@placeholder='Select an Engine']")
//    private WebElement ttsEngineDropdown;
//
    @FindBy(xpath = "//div[@class='tbs']//p[contains(text(),'Voice')]")
     WebElement voice;

    @FindBy(xpath = "//input[@placeholder='Select a voice']")
     WebElement voiceDropdown;

    @FindBy(xpath = "//div[@class='tbs']//p[contains(text(),'Voice')]")
     WebElement voiceTab;
    
    @FindBy(xpath = "//p[normalize-space()='Add New']")
     WebElement addNew;

    @FindBy(xpath = "//select[option[text()='Select Language']]")
    WebElement dropdown;
    
    @FindBy(xpath = "//div[@class='tts']//div[@role='textbox']")
    WebElement Text;
    

    @FindBy(xpath = "//li[contains(text(),'Some Category')]") // Adjust with correct value
    WebElement dropdownOption;
    
    @FindBy(xpath = "(//input[@placeholder='Select prompt'])[1]")
     WebElement greetingPrompt;
    
    @FindBy(xpath = "//input[@placeholder='Prompt Name']")
     WebElement PromptName;

    @FindBy(xpath = "(//input[@placeholder='Select prompt'])[2]")
     WebElement noEntryPrompt;

    @FindBy(xpath = "(//input[@placeholder='Select prompt'])[3]")
     WebElement invalidEntryPrompt;

    @FindBy(xpath = "(//input[@placeholder='Select prompt'])[4]")
     WebElement expiredEntryPrompt;

    @FindBy(xpath = "//span[@class='slider round']")
     WebElement voiceFeedbackToggle;

    @FindBy(xpath = "(//input[@placeholder='Select prompt'])[5]")
     WebElement voiceFeedbackPrompt;
    
    @FindBy(xpath = "//select[contains(@class, 'ng-pristine') and contains(@class, 'ng-invalid')]//option")
    List<WebElement> dropdownOptions;  // List to capture all the options in the dropdown

    @FindBy(xpath = "//button[normalize-space()='Add Prompt']")
    WebElement AddPrompt;  // List to capture all the options in the dropdown

    

    // Constructor to initialize elements
    public Voice_Channel(WebDriver driver) {
    	 this.driver = driver;
         PageFactory.initElements(driver, this);
    }

   
    public int randomnumber() {
        Random random = new Random();
        return random.nextInt(10000) + 1;  
        
    }
    
    public void greetingPrompt(String selectlanguage, String greetingTexttoSpeech) throws InterruptedException {

    	voice.click();
        int randomNumber = randomnumber();

        String uniqueGreetingPromptName = "Greeting_" + randomNumber;

        greetingPrompt.click();
        addNew.click();
        PromptName.sendKeys(uniqueGreetingPromptName);
        selectLanguage(selectlanguage);  
        Text.sendKeys(greetingTexttoSpeech);
        AddPrompt.click();
        Thread.sleep(2000);
        
        
    }
    // Method to select the desired language from the dropdown
    public void selectLanguage(String selectlanguage) {
        // Create a Select object for the dropdown
        Select select = new Select(dropdown);

        // Loop through all dropdown options
        for (WebElement option : dropdownOptions) {
            // Check if the option text matches the language to be selected
            if (option.getText().equalsIgnoreCase(selectlanguage)) {
                option.click();  // Click the option that matches the input language
                break;  // Exit the loop once the option is selected
            }
        }
    }

    
    public void noEntryPrompt(String selectlanguage, String TexttoSpeech) throws InterruptedException {

        int randomNumber = randomnumber();

        String uniqueGreetingPromptName = "NoEntry_" + randomNumber;

        noEntryPrompt.click();
        addNew.click();
        PromptName.sendKeys(uniqueGreetingPromptName);
        selectLanguage(selectlanguage); 
        Text.sendKeys(TexttoSpeech);
        AddPrompt.click();
        Thread.sleep(2000);
        
        
    }
    public void invalidEntryPrompt(String selectlanguage, String TexttoSpeech) throws InterruptedException {

        int randomNumber = randomnumber();

        String uniqueGreetingPromptName = "InvalidEntry_" + randomNumber;
        invalidEntryPrompt.click();
        addNew.click();
        PromptName.sendKeys(uniqueGreetingPromptName);
        selectLanguage(selectlanguage);  
        Text.sendKeys(TexttoSpeech);
        AddPrompt.click();
        Thread.sleep(2000);
        
        
    }
    public void expiredEntryPrompt(String selectlanguage, String TexttoSpeech) throws InterruptedException {

        int randomNumber = randomnumber();

        String uniqueGreetingPromptName = "ExpiredEntry_" + randomNumber;
        expiredEntryPrompt.click();
        addNew.click();
        PromptName.sendKeys(uniqueGreetingPromptName);

        
        selectLanguage(selectlanguage);  
        Text.sendKeys(TexttoSpeech);
        AddPrompt.click();
        Thread.sleep(2000);
        
        
    }
    public void voiceFeedbackPrompt(String selectlanguage, String TexttoSpeech) throws InterruptedException {
    	voiceFeedbackToggle.click();
        int randomNumber = randomnumber();

        String uniqueGreetingPromptName = "VoiceFeedback_" + randomNumber;

        voiceFeedbackPrompt.click();
        addNew.click();
        PromptName.sendKeys(uniqueGreetingPromptName);
        selectLanguage(selectlanguage);  
        Text.sendKeys(TexttoSpeech);
        AddPrompt.click();
        Thread.sleep(2000);
        
        
    }

}

   