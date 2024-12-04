package day14;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadWithRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.foundit.in/upload");
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
		
		JavascriptExecutor input = (JavascriptExecutor) driver;
		input.executeScript("arguments[0].click()", driver.findElement(By.name("file")));
		Thread.sleep(2000);
		// Copy the file path into click board
		StringSelection filepath = 
		new StringSelection("C:\\Users\\ashra\\OneDrive\\Desktop\\IncomeTranscript2015.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		Thread.sleep(2000);
		// Ctrl+V
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		
		//Click return or Enter key
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		
		driver.quit();
		

	}

}
