package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebPageControls {
	
	@Test

	public void test1() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:/BALAJI/study/SELENIUM SETUP/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();

		driver.findElement(By.name("userName")).sendKeys("Test1");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test1");
		WebElement submitButton = driver.findElement(By.xpath("//input[@name='submit']"));
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(submitButton.isEnabled());
		System.out.println("submit button is: " +submitButton.isEnabled());
		 
		submitButton.click();
		
		WebElement signOffLink = driver.findElement(By.linkText("SIGN-OFF"));
		
		softAssert.assertEquals(signOffLink.getText(), "SIGN-OFF");
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		Select select=new Select (driver.findElement(By.xpath("//select[@name='toMonth']")));
		select.selectByVisibleText("January");
		Select select1=new Select (driver.findElement(By.xpath("//select[@name='toPort']")));
		select1.selectByVisibleText ("Zurich");
		softAssert.assertAll();
	}

}
