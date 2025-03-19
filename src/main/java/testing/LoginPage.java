package testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
    public static void main(String[] args) {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
            driver.get("https://dev.feebak.com/");
            
            driver.findElement(By.xpath("//input[@placeholder='Organisation Name']"))
                 .sendKeys("Fantacode");

            WebElement dropdownElement = driver.findElement(By.tagName("select"));
            dropdownElement.click();
            Select dropdown = new Select(dropdownElement);
            dropdown.selectByVisibleText("Mumbai");
            
            driver.findElement(By.xpath("//button[normalize-space()='Log in with Genesys Cloud']"))
                 .click();
                 
            driver.findElement(By.id("email"))
                 .sendKeys("arjun.m@fantacode.com");
                 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Uncomment the following line when you want to close the browser
            // driver.quit();
        }
    }
}
