import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCampoDeTreinamento {

	private WebDriver driver;
	private DSL dslLocal;

	@Before
	public void inicializa() {

		System.setProperty("webdriver.gecko.driver", "C:/geckodriver-v0.31.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		dslLocal = new DSL(driver);
		driver.get("file:///" + System.getProperty("user.dir") + "/src/test/resources/componentes.html");
	}

	@After
	public void ExitTest() {
		//driver.quit();
	}

	@Test
	public void CadastroSuccess() {

		dslLocal.sendKeysDSL("elementosForm:nome", "Adriano");
		dslLocal.sendKeysDSL("elementosForm:sobrenome", "Patricio");


		driver.findElement(By.id("elementosForm:sexo:0")).click();
		driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
		
		new Select(driver.findElement(By.id("elementosForm:escolaridade"))).selectByVisibleText("Superior");
		new Select(driver.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Corrida");
		
		driver.findElement(By.id("elementosForm:cadastrar")).click();
		
		
		Assert.assertTrue(driver.findElement(By.id("resultado")).getText().startsWith("Cadastrado!"));
		
		
		Assert.assertEquals("Nome: Adriano", dslLocal.getTextDSL("descNome"));
		Assert.assertEquals("Sobrenome: Patricio", dslLocal.getTextDSL("descSobrenome"));
		Assert.assertEquals("Sexo: Masculino", dslLocal.getTextDSL("descSexo"));
		Assert.assertEquals("Comida: Pizza",dslLocal.getTextDSL("descComida"));
		Assert.assertEquals("Escolaridade: superior", dslLocal.getTextDSL("descEscolaridade"));
		Assert.assertEquals("Esportes: Corrida", dslLocal.getTextDSL("descEsportes"));

	}
}
