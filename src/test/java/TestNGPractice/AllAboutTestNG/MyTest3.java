package TestNGPractice.AllAboutTestNG;
import org.junit.Assert;
import org.testng.annotations.*;

public class MyTest3 {
	
	@AfterTest
	public void TearDown() {
		System.out.println("After-Test of Module-2");
	}
	
	@Test
	public void Login31() {
		System.out.println("Test3-Test1");
		Assert.assertTrue(false);
	}
	@Parameters({"URL" , "UserName"})
	@Test
	public void Login32(String url, String uname) {
		System.out.println("Test3-Test2");
		System.out.println(url);
		System.out.println(uname);
	}
	
	@Test (dataProvider = "data-provider")
	public void Login33(String username, String password) {
		System.out.println("Test3-Test3");
		System.out.println(username);
		System.out.println(password);
	}
	
	@AfterSuite
	@Test (dataProvider = "data-provider-2")
	public void Test(String username, String password){
		System.out.println("After-Suite");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider (name = "data-provider")
	public Object[][] getData(){
		
		return new Object[][] {{"firstSetUsername", "firstSetUserpassword" }, 
								{"secondSetUsername", "secondSetUserpassword"}};

	}
	
	@DataProvider (name = "data-provider-2")
	public Object [][] getData2(){
		Object [][] data = new Object[3][2];
		
		data[0][0]="11";
		data[0][1]="12";
		
		data[1][0]="21";
		data[1][1]="22";
		
		data[2][0]="31";
		data[2][1]="32";
		return data;

	}
}
