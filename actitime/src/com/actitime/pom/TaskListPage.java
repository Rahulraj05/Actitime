package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewBt;
	
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newCustOpetion;
	
	@FindBy(xpath = "//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement custNameTbx;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement custDescTbx;
	
	@FindBy(xpath = "//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustDD;
	
	@FindBy(xpath = "//div[text()='Our company' and@class='itemRow cpItemRow ']")
	private WebElement ourCompany;
	
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCustBtn;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getAddNewBtn() {
		return addNewBt;
	}
	public WebElement getNewCustOpetion() {
		return newCustOpetion;
	}
	public WebElement getCustNameTbx() {
		return custNameTbx;
	}
	public WebElement getCustDescTbx() {
		return custDescTbx;
	}
	public WebElement getSelectCustDD() {
		return selectCustDD;
	}
	public WebElement getOurCompany() {
		return ourCompany;
	}
	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}
}
