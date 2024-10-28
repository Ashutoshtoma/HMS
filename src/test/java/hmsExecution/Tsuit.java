	package hmsExecution;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(hmsExecution.MyListener.class)
public class Tsuit {
  @Test
  public void R1() {
	  System.out.println("R1 is running");
  }
  @Test
  public void R2() {
	  System.out.println("R2 is running");
  }
  @Test
  public void R3() {
	  System.out.println("R3 is running");
	  Assert.fail();
  }
  @Test
  public void R4() {
	  System.out.println("R4 is running");
  }
  @Test
  public void R5() {
	  System.out.println("R5 is running");
  }
  
}
