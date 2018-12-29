package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC002_CreateLead {
	
	ChromeDriver driver;
	
	@Given("open the browser")
	public void open_the_browser()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Given("enter the url")
	public void enter_the_url()
	{
		driver.get("http://leaftaps.com/opentaps");
	}
	
	@Given("enter the username as (.*)")
	public void enterTheUsername(String username)
	{
		driver.findElementById("username").sendKeys(username);
	}

	@Given("enter the password as (.*)")
	public void enterThePassword(String password) 
	{
		driver.findElementById("password").sendKeys(password);
	}

	@Given("click login button")
	public void clickLoginButton() 
	{
		driver.findElementByClassName("decorativeSubmit").click();

	}

	@Given("click CRM\\/SFA button")
	public void clickCRMSFAButton() 
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@Given("click Leads button")
	public void clickLeadsButton() 
	{
		driver.findElementByLinkText("Leads").click();
	}

	@Given("click Create Lead button")
	public void clickCreateLeadButton() 
	{
		driver.findElementByLinkText("Create Lead").click();
	}

	@Given("enter Company Name as (.*)")
	public void enterCompanyName(String cname) 
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
	}

	@Given("enter First Name as (.*)")
	public void enterFirstName(String fname) 
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	}

	@Given("enter Last Name as (.*)")
	public void enterLastName(String lname) 
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	}

	@When("click Create Leads button")
	public void clickCreateLeadsButton() 
	{
		driver.findElementByName("submitButton").click();
	}

	@Then("verify Create Lead is success")
	public void verifyCreateLeadIsSuccess() 
	{
	   System.out.println("Success");
	}


}
