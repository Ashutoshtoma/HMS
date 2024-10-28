package testNg01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import HmsLogicalClasses.HmsHomePage;
import HmsLogicalClasses.HmsLoginPage;

public class HardAassertion1 {
	WebDriver driver;
	HmsLoginPage a;
	HmsHomePage b;
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Open Browser");
		driver = new ChromeDriver();;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://project1.qualibytes.com/backend/admin/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		a= new HmsLoginPage(driver);
		b= new 	HmsHomePage(driver);
	}
	@BeforeMethod
	public void loginHMS() {
		System.out.println("Login into Application");
		a.inputEmail();
		a.inputPassword();
		a.enterButton();
		System.out.println("Successfully Login");
	}
	
	@Test
	public void title() {
		String actTitle = driver.getTitle();
		String expTitle = ("Hospital Management System -A Super Responsive Information System");
		
		//AssertEquals used to match the expected to actual
		Assert.assertEquals(actTitle,expTitle);
		
		//AssertNotEquals used to not match the expected to actual
//		Assert.assertNotEquals(actTitle,expTitle);
		
		//Assert.assertTrue(True);
//		Assert.assertTrue(25==25);
//		Assert.assertFalse(25<25);
		if(actTitle.equals(expTitle)) {
			System.out.println("Actual and Expected Title is same.");
		}
		else{
			System.out.println("Actual and Expected Title is not same.");
			System.out.println("Actual Title is :- " + actTitle);
			System.out.println("Expected Title is :- " + expTitle);
//		}
	}
	}
  
}
