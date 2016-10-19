package selenium;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElement {

	private WebDriver driver;
	
	/* 
	 * Open firefox and initialize website: www.globo.com 
	 */
	
	@Before
	public void setUp(){
		
		final String url = "E:\\Library\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", 
				new File(url).getAbsolutePath());
		driver = new ChromeDriver();
		driver.get("http://www.globo.com");
		driver.manage().window().maximize();
	}

	/*
	 * Search element by ID
	 */
	
	@Test
	public void findElement(){
		WebElement element = driver.findElement(By.id("user-bar"));
		assertTrue(element.isDisplayed());
	}
	
	
	@Test
	public void refresh(){
		driver.navigate().refresh();
	}
	
	
}
