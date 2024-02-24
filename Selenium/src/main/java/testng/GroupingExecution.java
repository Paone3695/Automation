package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingExecution {
	@Test(groups="smokegrp")
	public void smokegrp() {
		Reporter.log("Smoke Group 1",true);
	}
	@Test(groups="ITgrp")
	public void ITgrp() {
		Reporter.log("Integration Group 1",true);
	}
	@Test(groups="regGrp")
	public void RegGrp() {
		Reporter.log("Regression Group 1",true);
	}
	@Test(groups="FtGrp")
	public void FTGrp() {
		Reporter.log("Functional  Group 1",true);
	}
	@Test(groups="smokegrp")
	public void smokegrp2() {
		Reporter.log("Smoke Group 2",true);
	}
	@Test(groups="ITgrp")
	public void ITgrp2() {
		Reporter.log("Integration Group 2",true);
	}
	@Test(groups="regGrp")
	public void regGrp2() {
		Reporter.log("Regression Group 2",true);
	}
	@Test(groups="FtGrp")
	 public void FtGrp() {
		Reporter.log("Functional Group 2",true);
	}
	
	

}
