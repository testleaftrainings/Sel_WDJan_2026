package com.leaftaps.page;

import java.io.IOException;

import org.openqa.selenium.By;

import com.leaftaps.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	public CreateLeadPage user_enters_the_company_name_as_(String cname) throws IOException {
		try {
			getRd().findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
				reportStep("pass","company_name entered successfully as "+cname);
			} catch (Exception e) {
				reportStep("fail","company_name not entered"+e);
			}
		return this;
	}

	public CreateLeadPage user_enters_the_first_name_as_(String fname) throws IOException {
		
		try {
			getRd().findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
				reportStep("pass","first_name entered successfully as "+fname);
			} catch (Exception e) {
				reportStep("fail","first_name not entered"+e);
			}
		return this;
	}

	public CreateLeadPage user_enters_the_last_name_as_(String lname) throws IOException {
		
		try {
			getRd().findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
			reportStep("pass","last_name entered successfully as "+lname);
			} catch (Exception e) {
				reportStep("fail","last_name not entered"+e);
			}
		return this;
	}

	public CreateLeadPage user_enters_the_phone_number(String phNo) throws IOException {
		
		try {
			getRd().findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
			reportStep("pass","phone_number entered successfully as "+phNo);
			} catch (Exception e) {
				reportStep("fail","phone_number not entered"+e);
			}
		return this;
	}
	
	public ViewLeadPage user_clicks_the_create_lead_submit_button() throws IOException {
		
		try {
			getRd().findElement(By.name("submitButton")).click();
				reportStep("pass","submit_button clicked successfully");
			} catch (Exception e) {
				reportStep("fail","submit_button not clicked"+e);
			}
		return new ViewLeadPage();
	}

}
