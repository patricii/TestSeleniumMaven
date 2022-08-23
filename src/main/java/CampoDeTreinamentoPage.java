
import org.openqa.selenium.WebDriver;

public class CampoDeTreinamentoPage {

	private DSL dsl;

	public CampoDeTreinamentoPage(WebDriver driver) {
		this.dsl = new DSL(driver);
	}

	public void setNome(String nome) {
		dsl.sendKeysDSL("elementosForm:nome", nome);
	}

	public void setSobrenome(String sobrenome) {
		dsl.sendKeysDSL("elementosForm:sobrenome", sobrenome);
	}

	public void setMasculino() {
		dsl.setSexo("elementosForm:sexo:0");
	}

	public void setComidaPizza() {
		dsl.SetComidaPizza("elementosForm:comidaFavorita:2");
	}

	public void SetSchoolLevel(String level) {

		dsl.SetSchoolLevel("elementosForm:escolaridade", level);
	}

	public void SetSport(String level) {

		dsl.SetSport("elementosForm:esportes", level);
	}

	public void ClickPage() {

		dsl.ClickDsl("elementosForm:cadastrar");
	}

	public String getName() {

		return dsl.getTextDSL("descNome");
	}

	public String getLastName() {

		return dsl.getTextDSL("descSobrenome");
	}
	public String getGender() {

		return dsl.getTextDSL("descSexo");
	}
	public String getFood() {

		return dsl.getTextDSL("descComida");
	}
	public String getSchool() {

		return dsl.getTextDSL("descEscolaridade");
	}
	public String getSport() {

		return dsl.getTextDSL("descEsportes");
	}
	

}
