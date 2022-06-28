package TestNGPractice.AllAboutTestNG;
import org.testng.annotations.*;


public class MyTest2 {

	@Test
	public void Test21() {
		System.out.println("Test2-Test1");
	}
	
	@Test(groups= {"Smoke"})
	//@Test (dependsOnMethods={"Method Name"})
	public void Test22() {
		System.out.println("Test2-Test2");
	}
	@Parameters({"URL" , "UserName"})
	@Test
	public void Test23(String url, String uname) {
		System.out.println("Test2-Test3");
		System.out.println(url);
		System.out.println(uname);
	}
	
	@BeforeTest
	public void PreTest() {
		System.out.println("Before-Test of Module-1");
	}
	
}
