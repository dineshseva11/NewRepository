package Studyopedia;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinkAutomation1 {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\DineshApp\\src\\Studyopedia\\chromedriver.exe");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to Google
        driver.get("https://www.google.com");
        Thread.sleep(3000);

        // Find all visible links on the page
        java.util.List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        // Display the links
        for (WebElement link : allLinks) {
            if (link.isDisplayed()) {
                System.out.println(link.getText() + " - " + link.getAttribute("href"));

                // Click the link
                link.click();
                Thread.sleep(3000);


                // Perform your automation actions on the new page (e.g., wait for page to load, interact with elements)

                // Navigate back to the Google page
                driver.navigate().back();
            }
        }

        // Close the browser
        driver.quit();
    }
}
