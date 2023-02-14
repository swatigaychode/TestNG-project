package DEMO1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertion {
	
	
	
	
	
	
	//hard Assert
	
	@Test
	public void method1() {
   Assert.assertEquals(10,20);
   System.out.println("hello");
   
}

	// soft Asser
	public void method2() {
		
		SoftAssert Assert1 = new SoftAssert();
		Assert1.assertEquals(10, 10, "value is not matching");
		System.out.println("hello");
		Assert1.assertAll(); //this is fix line this is mandtory
		
		
	
	}
}

