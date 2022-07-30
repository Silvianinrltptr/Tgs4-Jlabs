package qaautomation.tugas4jully;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BasePage {

	By Product1 = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	By Product2 = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
	By Chart = By.xpath("//a[@class='shopping_cart_link']");
	By Chekout = By.xpath("//button[@id='checkout']");
	
 public ProductPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		
	}

public void testProduct() {
	clickAndWait(Product1);
	clickAndWait(Product2);
	clickAndWait(Chart);
	clickAndWait(Chekout);
	
	

	 
}
}
