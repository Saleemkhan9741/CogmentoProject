package com.crm.cogmento.genericUtilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.crm.cogmento.pompages.Login_Page;

public class Base_Class implements PConstants {
	public static WebDriver driver;
	FileUtilities fis=new FileUtilities();
	
//	@Parameters("BROWSER")
//	@BeforeMethod(groups={"smoke","regression"})
//	public void configbef(String browser) throws IOException {
//		String url = fis.getKey("url");
//
//		if(browser.equals("chrome")) {
//			System.setProperty(CHROME_KEY, CHROME_VALUE);
//			driver=new ChromeDriver();
//		}else if(browser.equals("firefox")){
//			System.setProperty(GECKO_KEY, GECKO_VALUE);
//			driver=new FirefoxDriver();
//		}else {
//			System.out.println("Specify the browser");
//		}
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().deleteAllCookies();
//		driver.get(url);
//		Login_Page l=new Login_Page(driver);
//		l.getUsernametbox().sendKeys(fis.getKey("username"));
//		l.getPasswordtbox().sendKeys(fis.getKey("password"));
//		l.getLoginbttn().click();
//		String username = l.getDispalyUsername().getText();
//		Assert.assertEquals(username, fis.getKey("user"));
//		}
	
	@BeforeMethod
	public void configbef() throws IOException {
		String url = fis.getKey("url");
		String browser=fis.getKey("browser");
		if(browser.equals("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}else if(browser.equals("firefox")){
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}else {
			System.out.println("Specify the browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(url);
		Login_Page l=new Login_Page(driver);
		l.getUsernametbox().sendKeys(fis.getKey("username"));
		l.getPasswordtbox().sendKeys(fis.getKey("password"));
		l.getLoginbttn().click();
		String username = l.getDispalyUsername().getText();
		Assert.assertEquals(username, fis.getKey("user"));
		}
	
	@AfterMethod(groups={"smoke","regression"})
	public void tearDown(){
		driver.quit();
	}
}

