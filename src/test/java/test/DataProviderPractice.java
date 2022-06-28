package test;
import org.testng.annotations.*;

public class DataProviderPractice {
	
	@DataProvider (name = "data-provider")
	public Object[][] getData(){
		
		return new Object[][] {{"firstSetUsername", "firstSetUserpassword" }, 
								{"secondSetUsername", "secondSetUserpassword"}};

	}

	@Test (dataProvider = "data-provider")
	public void LogIn(String username, String password)
	{
	System.out.println(username);
	System.out.println(password);
	}
}
