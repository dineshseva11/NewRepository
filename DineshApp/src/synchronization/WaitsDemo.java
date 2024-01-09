package synchronization;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsDemo {
         
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//ChromeDriver driver =new ChromeDriver(options);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https//:www.google.com/");
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.getTitle());
		
		//explicitly wait
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Images")));
		driver.findElement(By.linkText("Images")).click();
		driver.close();
		
		//Fluent wait
		
		Wait<WebDriver> myWait = new  FluentWait<WebDriver>(driver)
				                 .withTimeout(Duration.ofSeconds(20))
				                 .pollingEvery(Duration.ofSeconds(5))
				                 .ignoring(Exception.class);
	

		
	}

}
