package Test_Scripts;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.cogmento.genericUtilities.Base_Class;
import com.crm.cogmento.genericUtilities.WebDriverGenerics;
import com.crm.cogmento.pompages.CreateNewCompany_POM;
import com.crm.cogmento.testdata.DataforCompanyCreation;

public class CreateNewCompanyAndValidate extends Base_Class{
	WebDriverGenerics wutil=new WebDriverGenerics();


	@DataProvider
	public Iterator<Object[]> getdata() throws FileNotFoundException {
		ArrayList<Object[]> data = DataforCompanyCreation.companydata();
		return data.iterator();
	}

	/*
	 * @author-Saleem
	 * Script to check that user is able to create a company.
	 */
	@Test(dataProvider = "getdata")
	public void CreateNewCompanyTest(String name,String address, String city, String state, String pincode, String Phonenumber
			,String Homenumber, String tags, String Description, String Socailhandle, String Industry, String countofemp
			,String Symbol, String Revenue, String vatnumber, String identifier, String image) {
		CreateNewCompany_POM create=new CreateNewCompany_POM(driver);
		create.getCompanyicon().click();
		wutil.waitForPagetoLoad(driver);
		create.getCreatenewcompanybttn().click();
		wutil.waitForPagetoLoad(driver);
		wutil.moveByOffset(driver, 300, 0);
		wutil.doubleClick(driver, create.getLinkifyIcon());
		create.getNametextTbox().sendKeys(name);
		create.getAccessbutton().click();
		driver.findElement(By.xpath("//div[text()='Select users allowed access']")).click();
		driver.findElement(By.xpath("//div[@class='visible menu transition']/div")).click();
		create.getUrlTbox().sendKeys("https://www.amazon.com");
		create.getAddressTbox().sendKeys(address);
		create.getCityTbox().sendKeys(city);
		create.getStateTbox().sendKeys(state);
		create.getZipTbox().sendKeys(pincode);
		driver.findElement(By.xpath("//div[@name='country']")).click();
		List<WebElement> countryoptions = driver.findElements(By.xpath("//div[@class='six wide fields']//div[5]//div//div[2]//div"));
		countryoptions.get(5).click();
		create.getNumberTbox().sendKeys(Phonenumber);
		create.getHomeWorkNumberTbox().sendKeys(Homenumber);
		create.getTagsTbox().sendKeys(tags+Keys.ENTER);
		create.getDescriptionTbox().sendKeys(Description);
		List<WebElement> socialoptions = driver.findElements(By.xpath("//div[@class='three fields']/div[1]/div"));
		socialoptions.get(0).click();
		create.getSocialHandlesTbox().sendKeys(Socailhandle);
		create.getIndustryTbox().sendKeys(Industry);
		driver.findElement(By.xpath("//div[@name='priority']/div[1]")).click();
		List<WebElement> priorityoptions = driver.findElements(By.xpath("//div[@class='visible menu transition']"));
		priorityoptions.get(0).click();
		driver.findElement(By.xpath("(//div[@name='status'])[1]")).click();
		List<WebElement> statusoptions = driver.findElements(By.xpath("//div[@class='visible menu transition']"));
		statusoptions.get(0).click();
		driver.findElement(By.xpath("(//div[@name='source'])[1]")).click();
		List<WebElement> sourceoptions = driver.findElements(By.xpath("//div[@class='visible menu transition']"));
		sourceoptions.get(0).click();
		driver.findElement(By.xpath("(//div[@name='category'])[1]")).click();
		List<WebElement> categoryoptions = driver.findElements(By.xpath("//div[@class='visible menu transition']"));
		categoryoptions.get(0).click();
		create.getNoOfEmployeesTbox().sendKeys(countofemp);
		create.getStockSymbolTbox().sendKeys(Symbol);
		create.getAnnualRevenueTbox().sendKeys(Revenue);
		create.getVatNumberTbox().sendKeys(vatnumber);
		create.getIdentifireTbox().sendKeys(identifier);
		create.getImageBox().sendKeys(image);
		create.getSaveButton().click();
		create.getCompanyicon().click();;
		driver.findElement(By.xpath("(//span[@class='item-text'])[4]")).click();
		wutil.moveByOffset(driver, 300, 0);
		String createdname = driver.findElement(By.xpath("//div[@class='ui fluid container ']/div[2]/div/div/div/div/div[2]/div/span/p")).getText();
		Assert.assertEquals(createdname, name);
		System.out.println("pass");
	}

	public void Sample2() {
		Reporter.log("b", true);	
	}
	
	public void Sample3() {
		Reporter.log("Sample3", true);
	}	
	
	public void Sample4() {
		Reporter.log("Sample4", true);
	}
}
