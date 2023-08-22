package newproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import new1project.automation2;
import new1project.webpag;
import new1project.Doubleclick;
import new1project.alert1;
import new1project.newbrowser;
import new1project.slider;


@Test
public class automation1 {
	public WebDriver driver;

	@BeforeTest

	public void setup()

	{
     driver=new ChromeDriver();
	}

	@BeforeMethod

	public void start()

	{
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		

	}
	@Test
	public void test() throws Exception
	
	{
		automation2 ob1=new automation2 (driver);
		
		
		ob1.test1("chinju","chinju@gmail.com","9657987654","mangalassery");
		ob1.test2();
		
		webpag ob2=new webpag(driver);
    	ob2.tabss("testing");
    	
    	alert1 ob3=new alert1 (driver);
    	ob3.alert();
    	ob3.confirm();
    	ob3.prompt("Alan");

    	Doubleclick ob4=new Doubleclick(driver);
    	ob4.doublecl();
    	ob4.drag();
    	
    	
    	
    	newbrowser ob5=new newbrowser(driver);
    	ob5.scroll();
    	ob5.handle();
    	
    	slider ob6=new slider(driver);
    	ob6.slice();
    	ob6.resize();
    	
    	
    	
	}	
}
