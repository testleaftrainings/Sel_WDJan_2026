package com.leaftaps.testcases;

import org.testng.annotations.Test;

import com.leaftaps.base.ProjectSpecificMethods;
import com.leaftaps.page.LoginPage;

public class TC002_CreateLead extends ProjectSpecificMethods {
	@Test
	public void runCreateLead() {
		System.out.println("TC002 class driver value"+getRd());
		LoginPage user = new LoginPage();
		// user flow inside the application
		user.enterUsername("demosalesmanager").enterPassword("crmsfa").clickLoginButton().clickCrmsfaLink().clickLeadsLink();
	}
}
