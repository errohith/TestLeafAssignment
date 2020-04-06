package project_direct_method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Red_Bus {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://redbus.in");

		WebElement eleSRC = driver.findElementByXPath("(//input[@class='db'])[1]");
		eleSRC.sendKeys("Chennai");
		Thread.sleep(3000);
		eleSRC.sendKeys(Keys.TAB);

		WebElement eleToCity = driver.findElementByXPath("(//input[@class='db'])[2]");
		eleToCity.sendKeys("Coimbatore");
		Thread.sleep(3000);
		eleToCity.sendKeys(Keys.TAB);
		driver.findElementByXPath("(//td[text()='30'])[2]").click();

		driver.findElementById("search_btn").click();

		Thread.sleep(4000);

		driver.findElementByXPath("(//label[@for='dtAfter 6 pm'])[2]").click();

		Thread.sleep(3000);
		driver.findElementByXPath("//label[@title='SLEEPER']").click();
		Thread.sleep(2000);

		driver.findElementByXPath("(//div[contains(@class,'w-15 fl')]//a)[2]").click();

	}

}