package Test_Scripts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.cogmento.genericUtilities.Base_Class;
import com.crm.cogmento.pompages.CreateNewEvent_POM;
import com.crm.cogmento.pompages.Home_Page;
import com.crm.cogmento.testdata.DataforUserCreation;

public class Create_New_Event_Page_Test extends Base_Class {	


	@DataProvider
	public Iterator<Object[]> getData() throws Throwable {
		ArrayList<Object[]> data = DataforUserCreation.crmData();
		return data.iterator();
	}

	//creating new Calender
	@Test(dataProvider="getData", groups ="regression")
	public void createnewCalendertest(String title, String tagname, String Description, String Location, String Deal,
			String Task, String AssignedTo, String Participants, String Company, String Recurrence ,String Identifier, String Case, String ReminderTime  ) throws Throwable {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		Actions act=new Actions(driver);
		Home_Page h=new Home_Page(driver);
		CreateNewEvent_POM  c= new CreateNewEvent_POM(driver);
		act.moveToElement(h.getCalenderLink()).perform();
		Thread.sleep(1000);
		h.getCreateNewCalenderbttn().click();
		act.moveByOffset(200,200).doubleClick().build().perform();
		c.getTitleTbox().sendKeys(title);
		c.getStartDatetxtbox().click();
		c.getStartDatepopupSelect().click();
		c.getStarttimeSelect().click();
		driver.findElement(By.xpath("//div[@class='ui selection dropdown']")).click();
		List<WebElement> categoryoptions = driver.findElements(By.xpath("//div[@name='category']"));
		categoryoptions.get(1).click();
		c.getTagstbox().sendKeys(tagname+Keys.ENTER);
		c.getDescriptiontxtarea().sendKeys(Description);
		c.getLocationtxtarea().sendKeys(Location);
		c.getDealtbox().sendKeys(Deal+Keys.ENTER);
		c.getTasktbox().sendKeys(Task+Keys.ENTER);
		c.getCasetbox().sendKeys(Case+Keys.ENTER);
		c.getRemaindertimetbox().sendKeys(ReminderTime+Keys.ENTER);
		c.getParticipantstbox().sendKeys(Participants+Keys.ENTER);
		c.getCompanytbox().sendKeys(Company+Keys.ENTER);
		c.getIdentifiertbox().sendKeys(Identifier+Keys.ENTER);
		driver.findElement(By.xpath("//div[@name='minutesBefore']")).click();
		List<WebElement> alertbeforeoptions = driver.findElements(By.xpath("//div[@class='visible menu transition']/div"));
		alertbeforeoptions.get(1).click();
		driver.findElement(By.xpath("//div[@name='channels']")).click();
		List<WebElement> alertviaoptions = driver.findElements(By.xpath("//div[@class='visible menu transition']/div"));
		alertviaoptions.get(1).click();
		c.getSavebttn().click();
		Thread.sleep(2000);
		WebElement createduser = driver.findElement(By.xpath("//div[@class='ui header item mb5 light-black']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(createduser));
		String name = createduser.getText();
		Assert.assertEquals(name,title);
	}
	
	@Test(groups = "regression")
	public void sample() {
		Reporter.log("a",true);
	}
}
