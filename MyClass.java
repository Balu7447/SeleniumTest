package newpackage;

import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

	public static void main(String[] args) throws NoSuchElementException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumdrivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.navigate().to("https://sc-platform-stage.supplycompass.com/login");
		
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//input[@id='standard-name']")).sendKeys("balu.cse2@gmail.com");
		
//		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#standard-name")).sendKeys("balu.cse2@gmail.com");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rgukt123");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//button[@class='sc-htpNat ihiry']")).click();

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='sc-kkGfuU jEYEpB'][contains(.,'+')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Collection Name']")).sendKeys("dresses");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='DD-MM-YYYY']")).sendKeys("20-11-2019");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Add notes or priorities']")).sendKeys("collection of dresses");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='sc-htoDjs gRHWAX']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Moodboard Name']")).sendKeys("Dress");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='sc-chPdSV goqrTC']")).click();
		
		Thread.sleep(7000);
		driver.navigate().to("https://sc-platform-stage.supplycompass.com/collections/list");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@src='https://via.placeholder.com/340x490.png?text=%20'])[1]")).click();
		//driver.findElement(By.xpath("//div[@class='image']")).click();
		
		
		

		
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("#root > button")).click();
		
//		driver.get("https://sc-platform-stage.supplycompass.com/collections/create");
		
		
		
		/*driver.findElement(By.xpath("//button[@class='sc-bxivhb jtFfkZ']")).click();
		
			driver.navigate().to("mail.google.com");*/
		//WebElement password = driver.findElement(By.id("passwd"));
		
//		password.sendKeys("rgukt123");
		
		
	}
	
	
}
