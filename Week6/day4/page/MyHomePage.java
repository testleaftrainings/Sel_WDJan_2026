package com.leaftaps.page;

import org.openqa.selenium.By;
import com.leaftaps.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
//	 public MyHomePage(ChromeDriver driver) {
//		 System.out.println("My Home Page class driver value is "+driver);//b4
//			this.driver=driver;	}

	public void clickLeadsLink() {
		  getRd().findElement(By.linkText("Leads")).click();
	}
}
