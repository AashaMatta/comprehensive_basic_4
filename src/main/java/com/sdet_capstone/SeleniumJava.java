import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TheInternetHerokuAppTest {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\Users\aasha.matta\Downloads\chromedriver_win32"); 
        driver = new ChromeDriver();
    }

    @Test
    public void CapstoneProject() {
        driver.get("http://the-internet.herokuapp.com/");

        // 1. Verify the title
        Assert.assertEquals(driver.getTitle(), "Welcome to the-internet");

        // 2. A/B Testing link and text verification
        WebElement abTestingLink = driver.findElement(By.linkText("A/B Testing"));
        abTestingLink.click();
        Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), "A/B Test Variation 1");

        // 3. Navigate back to Home page and click on dropdown, and select Option1
        driver.navigate().back();
        WebElement dropdownLink = driver.findElement(By.linkText("Dropdown"));
        dropdownLink.click();
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        dropdown.findElement(By.xpath("//option[text()='Option 1']")).click();
        Assert.assertEquals(dropdown.getAttribute("value"), "1");  // Confirm Option1 is selected

        // 5. Navigate back to Home Page and Click on Frames
        driver.navigate().back();
        WebElement framesLink = driver.findElement(By.linkText("Frames"));
        framesLink.click();

        // 6. Verify hyperlinks presence
        Assert.assertTrue(driver.findElement(By.linkText("Nested Frames")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.linkText("iFrame")).isDisplayed());
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
