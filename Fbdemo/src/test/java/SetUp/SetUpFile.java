package SetUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import PageObjectModel.PageObjectModel;
import cucumber.api.java.en.*;

public class SetUpFile {
	WebDriver driver;
	PageObjectModel obj=new PageObjectModel(driver);
	
	@Given("^open account$")
	public void open_account() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "D:\\selinium-crome\\geckodriver-v0.30.0-win32\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
	}

	@Given("^add \"([^\"]*)\" and \"([^\"]*)\"$")
	public void add_and(String password, String userid) throws Throwable {
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(userid); 
	}

	@When("^hit login button$")
	public void hit_login_button() throws Throwable {
		driver.findElement(By.xpath("//*[@name='login']")).click();

	}

}
