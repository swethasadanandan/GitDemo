package Page_Code;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class QuestionRules {

    WebDriver driver;

    @FindBy(xpath="//div[@class='content-box']//div[@class='addrule']")
    List<WebElement> addNewrule;
    
    @FindBy(xpath = "//div[contains(text(), 'Question Response')]")
    WebElement questionResponse;
    
    @FindBy(xpath = "//div[@class='text justify']//p[contains(text(),'Conditions')]")
    WebElement Conditions;

    @FindBy(xpath = "//div[@class='drags adr' and contains(., 'Send Email')]")
    WebElement SendEmail;
    
    @FindBy(xpath = "//div[@class='actions margin right']")
    WebElement Actions;
    
    @FindBy(xpath = "//option[normalize-space()='Select Operator']")
    WebElement SelectOperator;
    
    @FindBy(xpath = "//option[@value='<']")
    WebElement lessThan;
    
    @FindBy(xpath = "//input[@placeholder='Value']")
    WebElement value;
    
    @FindBy(xpath = "//input[@placeholder='Select Template']")
    WebElement SendEmailRule;
    
    @FindBy(xpath="//li[@id='0']")
    WebElement SelectOption;
    
    @FindBy(xpath="//input[@placeholder='E-mail']")
    WebElement EnterEmail;
    
    @FindBy(xpath="//div[contains(text(), 'Skip Question')]")
    WebElement SkipQuestion;
    
    @FindBy(xpath="//p[contains(text(), 'Skip Question')]/following-sibling::div//input[@type='number']")
    WebElement AddSkipQuestion;
    
    //Q2
    @FindBy(xpath = "//div[contains(text(), 'Participant Data')]")
    WebElement  participantData ;
    
    @FindBy(xpath="//div[@class='act-grp']//select")
    WebElement participantDataSelector;
    
    @FindBy(xpath="//input[@placeholder='Attribute']")
    WebElement Attributes;
    
    @FindBy(xpath="//div[@class='half togl2']")
    WebElement participantDataText;
    
    @FindBy(xpath = "//app-input[@class='last']//input[@placeholder='Value']")
    WebElement participantvalue;
    
//    @FindBy(xpath = "/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[4]/form/div[3]/div[2]/div[4]/div[3]/div[2]/div/div[1]/div[2]/div/div/select/option[2]")
//    WebElement equalsValue;
    
    @FindBy(xpath="//div[contains(text(), 'Data Action')]")
    WebElement DataAction;
    
    @FindBy(xpath="//input[@type='text' and @placeholder='Select Template']")
    WebElement DataActiontemplate;
    
    @FindBy(xpath = "(//div[p[contains(text(),'Question Response')]]//select)[1]")
    WebElement SelectOperatorQ3;
    
    @FindBy(xpath = "/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[4]/form/div[3]/div[2]/div[4]/div[3]/div[2]/div/div[3]")
    WebElement actionQ3;
    
    @FindBy(xpath="//div[contains(text(), 'Stop Survey')]")
    WebElement stopSurvey;
    
    @FindBy(xpath="//div[contains(text(), 'Always True')]")
    WebElement alwaysTrue;
    
    @FindBy(xpath="//div[@class='trigers']//div[1]//div[5]")
    WebElement user;
    
    @FindBy(xpath="/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[4]/form/div[4]/div[2]/div[4]/div[3]/div[2]/div/div[1]")
    WebElement userCondition;
    
    @FindBy(xpath="//input[@placeholder='Select User']")
    WebElement userSelection;
    
    @FindBy(xpath="//div[contains(text(), 'Jump To Question')]")
    WebElement JumpToQuestion ;
    
    @FindBy(xpath="//div[@class='text justify']//p[contains(text(),'Actions')]")
    WebElement jumpAction;
    
    @FindBy(xpath="/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[4]/form/div[4]/div[2]/div[4]/div[3]/div[2]/div/div[3]/div[2]/div/div/select")
    WebElement JumpToQuestionSelection;
    
    @FindBy(xpath="//option[normalize-space()='Select Question']")
    WebElement JumpToQuestionNum;
    
    @FindBy(xpath="//div[@class='add']")
    WebElement nextQuestion;
    
    @FindBy(xpath="//p[normalize-space()='Post Survey Actions']")
	WebElement postSurveyAction;
    
    @FindBy(xpath = "//div[contains(text(), 'Survey Score')]")
    WebElement  SurveyScore ;
    
    @FindBy(xpath="(//div[@class='act-grp']//select)[2]")
    WebElement PostActionparticipantDataSelector;
    
    @FindBy(xpath="/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[3]/div[2]/div[2]/div[2]/div/div[1]")
    WebElement postActionuserCondition;
    
    @FindBy(xpath="/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[3]/div[2]/div[2]/div[2]/div/div[3]")
    WebElement postActionuserAction;
    
    @FindBy(xpath="/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[3]/div[2]/div[2]/div[2]/div/div[3]/div[2]/div/div/app-selecter/div/div/input")
    WebElement postActionsendEmail;
    
    @FindBy(xpath="//p[normalize-space()='Survey Timeout Settings']")
    WebElement SurveyTimeOutSetting;
    
    @FindBy(xpath="/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[3]/div[3]/app-input/input")
    WebElement surveyTimer;
    
    @FindBy(xpath="//div[@class='content-box hidetab']//div[@class='half togl2']")
    WebElement surveyTimeOutParticipantAttribute;
    
    @FindBy(xpath="/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]")
    WebElement surveyTimeOutCondition;
    
    @FindBy(xpath="/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[3]")
    WebElement surveyTimeOutAction;
    
    @FindBy(xpath="[/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[3]/div[2]/div/div/app-selecter/div/div/input")
    WebElement surveyTimeOutDataAction;

    
    @FindBy(xpath="/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[3]/div[2]/div/div/app-selecter/div/div/input")
    WebElement surveytemp;
    
    @FindBy(xpath="//button[normalize-space()='Publish']")
    WebElement PublishButton;
    
    @FindBy(xpath = "//p[normalize-space()='Add New']")
    WebElement addNew;
   
   @FindBy(xpath = "//input[@placeholder='Template Name']")
    WebElement templateName;
  
   @FindBy(xpath = "//input[@placeholder='Subject']")
    WebElement emailTemplateSubject;
   
   @FindBy(xpath = "/html/body/app-root/app-layout/div/app-survey-add/div[2]/div/app-email-template/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[3]/div[2]")
    WebElement mailBody;
   
   @FindBy(xpath = "//div[@class='note-hint-item' and text()='Survey']")
    WebElement surveyLinkOptionSurvey;
   
   @FindBy(xpath = "//div[@class='note-hint-item active' and text()='ConversationID']")
   WebElement surveyLinkOptionConversationID;
   
   @FindBy(xpath = "//div[@class='note-hint-item' and text()='Organization']")
   WebElement surveyLinkOptionOrganization;
   
   
   @FindBy(xpath = "/html/body/app-root/app-layout/div/app-survey-add/div[2]/div/app-email-template/div/div[1]/div/button[2]")
    WebElement save;
   
   @FindBy(xpath = "//input[@placeholder='Name of the request']")
   WebElement dataActionName;
   
   @FindBy(xpath = "//option[normalize-space()='POST']")
   WebElement dataActionMethod;
   
   @FindBy(xpath = "//div[@class='ace_content']")
   WebElement dataActionBody;
   
   @FindBy(xpath = "(//input[@type='text' and @placeholder='Select Template'])")
   WebElement selectdataactionTemplate;
   
   @FindBy(xpath ="//input[@placeholder='URL of the request']")
   WebElement dataactionurl;
   
   @FindBy(xpath ="/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[3]/div[2]/div/div/app-selecter/div/div/input")
   WebElement dataactiontemp;
   
   @FindBy(xpath ="/html/body/app-root/app-layout/div/app-survey-add/div[2]/div/app-data-actions-add/div/div[1]/div[2]/button[3]")
   WebElement dataactionSave;


    // Constructor to initialize the driver and elements
    public QuestionRules(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize WebElements
    }

    public void addNewruleQ1() {
        addNewrule.get(0).click();// Click the add new rule element
    }
    

    public  void questionResponse(String operatorSelect, String values) {
    	
    Actions actions = new Actions(driver);
	actions.dragAndDrop(questionResponse, Conditions).build().perform();
	
	

	List<WebElement> options = driver.findElements(By.xpath("//option")); // Find options
	for (WebElement option : options) {
	    if (option.getText().equals(operatorSelect)) {
	        option.click(); // Click the matching operator
	        break;
	    }
	}

	value.sendKeys(values);
    
    }
    public int randomnumber() {
        Random random = new Random();
        return random.nextInt(10000) + 1;  
        
    }
    public void surveyDetailsTemplate(String emailTemplateName,String emailSubject) throws InterruptedException {

	    addNew.click();
        int randomNumber = randomnumber();

        templateName.sendKeys(emailTemplateName + randomNumber);
        emailTemplateSubject.sendKeys(emailSubject);

        mailBody.click();
        mailBody.sendKeys("Survey Name :" + " "+ "@");
        surveyLinkOptionSurvey.click();
        
        mailBody.sendKeys("\n Organization :" + " "+ "@");
        surveyLinkOptionOrganization.click();
        
        mailBody.sendKeys("\n ConversationID :" + " "+ "@");
        surveyLinkOptionConversationID.click();
        
        save.click();
        Thread.sleep(5000);
	    }
    
	public void sendEmail(String emailTemplateName,String emailSubject, String enterEmail1) throws InterruptedException {

		Actions actionEmail = new Actions(driver);
		actionEmail.dragAndDrop(SendEmail, Actions).build().perform();
    	SendEmailRule.click();
    	surveyDetailsTemplate(emailTemplateName,emailSubject);
    	EnterEmail.sendKeys(enterEmail1);
              	  
 
    	  }
	 
    
    public void skipQuestion() throws InterruptedException {
    	
   	 	
  		Actions actionEmail = new Actions(driver);
  		actionEmail.dragAndDrop(SkipQuestion, Actions).build().perform();
   		AddSkipQuestion.sendKeys("1");
   		Thread.sleep(2000);

   }
    
    public void participantData(String secondOperator, String attributeValue, String participantValues) {
        addNewrule.get(1).click(); // Click the add new rule element

        Actions actions1 = new Actions(driver);
        actions1.dragAndDrop(participantData, Conditions).build().perform();

        participantDataSelector.click(); // Locate the dropdown

        List<WebElement> options1 = driver.findElements(By.xpath("//option")); // Find options
        for (WebElement option : options1) {
            if (option.getText().equals(secondOperator)) {
                option.click(); // Click the matching operator
                break;
            }
        }

        participantDataText.click();
        Attributes.sendKeys(attributeValue);

        WebElement participantValueInput = driver.findElement(By.xpath("//div[@class='act-grp']//app-input//input[@placeholder='Value']")); // Unique locator
        participantValueInput.sendKeys(participantValues); // Send specific value
    }

    public  void dataactionCreation(String url,String dataaction) {
    	
        int randomNumber = randomnumber();
    	addNew.click();

        dataActionName.sendKeys(dataaction + randomNumber);
        dataActionMethod.click();
        dataactionurl.sendKeys(url);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(dataActionBody));
       // dataActionBody.sendKeys("survey");
  		dataactionSave.click();


    }


        public  void dataaction(String url,String dataaction) {
        	Actions actionEmail = new Actions(driver);
      		actionEmail.dragAndDrop(DataAction, Actions).build().perform();
      		selectdataactionTemplate.click();
      		dataactionCreation(url,dataaction);
  
     
        }
        
