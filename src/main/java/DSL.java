import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DSL {

	private WebDriver driver;

	public DSL(WebDriver driver) {
		this.driver = driver;
	}

	public void sendKeysDSL(String id_name, String text) {

		driver.findElement(By.id(id_name)).sendKeys(text);
	}

	public void ClickDsl(String text_id) {

		driver.findElement(By.id(text_id)).click();
	}

	public String getTextDSL(String text) {

		return driver.findElement(By.id(text)).getText();
	}

	public void setSexo(String text_id) {

		driver.findElement(By.id(text_id)).click();
	}

	public void SetComidaPizza(String text_id) {

		driver.findElement(By.id(text_id)).click();
	}

	public void SetSchoolLevel(String text_id, String level) {

		new Select(driver.findElement(By.id(text_id))).selectByVisibleText(level);

	}

	public void SetSport(String text_id, String sport) {

		new Select(driver.findElement(By.id(text_id))).selectByVisibleText(sport);

	}

}
