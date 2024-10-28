package testNg01;

import org.testng.annotations.Test;

public class KeywordEnabled {
	@Test (enabled = false)
	  public void abc() {
		  System.out.println("abc is running.");
	  }
	  @Test
	  public void def() {
		  System.out.println("def is running.");
	  }
	  @Test(enabled = false)
	  public void ghi() {
		  System.out.println("ghi is running.");
	  }
	  @Test
	  public void jkl() {
		  System.out.println("jkl is running.");
	  }
	  @Test(enabled = false)
	  public void mno() {
		  System.out.println("mno is running.");
	  }
}
