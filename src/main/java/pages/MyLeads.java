package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods
{

	public MyLeads() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Create Lead") WebElement eleCreateLead;
	@FindBy(how=How.LINK_TEXT, using="Find Leads") WebElement eleFindLeads;
		
	public CreateLead clickCreateLead()
	{
		click(eleCreateLead);
		return new CreateLead();
	}
	
	public FindLeads clickFindLeads()
	{
		click(eleFindLeads);
		return new FindLeads();
	}
}
