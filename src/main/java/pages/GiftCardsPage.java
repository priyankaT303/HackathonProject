package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import Reports.ExtentReportsPage;
import library.ReusableMethods;
import library.ScreenShot;

public class GiftCardsPage extends ExtentReportsPage{
	static WebDriver driver;
	static String[] details=new String[10];
	ReusableMethods rm=new ReusableMethods(driver);
	ExtentReportsPage ep=new ExtentReportsPage();

	@FindBy(xpath="//span[contains(@class,'chNavIcon appendBottom2 chSprite chMore')]")
	WebElement moreOptions;

	@FindBy(xpath="//a[normalize-space()='Giftcards']")
	WebElement giftCards;	

	@FindBy(xpath= "//img[@src=\"https://promos.makemytrip.com/appfest/2x/580x346-Corporate-1.png\"]")
	WebElement corporateGift;

	@FindBy(xpath="//li[normalize-space()='E-Mail']")
	WebElement emailSelection;

	@FindBy(name= "name")
	WebElement name;

	@FindBy(name = "senderName")
	WebElement senderName;

	@FindBy(name ="mobileNo")
	WebElement mobileNumber;

	@FindBy(name= "senderMobileNo")
	WebElement senderMobileNo;

	@FindBy(name= "emailId")
	WebElement emailId;

	@FindBy(name= "senderEmailId")
	WebElement senderEmailId;

	@FindBy(name= "giftMessage")
	WebElement giftMessage;

	@FindBy(xpath ="//button[@class='prime__btn font16 prime__btn__text']")
	WebElement buyNow;

	public GiftCardsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void readDetailsSheet() throws Exception {             //To read the data from GiftcardsSheet
		details=rm.readExcelData("GiftcardsSheet");

	}

	public void MoreOption()                                      //To select the More Options
	{
		try
		{
			Thread.sleep(4000);
			moreOptions.click();
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red');", moreOptions);
			ScreenShot.TakeScreenShot(driver);
			test4.log(Status.PASS, "More option is selected");
		}
		catch(Exception e)
		{
			System.out.println("Error occured while selecting the more options");
		}
	}
	public void GiftCards()                                      //To select the GiftCards options
	{ 
		try
		{
			Thread.sleep(4000);
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red');", giftCards);
			ScreenShot.TakeScreenShot(driver);
			giftCards.click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,1700)");
			test4.log(Status.PASS, "Giftcards is clicked");
		}
		catch(Exception e)
		{
			System.out.println("Error occured while clicking the Giftcards options");
		}

	}
	public void CorporateGift() throws InterruptedException     //To select the Corporate Giftcard
	{
		try
		{
			Thread.sleep(4000);
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red');", corporateGift);
			ScreenShot.TakeScreenShot(driver);
			corporateGift.click();
			
			test4.log(Status.PASS, "Corporate Giftcard is clicked");
		}
		catch(Exception e)
		{
			System.out.println("Error occured while clicking the Corporate Giftcard options");
		}

	}
	public void MailSelection() throws InterruptedException           //To select the Mail Tab
	{
		try
		{
			Thread.sleep(4000);
			emailSelection.click();
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red');", emailSelection);
			ScreenShot.TakeScreenShot(driver);
			test4.log(Status.PASS, "Email Tab is selected");
		}
		catch(Exception e)
		{
			System.out.println("Error occured while selecting Email Tab");
		}

	}
	public void Name()                                                   //Enter the Name of Recipient's Name
	{
		try
		{
			Thread.sleep(4000);
			name.sendKeys(details[0]);
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red');", name);
			ScreenShot.TakeScreenShot(driver);
			test4.log(Status.PASS, "Recipient's Name is entered");
		}
		catch(Exception e)
		{
			System.out.println("Error occured while entering Recipient's Name");
		}

	}
	public void SenderName()                                             //Enter the Sender's Name
	{
		try
		{
			Thread.sleep(4000);
			senderName.sendKeys(details[1]);
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red');", senderName);
			ScreenShot.TakeScreenShot(driver);
			test4.log(Status.PASS, "Sender's Name is entered");
		}
		catch(Exception e)
		{
			System.out.println("Error occured while entering Sender's Name");
		}
	}
	public void MobileNo()                                                //Enter the Recipient's Mobile Number
	{
		try
		{
			Thread.sleep(4000);
			mobileNumber.sendKeys(details[2]);
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red');", mobileNumber);
			ScreenShot.TakeScreenShot(driver);
			test4.log(Status.PASS, "Recipient's Mobile Number is entered");
		}
		catch(Exception e)
		{
			System.out.println("Error occured while entering Recipient's Mobile Number");
		}
	}
	public void SenderMobileNo()                                          //Enter the Sender's Mobile Number
	{
		try
		{
			Thread.sleep(4000);
			senderMobileNo.sendKeys(details[3]);
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red');", senderMobileNo);
			ScreenShot.TakeScreenShot(driver);
			test4.log(Status.PASS, "Sender's Mobile Number is entered");
		}
		catch(Exception e)
		{
			System.out.println("Error occured while entering Sender's Mobile Number");
		}
	}
	public void EmailId()                                               //Enter the Recipient's email id
	{
		try
		{
			Thread.sleep(4000);
			emailId.sendKeys(details[4]);
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red');", emailId);
			ScreenShot.TakeScreenShot(driver);
			test4.log(Status.PASS, "Recipient's Email id is entered");
		}
		catch(Exception e)
		{
			System.out.println("Error occured while entering Recipient's Email id");
		}
	}
	public void SenderEmailId()                                         //Enter the Sender's Email id
	{
		try
		{
			Thread.sleep(4000);
			senderEmailId.sendKeys(details[5]);	
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red');", senderEmailId);
			ScreenShot.TakeScreenShot(driver);
			test4.log(Status.PASS, "Sender's Email id is entered");
		}
		catch(Exception e)
		{
			System.out.println("Error occured while entering Sender's Email id");
		}
	}
	public void GiftMessage()                                                    //To enter the Gift Message
	{
		try
		{
			Thread.sleep(4000);
			giftMessage.sendKeys(details[6]);
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red');", giftMessage);
			ScreenShot.TakeScreenShot(driver);
			test4.log(Status.PASS, "Gift Message is entered");
		}
		catch(Exception e)
		{
			System.out.println("Error occured while entering Gift Message");

		}

	}
	public void BuyNow()                                                        //To click the Buy Now
	{
		try
		{
			Thread.sleep(4000);
			buyNow.click();
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style','background:yellow; border:2px solid red');", buyNow);
			ScreenShot.TakeScreenShot(driver);
			test4.log(Status.PASS, "Buy Now Button is clicked");
			rep.flush();
		}
		catch(Exception e)
		{
			System.out.println("Error occured while clicking Buy Now Button");
		}
	}	

}
