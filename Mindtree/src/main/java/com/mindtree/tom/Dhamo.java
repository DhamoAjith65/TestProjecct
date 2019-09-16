package com.mindtree.tom;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dhamo {
	public static void main(String[] args) throws InterruptedException, verifyingTitleException {
		String webDriver="webdriver.chrome.driver";
		String chromeDriverpath="C:\\chrome driver\\chromedriver.exe";
		System.setProperty(webDriver,chromeDriverpath);
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		String actualTitle=driver.getTitle();
		String expectedTitle="Online1 Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	
			verifyEquals(actualTitle,expectedTitle);
		
		
		
		
		
		
		
		
		
		/*WebElement selectButton=driver.findElement(By.id("searchDropdownBox"));
		selectButton.click();
		Select dropdown=new Select(selectButton);
		Thread.sleep(3000);
		dropdown.selectByValue("search-alias=luggage");
*/
	}

	private static void verifyEquals(String actualTitle, String expectedTitle) throws verifyingTitleException   {
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