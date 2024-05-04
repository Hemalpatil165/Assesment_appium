package appiumAssignment;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
 
	
	
	public class ex_3 extends BaseDemo{
		@Test
	public void fb() throws InterruptedException
		{
			
		driver.findElement(By.id("com.android.packageinstaller:id/permission_deny_button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("android.widget.MultiAutoCompleteTextView")).sendKeys("9879969052");
		Thread.sleep(2000);
		
		driver.findElement(By.className("android.widget.MultiAutoCompleteTextView")).sendKeys("Hemal0606");
		Thread.sleep(1000);
		
		driver.findElement(By.className("android.view.ViewGroup")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
