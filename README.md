# TestVagrantCodingTest
# Project Name: Coding Test

# In src/main/java: 
Created One package and under this Three classes (Baseclass.java, WikiIMDBTest.java, (WikipediaTest.java: pls igonre it)

# In Baseclass.java there is script for connecting chromebrowser, upcasting, maximize window and timeouts.
# In  WikiIMDBTest.java class:
We have located the movie release date and country element from Wikipedia and IMDB websites and used POM concept i.e. @FindBy(xpath="") annotations with pageFactory. (In short I have created Object repositories and mathods in this class).
Again In  WikiIMDBTest.java class I have written code to extract movie release date and country name from Wikipedia and IMDB websites and also methods of validation country name and release date (i.e. comapring the movie country name and release date from Wikipedia and IMDB).

# Pls ignore WikipediaTest.java class.

# Now Src/test/java: 
One package-Two classes (IMDBWikiValidation.java, SimpleCodingDemo.java)
# In IMDBWikiValidation.java 
There is code for getting the urls(Wikipedia and IMDB) and calling the methods from WikiIMDBTest.java class by creating the object of class WikiIMDBTest.java. (i.e. calling the methods from WikiIMDBTest.java) TestNG annotations are used here.
# Now run with TestNG u will get all passed and fail test cases. (validation of Release date of movie must be fail )

# And at last In SimpleCodingDemo class- 
This is separate class(no relation with above packages or classes) 
In this Written code to validate movie country name and release date with help of Assert statement.
Used TestNG annotations with priorities:
First we are calling Baseclass from (src/main/java)and So as per priorites test cases will execute one by one (Connecting the URls then extracting the release date and country from both URls and printing in output console).
At last by using Assert statement just comparing the release date validation and country validation of the movie.
Release date validation Test case will fail, because it is not matching.

