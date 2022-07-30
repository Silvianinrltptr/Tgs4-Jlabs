package qaautomation.tugas4jully;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Information extends BasePage {

	public Information(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	By firstName = By.xpath("//input[@id='first-name']");
	By lastName = By.xpath("//input[@id='last-name']");
	By zipPostalCode = By.xpath("//input[@id='postal-code']");
	
	
	public void informationWeb(String first, String last, String zip) {
		setText(firstName, first);
		setText(lastName, last);
		setText(zipPostalCode, zip);
	}

}

