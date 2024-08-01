package Selenium_II;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenShot {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\sel\\BrowserJarFile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");
        String random = RandomString.make(2);
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        File desti = new File("F:\\WorkSpace\\New-workspace\\Dec21_Selenium\\Screenshot"+random+".jpg");
        
        FileHandler.copy(source, desti);
	}
}
