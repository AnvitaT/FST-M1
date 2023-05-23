import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Activity9 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://alchemy.hguy.co/lms/");

        //My Account Login
        WebElement MyAccount = driver.findElement(By.cssSelector("#menu-item-1507 > a:nth-child(1)"));
        MyAccount.click();

        WebElement headingElement = driver.findElement(By.cssSelector("h1.uagb-ifb-title"));
        driver.findElement(By.cssSelector(".ld-login")).click();
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();


        // Select the menu item All Courses and click
        //String xpath = "/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div/div[2]/article/div[2]/h3";
        WebElement AllCourses = driver.findElement(By.cssSelector("#menu-item-1508 > a:nth-child(1)"));
        AllCourses.click();

        //Scroll the page
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");

        //Course Content selection

        driver.findElement(By.cssSelector("#post-69 > div:nth-child(3) > p:nth-child(3) > a:nth-child(1)")).click();

        //Scroll the page
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("window.scrollBy(0,1000)");

        driver.findElement(By.id("ld-expand-button-69")).click();

        //Scroll the page
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("window.scrollBy(0,250)");

        //String ClickCourse= driver.findElement(By.cssSelector("#ld-table-list-item-183 > a:nth-child(1) > span:nth-child(2)")).getText();

        driver.findElement(By.cssSelector("#ld-table-list-item-183 > a:nth-child(1) > span:nth-child(2)")).click();

        // Print the title of the page

        WebElement heading=driver.findElement(By.cssSelector(".ld-focus-content > h1:nth-child(1)"));
        System.out.println(heading.getText());
        Assert.assertEquals(heading.getText(), "Basic Investment & Social Media Influencing");

        // Close the browser
        driver.close();

    }
}