package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.TaskListPage;

public class CustomerModule extends BaseClass {
	@Test
	public void testCreateCustomer() throws InterruptedException  {
		Reporter.log("create customer",true);
		EnterTimeTrack e = new EnterTimeTrack(driver);
		e.setTaskTab();
		TaskListPage t = new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewCustOpetion().click();
		t.getCustNameTbx().sendKeys("HDFC_001");
		t.getCustDescTbx().sendKeys("Banking Project");
		t.getSelectCustDD().click();
		t.getOurCompany().click();
		t.getCreateCustBtn().click();
		
		Thread.sleep(5000);
	}

}
