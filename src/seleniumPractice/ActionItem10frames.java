package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionItem10frames {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();// it would launch firefox browser
		// maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		// launching the web page
		driver.get("https://ui.vision/demo/webtest/frames/");
		// capture frame 4
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		// switch driver to the frame 4
		driver.switchTo().frame(frame4);
		// Capture the web element
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Learning Selenium In The Box");
		// switch the driver the again home page
		driver.switchTo().defaultContent();

	}

}
