 package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HowToLaunchBrowserInSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/BALAJI/study/SELENIUM SETUP/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://grabonz.com/");
		driver.manage().window().maximize();
		//driver.close();
		

	     WebElement element= driver.findElement(By.xpath("//button[@class='btn--link site-header__icon site-header__search-toggle js-drawer-open-top']"));
	      element.click();
	      //driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T shirt");
	     WebElement Searchbox = driver.findElement(By.xpath("//input[@placeholder='Search']"));
	     Searchbox.sendKeys("T shirt");
	     Thread.sleep(5000);
	     Searchbox.clear();
	     Thread.sleep(5000);
	     Searchbox.sendKeys("shirts");
	     List<WebElement> list =driver.findElements(By.tagName("a")); 
	     System.out.println(list.size());
	     
	     
			//driver.findElement(By.id("navbarDropdown")).click();
	     
		
		//driver.findElement(By.tagName("button")).click();
		//driver.findElement(By.linkText("Home")).click();
		//driver.findElement(By.partialLinkText("Hom")).click();
		
		//driver.close();
		//driver.quit();

	}

}
