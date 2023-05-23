import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.*;

public class Activity4 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/lms/");

        //Scroll the page
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,1000)");

        // Print the title of the second most popular course
        String xpath ="/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div/div[2]/article/div[2]/h3";
        WebElement headingElement = driver.findElement(By.xpath(xpath));
        String heading=  headingElement .getText();

        //Assertion for title of the second most popular course
        System.out.println("Heading: " + heading);
        Assert.assertEquals(heading, "Email Marketing Strategies");

        // Close the browser
        driver.close();
    }
}