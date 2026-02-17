package com.leaftaps.page;

import java.io.IOException;

import org.openqa.selenium.By;
import com.leaftaps.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	public MyLeadsPage clickLeadsLink() throws IOException {
		  try {
			  getRd().findElement(By.linkText("Leads")).click();
				reportStep("pass","Leads Link clicked successfully");
			} catch (Exception e) {
				reportStep("fail","Leads Link not clicked"+e);
			}
		  return new MyLeadsPage();
	}
}
