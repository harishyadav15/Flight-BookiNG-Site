package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjects {

	static WebElement element = null;

	public static WebElement flightsButton(WebDriver driver) {
		element = driver.findElement(By.id("tab-flight-tab-hp"));
		element.click();
		return element;

	}

	public static WebElement originTextBox(WebDriver driver, String originCity) {
		element = driver.findElement(By.id("flight-origin-hp-flight"));
		element.click();
		element.sendKeys(originCity);
		return element;

	}

	public static WebElement departureTextBox(WebDriver driver, String departureCity) {
		element = driver.findElement(By.id("flight-destination-hp-flight"));
		element.click();
		element.sendKeys(departureCity);
		return element;

	}

	public static WebElement departingDate(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='flight-departing-hp-flight']"));
		element.click();
		return element;

	}

	public static WebElement departDateToSelect(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//div[@class ='datepicker-cal-month'][position()=1]//button[text()='19']"));
		element.click();
		return element;

	}

	public static WebElement returningDate(WebDriver driver) {
		element = driver.findElement(By.id("flight-returning-hp-flight"));
		element.click();
		return element;

	}

	public static WebElement returnDateToSelect(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//div[@class ='datepicker-cal-month'][position()=1]//button[text()='25']"));
		element.click();
		return element;

	}

	public static WebElement adultsTab(WebDriver driver) {
		element = driver.findElement(By.id("flight-adults-hp-flight"));
		Select sel = new Select(element);
		sel.selectByValue("4");

		return element;

	}

	public static WebElement childrenTab(WebDriver driver) {
		element = driver.findElement(By.id("flight-children-hp-flight"));
		Select sel = new Select(element);
		sel.selectByVisibleText("1");

		return element;

	}

	public static WebElement childrenAge(WebDriver driver) {
		element = driver.findElement(By.id("flight-age-select-1-hp-flight"));
		Select sel = new Select(element);
		sel.selectByIndex(6);

		return element;

	}

	public static WebElement advanceOptions(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = driver.findElement(By.id("flight-advanced-options-hp-flight"));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
		return element;

	}

	public static WebElement nonstopCheckBox(WebDriver driver) {
		element = driver.findElement(By.id("advanced-flight-nonstop-hp-flight"));
		element.click();
		return element;

	}

	public static WebElement searchBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='gcw-flights-form-hp-flight']/div[8]/label/button"));
		element.click();
		return element;
	}

	public static WebElement assertElement(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[@class='title-city-text']"));
		return element;

	}

}
