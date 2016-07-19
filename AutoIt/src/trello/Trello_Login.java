package trello;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Trello_Login {

	public WebDriver driver;	
	
	@Test
	public void Login() throws Exception{
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse_Selenium\\Java_Selenium_Maven\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://trello.com/login");
		Pattern username = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\username.png");
		Pattern password = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\password.png");
		Pattern signIn = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\loginButton.png");
		Pattern profile = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\profile_click.png");
		Pattern signOut = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\Trello\\logout_click.png");
		
		Screen src = new Screen();
		src.setAutoWaitTimeout(20);
		src.type(username, "knskumari");
		Thread.sleep(2000);
		
		src.type(password, "pass@word1");
		Thread.sleep(2000);
		
		src.click(signIn);
		Thread.sleep(2000);
		
		src.click(profile);
		Thread.sleep(2000);
		
		src.click(signOut);
		Thread.sleep(2000);
		
		driver.close();
	}
}