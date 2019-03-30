package testscripts;

import org.testng.annotations.Test;

public class TestExecution extends Repository{
	
	@Test(priority=0)
	public void Launch_Verify()
	{
		LaunchStart();
	}
	
	@Test(priority=1)
	public void Login_Verify()
	{
		LoginStart();
	}
}
