package testng;



import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority =0)//By Default Priority is Zero
	public void settings() {
		Reporter.log("Setting",true);
	}
	
	@Test//if both methods have same Priority it will execute based on alphabetical order of method name
		public void tall() {
		Reporter.log("Calls",true);
		}
	//Priority Executes from Negative to Positive e.g -2,-1,0,+1,+2
	@Test(priority = -1)
	public void chats() {
	Reporter.log("Chats",true);
	}

}