//        public void questionResponseQ3(String secondOperator, String values3)  {
//            addNewrule.get(2).click();
//
//            Actions actions = new Actions(driver);
//            actions.dragAndDrop(questionResponse, Conditions).build().perform();
//
//            SelectOperatorQ3.click(); // Locate the dropdown
//
//            List<WebElement> options1 = driver.findElements(By.xpath("//option")); // Find options
//            for (WebElement option : options1) {
//                if (option.getText().equals(secondOperator)) {
//                    option.click(); // Click the matching operator
//                    break;
//                }
//            }
//
//            WebElement valueQ3 = driver.findElement(By.cssSelector("input[type='number'][placeholder='Value']")); // Unique locator
//            valueQ3.sendKeys(values3); // Send specific value for Q3
//        }


        public void questionResponseQ3(String secondOperator, String values3) throws InterruptedException {
            // Click to add a new rule
            addNewrule.get(2).click();

            // Perform drag and drop action
            Actions actions = new Actions(driver);
            actions.dragAndDrop(questionResponse, Conditions).build().perform();

            // Click the dropdown
            SelectOperatorQ3.click();
            
            // Select the operator from dropdown
            Select select = new Select(SelectOperatorQ3);
            select.selectByValue(secondOperator); // Using the parameter instead of hardcoded "<"

            // Verify selection
            WebElement selectedOption = select.getFirstSelectedOption();
            Assert.assertEquals(selectedOption.getText().trim(), secondOperator, "Operator selection failed!");

            // Small wait for UI stability
            Thread.sleep(2000);

            // Locate the value input field and enter value
            WebElement valueQ3 = driver.findElement(By.cssSelector("input[type='number'][placeholder='Value']"));
            valueQ3.clear(); // Ensure it's empty before entering data
            valueQ3.sendKeys(values3);
        }

        
	  		
        public  void stop_Survey()
        {
        Actions stop = new Actions(driver);
       	stop.dragAndDrop(stopSurvey,actionQ3).build().perform();	
        }
        
        
        public void addNewruleQ4() throws InterruptedException {
        	Thread.sleep(3000);
            addNewrule.get(3).click(); // Click the add new rule element
        }
        
        
        public void alwaysTrue() {
        	
            Actions actions1 = new Actions(driver);
    		actions1.dragAndDrop(alwaysTrue, Conditions).build().perform();
        }
        
           //  userRule
        public void user(String username) {
        	
            Actions actionsuser = new Actions(driver);
            actionsuser.dragAndDrop(user, userCondition).build().perform();
    		//Selecting user
    		userSelection.click();
    		userSelection.sendKeys(username);
    		SelectOption.click();

        }
        
        public void jumptoQuestion(String jumpQuestionNumber) {
      	  Actions actionEmail = new Actions(driver);
      		actionEmail.dragAndDrop(JumpToQuestion, jumpAction).build().perform();
      		
      		JumpToQuestionSelection.click();
      	    
      	    // Create a Select object
      	    Select select = new Select(JumpToQuestionSelection);
      	    
      	    // Select Q6 by visible text
      	    select.selectByVisibleText(jumpQuestionNumber);
        }
        
        public void postAction() {
        	//Post Survey Actions
    		postSurveyAction.click();
    		addNewrule.get(0).click();
    		
             
        }

        public  void postAction_surveyScore(String operatorSelect, String values) {
        	
            Actions actions = new Actions(driver);
        	actions.dragAndDrop(SurveyScore, Conditions).build().perform();
        	
        	// Replace SelectOperator.get(0).click() and operatorOption.click() with this:
        		SelectOperator.click(); // Locate the dropdown


        	List<WebElement> options = driver.findElements(By.xpath("//option")); // Find options
        	for (WebElement option : options) {
        	    if (option.getText().equals(operatorSelect)) {
        	        option.click(); // Click the matching operator
        	        break;
        	    }
        	}

        	value.sendKeys(values);
            
            }

        public  void postAction_dataaction(String url,String dataaction) throws InterruptedException {
        	Actions actionEmail = new Actions(driver);
      		actionEmail.dragAndDrop(DataAction, Actions).build().perform();
		
      		selectdataactionTemplate.click();
      		dataactionCreation(url,dataaction);
      		//Thread.sleep(3000);
     
        }
       
        public void postAction_participantData(String secondOperator, String attributeValue, String participantValues) throws InterruptedException {
             // Click the add new rule element
        	addNewrule.get(0).click();
        	Thread.sleep(3000);
            Actions actions1 = new Actions(driver);
            actions1.dragAndDrop(participantData, Conditions).build().perform();

            PostActionparticipantDataSelector.click(); // Locate the dropdown

            List<WebElement> options1 = driver.findElements(By.xpath("//option")); // Find options
            for (WebElement option : options1) {
                if (option.getText().equals(secondOperator)) {
                    option.click(); // Click the matching operator
                    break;
                }
            }

            participantDataText.click();
            Attributes.sendKeys(attributeValue);

            WebElement participantValueInput = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[3]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/app-input/input")); 
            participantValueInput.sendKeys(participantValues); 
        }

        
