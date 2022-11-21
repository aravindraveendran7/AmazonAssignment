# Amazon Assignment
----------
----------

## Libraries Used:
----------
**1.Selenium         -** Web Automation

**2.TestNG           -** Unit Testing Library

**3.Extent Reports   -** Reporting Library to generate beautiful html reports

**4.AssertJ          -** Fluent Assertion Library in Java

**5.WebDriverManager -** Executables management

**6.Lombok           -** To reduce boilerplate codes

**Note:** All the above mentioned libraries are open-source and does not include any license.

#Capabilities:
------------
1.Web Tests can be run on chrome or edge browsers.

2.Configuration can be changed from config.properties inside src/test/resources/config

3.Utility methods available for Web Interactions (SeleniumUtils.java)

#Adding more tests:
-----------
Prerequisites: Java 8+ , Maven 3.8.6 Installed and path set

1.Tests should be added as per the convention followed. New testng tests should be created inside the src/test/java folder.

2.All the tests should extend BaseTest.java

3.Each test created should define the description as mandatory parameters. This will be helpful while creating the extent reports.

4.Have maximum of one to two assertions per test.

#Running Tests:
----------
Prerequisites: Java 8+ , Maven 3.6.3 Installed and path set

1.There are multiple ways to run the tests. During development phase you can use the testng.xml present in the root folder to run. Right click and choose run.

2.Each of the testng xml file should contain the test classes to pick for the run.

3.User can also choose the thread-count parameter to run the tests in parallel.

4.User can also choose to run via maven commands which is highly recommended.

5.Maven profiles are configured in the pom.xml. You can run these from IDE Terminal or any OS Terminal inside the project folder.
**mvn clean test -Pall** - To run all the tests available in the testng.xml

**Note:** User should not try to run the test from test class - Might end up in Null Poinet Exceptions,because the listeners are configured only in testng.xml




