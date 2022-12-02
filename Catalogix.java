package Streamoid;


	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.util.List;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Catalogix
	{
		public static WebDriver driver;
		public static 	WebDriver driver1;
		public static void main(String[] args) throws InterruptedException, AWTException
		{
			loginCatalogix();
			Thread.sleep(2000);
			copyOTP();
			Thread.sleep(2000);
			createWorkspace();
			
		}
		public static void loginCatalogix() throws InterruptedException
		{

			System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
			 driver= new FirefoxDriver();
			Thread.sleep(2000);
			driver.get("https://staging.catalogix.ai/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='name@company.com']")).sendKeys("sujeeth@Streamoid.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[.='Sign In']")).click();
			Thread.sleep(2000);
		
			
		}
		public static void copyOTP() throws InterruptedException, AWTException
		{
			System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
			 driver1= new FirefoxDriver();
			driver1.get("https://outlook.office365.com");
			Thread.sleep(2000);
			driver1.findElement(By.xpath("//input[@placeholder='Email, phone, or Skype']")).sendKeys("sujeeth@Streamoid.com");
			Thread.sleep(2000);
			driver1.findElement(By.xpath("//input[@value='Next']")).click();
			Thread.sleep(2000);
			driver1.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
			driver1.findElement(By.xpath("//input[@value='Sign in']")).click();
			Thread.sleep(2000);
			
			driver1.findElement(By.xpath("//input[@value='Yes']")).click();
			Thread.sleep(2000);
			List<WebElement> mails = driver1.findElements(By.className("hcptT"));
			Thread.sleep(2000);
			mails.get(0).click();
			Thread.sleep(2000);
			WebElement address = driver1.findElement(By.xpath("//div[@class='x_main'] /p[2]/b"));
			Thread.sleep(2000);
			Actions selection = new Actions(driver1);
			selection.doubleClick(address).perform();
			selection.contextClick(address ).perform();
			Robot copy= new Robot();
			Thread.sleep(2000);
			copy.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			copy.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@id='input-1']")).sendKeys(Keys.CONTROL+"v");
			 driver1.close();		
		}
		
			 
			
		
		public static void createWorkspace() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@class='_2BbadYBf--arrow-icon']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[.='New Workspace']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("newone");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[.='Proceed']")).click();
			
		}
		
		

	}




