package org.example;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords;

public class SimpleTest {

	@BeforeClass
	public void setUp() {
		System.out.println("Set up");
	}

	@Test(groups = { "fast" })
	public void aFastTest() {
		System.out.println("Fast test");
	}

	@Test(groups = { "slow" })
	public void aSlowTest() {
		System.out.println("Slow test");
		WebUiBuiltInKeywords.openBrowser("google.com");
		WebUiBuiltInKeywords.closeBrowser();
	}
}
