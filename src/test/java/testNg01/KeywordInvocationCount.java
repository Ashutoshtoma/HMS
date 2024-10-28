package testNg01;

import org.testng.annotations.Test;

public class KeywordInvocationCount {
	
	
//	@Test(invocationCount=2)
//	  public void copy1() {
//		  System.out.println("copy1 is running");
//	  }
	
	
	
	//Q:-What would be happen if invocation count is zero?
	//A:-default test  1, default suit = 0
//	@Test(invocationCount=0)
//	  public void copy2() {
//		  System.out.println("copy1 is running");
//	  }
	
	
	//Q:-What would be happen if invocation count is negative?
		//A:-default test  1, default suit = 0
		@Test(invocationCount=-2)
		  public void copy2() {
			  System.out.println("copy1 is running");
		  }
}
