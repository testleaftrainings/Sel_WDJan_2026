package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://leafground.com/alert.xhtml");
		// simple alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		// without handling the alert , if we interact with other webelement ?
		// UnhandledAlertException
		Alert alert = driver.switchTo().alert();
		alert.accept();
		// confirmation alert
		driver.findElement(By.xpath("//h5[contains(text(),'Confirm Dialog')]/following-sibling::button")).click();
		System.out.println(alert.getText());
		alert.dismiss();
		// prompt alert
		driver.findElement(By.xpath("//h5[contains(text(),'Prompt Dialog')]/following-sibling::button")).click();
		System.out.println(alert.getText());
		alert.sendKeys("Bhuvanesh");
		alert.accept();
		String verifyEnteredName = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(verifyEnteredName);
		alert.accept();// NoAlertPresentException
		driver.close();
	}
}
