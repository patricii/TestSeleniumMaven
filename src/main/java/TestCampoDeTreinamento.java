import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCampoDeTreinamento {
	
	@Test
	public void TestCampoDeTreinamento() {
		
		System.setProperty("webdriver.gecko.driver","C:/geckodriver-v0.31.0-win64/geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/test/resources/componentes.html");
		
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Adriano");
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Patricio");
		driver.findElement(By.id("elementosForm:sexo:0")).click();
		driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
		new Select(driver.findElement(By.id("elementosForm:escolaridade"))).selectByVisibleText("Superior");
		new Select(driver.findElement(By.id("elementosForm:esportes"))).selectByVisibleText("Corrida");
		driver.findElement(By.id("elementosForm:cadastrar")).click();
		
		Assert.assertTrue(driver.findElement(By.id("resultado")).getText().startsWith("Cadastrado!"));
		Assert.assertEquals("Nome: Adriano",driver.findElement(By.id("descNome")).getText());
		Assert.assertEquals("Sobrenome: Patricio",driver.findElement(By.id("descSobrenome")).getText());
		Assert.assertEquals("Sexo: Masculino",driver.findElement(By.id("descSexo")).getText());
		Assert.assertEquals("Comida: Pizza",driver.findElement(By.id("descComida")).getText());	
		Assert.assertEquals("Escolaridade: superior",driver.findElement(By.id("descEscolaridade")).getText());
		Assert.assertEquals("Esportes: Corrida",driver.findElement(By.id("descEsportes")).getText());
	}
}
