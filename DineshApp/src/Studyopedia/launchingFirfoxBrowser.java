package Studyopedia;

import org.openqa.selenium.firefox.FirefoxDriver;

public class launchingFirfoxBrowser {
	

	public static void main(String[] args) {
		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\dell\\eclipse-workspace\\DineshApp\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		
	}

}
