package aashamattaCapstomeproject;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseTest {
 protected Webdriver driver;
 protected String baseUrl = "http://the-internet.herokuapp.com/"
 
 @BeforeSuite
 Public void setup(){
  driver = new ChromeDriver();
  driver.manage().window().maximize();
    driver.get(baseUrl);
	
	}
	
 @AfterSuite
 Public void teardown() {
 driver.quit();
   
    }
	
}