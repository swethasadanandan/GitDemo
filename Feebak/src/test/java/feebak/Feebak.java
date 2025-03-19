package feebak;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Feebak {
//	public static WebDriver setupDriver() {

		WebDriver driver;
//	 String url= "https://dev.7144.feebak.zook.top";
	  
  @BeforeTest
	  public void setUp() {
		  driver = new ChromeDriver();
	  }
	  @BeforeMethod
	  public void Url() {
		  driver.get("https://dev.7144.feebak.zook.top");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));  

	}
	  @Test
	  public void login() {
}
	  
	  @AfterTest
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	
}
