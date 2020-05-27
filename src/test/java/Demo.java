import static org.junit.Assert.*;

import org.junit.Test;

public class Demo {

	@Test
	public void TestPass() {
		int a = 1;
		int b = 2;
	    assertTrue(a+b==3);
	    
	    System.out.println("Right");
	}
	
	@Test
	public void TestFail() {
		int a = 1;
		int b = 2;
	    assertTrue(a+b==4);
	    
	    System.out.println("Wrong");
	}
	
}
