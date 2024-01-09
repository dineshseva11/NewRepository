package Selenium;

public class XpathDemo {



		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;


			public static void main(String[] args)  {
			ChromeOptions options =new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://www.google.comdriver");
			driver.findElement(By.xpath("/html/body/ntp-app//div/div[2]/ntp-realbox//div/input")).sendKeys("Selenium");
	}


