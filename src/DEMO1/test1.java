package DEMO1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {
	
	 @Test
	 public void test1method1() {
	  
	  System.out.println("test1method1");
	 }
	 
	 @BeforeSuite
	 public void test1method2() {

		  System.out.println("test1method2BeforeSuite");
}
	  
	  @AfterSuite
	  public void test1method3() {
		  
		  
		  System.out.println("test1method6AfterClass");
	  }

	  
	  @BeforeTest
	  public void test1method4() {

	   System.out.println("test1method7BeforeClass");
	  }
	 @AfterTest
	  public void test1method5() {

	   System.out.println("test1method8BeforeMethod");
	  }

	  @AfterClass
	  public void test1method6() {
		  System.out.println("test1method6afterClass");
		  
	  }
	  @BeforeClass
	  public void test2method7() {

		  System.out.println("test2method3beforeclass");
		 }
		 
		 @AfterClass
		 public void test2method8() {

		  System.out.println("test2method4Afterclass");
		 }
		 @BeforeMethod
		 public void test2method9() {

		  System.out.println("test2method5BeforeMethod");
		 }

		 
		 @AfterMethod
		 public void test2method10() {
			  System.out.println("test2method6AfterMethod");
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  

		 }

		 
		  
		  
		  

		  
	  
	  
	  

	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  }
	  
