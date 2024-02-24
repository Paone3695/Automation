package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngClass {
	@Test
	public void basic() {
		
		Reporter.log("selenium",true);//if true will Print on both Console and Report.
		Reporter.log("Java-selenium",false);//if false will Print on Report only.
	}
	

}
