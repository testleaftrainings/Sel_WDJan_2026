package com.leaftaps.base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ProjectSpecificMethods extends AbstractTestNGCucumberTests{
	//public  ChromeDriver driver; //NullPointerException
	private static final ThreadLocal<RemoteWebDriver> rd = new ThreadLocal<RemoteWebDriver>();
	public RemoteWebDriver getRd() {
		return rd.get();
	}
	public void setRd(RemoteWebDriver driver) {
		rd.set(driver);
	}
	@BeforeMethod
	public void preCondition() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--guest");
		//driver = new ChromeDriver(options); 
		setRd(new ChromeDriver(options));
		System.out.println("Base class driver value : "+getRd());
		getRd().manage().window().maximize();
		getRd().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		getRd().get("http://leaftaps.com/opentaps/control/main");
	}
	
	@AfterMethod
	public void postCondition() {
		getRd().close();
	}
}
