package com.leaftaps.page;

import org.openqa.selenium.By;
import com.leaftaps.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	// driver global variable is null
//  public HomePage(ChromeDriver driver) {
//	  System.out.println("Home Page class driver value is "+driver);//b4
//		this.driver=driver;
//	}

public MyHomePage clickCrmsfaLink() {
	  getRd().findElement(By.linkText("CRM/SFA")).click();
	  return new MyHomePage();
}
}
