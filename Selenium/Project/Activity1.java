import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity1 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/lms/");
        // Print the title of the page
        System.out.println("Website title: " + driver.getTitle());

        // Check the title of the page
        String title = driver.getTitle();

        //Assertion for page title
        Assert.assertEquals("Alchemy LMS – An LMS Application", title);

        Assert.assertEquals(driver.getTitle(), "Alchemy LMS – An LMS Application");

        // Close the browser
        driver.close();
    }
}