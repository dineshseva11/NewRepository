package Selenium;

public abstract class linksscreenshots {

		import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;


		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\DineshApp\\src\\Studyopedia\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://google.com/");
				driver.findElement(By.linkText("Advertising")).click();
				//String GoogleTitle=driver.getTitle();
				
				File src=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
				Files.copy(src, new File("C:\\Users\\admin\\OneDrive\\Desktop\\ScreenShot\\GoogleImg.jpg"));
				//Files.copy(src, "C:\\Users\\admin\\OneDrive\\Desktop\\ScreenShot\\" + GoogleTitle + ".png"));
				
				//Screenshot from gmail
				
				driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox/");
				File src1=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
				Files.copy(src1, new File("C:\\Users\\admin\\OneDrive\\Desktop\\ScreenShot\\Gmail.jpg"));
			
			//Screenshot from Hindi
				driver.get("https://www.google.com/");
				String GoogleTitle=driver.getTitle();
				File src11=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				Files.copy(src11, new File("C:\\Users\\admin\\OneDrive\\Desktop\\ScreenShot\\" + Hindi + ".png"));
			
			
			//Screenshot from About
				
				driver.get("https://about.google/?utm_source=google-IN&utm_medium=referral&utm_campaign=hp-footer&fg=1");
			
				File src111=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
				Files.copy(src111, new File("C:\\Users\\admin\\OneDrive\\Desktop\\ScreenShot\\About.jpg"));
			
				//Screenshot from Adveritsing
				driver.get("https://ads.google.com/intl/en_in/home/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpafooter&fg=1");
				
			File src1111=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
			Files.copy(src1111, new File("C:\\Users\\admin\\OneDrive\\Desktop\\ScreenShot\\Advertising.jpg"));
			Thread.sleep(10000);
			driver.navigate().back();
			

		  	

		}

	


