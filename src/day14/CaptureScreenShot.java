package day14;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenShot {

	public static void main(String[] args) {

		// it would launch firefox browser
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// launching web page
 //    	driver.get("https://www.target.com/");
		driver.get("https://www.wikipedia.org/");

		// full page screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File targetFile = new File("D:\\Automation24\\SeleniumLesson24\\Screenshot\\image.png");	
		srcFile.renameTo(targetFile);
		
//		// capture the screenshot of a single element
//		WebElement targetEle = driver.findElement(By.xpath("//nav[@aria-label='Top languages']"));
//		File src = targetEle.getScreenshotAs(OutputType.FILE);
//		File dstn = new File("D:\\Automation24\\SeleniumLesson24\\Screenshot\\wiki.png");
//		src.renameTo(dstn);
		
		

	}

}
