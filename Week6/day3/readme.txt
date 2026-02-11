PROJECT STRUCTURE CREATION – STEP BY STEP 

---

STEP 1 – Create a New Maven Project

1. Open IDE (Eclipse)
2. Select Create New Maven Project
3. Provide Project Name (Example: PageObjectModel)
4. Choose default Maven structure
5. Finish project creation

Now you will see:
src/main/java
src/test/java

---

STEP 2 – Create Base Package

1. Expand src/main/java
2. Right click → Create new Package
3. Give package name as com.leaftaps.base
4. Inside this package create a class for common methods
   (This class will handle driver setup, launch browser, common utilities)

Purpose:
All reusable setup logic stays here

---

STEP 3 – Create Page Package

1. Right click src/main/java
2. Create a new Package
3. Name it com.leaftaps.page
4. Inside this package create individual page classes

Example pages to create:

* LoginPage
* HomePage
* MyHomePage
* MyLeadsPage
* CreateLeadPage
* ViewLeadPage

Purpose:
Each class represents one application page
Each class contains page-specific actions

This follows Page Object Model principle

---

STEP 4 – Create Test Case Package

1. Expand src/main/java
2. Right click → Create new Package
3. Name it com.leaftaps.testcases
4. Create test case classes

Example:

* TC001_VerifyLogin
* TC002_CreateLead

Purpose:
This package contains only test logic
Test classes will call methods from Page classes

---

STEP 5 – Connect Base Class to Test Classes

1. Make test classes inherit from base class
2. Base class manages setup and teardown
3. Test classes focus only on test steps

Purpose:
Separation of concerns

---

STEP 6 – Maintain Clean Architecture

Final structure should look like:

Project
│
├── src/main/java
│   ├── com.leaftaps.base
│   ├── com.leaftaps.page
│   ├── com.leaftaps.testcases

---

ARCHITECTURE FLOW (IMPORTANT FOR TRAINING)

Test Case
→ calls Page Class
→ Page Class interacts with Web Elements
→ Base Class handles driver

---

WHY THIS STRUCTURE IS IMPORTANT

* Clear separation of logic
* Reusable code
* Easy maintenance
* Industry standard automation design
* Supports scalability

---

