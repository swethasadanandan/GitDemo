package Page_Code;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class QuestionSection {

    WebDriver driver;

    @FindBy(xpath="//input[@placeholder='Organisation Name']")
    WebElement OrganisationName;

    @FindBy(tagName="select")
    WebElement SelectRegion;

    @FindBy(xpath="//button[normalize-space()='Log in with Genesys Cloud']")
    WebElement LoginWithGenesysCloud;

    @FindBy(id="email")
    WebElement Email;

    @FindBy(id="password")
    WebElement Password;

    @FindBy(xpath="//button[normalize-space()='Log In']")
    WebElement Login;
    
    @FindBy(xpath="//body[1]/app-root[1]/app-layout[1]/app-sidebar[1]/div[1]/div[5]/div[1]/img[1]")
    WebElement Navigate;
    
    @FindBy(xpath="//div[@class='link']//p[contains(text(),'Surveys')]")
    WebElement SurveyFormMenu;
    
    @FindBy(xpath="//button[@class='fksave' and contains(text(), 'Add New Survey')]")
    WebElement SurveyButton;
    
    @FindBy(xpath="//input[@placeholder='Survey Name']")
    WebElement SurveyName;
    
    @FindBy(xpath="//label[text()='Description']/following-sibling::textarea")
    WebElement SurveyDescription;
    
    @FindBy(xpath="//input[@placeholder='Select Category']")
    List<WebElement> SurveyScore;
    
    @FindBy(xpath="//div[@class='sml']//div[contains(text(),'Web Messaging')]")
    WebElement Webmesaaging;
    
    @FindBy(xpath = "//div[@class='sml']//div[contains(text(),'Open Messaging')]")
    WebElement OpenMessaging;
    
    @FindBy(xpath = "//div[@class='sml']//div[contains(text(),'WhatsApp')]")
    WebElement WhatsApp;
    
    @FindBy(xpath = "//div[@class='sml']//div[contains(text(),'Instagram')]")
    WebElement instagram;
    
    @FindBy(xpath = "//div[@class='sml']//div[contains(text(),'Email')]")
    WebElement email;
    
    @FindBy(xpath = "//div[@class='sml']//div[contains(text(),'SMS')]")
    WebElement SMS;
    
    
    @FindBy(className="loader-wrapper")
    WebElement web;
    
    //question
    @FindBy(xpath="//input[@type='text' and @placeholder='Question Name' and contains(@class, 'ng-pristine') and contains(@class, 'ng-invalid')]")
    WebElement QuestionName;
    
    @FindBy(xpath="//input[@placeholder='Question Name']/../../..//div[2]/select")
    WebElement QuestionType;
    
   
    
    @FindBy(xpath = "/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[4]/form/div[1]/div[2]/div[1]/div[2]/div/app-selecter/div/div/input")
    WebElement promptInputsQ1;
    
    @FindBy(xpath = "/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[4]/form/div[2]/div[2]/div[1]/div[2]/div/app-selecter/div/div/input")
    WebElement promptInputsQ2;

    @FindBy(xpath = "/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[4]/form/div[3]/div[2]/div[1]/div[2]/div/app-selecter/div/div/input")
    WebElement promptInputsQ3;
    
    @FindBy(xpath = "/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[4]/form/div[4]/div[2]/div[1]/div[2]/div/app-selecter/div/div/input")
    WebElement promptInputsQ4;
    
    @FindBy(xpath = "/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[4]/form/div[5]/div[2]/div[1]/div[2]/div/app-selecter/div/div/input")
    WebElement promptInputsQ5;
    
    @FindBy(xpath = "/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[4]/form/div[6]/div[2]/div[1]/div[2]/div/app-selecter/div/div/input")
    WebElement promptInputsQ6;
    
    
    @FindBy(xpath="//li[@id='0']")
    WebElement SelectOption;
    
    @FindBy(xpath = "//div[@class='note-editable' and @contenteditable='true']")
    List<WebElement> QuestionText;
    
    @FindBy(xpath="//div[@class='add']")
    WebElement nextQuestion;
    
    @FindBy(xpath="//select[contains(@class, 'ng-pristine') and contains(@class, 'ng-invalid')]/option[@value='NPS']")
    WebElement QuestionTypeNPS;
    
    @FindBy(xpath="//select[contains(@class, 'ng-pristine') and contains(@class, 'ng-invalid')]/option[@value='CSAT']")
    WebElement QuestionTypeCSAT;
    
    @FindBy(xpath="//select[contains(@class, 'ng-pristine') and contains(@class, 'ng-invalid')]/option[@value='NumericRange']")
    WebElement QuestionTypeNumericRange;
    
    @FindBy(xpath="//select[contains(@class, 'ng-pristine') and contains(@class, 'ng-invalid')]/option[@value='YesNo']")
    WebElement QuestionTypeYesorNo;
    
    @FindBy(xpath="//select[contains(@class, 'ng-pristine') and contains(@class, 'ng-invalid')]/option[@value='MultipleChoice']")
    WebElement QuestionTypeMultipleChoice;
    
    
    @FindBy(xpath="//select[contains(@class, 'ng-pristine') and contains(@class, 'ng-invalid')]/option[@value='PromptOnly']")
    WebElement QuestionTypePromptOnly;
    
    //Score Category in Question
    @FindBy(css="input[placeholder='Select Category'].ng-untouched.ng-pristine.ng-valid")
    WebElement ScoreCategoryInQuestion;
    
    @FindBy(xpath="//p[normalize-space()='Add New']")
    WebElement AddNewScoreCategory;
    
    @FindBy(xpath="//input[@placeholder='Category Name']")
    WebElement ScoreCategoryName;
    
    @FindBy(xpath="//button[contains(@class, 'fksave') and contains(@class, 'import-btn') and contains(., 'Add New Level')]")
    WebElement AddNewlevel;
    
    @FindBy(xpath="//div[@class='level-name']//div//input[@type='text']")
    List<WebElement> LevelName;
    
    @FindBy(xpath = "//input[@type='number' and @min='0' and @max='100' and contains(@class, 'ng-untouched') and contains(@class, 'ng-pristine') and contains(@class, 'ng-invalid')]")
    List<WebElement> LowerBound;
  
    @FindBy(xpath = "//button[@class='fksave' and text()='Add']")
    WebElement addLevel;
    
    @FindBy(xpath = "//div[@class='surveypop']//button[@class='fksave'][normalize-space()='Save']")
    WebElement SaveScore;
   
    @FindBy(xpath = "//p[normalize-space()='Successfully added the score category']")
    WebElement SurveyscoreSccuessMessage;
    
    @FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/div[1]/app-survey-add[1]/div[1]/div[2]/div[2]/div[4]/form[1]/div[4]/div[2]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement YesInput;

    @FindBy(xpath = "/html/body/app-root/app-layout/div/app-survey-add/div[2]/div/div[3]/div[1]/div[1]/div")
    WebElement YesInputKey;
    
    @FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/div[1]/app-survey-add[1]/div[1]/div[2]/div[2]/div[4]/form[1]/div[4]/div[2]/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]/input[1]")
    WebElement NoInput;

    @FindBy(xpath = "//div[contains(text(),'2')]")
    WebElement NoInputKey;
    
    @FindBy(xpath="/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[4]/form/div[1]/div[1]")
    WebElement Question1Rule;

    
    @FindBy(xpath="//div[@class='sml']//div[contains(text(),'FB Messenger')]")
	 WebElement SelectFacebook; 
    
    @FindBy(xpath="//div[contains(text(),'English')]")
  	 WebElement supportedlanguagesEnglish; 
    
    @FindBy(xpath="//div[contains(text(),'German')]")
  	 WebElement supportedlanguagesGerman; 
    
    
    
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
   
   @FindBy(xpath = "//button[normalize-space()='Add Prompt']")
   WebElement AddPrompt;
   
   @FindBy(xpath = "//select[contains(@class, 'ng-pristine') and contains(@class, 'ng-invalid')]//option")
   List<WebElement> dropdownOptions;

    public QuestionSection(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginToFeebak(String organisationName, String region) {
        OrganisationName.sendKeys(organisationName);
         new Select(SelectRegion).selectByVisibleText(region);
    }

    public void loginWithGenesysCredentials(String email, String password) {
        Email.sendKeys(email);
        Password.sendKeys(password);
    }

    public void clickLoginWithGenesysCloud() {
        LoginWithGenesysCloud.click();
    }

    public void clickLogin() {
        Login.click();
    }
    

	public void navigateToSurvey() {
		Actions actions = new Actions(driver);
        actions.moveToElement(Navigate).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(SurveyFormMenu));
        element.click();
	}
	public void createSurvey() throws InterruptedException {
        // Create new survey
        SurveyButton.click();
       
         String uniqueSurveyName = "Feebak Webform Survey " + getCurrentTimestamp();
         SurveyName.sendKeys(uniqueSurveyName);

         WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement description = wait1.until(ExpectedConditions.elementToBeClickable(SurveyDescription));
         description.sendKeys("Survey automation refers to the use of technology and software to automate the process of creating, distributing, and analysing surveys.");
    
   }
    
	 private static String getCurrentTimestamp() {
//	        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyHHmmss");
//	        return sdf.format(new Date());
		 
	        return new SimpleDateFormat("ddMMyyyyHHmmss").format(new Date());
	    }
	 
	 public void generalInfo() {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader-wrapper")));
            webMessagingChannel();
            facebookChannel();
            openChannel();
            whatsAppChannel();
            instagramChannel();
            emailChannel();
            smsChannel();
		    SurveyScore.get(0).click();
		    SelectOption.click();
		}
	    
	 public void webMessagingChannel() {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
	        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Webmesaaging));
	        wait.until(ExpectedConditions.invisibilityOf(web)); 
	        element.click();
	    }
	  public void facebookChannel() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(SelectFacebook));
	        element.click();

	    }
	 
	  public void openChannel() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(OpenMessaging));
	        element.click();

	    }
	  
	  public void whatsAppChannel() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(WhatsApp));
	        element.click();
	    
	    }
	  
	  public void instagramChannel() {
	    	 
	        instagram.click();
	    }
	  
	  public void emailChannel() {
	    	
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(email));
	        element.click();

	    }
	  
	  public void smsChannel() {
	        SMS.click();

	    }
	  public int randomnumber() {
	        Random random = new Random();
	        return random.nextInt(10000) + 1;  
	        
	    }
	  
	  
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

	 
	 public void question1(String greetingTexttoSpeech) {

		 int randomNumber = randomnumber();

	        String uniqueGreetingPromptName = "Question_" + randomNumber;
		 	QuestionName.sendKeys("Q1");
		    QuestionType.click();
		    QuestionTypeNPS.click();
		    promptInputsQ1.click();
		    addNew.click();
	        PromptName.sendKeys(uniqueGreetingPromptName);
	        selectLanguage("English");  
	        Text.sendKeys(greetingTexttoSpeech);
	        AddPrompt.click();
		    

		    QuestionText.get(0).sendKeys(greetingTexttoSpeech);
		    nextQuestion.click();
		}
	 
	 public void question2(String greetingTexttoSpeech) throws InterruptedException {


		 int randomNumber = randomnumber();

	        String uniqueGreetingPromptName = "Question_" + randomNumber;
		 	QuestionName.sendKeys("Q2");
		    QuestionType.click();
		    QuestionTypeCSAT.click();
		    promptInputsQ2.click();
		    addNew.click();
	        PromptName.sendKeys(uniqueGreetingPromptName);
	        selectLanguage("English");  
	        Text.sendKeys(greetingTexttoSpeech);
	        AddPrompt.click();
	        Thread.sleep(5000);
		    QuestionText.get(1).sendKeys(greetingTexttoSpeech);
		    nextQuestion.click();

		}
	 
	 public void question3( String greetingTexttoSpeech) throws InterruptedException {


		 int randomNumber = randomnumber();

	        String uniqueGreetingPromptName = "Question_" + randomNumber;
		 	QuestionName.sendKeys("Q3");        
		 	QuestionType.click();
		 	QuestionTypeNumericRange.click();
		 	promptInputsQ3.click();
		    addNew.click();
	        PromptName.sendKeys(uniqueGreetingPromptName);
	        selectLanguage("English");  
	        Text.sendKeys(greetingTexttoSpeech);
	        AddPrompt.click();
	        Thread.sleep(5000);


		    QuestionText.get(2).sendKeys(greetingTexttoSpeech);

	        addScoreCategory();
	  //      question3Rules(driver);
	        Thread.sleep(10000);

	      }
	    
	 
	 public void addScoreCategory()
	    {
	    	//Score category
	    	
	    	ScoreCategoryInQuestion.click();
	    	AddNewScoreCategory.click();
	        
	        String categoryName = "Auto Score " + generateRandomNumber();
	        ScoreCategoryName.sendKeys(categoryName);
	        AddNewlevel.click();
	        LevelName.get(0).sendKeys("Bad");
	        LowerBound.get(0).sendKeys("40");
	        driver.findElement(By.xpath("//div[@style='background: rgb(76, 175, 80);']")).click();
	        addLevel.click();
	        
	        AddNewlevel.click();
	        LevelName.get(0).sendKeys("Good");
	        LowerBound.get(0).sendKeys("70");
	        driver.findElement(By.xpath("//div[@style='background: rgb(255, 193, 7);']")).click();
	        addLevel.click();
	        
	        SaveScore.click();
	       
	        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement successMessageElement = wait1.until(ExpectedConditions.visibilityOf(SurveyscoreSccuessMessage));
	        String scoreCategorySuccess = "Successfully added the score category";
	        Assert.assertEquals(successMessageElement.getText(), scoreCategorySuccess);
	        
	        
	    
	    }
	    
	    private static String generateRandomNumber() {
	        Random rand = new Random();
	        int randomNum = rand.nextInt(1000); // Generates a number between 0 and 999
	        return String.valueOf(randomNum);
	    }

	    public void question4(String greetingTexttoSpeech) throws InterruptedException 
	    {
		    nextQuestion.click();

			 int randomNumber = randomnumber();

		        String uniqueGreetingPromptName = "Question_" + randomNumber;
	    	QuestionName.sendKeys("Q4");
		    QuestionType.click();
		    QuestionTypeYesorNo.click();
		    promptInputsQ4.click();
		    addNew.click();
	        PromptName.sendKeys(uniqueGreetingPromptName);
	        selectLanguage("English");  
	        Text.sendKeys(greetingTexttoSpeech);
	        AddPrompt.click();
	        Thread.sleep(5000);


		    QuestionText.get(3).sendKeys(greetingTexttoSpeech);
	        addScoreCategory();

	        Thread.sleep(10000);

	        
		    YesInput.click();
		    YesInputKey.click();
		    NoInput.click();
		    NoInputKey.click();
		    nextQuestion.click();

	    }

	    public  void  question5(String greetingTexttoSpeech ) throws InterruptedException
	    {

			 int randomNumber = randomnumber();

		        String uniqueGreetingPromptName = "Question_" + randomNumber;
	    	QuestionName.sendKeys("Q5");
		    QuestionType.click();
		    QuestionTypeMultipleChoice.click();
		    
		    
		    promptInputsQ5.click();
		    addNew.click();
	        PromptName.sendKeys(uniqueGreetingPromptName);
	        selectLanguage("English");  
	        Text.sendKeys(greetingTexttoSpeech);
	        AddPrompt.click();
	        Thread.sleep(5000);

		    QuestionText.get(4).sendKeys(greetingTexttoSpeech);
	        addScoreCategory();
	        Thread.sleep(10000);

	        
	      //Multiple choice order
		    for (int i = 0; i <= 9; i++) {
	            // Click the option number
	            WebElement optionElement = driver.findElement(By.xpath("//p[normalize-space()='" + i + "']"));
	            optionElement.click();

	            // Find the score input field and set the score
	            WebElement scoreInput = driver.findElement(By.xpath("//input[@type='number' and @id=\"'Option'" + i + "'Score'\"]"));
	            scoreInput.clear(); // Ensure the field is cleared before entering a new value
	            scoreInput.sendKeys(String.valueOf((i + 1) * 10)); // Example: 10, 20, 30, ...

	            // Find the text input field and set the score description
	            WebElement scoreTextInput = driver.findElement(By.xpath(
	                    "//input[@type='text' and contains(@class, 'ng-untouched') and contains(@class, 'ng-pristine') and contains(@class, 'ng-invalid')]"));
	            scoreTextInput.clear(); // Ensure the field is cleared before entering a new value
	            scoreTextInput.sendKeys("Score " + (i + 1) * 10);
	        }
	       
	        
	        
		    nextQuestion.click();

	    }
	    
	    public  void question6( String greetingTexttoSpeech) throws InterruptedException
	    {

			 int randomNumber = randomnumber();

		        String uniqueGreetingPromptName = "Question_" + randomNumber;
	    	QuestionName.sendKeys("Q6");
		    QuestionType.click();
		    QuestionTypePromptOnly.click();
		    promptInputsQ6.click();
		    addNew.click();
	        PromptName.sendKeys(uniqueGreetingPromptName);
	        selectLanguage("English");
	        Text.sendKeys(greetingTexttoSpeech);
	        AddPrompt.click();
	        Thread.sleep(5000);

		    QuestionText.get(5).sendKeys(greetingTexttoSpeech);   
		    Question1Rule.click();
		    Question1Rule.click();
	        
	            
	    }

		
			

}