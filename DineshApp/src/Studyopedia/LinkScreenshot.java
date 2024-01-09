package Studyopedia;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class LinkScreenshot {

    public static void main(String[] args) throws IOException, InterruptedException {
       
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\DineshApp\\src\\Studyopedia\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        
        List<WebElement> nlinks = driver.findElements(By.tagName("a"));
        
        for (int i = 0; i < nlinks.size(); i++) {
           
        	   nlinks.get(i).click();
        	 
        	   
            File screenshots1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Thread.sleep(2000);
            Files.copy(screenshots1, new File ("C:\\Users\\dell\\OneDrive\\Desktop\\Screenshots\\" + i + ".png"));
          
            
           driver.navigate().back();
           nlinks = driver.findElements(By.tagName("a"));

           
                        }
        
        driver.quit();
    }
}