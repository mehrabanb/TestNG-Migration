import org.example.SampleJUnitTest
import org.example.SimpleTest as SimpleTest

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testng.keyword.JUnitRunnerResult
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

import com.moe.application.camoe.tests.Test1 as Test1

List testSuites = ['Include/resources/testng.xml']

TestNGKW.runTestNGTestSuites(testSuites, FailureHandling.STOP_ON_FAILURE)

List testClasses = [SimpleTest.class, Test1.class]

TestNGKW.runTestNGTestClasses(testClasses, FailureHandling.STOP_ON_FAILURE)

List junitTestClasses = [SampleJUnitTest.class]
JUnitRunnerResult junitResult = TestNGKW.runJUnitTestClasses(junitTestClasses, FailureHandling.STOP_ON_FAILURE)
println junitResult.getJUnitResult().getRunCount()

