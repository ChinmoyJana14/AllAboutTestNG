package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ttransportnsw {

	@Test
	public void test(String Input ) {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\Grid\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://transportnsw.info/");
		
		driver.findElement(By.id("tniFromTripLocation")).sendKeys("Input");
		//Step 2- selecting the first element by index
		
	}
	
	
	
	
}
