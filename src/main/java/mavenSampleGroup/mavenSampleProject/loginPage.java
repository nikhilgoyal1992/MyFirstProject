package mavenSampleGroup.mavenSampleProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {
	
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")
	WebElement signIn_Btn;
	
	@FindBy(id="identifierId")
	WebElement emailAddress;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")
	WebElement next_Btn;
	
	
	
	public void ClicksignIn_Btn()
	{
		signIn_Btn.click();
	}
	
	public void sendKeysemailAddress(String EmailAddress)
	{
		emailAddress.sendKeys(EmailAddress);
	}
	
	public void sendKeyspassword(String Password)
	{
		emailAddress.sendKeys(Password);
	}
	public void Clicknext_Btn()
	{
		next_Btn.click();
	}

}
