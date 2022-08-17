import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGoogle {
	
	@Test
	public void test() {
		
		System.setProperty("webdriver.gecko.driver","C:/geckodriver-v0.31.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
	}

}
