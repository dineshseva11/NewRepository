package Studyopedia;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinkAutomation {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\DineshApp\\src\\Studyopedia\\chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Find all visible links on the page
        java.util.List<WebElement> visibleLinks = driver.findElements(By.tagName("a"));
     
    

        // Display the URLs of visible links
        for (WebElement link : visibleLinks) {
            String url = link.getAttribute("href");
            if (url != null && !url.isEmpty()) {
                System.out.println("Link Text: " + link.getText());
                System.out.println("URL: " + url);
                System.out.println("------------");
            }
        }

        // Close the browser
        driver.quit();
    }
}