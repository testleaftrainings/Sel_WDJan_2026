package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	ChromeDriver driver;
	@Given("user launch the browser")
	public void launchBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	// io.cucumber.testng.UndefinedStepException:
	@Given("user loads the application url")
	public void user_loads_the_application_url() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("user enters username as DemoSalesManager")
	public void user_enters_username_as_demo_sales_manager() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	}

	@Given("user enters password as crmsfa")
	public void user_enters_password_as_crmsfa() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("user redirected to welcome page")
	public void user_redirected_to_welcome_page() {
		String expectedText ="CRM";
		String text = driver.findElement(By.xpath("//div[@id='label']/a")).getText();
		String[] split = text.trim().split("/");
		String actualText = split[0];
		Assert.assertEquals(actualText, expectedText);
	}

	@Then("user redirected to login page")
	public void user_redirected_to_login_page() {
		
		String expectedText =" User not found.";
		String text = driver.findElement(By.id("errorDiv")).getText();
		String[] split = text.split("login:");
		String actualText = split[1];
		Assert.assertEquals(actualText, expectedText);
	}

	@Given("user enters username as Demo")
	public void user_enters_username_as_demo() {
		driver.findElement(By.id("username")).sendKeys("Demo");
	}

	@Given("user enters password as crm123")
	public void user_enters_password() {
		driver.findElement(By.id("password")).sendKeys("crm123");
	}
	
//	io.cucumber.core.runner.DuplicateStepDefinitionException:
//	@Given("user loads the application url")
//	public void user_loads_the_application() {
//		System.out.println("leaftaps");
//	}
}

