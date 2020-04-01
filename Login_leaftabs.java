package selenium_Basic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_leaftabs {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			WebElement UserName = driver.findElementById("username");
			UserName.sendKeys("DemoSalesManager");
			WebElement Password=driver.findElementById("password");
			Password.sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByLinkText("CRM/SFA").click();
			driver.findElementByXPath("//a[text()='Create Lead']").click();
			driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("Accenture");
			driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Rohithkumar");
			driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Muthusamy");
			driver.findElementByXPath("//input[@value='Create Lead']").click();
			Thread.sleep(2000);
			
			WebElement firstName = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']");
			
			String Name = firstName.getText();
			String Expected = "Rohithkumar";

			if (Name.equalsIgnoreCase(Expected))
			{
				System.out.println("Verfied");
			}
			else
			{
				System.out.println("Not Verifed");
			}
			driver.close();
	}

}
