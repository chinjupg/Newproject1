package new1project;


	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.Test;

	public class newbrowser 
	{
		WebDriver driver;
		public newbrowser(WebDriver driver)
		{
			this.driver=driver;
		}
		@Test
		public void scroll()
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-2000)","");
		}
		public void handle()
		{
			String pswd=driver.getWindowHandle();
			driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/button")).click();
			Set<String> def=driver.getWindowHandles();
			for(String abc:def)
			{
				if(!abc.equalsIgnoreCase(pswd))
				{
					driver.switchTo().window(abc);
					driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[3]/a")).click();
					driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[3]/div/div/ul/li[2]/a")).click();
					driver.navigate().back();
					driver.close();
				}
				driver.switchTo().window(pswd);
			}
		}

	


}
