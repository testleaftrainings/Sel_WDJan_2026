package com.leaftaps.page;

import java.io.IOException;

import org.openqa.selenium.By;
import com.leaftaps.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

public MyHomePage clickCrmsfaLink() throws IOException {
	  try {
		getRd().findElement(By.linkText("CRM/SFA")).click();
		reportStep("pass","Crmsfa Link clicked successfully");
	} catch (Exception e) {
		reportStep("fail","Crmsfa Link not clicked"+e);
	}
	  return new MyHomePage();
}
}
