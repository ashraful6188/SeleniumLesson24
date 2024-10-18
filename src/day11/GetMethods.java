package day11;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		


	WebDriver driver = new FirefoxDriver();// it would launch firefox browser
	// maximize the window
	driver.manage().window().maximize();
	// launching the application
 //	driver.get("https://demo.opencart.com/");
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	// get current title and return String
	String title = driver.getTitle();
	System.out.println("the title of the page : "+ title);
	// getCurrenturl() -- return URL of the page
	String url = driver.getCurrentUrl();
	System.out.println("the url of the page : "+ url);
	// getPageSource --return source code of the page
	String sourceCode = driver.getPageSource();
	// getWindowHandle() -- return ID of the current window
	String handle = driver.getWindowHandle();
	System.out.println("The ID of the page: "+ handle);
	// getWindowHandles() -- return Set elements the window
	WebElement hrmLink = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
	// click on hrmLink
	hrmLink.click();
	
	Set<String> handles = driver.getWindowHandles();
	System.out.println("The ID of the pages"+ handles);
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	



	}

}
