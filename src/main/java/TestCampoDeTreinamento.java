import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCampoDeTreinamento {
	
	@Test
	public void TestCampoDeTreinamento() {
		
		System.setProperty("webdriver.gecko.driver","C:/geckodriver-v0.31.0-win64/geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/test/resources/componentes.html");
		
		
		
	}
	

}
