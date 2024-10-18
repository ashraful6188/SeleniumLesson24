package day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationMethods {
	
	public static void main(String[]args) throws InterruptedException  {
	//	System.setProperty("webdriver.chrome.driver", "Directory")
	// create instance firefox driver instance
	WebDriver driver = new FirefoxDriver();// it would launch firefox browser
	// maximize the window
	driver.manage().window().maximize();
	// launching google home page
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	// navigating to amazon website
	driver.navigate().to("https://www.amazon.com");
	Thread.sleep(2000);
	// navigating to target website
	driver.navigate().to("https://www.target.com");
	Thread.sleep(2000);
	// going back
	driver.navigate().back();
	// forward back to amazon
	driver.navigate().forward();
	// refresh
	driver.navigate().refresh();
	

	driver.close();
	
	}
	
	

}
