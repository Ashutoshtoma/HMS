package HmsLogicalClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HmsLoginPage {   //https://project1.qualibytes.com/backend/admin/index.php
	
	private WebElement email;
	private WebElement password;
	private WebElement button;
	
	WebDriver driver;
	public HmsLoginPage(WebDriver driver) {
		this.driver = driver;
		
		email = driver.findElement(By.xpath("//input[@type='email']"));
		password = driver.findElement(By.xpath("//input[@type='password']"));
		button = driver.findElement(By.xpath("//button[@type='submit']"));
	}
	
	public void inputEmail() {
		email.sendKeys("admin@mail.com");
	}
	public void inputPassword() {
		password.sendKeys("Password@123");
	}
	public void enterButton() {
		button.click();
	}
	

}
