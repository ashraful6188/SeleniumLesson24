package day12;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlerts {
	// Note: Alert is not WebElement 

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();// it would launch firefox browser
		// maximize the window
		driver.manage().window().maximize();
		// add implicitly wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// launching the application
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//		//1) click on JS alert ( Normal Alert with OK button ) 
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Thread.sleep(2000);
//		//Normal js alert ok button
//		Alert myalert = driver.switchTo().alert();
//		System.out.println(myalert.getText());
//		myalert.accept();
	
		
//		// 2) confirmation alert - ok and cancel
//		// click on JS confirm button
//		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//		Thread.sleep(2000);
//		//driver.switchTo().alert().dismiss();// close alert using cancel
//	    driver.switchTo().alert().accept();// close alert using ok button
		

//		// 3) Prompt alert -input box
//		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//		Thread.sleep(1500);
//		Alert myalert3 = driver.switchTo().alert();
//		System.out.println("Text message on alert :"+ myalert3.getText());
//		myalert3.sendKeys("Alert learning !");
//		myalert3.accept();
		
//		// handle alert without using switchTo().alert()
//		// handle alert By using explicit wait
//		//1) click on JS alert ( Normal Alert with OK button ) 
//		//   declare explicit wait  
//		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Thread.sleep(2000);
//		//Normal js alert ok button
//	    Alert myalert =	myWait.until(ExpectedConditions.alertIsPresent()); // capture alert
//		System.out.println(myalert.getText());
//		myalert.accept();
		
		// Alert handle by JavascriptExecutor
		//1) click on JS alert ( Normal Alert with OK button ) 
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		JavascriptExecutor scriptAlert = (JavascriptExecutor) driver;
		scriptAlert.executeScript("window.alert=function{}");
		
	
		
		

	}

}
