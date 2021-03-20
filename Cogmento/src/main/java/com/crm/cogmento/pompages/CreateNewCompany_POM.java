package com.crm.cogmento.pompages;
/*
 * @Saleem
 * POM class for creating a new Company
 * 
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCompany_POM {
	//Step1 : Decalaration of all the webElements

	@FindBy(xpath="//i[@class='building icon']")
	private WebElement companyicon;

	@FindBy(xpath="(//button[@class='ui mini basic icon button'])[3]")
	private WebElement Createnewcompanybttn;

	@FindBy(xpath="(//input[@name='name'])[1]")
	private WebElement nametextTbox;

	@FindBy(xpath="//button[@class='ui small fluid positive toggle button']")
	private WebElement Accessbutton;

	@FindBy(xpath="//i[@class='linkify icon']")
	private WebElement linkifyIcon;

	@FindBy(xpath="//input[@name='url']")
	private WebElement urlTbox;

	@FindBy(xpath="//input[@name='address']")
	private WebElement addressTbox;

	@FindBy(xpath="//input[@name='city']")
	private WebElement cityTbox;

	@FindBy(xpath="//input[@name='state']")
	private WebElement stateTbox;

	@FindBy(xpath="//input[@name='zip']")
	private WebElement zipTbox;

	@FindBy(xpath="(//i[@class='add icon'])[1]")
	private WebElement countryAddButton;

	@FindBy(xpath="//input[@placeholder='Number']")
	private WebElement NumberTbox;

	@FindBy(xpath="//input[@placeholder='Home, Work, Mobile...']")
	private WebElement HomeWorkNumberTbox;

	@FindBy(xpath="(//i[@class='add icon'])[2]")
	private WebElement NumberAddButton;

	@FindBy(xpath="//label[@for='tags']/div/input")
	private WebElement tagsTbox;

	@FindBy(xpath="//textarea[@name='description']")
	private WebElement DescriptionTbox;

	@FindBy(xpath="//label[contains(text(),'Social Channels')]/..//div/div[2]/div/input")
	private WebElement SocialHandlesTbox;

	@FindBy(xpath="(//i[@class='add icon'])[3]")
	private WebElement SocialHandlesAddButton;

	@FindBy(xpath="//input[@name='industry']")
	private WebElement IndustryTbox;

	@FindBy(xpath="//input[@name='num_employees']")
	private WebElement NoOfEmployeesTbox;

	@FindBy(xpath="//input[@name='symbol']")
	private WebElement StockSymbolTbox;

	@FindBy(xpath="//input[@name='annual_revenue']")
	private WebElement AnnualRevenueTbox;

	@FindBy(xpath="//input[@name='vat_number']")
	private WebElement VatNumberTbox;

	@FindBy(xpath="//input[@name='identifier']")
	private WebElement identifireTbox;

	@FindBy(xpath="//input[@name='image']")
	private WebElement ImageBox;

	@FindBy(xpath="//i[@class='save icon']")
	private WebElement SaveButton;
	
	@FindBy(xpath="//i[@class='cancel icon']")
	private WebDriver CancelButton;

	/*
	 * Step 2: Initializing all the variables through constructor
	 */
	public CreateNewCompany_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}

	/*
	 * Step 3: Utilization of all variables.
	 */
	public WebElement getCompanyicon() {
		return companyicon;
	}

	public WebElement getCreatenewcompanybttn() {
		return Createnewcompanybttn;
	}

	public WebElement getNametextTbox() {
		return nametextTbox;
	}

	public WebElement getAccessbutton() {
		return Accessbutton;
	}

	public WebElement getLinkifyIcon() {
		return linkifyIcon;
	}

	public WebElement getUrlTbox() {
		return urlTbox;
	}

	public WebElement getAddressTbox() {
		return addressTbox;
	}

	public WebElement getCityTbox() {
		return cityTbox;
	}

	public WebElement getStateTbox() {
		return stateTbox;
	}

	public WebElement getZipTbox() {
		return zipTbox;
	}

	public WebElement getCountryAddButton() {
		return countryAddButton;
	}

	public WebElement getNumberTbox() {
		return NumberTbox;
	}

	public WebElement getHomeWorkNumberTbox() {
		return HomeWorkNumberTbox;
	}

	public WebElement getNumberAddButton() {
		return NumberAddButton;
	}

	public WebElement getTagsTbox() {
		return tagsTbox;
	}

	public WebElement getDescriptionTbox() {
		return DescriptionTbox;
	}

	public WebElement getSocialHandlesTbox() {
		return SocialHandlesTbox;
	}

	public WebElement getSocialHandlesAddButton() {
		return SocialHandlesAddButton;
	}

	public WebElement getIndustryTbox() {
		return IndustryTbox;
	}

	public WebElement getNoOfEmployeesTbox() {
		return NoOfEmployeesTbox;
	}

	public WebElement getStockSymbolTbox() {
		return StockSymbolTbox;
	}

	public WebElement getAnnualRevenueTbox() {
		return AnnualRevenueTbox;
	}

	public WebElement getVatNumberTbox() {
		return VatNumberTbox;
	}

	public WebElement getIdentifireTbox() {
		return identifireTbox;
	}

	public WebElement getImageBox() {
		return ImageBox;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	public WebDriver getCancelButton() {
		return CancelButton;
	}
	
	







}
