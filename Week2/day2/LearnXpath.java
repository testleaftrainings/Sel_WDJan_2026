package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnXpath {

	public static void main(String[] args) {

		FirefoxDriver driver; // declaration
		driver = new FirefoxDriver();// instantiation
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		// Extracting the text from the webelement ---> getText()
		// xpath based on text
		String textOnTheElement = driver.findElement(By.xpath("//h2[text()='Leaftaps Login']")).getText();
		System.out.println(textOnTheElement);
		// xpath based on attribute
		WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));
		usernameField.sendKeys("demosalesmanager");
		// xpath based on collection
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		// xpath based on partial match (attribute)
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
	    // xpath based on partial match (text)   ='Leaftaps Login'
		//h2[contains(text(),'Leaftaps')]
	}

}
