package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class TaskModule extends BaseClass{
	@Test(priority = 1)
	public void CreateTask() {
	Reporter.log("CreateTask",true);
	}
	@Test(priority = 2)
	public void ModifyTask() {
		Reporter.log("ModifyTask",true);
	}
	@Test(priority = 3)
	public void DeleteTask() {
		Reporter.log("DeleteTask",true);
	}

}
