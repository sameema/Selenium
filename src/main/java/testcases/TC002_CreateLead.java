package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_CreateLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName = "TC002_CreateLead";
		testDescription ="Creating a lead in leaftaps";
		testNodes = "Leads";
		authors ="Sameema";
		category = "smoke";
		dataSheetName="TC002";
	}
	@Test(dataProvider="fetchData")
	public void loginLogout(String uname, String pwd, String cname, String fname, String lname) {
		new LoginPage() 
		.enterUsername(uname)
		.enterPassword(pwd)  
		.clickLogin()
		.clickCrmSfa()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.clickCreateLeadButton();
		}

}











