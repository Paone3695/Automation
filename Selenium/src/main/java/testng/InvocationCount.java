package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount =5)//By Default Invocation Count is 1
	public void settings() {
		Reporter.log("Setting",true);
	}
	
	@Test (priority = 1,enabled =false)
	//enabled used to skip the testcases
		public void call() {
		Reporter.log("Calls",true);
		}
	//Priority Executes from Negative to Positive e.g -2,-1,0,+1,+2
	@Test(priority = -1)
	public void chats() {
	Reporter.log("Chats",true);
	}

}
