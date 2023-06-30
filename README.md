# JupiterToys

#Automation Tool: Selenium Webdriver
#Programming language: Java
#Unit Testing Framework: TestNG
#Project/jar Management Tool: Maven

#Code repository: https://github.com/vgujjeti/JupiterToys

#Below are the test and steps

TC_001_ContactUsFormErrorValidation:
Steps:
1.	From the home page go to contact page
2.	Click submit button
3.	Verify error messages
4.	Populate mandatory fields
5.	Validate errors are gone


TC_002_ContactUsFormSubmittion:
Steps:
1.	From the home page go to contact page
2.	Populate mandatory fields
3.	Click submit button
4.	Validate successful submission message


TC_003_ProductValidation:
Steps:
1.	Buy 2 Stuffed Frog, 5 Fluffy Bunny, 3 Valentine Bear
2.	Go to the cart page
3.	Verify the subtotal for each product is correct
4.	Verify the price for each product
5.	Verify that total = sum(sub totals)

#​How to run the code:
Clone the repo ​https://github.com/vgujjeti/JupiterToys on your computer.
import the cloned project as maven project in any IDE e.g eclipse
 In Eclipse  Right click on the project--> Maven -->update project
To run --> Right click on pom.xml -->Run As -->Maven Clean --> Right click on pom.xml -->Run As -->Maven Test
