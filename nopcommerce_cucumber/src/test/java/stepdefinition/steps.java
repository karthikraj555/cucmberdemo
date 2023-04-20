package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import POM.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	
	public WebDriver driver;
	public LoginPage lp;
	
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karth\\eclipse-workspace\\nopcommerce_cucumber\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		lp=new LoginPage(driver);
	    
	    
	}

	@When("user opens URL {string}")
	public void user_opens_url(String url) {
	    
	   driver.get(url);
	}

	@When("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String pwd) {
	   
	    lp.setUsername(email);
	    lp.setPassword(pwd);
	}

	@When("click on login")
	public void click_on_login() {
	   
	    lp.ClickLogin();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
	   
	    if(driver.getPageSource().contains("Login was Unsuccessful."))
	    {
	    	driver.close();
	    	Assert.assertTrue(false);
	    }
	    else {
	    	Assert.assertEquals(title,driver.getTitle());
	    }
	}

	@When("user click on log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
	  
	    lp.ClickLogout();
	    Thread.sleep(2000);
	}


	@Then("close browser")
	public void close_browser() {
     driver.quit();
	}


}
