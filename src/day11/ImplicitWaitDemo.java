package day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args)  {
		
		// create a object and launch the firefox browser
		WebDriver driver = new FirefoxDriver();
		// maximize the window
		driver.manage().window().maximize();
		// page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		// Delete all cookies
		driver.manage().deleteAllCookies();
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// launching the application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// adding Thread.sleep(2000);
//		Thread.sleep(2000);

		// pass admin value to username field
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");

		driver.quit();
	}

}
