package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	
	//This is the constructor.this method will execute first.
	//initilaisation code will be written here
	public Login(WebDriver driver)
	{
		this.driver =driver;
		//PageFactory.initElements(driver, this);
	}

	//WebElement orgname = driver.findElement(By.xpath("//input[@placeholder='Organisation Name']"));
  //  WebElement dropdownElement = driver.findElement(By.tagName("select"));
    
	//PageFactory
		@FindBy(xpath="//input[@placeholder='Organisation Name']")
		WebElement orgname;
	
	
    public void loginApplication(String name)
    {
    	orgname.sendKeys(name);
    	//dropdownElement.click();
    	
    }
    public void goTo() {
    	driver.get("https://dev.feebak.com/");
    }
    }
	
	
	

	
	
