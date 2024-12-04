package day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadWithSendKeys {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.foundit.in/upload");
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
		driver.findElement(By.name("file"))
		.sendKeys("C:\\\\Users\\\\ashra\\\\OneDrive\\\\Desktop\\\\IncomeTranscript2015.pdf");

	}

}
