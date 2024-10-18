package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleFrames {
	/*
	 * Note 1: driver focus can't directly switch one frame to another frame, then
	 * at first, driver focus come back homepage then switch to 2nd frame. 
	 * Note 2: There is several command , to change driver focus on between frame
	 *       a) driver.switchTo().frame(name )
	 *       b) driver.switchTo().frame (id)
	 *       c) driver.switchTo().frame(WebElement) 
	 *       d) driver.switchTo().frame(index)
	 * 
	 * Note 3:If html dom structure has tag with frame,iframe and form then this
	 * page has frame
	 */
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();// it would launch firefox browser
		// maximize the window
		driver.manage().window().maximize();
		// adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// launching the application
		driver.get("https://ui.vision/demo/webtest/frames/");

		// Frame 1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		// change the focus of the driver to frame 1
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("selenium");
		// going back to the home screen
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
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		// print "Journy" is frame 3
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Journy");
		// switch to the inner frame
		driver.switchTo().frame(0);
		// select the radio button
		driver.findElement(By.xpath("//div[@data-value='Hi, I am the UI.Vision IDE']")).click();
		// going back to the home screen
		driver.switchTo().defaultContent();
		// frame 4
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		// print automation is frame 4
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Finally");

	}

}
