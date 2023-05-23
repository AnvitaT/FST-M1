import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Activity7 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/lms/");

        // Select the menu item All Courses and click
        //String xpath = "/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div/div[2]/article/div[2]/h3";
        WebElement AllCourses = driver.findElement(By.cssSelector("#menu-item-1508 > a:nth-child(1)"));
        AllCourses.click();

        //Scroll the page
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");

        //Print the number of total courses.

        int TotalCourses = driver.findElements(By.className("entry-title")).size();
        System.out.println("Total no.of Courses:"+  TotalCourses);

        // Close the browser
        driver.close();

    }
}