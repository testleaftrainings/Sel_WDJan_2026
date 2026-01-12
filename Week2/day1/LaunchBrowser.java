package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		// Step no.1: Establishing environment for the automation testing
		// Instantiation of browser driver
		ChromeDriver driver; // declaration
		driver = new ChromeDriver();// instantiation
		// Step no.2: maximize the browser
		driver.manage().window().maximize();
		// Step no.3: Load the url
		driver.get("https://www.google.com/");
		// Step no.4: Verify the title
		String titleOfTheCurrentWindow = driver.getTitle();
		System.out.println(titleOfTheCurrentWindow);
		// Step no.5: Close the browser
		driver.close();
		
		
	}

}
