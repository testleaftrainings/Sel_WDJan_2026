package com.leaftaps.page;

import java.io.IOException;

import org.openqa.selenium.By;
import com.leaftaps.base.ProjectSpecificMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethods{
	@Given("user enters username as {string}")
	public LoginPage enterUsername(String uname) throws IOException{
		try {
			getRd().findElement(By.id("username")).sendKeys(uname);
			// pass // step description // snap
			reportStep("pass","username Name entered successfully");
			
		} catch (Exception e) {
			// fail // step description // snap
			reportStep("fail","username Name  not entered"+e);
		}
		return this;
	}
	@Given("user enters password as {string}")
	public LoginPage enterPassword(String pword) throws IOException {
		try {
			getRd().findElement(By.id("password")).sendKeys(pword);
			reportStep("pass","password  entered successfully");
		} catch (Exception e) {
			reportStep("fail","password   not entered"+e);
		}
		return this;
	}
	@When("user clicks the login button")
	public HomePage clickLoginButton() throws IOException {
		try {
			getRd().findElement(By.className("decorativeSubmit")).click();
			Thread.sleep(3000);
			reportStep("pass","login button clicked  successfully");
		} catch (Exception e) {
			reportStep("fail","login button not clicked "+e);
		}
		return new HomePage();
	}
}
