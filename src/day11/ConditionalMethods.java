package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();// it would launch firefox browser
		// maximize the window
		driver.manage().window().maximize();
		// launching the application
	//	driver.get("https://demo.opencart.com/");
		driver.get("https://testautomationpractice.blogspot.com/");
		// identify searchField
	//	WebElement searchFiled = driver.findElement(By.xpath("//input[@name='search']"));
		 // idetify gender male button on the page
	WebElement male =     driver.findElement(By.xpath("//input@name='search'"));	
	    // find out display status
	    boolean status = male.isDisplayed();
	    System.out.println("Male button is displayed = " + status);
	    
	
		// find out display status
//		boolean displayStatus = searchFiled.isDisplayed();
		// print display status
//		System.out.println(" Search field is displayed = " + displayStatus);
		
		// find out enabled status
//		boolean enabledStatus = searchFiled.isEnabled();
		
		// print enabled
//		System.out.println("searh field is enabled = "+ enabledStatus);
		
		// type a search  item in the field
//	     searchFiled.sendKeys("iphone 15 plus");
		Thread.sleep(2000);
		
		driver.quit();
		
		

	}

}
