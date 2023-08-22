package new1project;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.Test;

	public class Doubleclick 
	{
		WebDriver driver;
		public Doubleclick(WebDriver driver)
		{
			this.driver=driver;
		}
		@Test
		public void doublecl()
		{
			Actions act=new Actions(driver);
			WebElement xy = driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
			act.doubleClick(xy).perform();
		}
		public void drag()
		{
			WebElement ab=driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
			WebElement cd=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
			Actions act=new Actions(driver);
			act.dragAndDrop(ab, cd);
			act.perform();
		}

	

}
