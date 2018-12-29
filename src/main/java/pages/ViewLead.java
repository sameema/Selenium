package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods
{

	public ViewLead() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//div[@class='frameSectionExtra']/following::a[3]") WebElement eleEdit;
	
	public EditLead eleEdit()
	{
		click(eleEdit);
		return new EditLead();
	}

	}
