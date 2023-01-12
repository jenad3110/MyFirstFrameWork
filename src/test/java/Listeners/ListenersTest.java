package Listeners;

import Base.CommonAPI;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenersTest  implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult)
    {System.out.println("Test Passed "+iTestResult.getName());
        System.out.println(iTestResult.getMethod());

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test Failed name of the test "+iTestResult.getName());
        System.out.println(iTestResult.getMethod());

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}