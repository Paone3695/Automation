package testng;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataParameterization {
@Parameters({"browser","url"})
@Test
public void DataParamers(String br,String url) {
	Reporter.log(br+"---"+url,true);
}
}
