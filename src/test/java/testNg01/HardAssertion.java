package testNg01;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import HmsLogicalClasses.HmsHomePage;
import HmsLogicalClasses.HmsLoginPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HardAssertion {
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
	public void verifytitle() {
		b.title();
	}
	
}
