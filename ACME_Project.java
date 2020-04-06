package project_direct_method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACME_Project {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://acme-test.uipath.com/account/login");

		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");

		driver.findElementById("password").sendKeys("leaf@12");

		driver.findElementById("buttonLogin").click();

		WebElement ele = driver.findElementByXPath("(//button[contains(@class,'btn btn-default')])[5]");

		Actions builder = new Actions(driver);
		builder.moveToElement(ele).perform();

		driver.findElementByLinkText("Search for Vendor").click();

		driver.findElementById("vendorName").sendKeys("Blue Lagoon");

		driver.findElementById("buttonSearch").click();

		String country = (driver.findElementByXPath("//table/tbody/tr[2]/td[5]")).getText();
		System.out.println(" For vendor Blue Lagoo the country is " + country);

		driver.findElementByLinkText("Log Out").click();

		driver.close();

	}

}