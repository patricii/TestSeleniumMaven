import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {
	
	private WebDriver driver;

	public DSL(WebDriver driver) {
		this.driver = driver;
	}
	public void sendKeys(String id_name, String text) {
		
		driver.findElement(By.id(id_name)).sendKeys(text);
	}
	


}
