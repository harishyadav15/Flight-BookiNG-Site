package TestScript;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import java.util.concurrent.TimeUnit;
import TestScript.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Expedia {

	WebDriver driver;
	String Url = "https://www.expedia.com/";

	@DataProvider(name = "InputData")
	public static String[][] data() {
		return new String[][] { { "New York", "San Francisco" },{"Chicago","Boston"}};

	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(Url);
	}

	@Test(dataProvider = "InputData")
	public void test(String originCity, String departureCity) {
		PageObjects.flightsButton(driver);
		PageObjects.originTextBox(driver, originCity);
		PageObjects.departureTextBox(driver, departureCity);
		PageObjects.departingDate(driver);
		PageObjects.departDateToSelect(driver);
		PageObjects.returningDate(driver);
		PageObjects.returnDateToSelect(driver);
		PageObjects.adultsTab(driver);
		PageObjects.childrenTab(driver);
		PageObjects.childrenAge(driver);
		PageObjects.advanceOptions(driver);
		PageObjects.nonstopCheckBox(driver);
		PageObjects.searchBox(driver);

		String text = PageObjects.assertElement(driver).getText();

		Assert.assertEquals(text, "Select your departure to San Francisco");
		

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		
		
	}

}
