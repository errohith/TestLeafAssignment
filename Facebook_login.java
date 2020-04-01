package selenium_Basic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.facebook.com/");
			driver.manage().window().maximize();
			WebElement UserName = driver.findElementByXPath("//input[@id='email']");
			UserName.sendKeys("errohith");
			WebElement Password=driver.findElementById("pass");
			Password.sendKeys("Rohith!43");
			driver.findElementByXPath("//input[@type='submit']").click();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			driver.findElementByXPath("//div[@id='userNavigationLabel']").click();
			Thread.sleep(1000);
			driver.findElementByXPath("(//span[@class='_54nh'])[7]").click();
			Thread.sleep(1000);
			driver.close();
			}
			
	}

