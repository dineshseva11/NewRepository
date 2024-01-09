package Studyopedia;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinksGetNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver =new ChromeDriver();
  driver.manage().window().maximize();
driver.get("https://www.google.com/");
List<WebElement>nlinks=driver.findElements(By.tagName("a"));
	
System.out.println("Total no.of links: " + nlinks.size());
for(int i=0;i<nlinks.size();i++)
{
System.out.println(nlinks.get(i).getText());
}
	}
}
