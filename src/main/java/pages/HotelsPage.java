package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import Reports.ExtentReportsPage;
import library.ScreenShot;
public class HotelsPage extends ExtentReportsPage {
	WebDriver driver;
	ExtentReportsPage ep=new ExtentReportsPage();
	static ScreenShot sc= new ScreenShot();
	@FindBy(partialLinkText = "Hotels")
	WebElement hotels;

	@FindBy(id= "guest")
	WebElement guest;
	
	public HotelsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void Hotels()                                             //To select the Hotel logo container
	{
		try
		{
			
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red');", hotels);
			ScreenShot.TakeScreenShot(driver);
		hotels.click();  
		Thread.sleep(4000);
		test6.log(Status.PASS,"Hotels Tab is clicked");
		}
		catch(Exception e)
		{
			System.out.println("Error occured while clicking the Hotels Tab");
		}
	}
	
	public void guest()                                              //To  select the adult list and display it 
	{
		try
		{

			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red');", guest);
			ScreenShot.TakeScreenShot(driver);
		guest.click();		   
		System.out.println("List of Adult Counts");
		List<WebElement> allElements = driver.findElements(By.xpath("//ul[@ data-cy='adultCount']")); 
		Thread.sleep(4000);
		for (WebElement element: allElements)
		{
			System.out.println(element.getText());
		}
		test6.log(Status.PASS,"Adults Details is Returned");
		rep.flush();
		}
		catch(Exception e)
		{
			System.out.println("Error occured while returning Adults Details");
		}
	}

}
