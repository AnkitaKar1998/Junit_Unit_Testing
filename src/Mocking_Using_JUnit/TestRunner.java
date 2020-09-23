package Mocking_Using_JUnit;

import Runner_Suite_Timeout.TestMessage;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String args[]) {
        Result result = JUnitCore.runClasses(ApplicationTester.class);
        for(Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
