package qaautomation.tugas4jully;


import org.testng.Assert;
import org.testng.annotations.Test;
public class WebTestPOM extends BaseWebTest {
		
	LoginPage loginPage = new LoginPage(driver, explicitWait);
	String username = "standard_user";
	String password = "secret_sauce";
	String erorUsername = "standru";
	String erorPassword = "ok";
	
	
	ProductPage productPage = new ProductPage(driver, explicitWait);
	
	Information information = new Information(driver, explicitWait);
	String firstName = "silvianinurlita";
	String lastName = "putri";
	String zipPostalCode = "16437";
	
	Pay pay = new Pay(driver, explicitWait);
	
	////	TestLoginUsername = "standard_useqqr";
	@Test
	public void testxLogin() {
		driver.get().get("https://www.saucedemo.com/");
		loginPage.loginWeb(username, password);
		
		productPage.testProduct();
		information.informationWeb(firstName, lastName, zipPostalCode);
		pay.testPay();
		String actualCompleteText = pay.getCompleteText();
		System.out.println(actualCompleteText);

		String expectedCompleteText = "THANK YOU FOR YOUR ORDER";
		System.out.println(expectedCompleteText);
		Assert.assertTrue(actualCompleteText.contains(expectedCompleteText));
	}
	
}