import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCampoDeTreinamento {

	private WebDriver driver;
	private CampoDeTreinamentoPage page;

	@Before
	public void inicializa() {

		System.setProperty("webdriver.gecko.driver", "C:/geckodriver-v0.31.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/test/resources/componentes.html");
		page = new CampoDeTreinamentoPage(driver);

	}

	@After
	public void ExitTest() {
		// driver.quit();
	}

	@Test
	public void CadastroSuccess() {

		page.setNome("Adriano");
		page.setSobrenome("Patricio");
		page.setMasculino();
		page.setComidaPizza();
		page.SetSchoolLevel("Superior");
		page.SetSport("Corrida");
		page.ClickPage();

		Assert.assertTrue(driver.findElement(By.id("resultado")).getText().startsWith("Cadastrado!"));
		Assert.assertEquals("Nome: Adriano", page.getName());
		Assert.assertEquals("Sobrenome: Patricio", page.getLastName());
		Assert.assertEquals("Sexo: Masculino", page.getGender());
		Assert.assertEquals("Comida: Pizza", page.getFood());
		Assert.assertEquals("Escolaridade: superior", page.getSchool());
		Assert.assertEquals("Esportes: Corrida", page.getSport());

	}
}
