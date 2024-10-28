package HmsLogicalClasses;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class HmsHomePage {

	@FindBy(xpath = "//*[@id=\\\"wrapper\\\"]/div[1]/div")
	private WebElement logo;
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/div[1]/ul[2]/li[1]/button/i")
	private WebElement option;
	
	
	WebDriver driver;
	
	
	public HmsHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	public void verifylogo() {
		boolean result = logo.isDisplayed();
		if(result = true) {
			System.out.println("Logo is displayed so Test is Passed" + result);
		}
		else {
			System.out.println("Logo is not displayed so Test is failed");
		}
	}
	public void title() {
		String actTitle = driver.getTitle();
		String expTitle = ("Hospital Management System");
		System.out.println("Actual Title is :- " + actTitle);
		System.out.println("Expected Title is :- " + expTitle);
//		Assert.assertEquals(actTitle,expTitle);
//		if(actTitle.equals(expTitle)) {
//			System.out.println("Actual and Expected Title is same.");
//		}
//		else{
//			System.out.println("Actual and Expected Title is not same.");
//			System.out.println("Actual Title is :- " + actTitle);
//			System.out.println("Expected Title is :- " + expTitle);
//		}
	}
	public void optionbutton() {
		option.click();
	}
	
	
}
