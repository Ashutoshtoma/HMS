package testNg01;

import org.testng.annotations.Test;

public class KeywordPriority {
	
	//Q;- What would be happen if the methods have no priority?
	//Ans:- Then those methods are execute in alphabetical order.
//  @Test (priority=3)
//  public void abc() {
//	  System.out.println("abc is running.");
//  }
//  
//  @Test(priority=1)
//  public void def() {
//	  System.out.println("def is running.");
//  }
//  
//  @Test(priority=5)
//  public void ghi() {
//	  System.out.println("ghi is running.");
//  }
//  
//  @Test(priority=2)
//  public void jkl() {
//	  System.out.println("jkl is running.");
//  }
//  
//  @Test(priority=4)
//  public void mno() {
//	  System.out.println("mno is running.");
//  }
	
	
  
  //Q;- What would be happen if two methods have same priority? 
  //Ans;- Then those methods have same priority execute in alphabetical order.
//  @Test (priority=2)
//  public void abc() {
//	  System.out.println("abc is running.");
//  }
//  
//  @Test(priority=1)
//  public void def() {
//	  System.out.println("def is running.");
//  }
//  
//  @Test(priority=2)
//  public void ghi() {
//	  System.out.println("ghi is running.");
//  }
	
	
  
//  //Q:-What would be happen if Methods have priority in negative numbers?
//  //Ans:-Those method have highest negative value can be execte first.
//	 @Test (priority=-2)
//	  public void abc() {
//		  System.out.println("abc is running.");
//	  }
//	  
//	  @Test(priority=-1)
//	  public void def() {
//		  System.out.println("def is running.");
//	  }
//	  
//	  @Test(priority=-3)
//	  public void ghi() {
//		  System.out.println("ghi is running.");
//	  }
	
	
	
	//Q:-What would be happen if two Methods have same priority two have zero priority and one have no priority.
	//A:-
	@Test (priority=0)
	  public void abc() {
		  System.out.println("abc is running.");
	  }
	  @Test(priority=0)
	  public void def() {
		  System.out.println("def is running.");
	  }
	  @Test(priority=1)
	  public void ghi() {
		  System.out.println("ghi is running.");
	  }
	  @Test
	  public void jkl() {
		  System.out.println("jkl is running.");
	  }
	  @Test(priority=1)
	  public void mno() {
		  System.out.println("mno is running.");
	  }
  
  

}
