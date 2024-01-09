package Studyopedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChromeDriver {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\DineshApp\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		
	}

}
