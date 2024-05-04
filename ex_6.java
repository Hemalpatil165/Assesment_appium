package appiumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class ex_6 extends BaseDemo
{
	
	@Test
	public void seekbar() throws InterruptedException
	{
		driver.findElement(AppiumBy.androidUIAutomator
				("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.androidUIAutomator
				("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Seek Bar\"));")).click();
		Thread.sleep(5000);
		
		WebElement slider=driver.findElement(By.id("io.appium.android.apis:id/seek"));
		Thread.sleep(5000);
		
		int xAxisStartPoint=slider.getLocation().getX();

		int xAxisEndPoint=xAxisStartPoint+slider.getSize().getWidth();

		int yAxisStartPoint=slider.getLocation().getY();

		TouchAction action=new TouchAction(driver);

		action.press(PointOption.point(xAxisStartPoint, yAxisStartPoint))

		.moveTo(PointOption.point(xAxisEndPoint-100,yAxisStartPoint))

		.release()

		.perform();



	}
	
	}
