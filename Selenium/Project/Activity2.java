import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Activity2 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/lms/");

              // Print the heading of the page
        WebElement headingElement = driver.findElement(By.cssSelector("h1.uagb-ifb-title"));
        String heading=  headingElement .getText();

           // Assertion for page heading
        System.out.println("Heading: " + heading);
        Assert.assertEquals(heading, "Learn from Industry Experts");

        // Close the browser
        driver.close();
    }
}