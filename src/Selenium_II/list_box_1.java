package Selenium_II;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class list_box_1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\drivers\\chromedriver(96).exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        
       WebElement day = driver.findElement(By.id("day"));
        Select d= new Select(day);
        d.selectByIndex(2);
        Thread.sleep(20);
        
        WebElement months = driver.findElement(By.xpath("//select[@title='Month']"));
        Select m = new Select(months);
        m.selectByIndex(2);
        Thread.sleep(20);
        
        WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
        Select y = new Select(year);
        y.selectByValue("1990");
	}
}
