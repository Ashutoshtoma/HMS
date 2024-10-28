package TestngGrouping;

import org.testng.annotations.Test;

public class TestngMetaGroup {
	  @Test(groups = {"logo"})
	  public void logo1() {
	  	  System.out.println("Logo1 is visible");
	    }
	    
	    @Test(groups = {"logo"})
	    public void logo2() {
	  	  System.out.println("Logo2 is visible");
	    }
	    @Test(groups = {"logo","input"})
	    public void logo3() {
	  	  System.out.println("Logo2 is visible and input is correct");
	    }
	    @Test(groups = {"title"})
	    public void title() {
	  	  System.out.println("title is correct");
	    }
}
