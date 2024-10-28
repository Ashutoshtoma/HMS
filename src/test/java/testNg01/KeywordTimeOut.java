package testNg01;

import org.testng.annotations.Test;

public class KeywordTimeOut {
	@Test 
	  public void abc() {
		  System.out.println("abc is running.");
	  }
	  @Test(timeOut = 5000)
	  public void def() {
		  System.out.println("def is running.");
	  }
	  @Test
	  public void ghi() {
		  System.out.println("ghi is running.");
	  }
}
