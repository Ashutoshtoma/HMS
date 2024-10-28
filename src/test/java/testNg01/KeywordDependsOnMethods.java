package testNg01;

import org.testng.annotations.Test;
import org.testng.Assert;



public class KeywordDependsOnMethods {
	@Test 
	  public void abc() {
		  System.out.println("abc is running.");
		  Assert.fail();
	  }
	  @Test
	  public void def() {
		  System.out.println("def is running.");
	  }
	  @Test
	  public void ghi() {
		  System.out.println("ghi is running.");
	  }
	  @Test
	  public void jkl() {
		  System.out.println("jkl is running.");
	  }
	  @Test(dependsOnMethods = {"abc"})
	  public void mno() {
		  System.out.println("mno is running.");
	  }
}
