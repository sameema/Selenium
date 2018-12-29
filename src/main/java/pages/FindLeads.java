package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods
{

	public FindLeads() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//div[@id='center-content-column']//descendant::input[2]") WebElement eleFirstNamee;
	@FindBy(how=How.XPATH, using="//div[@id='center-content-column']//descendant::button") WebElement eleFindLeadss;
	@FindBy(how=How.XPATH, using="//div[text()='First name']/following::table//tr//td[3]//a") WebElement eleFirstResult;

		
	public FindLeads enterFirstNamee(String data)
	{
		type(eleFirstNamee, data);
		return new FindLeads();
	}
	
	public FindLeads clickFindLeadss()
	{
		click(eleFindLeadss);
		return new FindLeads();
	}
	
	public ViewLead clickFirstResult()
	{
		click(eleFirstResult);
		return new ViewLead();
	}
	
	
}
