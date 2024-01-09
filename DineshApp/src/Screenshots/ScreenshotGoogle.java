package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class ScreenshotGoogle {

	public static void main(String[] args) throws IOException {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//ChromeDriver driver =new ChromeDriver(options);
		WebDriver driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https//:www.google.com/");
		String GoogleTitle = driver.getTitle();	

		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//Files.copy(src, new File("C:\\Users\\dell\\OneDrive\\Desktop\\Screenshots\\GoogleImg.jpg"));
		Files.copy(src, new File("C:\\Users\\dell\\OneDrive\\Desktop\\Screenshots\\"+ GoogleTitle +" .png"));

	}

}
