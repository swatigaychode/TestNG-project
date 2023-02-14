package DEMO1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pareleleTesting {
	//declaire a globly
	public WebDriver driver;
	
	@Test
	public void test1() {
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		  
		
		
	}
    @Test
	public void test2() {
	 driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		
		
		
		//one time open many browesrss

	 
	
		
		
		
		
		
	}
}
