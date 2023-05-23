import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Activity8 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/lms/");

        // Select the menu item Contact Us and click
        //String xpath = "/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div/div[2]/article/div[2]/h3";
        WebElement ContactUs = driver.findElement(By.cssSelector("#menu-item-1506 > a:nth-child(1)"));
       ContactUs.click();

        //Scroll the page
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)");

        //Fill the contact details and Submit

        driver.findElement(By.id("wpforms-8-field_0")).sendKeys("Anvita Tiwari");
        driver.findElement(By.id("wpforms-8-field_1")).sendKeys("anvita.t@gmail.com");
        driver.findElement(By.id("wpforms-8-field_3")).sendKeys("Software");
        driver.findElement(By.id("wpforms-8-field_2")).sendKeys("For Selenium Activity");
        driver.findElement(By.id("wpforms-submit-8")).click();

        // Print the output message
        String MessageOutput= driver.findElement(By.id("wpforms-confirmation-8")).getText();
        System.out.println(MessageOutput);

        // Close the browser
        driver.close();

    }
}