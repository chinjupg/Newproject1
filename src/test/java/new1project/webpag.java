package new1project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class webpag
{
	WebDriver driver;
	By sear=By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]");
	By sea=By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input");

	public webpag(WebDriver driver)
	{
		this.driver=driver;
	}
	@Test
	public void tabss(String search)
	{
		driver.findElement(sear).sendKeys(search);
		driver.findElement(sea).click();
	}

}


