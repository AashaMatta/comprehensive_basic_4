import org.openqa.selenium.By;
Import org.openga.selenium.WebDriver;
 import org.openga.selenium.chrome.ChromeDriver;

public class InvalidLogin (

public static void main(String[] args) throws InterruptedException [

// Set the system property for the Chrome 

driver.System.setProperty("webdriver.chrome. driver". "C:\Users\aashamatta\Downloads chromedriver");

// Create a new Chrome WebDriver instance 
WebDriver driver = new Chrome Driver();

// Navigate to the FreeCRM website driver.get("https://www.freecrm.com/C:);

// Click on the Login button.

driver.findElement(By.xpath("//div[@class="btn btn-primary btn-xs-2 btn-shadow btn-rect btn- icon btn-icon-left']")).click(); 

// Enter an invalid username and password

driver findElement(By.xpath("//input[@name='email' and @type='email']")).sendKeys("aashatest@ttest.com");
driver.findElement(By.xpath("//input[@name="password" and @type='password']")).sendKeys("Test@1234");

// Click on the Login button again


driver.findElement(By.xpath("//button[@class='ui fluid large blue subest button and text()='Login']")).click();

// Verify that the Invalid error message is displayed

 String errorMessage = driver.findElement(By.xpath("//div[@class="header']").getText(); 
if (errorMessage.equals("something went wrong..."));

System.out.println("Invalid error message is displayed successfully!");

else{

System.out.println("Invalid error message is not displayed!");

// Close the browser driver quit);
driver.quit();

}
}
