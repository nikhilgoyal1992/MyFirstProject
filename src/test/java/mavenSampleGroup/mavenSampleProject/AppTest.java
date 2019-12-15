package mavenSampleGroup.mavenSampleProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     * @throws InterruptedException 
     */
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
		 System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		
		
	}
	
	
	@BeforeMethod
	public void beforMethods()
	{
		System.out.println("Before method");
		 //System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		    //driver.get("https://www.tutorialspoint.com/index.htm");
	}
	
	@AfterMethod
	public void afetMethodd()
	{
		System.out.println("After method");
		// System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.close();
	}
	  @Test
	    public void testBrowser1() throws InterruptedException {
		//  System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://gmail.com");
	   // Thread.sleep(2000);
	   // loginPage login = PageFactory.initElements(driver, loginPage.class);
	   // login.sendKeysemailAddress("nikhil.goyal1992");
	  
	  }
	  
	  
	  @Test
	    public void testBrowser2() throws InterruptedException {
		//  System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.guru99.com/selenium-tutorial.html");
	   
	  }
	  
}
