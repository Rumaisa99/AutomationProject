package testpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Loginpage;
import pagepkg.createaccntpage;

public class Lumatest {
	
	  WebDriver driver;
	 @BeforeTest
	 public void setup() 
	 {
		 driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/"); 
	  }
	@Test(priority=1)
	public void test1() throws InterruptedException
	{
		createaccntpage ob=new createaccntpage(driver);
		ob.createaccount();
		ob.Setvalues("Rumaisa","C R","rumaisasif99@gmail.com","kezin@22","kezin@22");
		
		ob.clickcreateaccount();
	
		System.out.println("successfully created account");
		Thread.sleep(2000);
		
	}
	
    @Test(priority=2)
    public void test2() throws InterruptedException 
    {
    	Loginpage ob= new Loginpage(driver);
    	ob.signin();
    	String xl="C:\\Users\\asifa\\Desktop\\LUMINAR WORKS\\lumatest1.xlsx";
		String sheet="Sheet1";
		int rowCount=Excelutils.getRowCount(xl, sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String email=Excelutils.getCellValue(xl, sheet, i, 0);
			System.out.println("email......"+email);
			String password=Excelutils.getCellValue(xl, sheet, i, 1);
			System.out.println("password......."+password);
		    ob.setvalues(email, password);
			ob.loginclick();
	        driver.navigate().refresh();
	       
	        Thread.sleep(1000);
    }
    }
    @Test(priority=3)
    public void test3() throws InterruptedException 
    {
    	Loginpage ob= new Loginpage(driver);
    	ob.logo();
    	ob.women();
    	JavascriptExecutor js=(JavascriptExecutor) driver;
    	 js.executeScript("window.scrollBy(0,2000)");
    	ob.product();
    	// WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
    //	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	ob.cart();
    	js.executeScript("window.scrollTo(0, 0);");
    	ob.homecart();	
    	Thread.sleep(1000);
    	driver.navigate().back();
    	
    }
    @Test(priority=4)
    public void test4() 
    {
    	
    	String expurl="https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/";
		String actualurl=driver.getCurrentUrl();
		if(actualurl.equals(expurl))
		{
			System.out.println("Test pass");
		}
		else
		{
			System.out.println("Test fail");
		}
	}
    @Test(priority=5)
    public void test5() 
    {
    		List<WebElement>li=driver.findElements(By.tagName("a"));
    		System.out.println("total no of links="+li.size());
    		
    	for(WebElement link:li)
    	{
    		System.out.println("Link:"+link.getAttribute("href"));
    		System.out.println("Link:"+link.getText());
    }
            driver.quit();
    }
    
}
 
