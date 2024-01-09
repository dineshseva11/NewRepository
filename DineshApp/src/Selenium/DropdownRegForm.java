package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropdownRegForm {

	public static void main(String[] args)  {
	ChromeOptions options =new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Register.html");
	
	WebElement skillsDropdown=driver.findElement(By.id("skills"));
	
	List<WebElement> nvalues=skillsDropdown.findElements(By.tagName("option"));
	
	for(int i=0;i<nvalues.size();i++)
	{
		System.out.println(nvalues.get(i).getText());
	}
	}

}
