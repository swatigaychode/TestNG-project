package DEMO1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class parameterization {
	

	//parameter({"username" , "password"})
	//public void method (String username,String password  {
	//System.out.println(username + " " +password);

	
	@Test
	@Parameters({"username" , "password"})
    public void method (String A1 ,String A2 ) {
	System.out.println(A1 + " " +A2);
	//Sdriver.get(A1);
	
	
	
	
	
	
	
	
	}


	
	
}
	
	
	
	
	

