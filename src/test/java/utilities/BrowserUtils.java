package utilities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

	private static WebDriver driver = Driver.getDriver();
	private static Alert alert;
	private static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	private static Select letsSelect;

	public void switchToAlert() {
		alert = Driver.getDriver().switchTo().alert();
	}

	public String alertGetText() {
		return alert.getText();
	}

	public void alertAccept() {
		alert.accept();
	}

	public void alertDismiss() {
		alert.dismiss();
	}

	public void sendKeysOnAlert(String name) {
		alert.sendKeys(name);
	}

	public void waitUntilAlertIsPresent() {
		wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void waitUntilElementVisible(WebElement element) {
		wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void selectByVisibleText(WebElement element, String optionToSelect) {
		letsSelect = new Select(element);
		letsSelect.selectByVisibleText(optionToSelect);
	}

	public void clearValueOnTheField(WebElement element) {
		String temp = element.getAttribute("value");
		for (int i = 0; i < temp.length(); i++) {
			element.sendKeys(Keys.BACK_SPACE);
		}
	}

	public boolean isElementPresent(WebElement element) {
		try {
			element.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
		return true;
	}
	
	public void waitForElementToBeClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitForElementToBeClickable(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public void waitForElementToBeVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void wait(int seconds) throws InterruptedException {
		driver.wait(seconds);
	}
}
