package appiumAssignment;

import java.sql.Driver;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ex_5 extends BaseDemo
{
	@Test
	public void scroll() throws InterruptedException
	{
	
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.androidUIAutomator
				("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));")).click();
		Thread.sleep(2000);	
		
	}

}
