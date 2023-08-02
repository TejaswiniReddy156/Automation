package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjectModule extends BaseClass{
	@Test
	public void CreateProject() {
	Reporter.log("CreateProject",true);
	}
	@Test
	public void ModifyProject() {
		Reporter.log("ModifyProject",true);
	}
	@Test
	public void DeleteProject() {
		Reporter.log("DeleteProject",true);
	}
	@Test
	public void ModifyCustomer() {
		Reporter.log("ModifyCustomer",true);
	}
	@Test
	public void DeleteCustomer() {
		Reporter.log("DeleteCustomer",true);
	}

}
