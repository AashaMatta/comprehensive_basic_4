import org.openga.selenium.By;
 import org.openqa.selenium.WebDriver;
import org.openga.selenium.chrome.ChromeDriver;

public class Problem4 {

public static void main(String[] args) throws InterruptedException {

// Set the system property for the Chrome 

driver System setProperty("webdriver chrome driver". "C:\Users\aashamatta\Downloads\chromedriver");

// Create a new Chrome WebDriver instance WebDriver driver = new ChromeDriver();

// Navigate to the FreeCRM website driver.get("https://www.freeerm.com/);

// Click on the Login button 

driver.findElement(By.xpath("//button[@type='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();

// Click on the Signup button 

driver.findElement(By.xpath("//altext()='Sign Up T")).click();

// Enter a dummy email address

driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aashamatta@test.com");

// Click on the I'm not a robot checkbox

driver.findElement(By xpath("//input[@id='recaptcha-anchor' and @type='checkbox']")).click();

// Click on the Signup button

driver.findElement(By.xpath("//button[@type='submit' and text()='Sign up']")).click();

// Verify that the "Please accept the terms to continue." error message is displayed String errorMessage = driver.findElement(By xpath("//div[@class="header' and text()=Errors']")).getText();

If (errorMessage.equals("Please accept the terms to continue."))

System.out.println("\"Please accept the terms to continue\" error message is displayed successfully!");

else {

System.out.println("\"Please accept the terms to continue.\" error message is not displayed!");

// Close the browser 
driver.quit();

}
}}