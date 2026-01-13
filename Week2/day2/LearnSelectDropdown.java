package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectDropdown {

	public static void main(String[] args) {

		FirefoxDriver driver; // declaration
		driver = new FirefoxDriver();// instantiation
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Qeagle");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bhuvanesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Moorthy");
		WebElement sourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		// select class -->  Choosing the option based on index
		Select option = new Select(sourceDropDown);
		int sizeOfOption = option.getOptions().size();// 13
		option.selectByIndex(sizeOfOption-1);
		WebElement marketingCampDropDown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		// Choosing the option based on value as the attribute 
		Select  marketingOption = new Select(marketingCampDropDown);
		marketingOption.selectByValue("DEMO_MKTG_CAMP");
	}

}
