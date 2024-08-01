package Selenium_I;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","B:\\sel\\BrowserJarFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]")).click();
		
		List<WebElement> all_links = driver.findElements(By.xpath("//a"));
		System.out.println(all_links);
		
		List<WebElement> all_element = driver.findElements(By.xpath("//*"));
		System.out.println(all_element);
	}
}
