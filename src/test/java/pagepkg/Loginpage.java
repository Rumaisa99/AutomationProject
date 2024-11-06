package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	WebElement signin;
	@FindBy(xpath = "//*[@id=\"email\"]" )
	WebElement emailid;
	@FindBy(id="pass")
	WebElement password;
	@FindBy(name = "send")
	WebElement signclick;
	
	@FindBy(xpath = "/html/body/div[2]/header/div[2]/a/img")
	WebElement clicklogo;
	@FindBy(xpath = "//*[@id=\"ui-id-4\"]")
	WebElement clickwomen;

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[4]/div/div/ol/li[1]")
	WebElement  clickradianttee;
	@FindBy(xpath = "//*[@id=\"option-label-size-143-item-167\"]")
	WebElement clicksize;
	@FindBy(xpath = "//*[@id=\"option-label-color-93-item-50\"]")
	WebElement clickcolor;
	@FindBy(xpath = "//*[@id=\"product-addtocart-button\"]")
	WebElement addtocart;
	@FindBy(xpath = "/html/body/div[2]/header/div[2]/div[1]/a")
	WebElement clickcartbutton;
   
	public Loginpage (WebDriver driver) 
	{
		this.driver=driver;
   	    PageFactory.initElements(driver,this);
	}
	public void signin() 
	{
		signin.click();
	}
	public void setvalues(String mailid,String pswd) 
	{
		emailid.sendKeys(mailid);
		password.sendKeys(pswd);
	}
	public void loginclick()
	{
		signclick.click();
	}
    public void logo() 
    {
    	clicklogo.click();
    }
    public void women() 
    {
    	clickwomen.click();
    }
 
   
    public void product()
    {
    	clickradianttee.click();
    	clicksize.click();
    	clickcolor.click();
    }
    public void cart()
    {
    	addtocart.click();
    	
    }
    public void homecart()
    {
    	clickcartbutton.click();
    	
    }
	

}
