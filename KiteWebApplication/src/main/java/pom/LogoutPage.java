package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
	

	@FindBy(id="userid")
	private WebElement userID;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath = "//button[text()='Login ']")
	private WebElement loginButton;
	
	@FindBy(id = "pin")
	private WebElement pin;
	
	@FindBy(xpath="//button[text()='Continue ']")
	private WebElement continueButton;
	
	

}
