package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

    public class DropDown {
    	WebDriver driver;
@BeforeTest
   public void setup() { 
    driver= new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://demo.automationtesting.in/Register.html");
  
}
 @Test
 public void dropDown() {
	WebElement year_dropdown=driver.findElement(By.xpath("//select [@id='yearbox']"));
	List<WebElement> value = year_dropdown.findElements(By.tagName("option"));
	 for(int i=0;i<value.size();i++)
	 {
	 System.out.println(value.get(i).getText());
	 
 }
 }
	}


