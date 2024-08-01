package Selenium_III;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Broken_links {

	@Test
	public void brokenlinkTest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\sel\\BrowserJarFile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("No of links is: "+links.size());
		
		for(int i=0;i<links.size();i++) 
		{
			WebElement E1 = links.get(i);
			String linkurl = E1.getAttribute("href");
			veryfylinks(linkurl);
		}
		driver.quit();
	}
	public static void veryfylinks(String linkurl) 
	{
		try 
		{
			URL url = new URL(linkurl);
			HttpURLConnection httpURLconnect = (HttpURLConnection)url.openConnection();
			httpURLconnect.setConnectTimeout(5000);
			httpURLconnect.connect();
			if(httpURLconnect.getResponseCode()>=400) 
			{
				System.out.println(linkurl+" - "+httpURLconnect.getResponseMessage()+"is broken link");
			}
			else 
			{
				System.out.println(linkurl+" - "+ httpURLconnect.getResponseMessage());
			}
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
