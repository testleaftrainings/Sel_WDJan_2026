package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnVerificationMethod {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		WebElement basicCheckBox = driver.findElement(By.xpath("//span[@class='ui-chkbox-label']"));
		boolean displayedState = basicCheckBox.isDisplayed();
		if (displayedState) {
			basicCheckBox.click();
			WebElement seletedStateOfTheElement = driver.findElement(By.xpath("//span[@class='ui-chkbox-label']/preceding-sibling::div/input"));
			System.out.println(seletedStateOfTheElement.isSelected());// true
		}else {
			Thread.sleep(2000);
			if (displayedState) {
				basicCheckBox.click();
			}
			
		}
		
		
	}

}
