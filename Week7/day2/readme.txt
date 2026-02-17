Extent Report Integration with POM
==========================================
Step 1: Create an ExtentHtmlReporter Object

Initialize the ExtentHtmlReporter with the path where the HTML report will be generated.​

  LocalDateTime localDateTime = LocalDateTime.now();
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
  String timeStamp = localDateTime.format(formatter);
  ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/" + timeStamp + ".html");

Step 2: Initialize the ExtentReports Object

Create an instance of ExtentReports and attach the ExtentHtmlReporter to it.​

  ExtentReports reports = new ExtentReports();
  reports.attachReporter(reporter);


Step 3: Set Up Test Details

Define the test name, description, author, and category.​


  String testName = "Your Test Name";
  String testDes = "Description of the test";
  String testAuthor = "Author Name";
  String testCategory = "Category of Test";


Step 4: Create an ExtentTest Instance

Initialize the ExtentTest object with the test details.​

  ExtentTest test = reports.createTest(testName, testDes);
  test.assignAuthor(testAuthor);
  test.assignCategory(testCategory);


Step 5: Implement the takeSnap Method

Create a method to capture a screenshot and return its filename.​
TakesScreenshot is imported 
  private int takeSnap() throws IOException {
      int ranNum = (int) (Math.random() * 999999);
      File scr = getRdriver().getScreenshotAs(OutputType.FILE);
      File des = new File("./snaps/" + ranNum + ".png");
      FileUtils.copyFile(scr, des);
      return ranNum;
  }
Step 6: Implement the reportStep Method

Create a method to log test steps with their status and attach the corresponding screenshot.​

  public void reportStep(String status, String message) throws IOException {
      int snapNumber = takeSnap();
      if (status.equalsIgnoreCase("pass")) {
          test.pass(message, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/" + snapNumber + ".png").build());
      } else {
          test.fail(message, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/" + snapNumber + ".png").build());
      }
  }
Step 7: Finalize the Report

After all tests have been executed, call the flush method to write the test information to the report.​

  reports.flush();

step to setup the Extent report with POM:
=================================

1)Create startReport() in the BaseClass and declare the ExtentReport extent as a global variable
Add all the common lines of code (Step 1 & Step 2)
                                    Annotate startReport() with @BeforeSuite
2)Declare some global variables as public String testName, testDescription,testAuthor, testCategory;
Create setValues() method inside the class file of testcases packages extends with ProjectSpecificMethod

Assign all the value inside setValues() in each testcase with 	@BeforeTest (Step 3)
                                     Annotate setValues() with @BeforeTest


3)Create getTestcasesInfo() in the Base and have the lines of code to create testcase and assign the details(Step 4)
Replace all the hardcoded datas with same global variables: testName, testDescription,testAuthor, testCategory;
                                    Annotate testCaseDetails() method with @BeforeClass


4)Implement the takeSnap Method(Step 5) 

5)Implement the reportStep Method(Step 6)

6)Create stopReport() in the BaseClass and have the code(Step 7)
extent.flush(); 
                                    Annotate stopReport() with @AfterSuite


------------------------------------------------
Execution Flow :

@BeforeSuite---startReport()
  @BeforeTest--->setValues()
    @BeforeClass--->gettestCaseinfo()
      @BeforeMethod--->precondn()
       @test---->testcases
      @AfterMethod--->postcondn()
    @AfterClass---Nil
  @AfterTest---Nil
@AfterSuite---->stopReport()

------------------------------------------------


Data Driven Testing(Excel Integration) with POM
================================================
POM with Excel Integration:
---------------------------
Step 1 : Create data folder and have the excelsheets inside the folder 
Step 2 : Create a package called utils and have the ReadExcel java class inside
Step 3 : Create dataLibrary() and annotate with DataProvider and call the readExcel() and return
Replace all the hardcoded data with input arguments in the required pages
Step 4 : In the testClasses, use dataProvider attribute to receive the data and pass input arguments in the test method.
Create setValues() in each testclass to mention the fileName and annotate with @BeforeTest

How to Parameterize the data?
	  1)Create a new package(utils) and copy the ReadExel class from the previous project or package ✅
	  and paste it here
	  2)Create a data folder and Create Excel workbook sheets ✅
	  3)Declare the filedata globally in baseclass ✅
	  4)Create a method for @DataProvider and call the ReadExel class ✅
	  5)Integrate @Test with dataProvider attribute ✅ 
	  6)Pass the inputs as arguments in the testcase method level and replace the hardcoded values ✅
	  7)In the testcase create a method to mention the ExcelFileName and annotate with @BeforeTest ✅
---------------------------
Execution Flow :

@BeforeSuite---startReport()
  @BeforeTest--->setValues()
    @BeforeClass--->getTestCaseinfo()
     @DataProvider-->dataLibrary()
      @BeforeMethod--->precondn(
       @test---->testcases
      @AfterMethod--->postcondn()
    @AfterClass---Nil
  @AfterTest---Nil
@AfterSuite---->stopReport()

---------------------------


How to setup the makaia framework:
=================================


1. Click on Code -> Download ZIP
2. Extract the zip the file in your system
3. Click on File -> Import... in eclipse
4. Select Existing Maven project -> Next in the wizard
5. Browse the extracted folder -> Select folder
6. Click on Finish button in the wizard


Execution flow  : 
-----------------------
    @BeforeSuite --> startReport() in Reporter class
        @BeforeTest --> setValues() in testcase class
            @BeforeClass --> setUpClass() in AbstarctTestNGCucumberTests and startTestCase() in Reporter
                @DataProvider --> fetchData() in PSM class
		  @Parameters--> preCondition() in PSM class
                    @BeforeMethod --> preCondition() in PSM class
                        @Test --> testcase class
                    @AfterMethod --> postCondition() in PSM class
                @AfterClass --> tearDownClass() in AbstractTestNGCucumberTests
            @AfterTest --> NA
        @AferSuite--> endResult() in Reporter
---------------------------

######################################################################