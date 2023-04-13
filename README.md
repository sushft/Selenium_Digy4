# Selenium_Digy4
TestNG and Selenium starter to use with DigyRunner

Kindly check attached project for Selenium TestNG. 
Below are some notes to run the project.
1. Test Steps:
                             1. Open google search application: url- www.google.com
                             2. Enter a keyword in the search box
                             3. On the search results page, validate if the keyword appears as the first result.
2. First of all, you need to download your maven depenedencies using any of the maven commands such as 
              Go to-
                             1. *Eclipse> Project Explorer*
                             2. Right click on the project.
                             3. *Maven> Update Project*.
3. If you want to run your tests through *testng.xml* , You can perform following steps.

              1. Eclipse>Project Explorer
              2. Open/Expand the project
              3. Right click on the *testng.xml*
              4. *Run As> TestNG Suite*

4. There are two types of report will be generated as :
         - target/spark.html
         - test-output/emailable-report.html

