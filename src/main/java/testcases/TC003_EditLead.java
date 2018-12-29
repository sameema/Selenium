package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_EditLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName = "TC003_EditLead";
		testDescription ="Edit a lead in leaftaps";
		testNodes = "Leads";
		authors ="Sameema";
		category = "smoke";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public void loginLogout(String uname, String pwd, String name) {
		new LoginPage() 
		.enterUsername(uname)
		.enterPassword(pwd)  
		.clickLogin()
		.clickCrmSfa()
		.clickLeads()
		.clickFindLeads()
		.enterFirstNamee(name)
		.clickFindLeadss()
		.clickFirstResult();
		}

}











