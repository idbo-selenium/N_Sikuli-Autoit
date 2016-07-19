package gmail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Gmail_AutoIt {

	WebDriver driver;
	@Before
	public void Init(){
//		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse_Selenium\\Java_Selenium_Maven\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
		driver = new FirefoxDriver();
	}
	@After 
	public void Cleanup(){
		driver.close();
	}
	@Test
	public void AutoIt_Gmail()throws Exception{
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&osid=1&service=mail&ltmpl=default&rm=false#identifier");
		Pattern username = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\gmail\\username.png");
		Pattern next_buttonClick = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\gmail\\nextButton.png");
		Pattern password = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\gmail\\password.png");
		Pattern signinButton = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\gmail\\signinButton.png");
		Pattern composeButton = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\gmail\\compose_button.png"); 
		Pattern attachfile_click = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\gmail\\attachfile_click.png");
		Pattern mailsending_to = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\gmail\\mailsending_to.png");
		Pattern subject = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\gmail\\subject.png"); 
		Pattern mailsend_button = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\gmail\\mailsend_button.png");
		Pattern sentmail = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\gmail\\sentmail.png");
		Pattern sentmail_click = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\gmail\\sentmail_autoit.png");
		Pattern profile_click = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\gmail\\srinivasProfile_click.png");
		Pattern signout_click = new Pattern("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\gmail\\signout_click.png");
		
		Screen src = new Screen();
		src.setAutoWaitTimeout(30);//Thread.sleep(10000);
		//enter username
		src.type(username,"srinivas.v145");
		Thread.sleep(2000);
		//click next button
		src.click(next_buttonClick);
		Thread.sleep(2000);
		//enter password 
		src.type(password, "krishvani");
		Thread.sleep(2000);
		//click signin button
		src.click(signinButton);
		Thread.sleep(2000);	
		//compose button click
		src.click(composeButton);
		Thread.sleep(2000);
		//mailsending_to
		src.type(mailsending_to,"knskumari@gmail.com");
		Thread.sleep(4000);
		//actions for cursor getting into subject place
		Actions action = new Actions(driver);		
		action.sendKeys(Keys.TAB).build().perform();
		// enter subject to mail
		src.type(subject, "Autoit");
		Thread.sleep(2000);
		//attachfile_click
		src.click(attachfile_click);
		Thread.sleep(2000);
		//file attachment using AutoIt
		Runtime.getRuntime().exec("C:\\Users\\sravan\\Desktop\\important\\Sikuli_Snippets\\gmail\\Attachfile_Gmail.exe");
		Thread.sleep(4000);
		//send button click
		src.click(mailsend_button);
		Thread.sleep(4000);
		//sent mail click
		src.click(sentmail);
		Thread.sleep(4000);
//		//check wheater mail sent or not
//		src.click(sentmail_click);
//		Thread.sleep(2000);
		//profile click
		src.click(profile_click);
		Thread.sleep(2000);
		//signout click
		src.click(signout_click);
		Thread.sleep(2000);		
	}
}