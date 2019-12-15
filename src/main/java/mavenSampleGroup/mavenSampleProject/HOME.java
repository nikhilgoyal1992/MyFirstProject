package mavenSampleGroup.mavenSampleProject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * Hello world!
 *
 */
public class HOME 
{
	@FindBy(xpath = "//span[@class='gb_Ea gbii']")
	WebElement image_Btn;
	
	@FindBy(xpath = "//a[@id='gb_71']")
	WebElement signOut_Btn;
	
	public void Clickimage_Btn()
	{
		image_Btn.click();
	}
	
	public void ClicksignOut_Btn()
	{
		signOut_Btn.click();
	}
	
}
