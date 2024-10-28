package hmsExecution;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Name of the test method started"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Name of the test method success"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Name of the test method failed"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Name of the test method skipped"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("finished");
	}

}
