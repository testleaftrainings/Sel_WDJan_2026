package com.leaftaps.testcases;

import org.testng.annotations.Test;

import com.leaftaps.base.ProjectSpecificMethods;
import com.leaftaps.page.LoginPage;

public class TC001_VerifyLogin extends ProjectSpecificMethods{
	@Test
	public void runVerifyLogin() {
	System.out.println("TC001 class driver value"+getRd());
    LoginPage user =new LoginPage();
    user.enterUsername("demosalesmanager");
    user.enterPassword("crmsfa");
    user.clickLoginButton();
	}
}
