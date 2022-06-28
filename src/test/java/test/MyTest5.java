package test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MyTest5 {

	@Test
	public void Test51() {
		System.out.println("Test5-Test1");
	}
	
	@Test
	public void Test52() {
		System.out.println("Test5-Test2");
	}
	
	@Test(groups= {"Smoke"})
	public void Test53() {
		System.out.println("Test5-Test3");
	}
	
	@BeforeSuite
	public void Test(){
		System.out.println("Before-Suite");
	}
}
