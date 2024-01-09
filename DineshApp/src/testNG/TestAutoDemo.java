package testNG;

	 import org.openqa.selenium.By;
	 import org.openqa.selenium.WebDriver;
	 import org.openqa.selenium.WebElement;
	 import org.openqa.selenium.chrome.ChromeDriver;
	 import org.testng.annotations.AfterTest;
	 import org.testng.annotations.BeforeTest;
	 import org.testng.annotations.Test;


public class TestAutoDemo {

	     WebDriver driver;

	     @BeforeTest
	     public void setUp() {
	         System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\DineshApp\\chromedriver.exe");
	         driver = new ChromeDriver();
	         driver.manage().window().maximize();
	         driver.get("https://demo.automationtesting.in/Register.html");
	     }

	     @Test
	     public void testRegistration() {
	         driver.findElement(By.xpath("input[placeholder='Full Name']")).sendKeys("dinesh");
	         driver.findElement(By.xpath("input[placeholder='Last Name']")).sendKeys("reddy");
	         driver.findElement(By.xpath("textarea[ng-model='Adress']")).sendKeys("madanapalle");
	         driver.findElement(By.xpath("input[ng-model='EmailAdress']")).sendKeys("dineshseva@example.com");
	         driver.findElement(By.xpath("input[ng-model='tel']")).sendKeys("8106098543");
//gender
	         WebElement genderMale = driver.findElement(By.xpath("//input[@value='Male']"));
	         genderMale.click();
//hobbies
	     
	         WebElement hobbyReading = driver.findElement(By.id("checkbox1"));
	         WebElement hobbyCricket = null;
			hobbyCricket.click();

	//language     
	         WebElement languageEnglish = driver.findElement(By.id("msdd"));
	         languageEnglish.click();
	         WebElement englishOption = driver.findElement(By.xpath("//a[text()='English']"));
	         englishOption.click();

	  //skills      
	         WebElement skillsDropdown = driver.findElement(By.id("Skills"));
	         skillsDropdown.sendKeys("Java");

	//country     
	         WebElement countryDropdown = driver.findElement(By.id("countries"));
	         countryDropdown.sendKeys("India");
//dob
	        
	         WebElement yearDropdown = driver.findElement(By.id("yearbox"));
	         yearDropdown.sendKeys("1995");
	         WebElement monthDropdown = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
	         monthDropdown.sendKeys("september");
	         WebElement dayDropdown = driver.findElement(By.id("daybox"));
	         dayDropdown.sendKeys("20");

//password	      
	         driver.findElement(By.id("firstpassword")).sendKeys("mpl123");
	         driver.findElement(By.id("secondpassword")).sendKeys("mpl123");
	//submit         
	         WebElement submitButton = driver.findElement(By.id("submitbtn"));
	         submitButton.click();

	     }
	  @AfterTest
	     public void tearDown() 
	  {
	        
	             driver.close();
	         }
	     

	     }

