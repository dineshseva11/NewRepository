package Studyopedia;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

					ChromeDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://www.google.com");
					//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("Selenium");
					
					//driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("java selenium");
					//driver.findElement(By.xpath("//textarea[@id='APjFqb'][@class='gLFyf'][@name='q']")).sendKeys("java with selenium");
					//driver.findElement(By.xpath("//textarea[@id='APjFqb' and @class='gLFyf' and @name='q']")).sendKeys("java with selenium");
					//driver.findElement(By.xpath("//textarea[@id='APjFqb' or @class='gLFyf' or @name='q']")).sendKeys(" indian cricket team");
	
				//	driver.findElement(By.xpath("//textarea [contains(@id,'A')]")).sendKeys("java");
					/*
					driver.navigate().to("https://www.rediff.com/");
					
					driver.findElement(By.linkText(" Create Account")).click();
				
					driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("dinesh");
				*/
					
					String	indiatext =driver.findElement(By.xpath("//div[text()='India']")).getText();			
					System.out.println(indiatext);
					if(indiatext.equals("India"))
					{
					System.out.println("text is present");	
					}
					else
					{
						System.out.println("text is not present");
					
					}
					
					
					
	}

}
