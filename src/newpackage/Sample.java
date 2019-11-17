package newpackage;

import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws NoSuchElementException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumdrivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.navigate().to("https://sc-platform-stage.supplycompass.com/collections/list");
		
		driver.manage().window().maximize();
		
		
	}
}