//        public void postAction_participantData(String secondOperator, String attributeValue, String participantValues) {
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//            // Click the add new rule element
//            wait.until(ExpectedConditions.elementToBeClickable(addNewrule.get(0))).click();
//
//            // Drag and drop participantData into Conditions
//            Actions actions = new Actions(driver);
//            actions.dragAndDrop(participantData, Conditions).perform();
//
//            // Click the dropdown to open it
//            wait.until(ExpectedConditions.elementToBeClickable(PostActionparticipantDataSelector)).click();
//
//            // Select the appropriate option from the dropdown
//            List<WebElement> options = driver.findElements(By.xpath("//select[contains(@class, 'some-class')]//option"));
//            for (WebElement option : options) {
//                if (option.getText().trim().equals(secondOperator)) {
//                    option.click();
//                    break;
//                }
//            }
//
//            // Enter attribute value
//            wait.until(ExpectedConditions.elementToBeClickable(participantDataText)).click();
//            Attributes.sendKeys(attributeValue);
//
//            // Locate input field and enter the participantValues
//            WebElement participantValueInput = wait.until(ExpectedConditions.presenceOfElementLocated(
//                By.xpath("//input[@type='text' and contains(@class, 'specific-class')]")
//            ));
//            participantValueInput.sendKeys(participantValues);
//        }

        public void postAction_sendEmail(String emailTemplateName,String emailSubject, String enterEmail1) throws InterruptedException {

        	Actions actionEmail = new Actions(driver);
        	actionEmail.dragAndDrop(SendEmail, postActionuserAction).build().perform();
        	
        	postActionsendEmail.click();
        	surveyDetailsTemplate(emailTemplateName,emailSubject);
        	EnterEmail.sendKeys(enterEmail1);
                  	  
     
        }
    	 
        
        	public void postAction_user(String username) {
        	
            Actions actionsuser = new Actions(driver);
            actionsuser.dragAndDrop(user, postActionuserCondition).build().perform();
    		//Selecting user
    		userSelection.click();
    		userSelection.sendKeys(username);
    		SelectOption.click();
        	}
        	
        	
        	//Survet Timeout Settings
        	
        	public void surveyTimeout() throws InterruptedException {
        		SurveyTimeOutSetting.click();
           	 
        		surveyTimer.sendKeys("1");
                
                //Add new rules

           			addNewrule.get(0).click();      		
           			Thread.sleep(10000);

           }
        	
        	public  void surveyTimeOut_surveyScore(String operatorSelect, String values) {
            	
        		Actions actions = new Actions(driver);
        		actions.dragAndDrop(SurveyScore, Conditions).build().perform();
        		Actions actionEmail = new Actions(driver);
        		actionEmail.dragAndDrop(SendEmail, Actions).build().perform();
            	
            	// Replace SelectOperator.get(0).click() and operatorOption.click() with this:
            		SelectOperator.click(); // Locate the dropdown


            	List<WebElement> options = driver.findElements(By.xpath("//option")); // Find options
            	for (WebElement option : options) {
            	    if (option.getText().equals(operatorSelect)) {
            	        option.click(); // Click the matching operator
            	        break;
            	    }
            	}

            	value.sendKeys(values);
                
                }

        	public void surveyTimeOut_sendEmail(String emailTemplateName,String emailSubject, String enterEmail1) throws InterruptedException {

            	SendEmailRule.click();
            	surveyDetailsTemplate(emailTemplateName,emailSubject);

            	EnterEmail.sendKeys(enterEmail1);
                     Thread.sleep(5000); 	  
         
            	  }

        	public void surveyTimeout_participantData( String attributeValue, String participantValues) {
                // Click the add new rule element
           	addNewrule.get(0).click();
               Actions actions1 = new Actions(driver);
               actions1.dragAndDrop(participantData, Conditions).build().perform();

               driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/select/option[2]")).click(); // Locate the dropdown

              

               participantDataText.click();
               driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/app-input/input")).sendKeys(attributeValue);

               WebElement participantValueInput = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-survey-add/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/app-input/input")); 
               participantValueInput.sendKeys(participantValues); 
           }
        	
        	public void surveyTimeout_alwaysTrue() {
            	
                Actions actions1 = new Actions(driver);
        		actions1.dragAndDrop(alwaysTrue, surveyTimeOutCondition).build().perform();
            }
        	
        	 public  void surveyTimeout_dataaction(String url,String dataaction) throws InterruptedException {
             	Actions actionEmail = new Actions(driver);
           		actionEmail.dragAndDrop(DataAction, surveyTimeOutAction).build().perform();
     		
           		dataactiontemp.click();
          		dataactionCreation(url,dataaction);
          		Thread.sleep(5000);
             }
        	 
        	 public  void publishSurvey() throws InterruptedException {
        		 PublishButton.click();
        	        Thread.sleep(100000);  
        	        verifySurveyPublished();


        	    }
        	 
        	 public void verifySurveyPublished() throws InterruptedException {
        	        try {
        	            // Increase the wait time for up to 5 minutes (300 seconds)
        	           // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));

        	            // Wait until the element is visible
        	            WebElement statusElement = driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-survey-list/datatable/div/div/table/tbody[1]/tr/td[3]/div[2]/div/span"));

        	            // Retrieve the actual status text
        	            String actualStatus = statusElement.getText();
        	            String expectedStatus = "Published";

        	            // Check if the actual status is equal to the expected status
        	            if (actualStatus.equals(expectedStatus)) {
        	                System.out.println("Survey published successfully.");
        	            } else {
        	                System.out.println("Survey publishing Failed");
        	            }

        	            // Optional: Assert that the actual status is equal to the expected status
        	            Assert.assertEquals(actualStatus, expectedStatus);

        	        } catch (TimeoutException e) {
        	            // Handle the timeout exception
        	            System.out.println("Survey Published");
        	        } finally {
        	            // Close the current browser tab
        	            driver.quit();
        	        }
        	    }

			
			

}


	
	
		

	
