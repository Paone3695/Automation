package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelClass1 {
	@Test
	public void runchrome()
	{
		Reporter.log("Chrome Class1",true);
	}

}
