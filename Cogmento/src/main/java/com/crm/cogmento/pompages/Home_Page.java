package com.crm.cogmento.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page{
	

	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//i[@class='calendar icon']")
	private WebElement calenderLink;

	@FindBy(xpath="//i[@class='users icon']")
	private WebElement contactsLink;
	
	@FindBy(xpath="//i[@class='building icon']")
	private WebElement companiesLink;
	
	@FindBy(xpath="//i[@class='money icon']")
	private WebElement dealsLink;
	
	@FindBy(xpath="//i[@class='tasks icon']")
	private WebElement tasksLink;
	
	@FindBy(xpath="//i[@class='comments icon']")
	private WebElement casesLink;
	
	@FindBy(xpath="//i[@class='phone icon']")
	private WebElement callsLink;
	
	@FindBy(xpath="//i[@class='file icon']")
	private WebElement documentsLink;
	
	@FindBy(xpath="//i[@class='mail outline icon']")
	private WebElement emailLink;
	
	@FindBy(xpath="//i[@class='target icon']")
	private WebElement CampaignsLink;
	
	@FindBy(xpath="//i[@class='wpforms icon']")
	private WebElement formsLink;
	
	@FindBy(xpath="(//button[@class='ui mini basic icon button'])[1]")
	private WebElement CreateNewCalenderbttn;

	@FindBy(xpath="(//button[@class='ui mini basic icon button'])[2]")
	private WebElement CreateNewContactsbttn;
	
	@FindBy(xpath="(//button[@class='ui mini basic icon button'])[3]")
	private WebElement CreateNewCompaniesbttn;
	
	@FindBy(xpath="(//button[@class='ui mini basic icon button'])[4]")
	private WebElement CreateNewDealsbttn;
	
	@FindBy(xpath="(//button[@class='ui mini basic icon button'])[5]")
	private WebElement CreateNewTasksbttn;
	
	@FindBy(xpath="(//button[@class='ui mini basic icon button'])[6]")
	private WebElement CreateNewCasesbttn;
	
	@FindBy(xpath="(//button[@class='ui mini basic icon button'])[7]")
	private WebElement CreateNewCallsbttn;
	
	@FindBy(xpath="(//button[@class='ui mini basic icon button'])[8]")
	private WebElement CreateNewDocumentsbttn;

	public WebElement getCalenderLink() {
		return calenderLink;
	}

	public WebElement getContactsLink() {
		return contactsLink;
	}

	public WebElement getCompaniesLink() {
		return companiesLink;
	}

	public WebElement getDealsLink() {
		return dealsLink;
	}

	public WebElement getTasksLink() {
		return tasksLink;
	}

	public WebElement getCasesLink() {
		return casesLink;
	}

	public WebElement getCallsLink() {
		return callsLink;
	}

	public WebElement getDocumentsLink() {
		return documentsLink;
	}

	public WebElement getEmailLink() {
		return emailLink;
	}

	public WebElement getCampaignsLink() {
		return CampaignsLink;
	}

	public WebElement getFormsLink() {
		return formsLink;
	}

	public WebElement getCreateNewCalenderbttn() {
		return CreateNewCalenderbttn;
	}

	public WebElement getCreateNewContactsbttn() {
		return CreateNewContactsbttn;
	}

	public WebElement getCreateNewCompaniesbttn() {
		return CreateNewCompaniesbttn;
	}

	public WebElement getCreateNewDealsbttn() {
		return CreateNewDealsbttn;
	}

	public WebElement getCreateNewTasksbttn() {
		return CreateNewTasksbttn;
	}

	public WebElement getCreateNewCasesbttn() {
		return CreateNewCasesbttn;
	}

	public WebElement getCreateNewCallsbttn() {
		return CreateNewCallsbttn;
	}

	public WebElement getCreateNewDocumentsbttn() {
		return CreateNewDocumentsbttn;
	}
	
	

}
