package Ultils_driver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class baseClass {
	 protected WebDriver driver;

	    @BeforeTest
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.get("https://dev.7757.feebak.zook.top/");
	        driver.manage().window().maximize();
	    }

	    @BeforeMethod
	    public void setUpTimeout() {
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    }

//	    @AfterTest
//	    public void teardown() {
//	        if (driver != null) {
//	            driver.quit();
//	        }
//	    }
	}



