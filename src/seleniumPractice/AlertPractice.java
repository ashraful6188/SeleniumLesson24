package seleniumPractice;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		// launch firefox browser
		WebDriver driver = new FirefoxDriver();
		// maximize windows
		driver.manage().window().maximize();
		// add pageLoadTimeout for page load
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// launch the application
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//		// capture the element & click it 
//	    driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//	    Thread.sleep(2000);
//	    Alert al = driver.switchTo().alert();
//	    System.out.println(al.getText());
//	    al.accept();

//	    // capture the element & click it 
//	    driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//	    Thread.sleep(2000);
//	    Alert al = driver.switchTo().alert();
//	    System.out.println(al.getText());
//	    // accept by clicking OK button
//	    //al.accept();
//	    // dismiss by clicking Cancel button
//	    al.dismiss();

//	    // capture the element & click it 
//	    driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//	    Thread.sleep(2000);
//	    Alert al = driver.switchTo().alert();
//	    System.out.println(al.getText());
//	    al.sendKeys("I am Alert");
//	    // accept by clicking OK button
//	      al.accept();
//	    // dismiss by clicking Cancel button
//	    //al.dismiss();

		// capture the element & click it
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// capture alert without switchTo().alert()
		Alert al = myWait.until(ExpectedConditions.alertIsPresent());
		System.out.println(al.getText());
		al.sendKeys("I am Alert");
		// accept by clicking OK button
		al.accept();

	}

}
