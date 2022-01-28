package testcases1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import testbase.testbase1;

public class Sampleextentreport extends testbase1 {
	@Test
	void sample() {
	String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
	logger = extent.startTest(TestcaseId, "test1 i am running");
	logger.log(LogStatus.PASS, "text");
	logger.log(LogStatus.FAIL, "text");
	logger.log(LogStatus.INFO, "text");

}
}