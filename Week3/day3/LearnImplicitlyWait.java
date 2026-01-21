package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnImplicitlyWait {

	public static void main(String[] args) {
		FirefoxDriver driver; // declaration
		driver = new FirefoxDriver();// instantiation
		driver.manage().window().maximize();
		//Specifies the amount of time the driver should wait 
		// when searching for an element if it is not immediately present. 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		List<WebElement> anchorTagElements = driver.findElements(By.tagName("a")); //if it is present.
		System.out.println(anchorTagElements.size());
		List<String> anchorTextList = new ArrayList<String>();
		for (int i = 0; i < anchorTagElements.size(); i++) {
			String temp = anchorTagElements.get(i).getText();
			System.out.println(temp);
			anchorTextList.add(temp);
		}
		driver.findElement(By.id("EMail")).sendKeys("bhuvanesh@testleaf.com");//if it is not immediately present. 
	}

}
