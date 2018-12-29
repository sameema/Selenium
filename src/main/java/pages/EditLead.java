package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods
{

	public EditLead() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="updateLeadForm_companyName") WebElement eleCompanyName;
	@FindBy(how=How.XPATH, using="//div[@class='fieldgroup-body']/following::input") WebElement eleUpdate;

	
	public EditLead updateCompanyName(String data)
	{
		type(eleCompanyName, data);
		return this;
	}
	
	

	}
