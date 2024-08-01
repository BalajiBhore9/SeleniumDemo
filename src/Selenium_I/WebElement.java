package Selenium_I;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\drivers\\chromedriver(96).exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com");
		driver.navigate().to("http://www.facebook.com");
		driver.navigate().back();
		driver.navigate().refresh();
		String title = driver.getTitle();
		System.out.println(title);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.close();
		driver.quit();
	}

}
