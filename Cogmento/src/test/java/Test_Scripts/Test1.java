package Test_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.cogmento.genericUtilities.Base_Class;

@Listeners(com.crm.cogmento.genericUtilities.ListenerTest.class)
public class Test1 extends Base_Class {
	@Test(invocationCount = 1)
	public void main1() throws InterruptedException {
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		Assert.fail();
	}

}
