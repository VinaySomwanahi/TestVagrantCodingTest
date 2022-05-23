
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IMDBWikiValidation extends Baseclass {

	@BeforeClass
	public void setUp() {
		Baseclass.initialization();
	}

	@Test(priority = 1)
	public void GetIMDBUrl() {
		driver.get("https://www.imdb.com/title/tt9389998/");
	}

	@Test(priority = 2)
	public void diplayIMDBdata() {
		WikiIMDBTest Imdbtest = new WikiIMDBTest();
		Imdbtest.ExtractReleaeDateandCountryIMDB();
	}

	@Test(priority = 3)
	public void GetWikipediaUrl() {
		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
	}

	@Test(priority = 4)
	public void displayGetWikipediadata() {
		WikiIMDBTest wikitest = new WikiIMDBTest();
		wikitest.ExtractReleaeDateandCountryWiki();
	}

	@Test(priority = 5)
	public void CountryValidation() {
		WikiIMDBTest validateCountry = new WikiIMDBTest();
		validateCountry.validateCountrydata();
	}

	@Test(priority = 6)
	public void validateReleasedate() {
		WikiIMDBTest validateDate = new WikiIMDBTest();
		validateDate.validateReleasedate();

	}
}
