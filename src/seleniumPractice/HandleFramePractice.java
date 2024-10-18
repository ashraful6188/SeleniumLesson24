package seleniumPractice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFramePractice {

	public static void main(String[] args) {

		// launch firefox browser
		WebDriver driver = new FirefoxDriver();
		// maximize windows
		driver.manage().window().maximize();
		// add pageLoadTimeout for page load
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// launch the application
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frame = driver.findElement(By.xpath("//frame[contains(@src, 'frame_1.html')]"));
		// switch the driver focus frame 1
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[contains(@name, 'mytext1')]")).sendKeys("Ashraful");
		// switch the driver focus on the home page
		driver.switchTo().defaultContent();
		// frame 2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		// change the focus of the driver to frame 2
		driver.switchTo().frame(frame2);
		// print "automation" is frame 2
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("automation");
		// going back to the home screen
		driver.switchTo().defaultContent();
		// frame 3
		WebElement frame3 = driver.findElement(By.cssSelector("frame[src='frame_3.html']"));
		// change the focus of the driver to frame 3
		driver.switchTo().frame(frame3);
		// print "automation" is frame 3
		driver.findElement(By.cssSelector("input[name='mytext3']")).sendKeys("java");
		// chang the driver focus iframe
		driver.switchTo().frame(0);
		// click web testing check box
		driver.findElement(By.xpath("//span[text()='Web Testing' and @class='aDTYNe snByac n5vBHf OIC90c']")).click();
		// switch driver focus home page
		driver.switchTo().defaultContent();
		// frame 5
		WebElement frame5 = driver.findElement(By.cssSelector("frame[src='frame_5.html']"));
		// switch driver focus frame 5
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Selenium");
		// click frame 5 link
		driver.findElement(By.xpath("//a[text()='https://a9t9.com']")).click();
		driver.switchTo().defaultContent();

	}

}
