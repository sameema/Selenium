package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods
{

	public CreateLead() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="createLeadForm_companyName") WebElement eleCompanyName;
	@FindBy(how=How.ID, using="createLeadForm_firstName") WebElement eleFirstName;
	@FindBy(how=How.ID, using="createLeadForm_lastName") WebElement eleLastName;
	@FindBy(how=How.XPATH, using="//input[@value='Create Lead']") WebElement eleCreateLeadButton;

	@Given("enter Company Name as (.*)")
	public CreateLead enterCompanyName(String data)
	{
		type(eleCompanyName, data);
		return new CreateLead();
	}
	
	@Given("enter First Name as (.*)")
	public CreateLead enterFirstName(String data)
	{
		type(eleFirstName, data);
		return new CreateLead();
	}
	
	@Given("enter Last Name as (.*)")
	public CreateLead enterLastName(String data)
	{
		type(eleLastName, data);
		return new CreateLead();
	}
	
	public ViewLead clickCreateLeadButton()
	{
		click(eleCreateLeadButton);
		return new ViewLead();
	}
}
