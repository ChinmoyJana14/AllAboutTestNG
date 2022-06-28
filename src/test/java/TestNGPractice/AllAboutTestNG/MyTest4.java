package TestNGPractice.AllAboutTestNG;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTest4 {
	
	@Test
	public void Login41() {
		System.out.println("Test4-Test1");
	}
	
	@Test
	public void Login42() {
		System.out.println("Test4-Test2");
	}
	 	
	@Test(groups= {"Smoke"})
	public void Login43() {
		System.out.println("Test4-Test3");
	}
	
	@BeforeTest
	public void PreTest() {
		System.out.println("Before-Test of Module-2");
	}
	
	@BeforeSuite
	public void Test(){
		System.out.println("Before-Suite");
	}
	
	@BeforeMethod
	public void PreMethod() {
		System.out.println("Before-Method of Class MyTest4");
	}
	
}
