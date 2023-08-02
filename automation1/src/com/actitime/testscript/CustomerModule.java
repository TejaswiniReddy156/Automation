package com.actitime.testscript;


import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;


@Listeners(com.actitime.generic.ListenersImplementation.class)
public class CustomerModule extends BaseClass
{
	
	@Test(groups="smoketest")
	public void CreateCustomer() {
	Reporter.log("CreateCustomer",true);
	}
	@Test(groups="smoketest")
	public void ModifyCustomer() {
		Reporter.log("Modifycustomer",true);
	}
	
	
}
