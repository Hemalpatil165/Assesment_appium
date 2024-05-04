package appiumAssignment;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ex_7 extends BaseDemo
{
	@Test
	public void swipe() throws InterruptedException
	{
		driver.findElement(AppiumBy.androidUIAutomator
				("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.androidUIAutomator
				("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Gallery\"));")).click();
		Thread.sleep(2000);
		
       driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
       Thread.sleep(2000);
       
       for(int i=1; i<3; i++)
       {
    	WebElement ele=driver.findElement(By.xpath("//android.widget.ImageView["+i+"]"));
    	assertEquals(ele.getAttribute("focusable"),"true");
    	Thread.sleep(3000);
    	swipeAction(ele,"left");
    	Thread.sleep(3000);
    	
    	assertEquals(ele.getAttribute("focusable"),"false");
    
       }
	
	}

}


