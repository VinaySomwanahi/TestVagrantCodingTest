import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class SimpleCodingDemo extends Baseclass {
	String IMDBreleasedate;
	String WikiReleaseDate;
	WebElement IMDBCountryValue;
	WebElement WikiCountryValue;

	@BeforeClass
	public void setUp() {
		Baseclass.initialization();
	}

	@Test(priority = 1)
	public void IMDBTest1() {
		driver.get("https://www.imdb.com/title/tt9389998/");
		WebElement ReleasedateKey = driver.findElement(By.xpath("//a[text()='Release date']"));
		System.out.println(ReleasedateKey.getText());
		WebElement ReleasedateValue = driver.findElement(By.xpath("//a[text()='January 7, 2022 (United States)']"));
		IMDBreleasedate = ReleasedateValue.getText();
		System.out.println(IMDBreleasedate);
	}

	@Test(priority = 2)
	public void IMDBTest2() {
		WebElement Countryoforigin = driver.findElement(By.xpath("//span[text()='Country of origin']"));
		System.out.println(Countryoforigin.getText());
		IMDBCountryValue = driver.findElement(By.xpath("//a[text()='India']"));
		System.out.println(IMDBCountryValue.getText());
	}

	@Test(priority = 3)
	public void WikipediaTest1() {
		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		WebElement WikiReleaseKey = driver.findElement(By.xpath("//div[text()='Release date']"));
		System.out.println(WikiReleaseKey.getText());
		WebElement WikiReleaseValue = driver.findElement(By.xpath("//div[@id='toc']/preceding::li[1]"));
		WikiReleaseDate = WikiReleaseValue.getText();
		System.out.println(WikiReleaseDate);
	}

	@Test(priority = 4)
	public void WikipediaTest2() {
		WebElement CountryKey = driver.findElement(By.xpath("//th[text()='Country']"));
		System.out.println(CountryKey.getText());
		WikiCountryValue = driver.findElement(By.xpath("//td[text()='India']"));
		System.out.println(WikiCountryValue.getText());

	}

	@Test(priority = 5)
	public void CountryValidation() {
		Assert.assertEquals(IMDBCountryValue, WikiCountryValue);
	}

	@Test(priority = 6)
	public void ReleaseValidation() {
		Assert.assertEquals(IMDBreleasedate, WikiCountryValue);

	}
}
