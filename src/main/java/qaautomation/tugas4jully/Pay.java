package qaautomation.tugas4jully;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pay extends BasePage {
	
	By Continue = By.xpath("//input[@id='continue']");
	By Finish = By.xpath("//button[@id='finish']");
	By CompleteText = By.xpath("//h2[normalize-space()='THANK YOU FOR YOUR ORDER']");
	
	public Pay(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		
	}
	
	public void testPay() {
		clickAndWait(Continue);
		clickAndWait(Finish);
	}
	
	public String getCompleteText() {
		return getText(CompleteText);
	}
}
