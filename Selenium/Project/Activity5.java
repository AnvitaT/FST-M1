import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Activity5 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/lms/");

        // Select the My Account Menu item and click
        //String xpath = "/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div/div[2]/article/div[2]/h3";
        WebElement MyAccount = driver.findElement(By.cssSelector("#menu-item-1507 > a:nth-child(1)"));
       MyAccount.click();
          WebElement headingElement = driver.findElement(By.cssSelector("h1.uagb-ifb-title"));

        // Print the My Account Page title and Assertion for the same
        System.out.println("Heading: " + headingElement.getText());
        Assert.assertEquals(headingElement.getText(), "My Account");

        // Close the browser
        driver.close();
    }
}
