package Qualibytes_1.Maven_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogicClass {
	private WebElement skill;
	private WebElement location;
	private WebElement button;
	WebDriver driver;
	
	public LogicClass (WebDriver driver) {
		this.driver = driver;
		//INITIALIZATION
		
		
		skill = driver.findElement(By.xpath("//input[@placeholder='Enter skills / designations / companies']"));
		location = driver.findElement(By.xpath("//input[@placeholder='Enter location']"));
		button = driver.findElement(By.xpath("//div[@class='qsbSubmit']"));
	}
	//USAGE
	public void setSkill() {
		skill.sendKeys("Automation Tester");
	}

	public void setlocation() {
		location.sendKeys("Noida");
	}
	public void searchbutton() {
		button.click();
	}

}
