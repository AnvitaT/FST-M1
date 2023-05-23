import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.*;

public class Activity3 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/lms/");

        //Scroll the page
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,300)");

        // Print the title of the first info box
        WebElement headingElement = driver.findElement(By.cssSelector("h3.uagb-ifb-title"));
        String heading=  headingElement .getText();

        // Assertion for title of the first info box
        System.out.println("Heading: " + heading);
        Assert.assertEquals(heading, "Actionable Training");

        // Close the browser
        driver.close();
    }
}