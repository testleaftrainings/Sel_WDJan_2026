
package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class CreateLead extends ProjectSpecificMethods {
	
	@Test
	public  void runCreateLead() {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("bhuvanesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("moorthy");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("98000");
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String[] split = text.split(" ");
		String actualText =split[0]; 
		Assert.assertEquals(actualText,"Testleaf");
	}
}
