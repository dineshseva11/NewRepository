package Selenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSelf {

	public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			

						ChromeDriver driver = new ChromeDriver();
						driver.manage().window().maximize();
						driver.get("https://www.zoho.com/crm/signup.html");
						//self.Xpath
					//	driver.findElement(By.xpath("//input[@name='password']/self::input")).sendKeys("dineshreddy");		
		/*				
	List<WebElement> taglist= driver.findElements(By.xpath("//div[@class='za-password-container sgfrm']/self::*"));
	System.out.println(taglist.size());
	for(int i = 0;i<taglist.size();i++) {
		System.out.println(taglist.get(i).getTagName());
		
						List<WebElement> plist= driver.findElements(By.xpath("//div[@class='za-password-container sgfrm']/parent::*"));
						System.out.println(plist.size());
						for(int i = 0;i<plist.size();i++) {
							System.out.println(plist.get(i).getTagName());				
		
						
						List<WebElement>clist= driver.findElements(By.xpath("//div[@class='za-password-container sgfrm']/child::*"));
						System.out.println(clist.size());
						for(int i = 0;i<clist.size();i++) {
							System.out.println(clist.get(i).getTagName());
			
						
						List<WebElement> alist= driver.findElements(By.xpath("//div[@class='za-password-container sgfrm']/ancestor::*"));
						System.out.println(alist.size());
						for(int i = 0;i<alist.size();i++) {
							System.out.println(alist.get(i).getTagName());	
				
						List<WebElement> aslist= driver.findElements(By.xpath("//div[@class='za-password-container sgfrm']/ancestor-or-self::*"));
						System.out.println(aslist.size());
						for(int i = 0;i<aslist.size();i++) {
							System.out.println(aslist.get(i).getTagName());
				
						List<WebElement> dlist= driver.findElements(By.xpath("//div[@class='za-password-container sgfrm']/descendant::*"));
						System.out.println(dlist.size());
						for(int i = 0;i<dlist.size();i++) {
							System.out.println(dlist.get(i).getTagName());
						
						
						List<WebElement> dslist= driver.findElements(By.xpath("//div[@class='za-password-container sgfrm']/descendant-or-self::*"));
						System.out.println(dslist.size());
						for(int i = 0;i<dslist.size();i++) {
							System.out.println(dslist.get(i).getTagName());
						
						
						List<WebElement> polist= driver.findElements(By.xpath("//div[@class='za-password-container sgfrm']/preceding::*"));
						System.out.println(polist.size());
						for(int i = 0;i<polist.size();i++) {
							System.out.println(polist.get(i).getTagName());	
					
						
						List<WebElement> pslist= driver.findElements(By.xpath("//div[@class='za-password-container sgfrm']/preceding-sibling::*"));
						System.out.println(pslist.size());
						for(int i = 0;i<pslist.size();i++) {
							System.out.println(pslist.get(i).getTagName());	
						
						
						List<WebElement> flist= driver.findElements(By.xpath("//div[@class='za-password-container sgfrm']/following::*"));
						System.out.println(flist.size());
						for(int i = 0;i<flist.size();i++) {
							System.out.println(flist.get(i).getTagName());		
						
						List<WebElement> fslist= driver.findElements(By.xpath("//div[@class='za-password-container sgfrm']/following-sibling::*"));
						System.out.println(fslist.size());
						for(int i = 0;i<fslist.size();i++) {
							System.out.println(fslist.get(i).getTagName());
						
				*/		
				// identify the fullname field from creating password field
driver.findElement(By.xpath("//div[@class='za-password-container sgfrm']/ancestor::section//input[@id='namefield']")).sendKeys("dinesh");
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='za-password-container sgfrm']/following::input[@id='rmobile']")).sendKeys("8106098543");
						
						
						
						
						
								
						
						
						
	}
	
	
	}


