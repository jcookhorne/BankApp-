package E2E;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {
public static WebDriver driver;
	
	@BeforeEach
	public void setup() {
		// to create an instace of our  driver we need
		// an executable driver downloaded from the Browser
		// set the file path to the web driver executable
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Joshua Cookhorne\\Documents\\Selenium\\chromedriver_win\\chromedriver.exe");
//C:\Users\Joshua Cookhorne\Documents\Selenium\selenium-java-4.1.3.zip\selenium-chrome-driver-4.1.3
		driver = (WebDriver) new ChromeDriver();
	}

	@AfterAll
	public static void tearDown() {
		driver.quit();
		// take a look into the difference between driver.close( and driver .quit
		
	}
	
//	@Test
//	public void Facebookhometest() {
//		//I want to navigate to facebooks homepage
//		driver.get("http://www.facebook.com");
//		// make sure the title of the page is what it should be
//		
//		String pageTitle = driver.getTitle();
//		assertEquals("Facebook - log in or sign up", pageTitle);
//		
//	}
//    @Test
//    public void wikipediaEnglishLinkWorks() {
//    	// navigate to wikipedia.org
//    	driver.get("https://www.wikipedia.org");
//   
//    	// click on the English Link
//    	
//    	WebElement english = driver.findElement(By.id("js-link-box-en"));
//    	english.click();
//    	
//    	// verify that the user is on the english page
//    	assertEquals("Wikipedia, the free encyclopedia", driver.getTitle());
//    }
    @Test
    public void revaturehirenow() {
    	driver.manage().window().maximize();
    	driver.get("https://revature.com/");
    	assertEquals("Hire Your Next MVP Today", driver.getTitle());
    	WebElement rev = driver.findElement(By.className("new_b2b_stage"));
    	rev.click();
    	assertEquals("Hire Your Next MVP Today", driver.getTitle());
    }
    @Test
    public void revaturehomepage() {
    	driver.manage().window().maximize();
    	driver.get("https://revature.com/");
    	WebElement rev = driver.findElement(By.id("menu-item-28836"));
    	rev.click();
    	assertEquals("Hire Your Next MVP Today", driver.getTitle());
    }
}
