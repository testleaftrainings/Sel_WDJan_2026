package com.leaftaps.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.leaftaps.base.ProjectSpecificMethods;
import com.leaftaps.page.LoginPage;

public class TC002_CreateLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setValues() {
		testcaseName="Verify Lead Creation";
		testcaseDescription="Test to verify Lead creation with the valid lead information";
		authorName="Harrish";
		testCategory="Functional";
		fileName="CreateLead";
	}
	
	
	@Test(dataProvider = "extractData")
	public void runCreateLead(String cname,String fname, String lname, String phno ) throws IOException {
		LoginPage user = new LoginPage();
		user
			.enterUsername("demosalesmanager")
			.enterPassword("crmsfa")
			.clickLoginButton()
			.clickCrmsfaLink()
			.clickLeadsLink()
		.user_clicks_the_create_lead_link()
		.user_enters_the_company_name_as_(cname)
		.user_enters_the_first_name_as_(fname)
		.user_enters_the_last_name_as_(lname)
		.user_enters_the_phone_number(phno)
		.user_clicks_the_create_lead_submit_button()
		.user_verify_the_lead_id_using_the_company_name();
	}
}
