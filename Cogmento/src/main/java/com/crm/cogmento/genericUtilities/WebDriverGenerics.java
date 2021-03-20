package com.crm.cogmento.genericUtilities;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverGenerics extends Base_Class{
	/*
	 * method to move to specific element using actions class
	 * @parameter driver
	 * @parameter element
	 */
	public void movetoElement(WebDriver driver, WebElement ele) {
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	/*
	 * method to move by offset using actions class
	 * @parameter driver
	 * @parameter element
	 */
	public void moveByOffset(WebDriver driver,int x, int y) {
		Actions act=new Actions(driver);
		act.moveByOffset(x,y).perform();
	}
	/*
	 * method to doubleClick using actions class
	 * @parameter driver
	 * @parameter element
	 */
	public void doubleClick(WebDriver driver, WebElement ele) {
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
	}
	/*
	 * method to Right click on element using actions class
	 * @parameter driver
	 * @parameter element
	 */
	public void RightClick(WebDriver driver, WebElement ele) {
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
	}
	/*
	 * method to Drap and Drop using actions class
	 * @parameter driver
	 * @parameter source
	 * @parameter destination
	 */
	public void DrapandDrop(WebDriver driver, WebElement src, WebElement dest) {
		Actions act=new Actions(driver);
		act.dragAndDrop(src,dest).perform();
	}
	
	/*
	 *method to Select an option by visible text in a Select dropdown
	 *@parameter element
	 *@parameter text
	 */
	public void selectbyvisibletxt(WebElement element, String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	
	/*
	 *method to Select an option by index in a Select dropdown
	 *@parameter element
	 *@parameter index 
	 */
	public void selectbyIndex(WebElement element, int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
	/*
	 *  method to Select an option by value in a Select dropdown
	 *  @paramater element
	 *  @parameter value
	 */
	public void selectbyValue(WebElement element, String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	
	/*
	 *  method to Wait for element to be visibity and then click
	 *  @paramater driver
	 *  @parameter ele
	 */
	public void WaiforElementVisibleandClick(WebDriver driver, WebElement ele) {
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(ele)).click();	
	}
	
	/*
	 *  method to Switch to alert and accept
	 *  @paramater driver
	 */
	public void AlertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
		
	}
	
	/*
	 *  method to Switch to alert and dismiss
	 *  @paramater driver
	 */
	public void AlertDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
		
	}
	
	/*
	 * method to switch to specific window based on complete or partial title
	 * @parameter driver
	 * @parameter title
	 */
	public void switchingToWindowTitle(WebDriver driver, String title) {
		Set<String> ssid = driver.getWindowHandles();
		for(String id:ssid) {
			if(id.contains(title)) {
			driver.switchTo().window(id);
			break;
			}
		}
	}
	
	/*
	 * method to wait for a second to load the page
	 * @parameter driver
	 *
	 */
	public void waitForPagetoLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
	}


}
