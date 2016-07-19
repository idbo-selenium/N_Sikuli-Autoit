package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExampleProgram {

	WebDriver driver;
	@Test
	public void AutoIt() throws Exception{
		
		//System.setProperty("webdriver.chrome.driver", "F:\\Eclipse_Selenium\\Java_Selenium_Maven\\chromedriver_win32\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.navigate().to("file:///C:/Users/sravan/Desktop/fileupload.html");
		driver.findElement(By.xpath("html/body/input")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\gmail\\Attachfile_Gmail.exe");
	}	
}