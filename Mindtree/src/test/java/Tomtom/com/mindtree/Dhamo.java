package Tomtom.com.mindtree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.mindtree.tom.verifyingTitleException;
public class Dhamo {
	@Test
	public void init() throws InterruptedException
	{
		String webDriver="webdriver.chrome.driver";
		String chromeDriverpath="C:\\chrome driver\\chromedriver.exe";
		System.setProperty(webDriver,chromeDriverpath);
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		String actualTitle=driver.getTitle();
		String expectedTitle="Online1 Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	
			try {
				verifyEquals(actualTitle,expectedTitle);
			} catch (verifyingTitleException e) {
				System.err.println(e);
			}
	
	}

	private void verifyEquals(String actualTitle, String expectedTitle) throws verifyingTitleException {
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("****TITLE VERIFIED SUCCESSFULLY");
		}
		else
		{
			
				
					throw new verifyingTitleException("***SOMETHING WENT WRONG*****");
				
		
		}
		

		
	}
	

}
