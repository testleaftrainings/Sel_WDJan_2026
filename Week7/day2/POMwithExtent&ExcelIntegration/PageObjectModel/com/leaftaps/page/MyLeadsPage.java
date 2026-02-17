package com.leaftaps.page;

import java.io.IOException;

import org.openqa.selenium.By;

import com.leaftaps.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	
	public CreateLeadPage user_clicks_the_create_lead_link() throws IOException {
		
		try {
			getRd().findElement(By.linkText("Create Lead")).click();
				reportStep("pass","create Lead Link clicked successfully");
			} catch (Exception e) {
				reportStep("fail","create Lead Link not clicked"+e);
			}
	    return new CreateLeadPage();
	}

}
