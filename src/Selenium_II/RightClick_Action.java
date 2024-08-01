package Selenium_II;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_Action {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\selenium\\BrowserJarFile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        
        WebElement rightclick = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
        Actions ac = new Actions(driver);
        
        ac.contextClick(rightclick).perform();
        Thread.sleep(10);		
	}
}
