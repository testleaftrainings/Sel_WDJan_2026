package com.leaftaps.page;

import org.openqa.selenium.By;
import com.leaftaps.base.ProjectSpecificMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethods{
	// driver global variable is null
//	public LoginPage(ChromeDriver driver) {
//		System.out.println("parameterized value is "+driver);//b4
//		this.driver=driver;
//	}
	@Given("user enters username as {string}")
	public LoginPage enterUsername(String uname){
		System.out.println("page class driver value"+getRd());
		getRd().findElement(By.id("username")).sendKeys(uname);
		return this;
	}
	@Given("user enters password as {string}")
	public LoginPage enterPassword(String pword) {
		getRd().findElement(By.id("password")).sendKeys(pword);
		return this;
	}
	@When("user clicks the login button")
	public HomePage clickLoginButton() {
		getRd().findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}
}
