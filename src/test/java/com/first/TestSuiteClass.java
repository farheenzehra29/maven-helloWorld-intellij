package com.first;

import junit.framework.TestResult;
import junit.framework.TestSuite;

//import org.junit.runner.Result;
public class TestSuiteClass {
    public static void main(String[] args) {
        TestSuite suite = new TestSuite(AppTest.class, PrintGradesTest.class);
        TestResult result = new TestResult();
        suite.run(result);
        System.out.println("The number of test cases= " + result.runCount());


    }

}
