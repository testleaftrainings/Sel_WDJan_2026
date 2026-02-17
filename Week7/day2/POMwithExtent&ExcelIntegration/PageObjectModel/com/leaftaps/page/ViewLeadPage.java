package com.leaftaps.page;

import java.io.IOException;

import org.openqa.selenium.By;

import com.leaftaps.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	public ViewLeadPage user_verify_the_lead_id_using_the_company_name() throws IOException {
		
		try {
			String text = getRd().findElement(By.id("viewLead_companyName_sp")).getText();
			System.out.println(text);
				reportStep("pass","lead_id_ verified  successfully");
			} catch (Exception e) {
				reportStep("fail","lead_id_ not verified"+e);
			}
		
		return this;
	}
}
