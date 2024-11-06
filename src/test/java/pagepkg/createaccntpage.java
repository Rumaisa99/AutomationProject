package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createaccntpage {
	WebDriver driver;
	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[3]/a")
	WebElement createaccnt;
	@FindBy(id="firstname")
	WebElement firstname;
	@FindBy(id="lastname")
	WebElement lastname;
	@FindBy(id="email_address")
	WebElement email;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="password-confirmation")
	WebElement confirmpassword;
	@FindBy(xpath = "//*[@id=\"form-validate\"]/div/div[1]/button")
	WebElement clickcreateaccount;
	
	
	
	public createaccntpage (WebDriver driver) 
	{
		this.driver=driver;
   	    PageFactory.initElements(driver,this);
	}
	public void createaccount() 
	{
		createaccnt.click();
	}
	public void Setvalues(String firstname1,String lastname1,String email1,String password1,String cnfrmpsswrd)
	{
		firstname.sendKeys(firstname1);
		lastname.sendKeys(lastname1);
		email.sendKeys(email1);
		password.sendKeys(password1);
		confirmpassword.sendKeys(cnfrmpsswrd);
	}
	public void clickcreateaccount() 
	{
		clickcreateaccount.click();
	}

	
}
