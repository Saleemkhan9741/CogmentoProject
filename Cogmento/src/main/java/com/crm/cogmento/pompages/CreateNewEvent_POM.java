package com.crm.cogmento.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewEvent_POM {
	
	public CreateNewEvent_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}	
	
	@FindBy(xpath="//input[@name='title']")
	private WebElement titleTbox;
	
	@FindBy(xpath="(//div[@class='react-datepicker__input-container'])[1]")
	private WebElement startDatetxtbox;
	
	@FindBy(xpath="//div[@class='react-datepicker__month-container']/div[2]/div[4]/div[7]")
	private WebElement startDatepopupSelect;
	
	@FindBy(xpath="//li[@class='react-datepicker__time-list-item  react-datepicker__time-list-item--selected']")
	private WebElement starttimeSelect;
	
	@FindBy(xpath="(//div[@class='react-datepicker__input-container'])[2]")
	private WebElement EndDatetxtbox;
	
	@FindBy(xpath="//div[@class='react-datepicker__month-container']/div[2]/div[4]/div[7]")
	private WebElement EndDatepopupSelect;
	
	@FindBy(xpath="//li[@class='react-datepicker__time-list-item  react-datepicker__time-list-item--selected']")
	private WebElement endtimeSelect;
	
	@FindBy(xpath="//label[@for='tags']/div/input")
	private WebElement tagstbox;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement descriptiontxtarea;
	
	@FindBy(xpath="//textarea[@name='location']")
	private WebElement locationtxtarea;
	
	@FindBy(xpath="//input[@name='all_day']")
	private WebElement alldaybutton;
	
	@FindBy(xpath="(//input[@aria-autocomplete='list' and @class='search'])[4]")
	private WebElement tasktbox;
	
	@FindBy(xpath="(//input[@aria-autocomplete='list' and @class='search'])[2]")
	private WebElement dealtbox;
	
	@FindBy(xpath="(//input[@aria-autocomplete='list' and @class='search'])[3]")
	private WebElement casetbox;
	
	@FindBy(xpath="//input[@name='reminder_minutes']")
	private WebElement remaindertimetbox;
	
	@FindBy(xpath="(//input[@aria-autocomplete='list' and @class='search'])[5]")
	private WebElement participantstbox;
	
	@FindBy(xpath="(//input[@aria-autocomplete='list' and @class='search'])[6]")
	private WebElement companytbox;
	
	@FindBy(xpath="//input[@name='identifier']")
	private WebElement identifiertbox;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement savebttn;

	public WebElement getTitleTbox() {
		return titleTbox;
	}


	public WebElement getStartDatetxtbox() {
		return startDatetxtbox;
	}

	public WebElement getStartDatepopupSelect() {
		return startDatepopupSelect;
	}

	public WebElement getStarttimeSelect() {
		return starttimeSelect;
	}

	public WebElement getEndDatetxtbox() {
		return EndDatetxtbox;
	}

	public WebElement getEndDatepopupSelect() {
		return EndDatepopupSelect;
	}

	public WebElement getEndtimeSelect() {
		return endtimeSelect;
	}

	public WebElement getTagstbox() {
		return tagstbox;
	}

	public WebElement getDescriptiontxtarea() {
		return descriptiontxtarea;
	}

	public WebElement getLocationtxtarea() {
		return locationtxtarea;
	}

	public WebElement getAlldaybutton() {
		return alldaybutton;
	}

	public WebElement getTasktbox() {
		return tasktbox;
	}

	public WebElement getDealtbox() {
		return dealtbox;
	}

	public WebElement getCasetbox() {
		return casetbox;
	}
	
	public WebElement getRemaindertimetbox() {
		return remaindertimetbox;
	}

	public WebElement getParticipantstbox() {
		return participantstbox;
	}

	public WebElement getCompanytbox() {
		return companytbox;
	}

	public WebElement getIdentifiertbox() {
		return identifiertbox;
	}

	public WebElement getSavebttn() {
		return savebttn;
	}

}
