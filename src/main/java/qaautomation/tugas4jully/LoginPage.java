package qaautomation.tugas4jully;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	
	By username = By.xpath("//input[@id='user-name']");
	By password = By.xpath("//input[@id='password']");
	By Submit = By.xpath("//input[@id='login-button']");
	
	public void loginWeb(String user, String pass) {
		setText(username, user);
		setText(password, pass);
		clickAndWait(Submit);
	}
	

	public LoginPage(ThreadLocal<WebDriver> driver,  ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
	}
	
	
	
	public void inputUsername(String user) {
		setText(username,user);
	}
	
	public void inputPassword(String pass) {
		setText(password,pass);
	}
	
	public void clickLoginButton() {
		clickAndWait(Submit);
	}

}
