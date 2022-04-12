package BrowserTestScript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class FirstBrowserTest extends BaseClass {
	@BeforeMethod
	public void BrowserInitiate() throws Exception {
		InitiateBrowser("chrome");
	}

	@Test
	public void FirstTest() {
		driver.get(prop.getProperty("url"));
	}

	@AfterMethod
	public void CloseBrowser() {
		BrowserClosed();
	}
}
