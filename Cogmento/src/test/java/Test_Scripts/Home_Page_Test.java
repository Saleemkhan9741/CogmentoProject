package Test_Scripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.cogmento.genericUtilities.Base_Class;
import com.crm.cogmento.pompages.Home_Page;

public class Home_Page_Test extends Base_Class{
	@Test
	public void homepagecomponents() throws InterruptedException {
		Home_Page h=new Home_Page(driver);
		Actions act=new Actions(driver);
		act.moveToElement(h.getCalenderLink()).perform();
		Thread.sleep(1000);
		h.getCreateNewCalenderbttn().click();
	}
}
