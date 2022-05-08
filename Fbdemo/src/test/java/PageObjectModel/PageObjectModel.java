package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {


@FindBy(xpath="//*[@id='email']")private WebElement EntreEmail;
@FindBy(xpath="//*[@id='passContainer']")private WebElement EntrePassword;
@FindBy(xpath="//*[@name='login']")private WebElement EntreonLogin;

public PageObjectModel(WebDriver driver){
	
	PageFactory.initElements(driver, this);
}
public void EntreEmail(String Email){
	EntreEmail.sendKeys(Email);
}
public void EntrePassword(String Password){
	EntrePassword.sendKeys(Password);
}
public void ClickOnLogin(){
	EntreonLogin.click();
}

}
