package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods {
	
	/*@Before
	public void beforeScenario(Scenario sc)
	{
		System.out.println("name "+sc.getName());
		System.out.println("id "+sc.getId());
		System.out.println(sc.getStatus());
	}
	
	@After
	public void afterScenario(Scenario sc)
	{
		System.out.println(sc.getStatus());
	}*/
	
	@Before
	public void beforeScenario(Scenario sc)
	{
		startResult();
		startTestModule(sc.getName(), sc.getId());
		test = startTestCase("Test Node Name");
		test.assignCategory("Smoke");
		test.assignAuthor("Sameema");
		startApp("chrome", "http://leaftaps.com/opentaps");
	}
	
	@After
	public void afterScenario(Scenario sc)
	{
		closeAllBrowsers();
		endResult();
	}

}
