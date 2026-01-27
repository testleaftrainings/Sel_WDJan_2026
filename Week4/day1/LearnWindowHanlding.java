package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHanlding {
	public static void main(String[] args) {
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/window.xhtml");
		// requirement 1 : print the current window's id 
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> currentlyActiveWindowIds = driver.getWindowHandles();
		System.out.println("currently Active Window Ids are ");
		currentlyActiveWindowIds.forEach(System.out::println);
		List<String> listOfCurrentlyActiveWindowsID= new ArrayList<String>(currentlyActiveWindowIds);
		//listOfCurrentlyActiveWindowsID.addAll(currentlyActiveWindowIds);
		driver.switchTo().window(listOfCurrentlyActiveWindowsID.get(listOfCurrentlyActiveWindowsID.size()-1)); //IndexOutOfBound
		System.out.println(driver.getTitle());// dashboard // window
		driver.quit();// Quits this driver, closing every associated window
		//System.out.println(driver.getTitle());// dashboard // window //NoSuchWindowException

		
	}

}
