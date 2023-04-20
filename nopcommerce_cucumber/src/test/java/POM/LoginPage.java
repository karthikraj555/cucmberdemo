package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;
	
	public LoginPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.ID,using="Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(how=How.ID,using="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	@CacheLookup
	WebElement Loginbtn;
	
	@FindBy(how=How.XPATH,using="//a[@href='/logout']")
	@CacheLookup
	WebElement Logoutbtn;
	
	public void setUsername(String uname)
	{
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	public void ClickLogin()
	{
		Loginbtn.click();
	}
	
	public void ClickLogout()
	{
		Logoutbtn.click();
	}

}
