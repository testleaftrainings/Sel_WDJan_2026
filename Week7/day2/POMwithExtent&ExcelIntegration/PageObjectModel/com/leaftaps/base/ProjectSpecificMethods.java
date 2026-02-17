package com.leaftaps.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;


public class ProjectSpecificMethods extends AbstractTestNGCucumberTests{
	private static final ThreadLocal<RemoteWebDriver> rd = new ThreadLocal<RemoteWebDriver>();
	public static ExtentReports reporter;
	public static ExtentTest Test;
	public String testcaseName,testcaseDescription,authorName,testCategory,fileName;
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
		setRd(new ChromeDriver(options));
		getRd().manage().window().maximize();
		getRd().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		getRd().get("http://leaftaps.com/opentaps/control/main");
	}
	
	@AfterMethod
	public void postCondition() {
		getRd().close();
	}
	
	@DataProvider(name = "extractData")
	public String[][] dataLibrary() throws IOException {
            return com.leaftaps.utils.ReadExcel.extractDataFromExcel(fileName) ;  
            		}
	
	
	//------------------Extent report implementation---------//
	@BeforeSuite
	public void startReport() {
		// i want to create a rich standalone HTML 
				String filename = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh_mm_ss_a"));
				ExtentHtmlReporter extent = new ExtentHtmlReporter("./reports/"+filename+"result.html");
				//extent.setAppendExisting(null)
				// Step 2: Create ExtentReports Object
				reporter = new ExtentReports();
				// Step 3: Attach Reporter to ExtentReports
				reporter.attachReporter(extent);
	}
	@AfterSuite
	public void endReport() {
		reporter.flush();
	}
	
	@BeforeClass
	public void getTestcasesInfo() {
		Test = reporter.createTest(testcaseName,testcaseDescription);
		Test.assignAuthor(authorName);
		Test.assignCategory(testCategory);
	}
	
	public int takeSnap() throws IOException {
		int ranNum =(int)(Math.random()*999999);
		File source = getRd().getScreenshotAs(OutputType.FILE);
		File destination = new File("./snap/"+ranNum+".png");
		FileUtils.copyFile(source, destination);
		return ranNum;
	}
	
	public void reportStep(String status,String stepDescription ) throws IOException {// status -> pass/fail , step description, snap
		int snapshotName = takeSnap();
		if (status.equalsIgnoreCase("pass")) {
			Test.pass(stepDescription, MediaEntityBuilder.createScreenCaptureFromPath(".././snap/"+snapshotName+".png").build());
		}else {
			Test.fail(stepDescription, MediaEntityBuilder.createScreenCaptureFromPath(".././snap/"+snapshotName+".png").build());
		}
	}
	
}
