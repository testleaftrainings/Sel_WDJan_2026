package com.leaftaps.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.leaftaps.base.ProjectSpecificMethods;
import com.leaftaps.page.LoginPage;

public class TC001_VerifyLogin extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName="Verify Login";
		testcaseDescription="Test to verify application is stable and grants access using valid credentials";
		authorName="Bhuvanesh";
		testCategory="Smoke";
	}
	
	
	@Test
	public void runVerifyLogin() throws IOException {
	System.out.println("TC001 class driver value"+getRd());
    LoginPage user =new LoginPage();
    user.enterUsername("demosalesmanager");
    user.enterPassword("crmsfa");
    user.clickLoginButton();
	}
}
