package testing_MainPart;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Page_Code.*;
import Ultils_driver.baseClass;

public class Feebak_Test extends baseClass {

    private QuestionSection question;
    private QuestionRules rules;
    private SurveyForm surveyFormPage;
    private Voice_Channel voice;
    private WebMessaging_Channel web;
    private Facebook_Channel facebook;
    private OpenMessaging_Channel open;
    private WhatsApp_Channel whatsapp;
    private Instagram_Channel insta;
    private Email_Channel email;
    private SMS_Channel sms;

    @BeforeClass
    public void setUp() {
        // Initialize page objects
        question = new QuestionSection(driver);
        rules = new QuestionRules(driver);
        surveyFormPage = new SurveyForm(driver);
        voice = new Voice_Channel(driver);
        web = new WebMessaging_Channel(driver);
        facebook = new Facebook_Channel(driver);
        open = new OpenMessaging_Channel(driver);
        whatsapp = new WhatsApp_Channel(driver);
        insta = new Instagram_Channel(driver);
        email = new Email_Channel(driver);
        sms = new SMS_Channel(driver);
        
     
    }

    @Test(priority = 1)
    public void testLoginAndNavigation() throws InterruptedException {
        question.loginToFeebak("Fantacode", "Mumbai");
        question.clickLoginWithGenesysCloud();
        question.loginWithGenesysCredentials("altaf@fantacode.com", "b#5e@RkB019D");
        question.clickLogin();
        question.navigateToSurvey();
        question.createSurvey();
        question.generalInfo();

     
    }

    @Test(priority = 2, dependsOnMethods = "testLoginAndNavigation")
    public void testSetupSurveyForm() {
//        surveyFormPage.setupSurveyForm(
//            "Share Your Experience",
//            "Your feedback shapes our future. Share your experience and let us know how we can improve.",
//            "Greeting From Our Team",
//            "Thanks for reaching out to us",
//            "Text",
//            "Please provide your valuable feedback"
//        );
    }

    @Test(priority = 3, dependsOnMethods = "testSetupSurveyForm")
    public void testSetupChannels() throws InterruptedException {
//        voice.greetingPrompt("English", "Welcome To Feebak");
//        voice.noEntryPrompt("English", "No input received. Please try again.");
//        voice.invalidEntryPrompt("English", "Invalid input. Please try again.");
//        voice.expiredEntryPrompt("English", "Time expired. Please respond sooner next time.");
//        voice.voiceFeedbackPrompt("English", "Please provide your feedback after the beep.");
//
//        web.WebMessaging("WebMessaging Survey");
//        facebook.channelFacebook("Facebook Survey", "Facebook Survey Link", "0");
//        open.openMessaging("Open Messaging Survey Link", "0");
//        whatsapp.whatsapp("1", "7c0c6f91-9c95-4df0-b687-1352f675725b", "0");
//        insta.instagram("Instagram Survey", "Instagram Survey Link", "0");
//        email.email("Survey Link", "Your Feedback is Important – Participate in Our Survey", "0");
//        sms.channelSMS("SMS Survey", "0");
    }

    @Test(priority = 4, dependsOnMethods = "testSetupChannels")
    public void testSurveyQuestions() throws InterruptedException {
//        question.question1("How effectively did the agent manage your inquiry in a timely manner?");
//        question.question2("How satisfied are you with the overall quality of our services?");
//        question.question3("On a scale of 0 to 100, how much do you think Feebak will add value to your Contact Center operation?");
//        question.question4("Are you satisfied with the demo in our booth?");
//        question.question5("What aspect of the agent’s service did you find most satisfactory?");
//        question.question6("Your insights are impactful!");
    }

    @Test(priority = 5, dependsOnMethods = "testSurveyQuestions")
    public void testSurveyRules() throws InterruptedException {
//        rules.participantData("=", "OfferSurvey", "false");
//        rules.dataaction("https://eopwaxlqgzikhi9.m.pipedream.net", "Auto_DataAction");
//        Thread.sleep(4000);
//
//        rules.questionResponseQ3("<","10");
//        rules.stop_Survey();
//
//        rules.addNewruleQ1();
//        rules.questionResponse("<", "7");
//        rules.sendEmail("FeebakAuto_SurveyDetails", "Details for Your Survey", "swetha.s@fantacode.com");
//        rules.skipQuestion();
//
//        rules.addNewruleQ4();
//        rules.alwaysTrue();
//        rules.user("arjun");
//        rules.jumptoQuestion("Q6");

        rules.postAction();
        rules.postAction_surveyScore("<", "50");
       // rules.postAction_dataaction("https://eopwaxlqgzikhi9.m.pipedream.net", "Auto_DataAction");
        rules.postAction_participantData("=", "CustomerLevel", "Gold");
        rules.postAction_user("arjun");
        rules.postAction_sendEmail("FeebakAuto_SurveyDetails", "Details for Your Survey", "swetha.s@fantacode.com");

        rules.surveyTimeout();
        rules.surveyTimeOut_surveyScore(">", "90");
        rules.surveyTimeOut_sendEmail("SurveyDetails", "Details for Your Survey", "swetha.s@fantacode.com");
        rules.surveyTimeout_participantData("OfferSurvey", "false");
        rules.surveyTimeout_alwaysTrue();
        rules.surveyTimeout_dataaction("https://eopwaxlqgzikhi9.m.pipedream.net", "Auto_DataAction");
    }

    @Test(priority = 6, dependsOnMethods = "testSurveyRules")
    public void testPublishSurvey() throws InterruptedException {
        rules.publishSurvey();

    }

//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }
}
