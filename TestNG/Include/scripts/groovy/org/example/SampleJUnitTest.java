package org.example;
import org.junit.BeforeClass;
import org.junit.Test;

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords;

public class SampleJUnitTest {

	@BeforeClass
	public void setUp() {
		System.out.println("Set up");
	}

	@Test
	public void aFastTest() {
		System.out.println("Fast test");
	}

	@Test
	public void aSlowTest() {
		System.out.println("Slow test");
		WebUiBuiltInKeywords.openBrowser("google.com");
		WebUiBuiltInKeywords.closeBrowser();
	}
}