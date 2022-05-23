import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaTest extends Baseclass {
	
	@FindBy(xpath = "//div[text()='Release date']")
	WebElement WikiReleaseDateKey;
	
	@FindBy(xpath = "//div[@id='toc']/preceding::li[1]")
	WebElement WikiReleaseDateValue;
	
	@FindBy(xpath = "//th[text()='Country']")
	WebElement WikiCountryKey ;
	
	
	@FindBy(xpath = "//td[text()='India']")
	WebElement WikiCountryValue;
	
	public WikipediaTest() {
		PageFactory.initElements(driver, this);
	}
	
	public void ExtractReleaeDateandCountryWiki() {
		System.out.println(WikiReleaseDateKey.getText());
		System.out.println(WikiReleaseDateValue.getText());
		System.out.println(WikiCountryKey.getText());
		System.out.println(WikiCountryValue.getText());

}
}
