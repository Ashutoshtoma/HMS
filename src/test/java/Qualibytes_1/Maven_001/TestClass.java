package Qualibytes_1.Maven_001;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {
	public static void main (String args[]) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		LogicClass a = new LogicClass(driver);
		a.setSkill();
		a.setlocation();
		a.searchbutton();
	}
}
