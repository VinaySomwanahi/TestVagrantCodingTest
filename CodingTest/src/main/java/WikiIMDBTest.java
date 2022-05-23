import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiIMDBTest extends Baseclass {
	String a;
	String b;
	String c;
	String d;
	@FindBy(xpath = "//a[text()='Release date']")
	WebElement IMDBReleaseDateKey;
	
	@FindBy(xpath = "//a[text()='January 7, 2022 (United States)']")
	WebElement IMDBReleaseDateValue;
	
	@FindBy(xpath = "//span[text()='Country of origin']")
	WebElement IMDBCountryKey ;
	
	
	@FindBy(xpath = "//a[text()='India']")
	WebElement IMDBCountryValue;
	

	@FindBy(xpath = "//div[text()='Release date']")
	WebElement WikiReleaseDateKey;
	
	@FindBy(xpath = "//div[@id='toc']/preceding::li[1]")
	WebElement WikiReleaseDateValue;
	
	@FindBy(xpath = "//th[text()='Country']")
	WebElement WikiCountryKey ;
	
	
	@FindBy(xpath = "//td[text()='India']")
	WebElement WikiCountryValue;
	

	
	public WikiIMDBTest() {
		PageFactory.initElements(driver, this);
	}
	
	public void ExtractReleaeDateandCountryIMDB() {
		System.out.println(IMDBReleaseDateKey.getText());
		System.out.println(IMDBReleaseDateValue.getText());
		System.out.println(IMDBCountryKey.getText());
		System.out.println(IMDBCountryValue.getText());
		System.out.println("------------------------");
		
}
	public void ExtractReleaeDateandCountryWiki() {
		System.out.println(WikiReleaseDateKey.getText());
		System.out.println(WikiReleaseDateValue.getText());
		System.out.println(WikiCountryKey.getText());
		System.out.println(WikiCountryValue.getText());
		System.out.println("------------------------");
	}
	

	public void validateReleasedate() {
		a=IMDBReleaseDateValue.getText();
		System.out.println(a);
		
		b=WikiReleaseDateValue.getText();
		System.out.println(b);
		
		if(a.equals(b))
		{
			System.out.println("Release Test case is pass");
		}else
		{
			System.out.println("Release Test case is fail");
		}
		
		
	}
	public void validateCountrydata() {
		
		c=IMDBCountryValue.getText();
		System.out.println(c);
		
		d=WikiCountryValue.getText();
		System.out.println(d);
		
		if(c.equals(d))
		{
		System.out.println("Country test case is pass");
	}
		else
		{
			System.out.println("Country test case is fail");
		}
	
	}
}
