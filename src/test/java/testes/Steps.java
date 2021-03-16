package testes;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.Metodos;

public class Steps {
	Metodos metodo = new Metodos();
	ElementosWeb el = new ElementosWeb();

	@Dado("que eu acesse {string}")
	public void que_eu_acesse(String appUrl) throws InterruptedException {
		metodo.abrirNavegador(appUrl, "Abrindo Navegador");
		metodo.pausa(1000);
	}

	@Dado("preencha os dados do veículo")
	public void preencha_os_dados_do_veículo() throws InterruptedException, IOException {
		metodo.clicar(el.getMake());
		metodo.pausa(1000);
		metodo.clicar(el.getMercedes());
		metodo.clicar(el.getModel());
		metodo.pausa(1000);
		metodo.clicar(el.getScooter());
		metodo.pausa(1000);
		metodo.preencher(el.getCilindradas(), "250");
		metodo.pausa(1000);
		metodo.preencher(el.getEngineperfomance(), "250");
		metodo.preencher(el.getDateofmanufacture(), "05/10/2020");
		metodo.clicar(el.getNumberofseats());
		metodo.pausa(1000);
		metodo.clicar(el.getNumberofseats2());
		metodo.pausa(1000);
		metodo.clicar(el.getNumberofseats2());
		metodo.rolarPagina();
		metodo.clicar(el.getNumberofseats2());
		metodo.pausa(2000);
		metodo.clicar(el.getRighthanddriveyes());
		metodo.clicar(el.getNumberofseatsmotorcycle());
		metodo.pausa(1000);
		metodo.clicar(el.getNumberofseatsmotor2());
		metodo.clicar(el.getFuel());
		metodo.pausa(1000);
		metodo.clicar(el.getFuelpetrol());
		metodo.preencher(el.getPayload(), "400");
		metodo.preencher(el.getTotalweight(), "600");
		metodo.preencher(el.getListprice(), "5000");
		metodo.preencher(el.getLicenceplate(), "ABC123");
		metodo.preencher(el.getAnnualmileage(), "2000");
		metodo.screenShoot("Vehicle Data Completo");
		metodo.clicar(el.getNextenterinsurantdata());

	}

	@Dado("preencha os dados assegurado")
	public void preencha_os_dados_assegurado() throws InterruptedException, IOException {
		metodo.preencher(el.getPrimeironome(), "Rinaldo");
		metodo.preencher(el.getSegundonome(), "Arthur");
		metodo.preencher(el.getBirthdate(), "03/24/1975");
		metodo.pausa(1000);
		metodo.clicar(el.getMasculino());
		metodo.preencher(el.getEndereço(), "Rua da Paz ");
		metodo.clicar(el.getPaís());
		metodo.pausa(1000);
		metodo.clicar(el.getArgentina());
		metodo.rolarPagina();
		metodo.pausa(1000);
		metodo.preencher(el.getCEP(), "11045110");
		metodo.preencher(el.getCidade(), "Santos");
		metodo.clicar(el.getOcupação());
		metodo.pausa(1000);
		metodo.clicar(el.getEmpregado());
		metodo.clicar(el.getSpeeding());
		metodo.rolarPagina();
		metodo.rolarPagina();
		metodo.screenShoot("Enter Insurance Data");
		metodo.clicar(el.getNextenterproductdata());

	}

	@Dado("preencha os dados do produto")
	public void preencha_os_dados_do_produto() throws InterruptedException, IOException {
		metodo.preencher(el.getDatadeinicio(), "05/20/2021");
		metodo.clicar(el.getInsurancesum());
		metodo.pausa(1000);
		metodo.clicar(el.getInsurancesumvalue());
		metodo.clicar(el.getMeritrating());
		metodo.pausa(1000);
		metodo.clicar(el.getBonus2());
		metodo.clicar(el.getSegurodano());
		metodo.pausa(1000);
		metodo.clicar(el.getTipodecobertura());
		metodo.pausa(1000);
		metodo.clicar(el.getEuroinsurance());
		metodo.pausa(1000);
		metodo.clicar(el.getCourtesycar());
		metodo.clicar(el.getCourtesycaryes());
		metodo.screenShoot("Enter Product Data");
		metodo.clicar(el.getNextselectpriceoption());

	}

	@Dado("selecione a opção de preço")
	public void selecione_a_opção_de_preço() throws InterruptedException, IOException {
		metodo.clicar(el.getUltimateoption());
		metodo.pausa(3000);
		metodo.screenShoot("Ultimate Option");
		metodo.clicar(el.getNextsendquote());

	}

	@Dado("preencha os dados para contato")
	public void preencha_os_dados_para_contato() throws IOException, InterruptedException {
		metodo.preencher(el.getEmail(), "luis@luis.com");
		metodo.preencher(el.getPhone(), "13123456789");
		metodo.preencher(el.getUsername(), "AutomationAccenture");
		metodo.preencher(el.getPassword(), "Automation123");
		metodo.preencher(el.getPasswordconfirm(), "Automation123");
		metodo.screenShoot("Contact Info");
		metodo.pausa(1000);

	}

	@Quando("enviar os dados")
	public void enviar_os_dados() throws InterruptedException {
		metodo.clicar(el.getSendemail());
		metodo.pausa(10000);
	}

	@Então("validar a mensagem {string}")
	public void validar_a_mensagem(String EnvioEmail) throws IOException {

		metodo.validarMensagem(EnvioEmail, el.getSendemailsucess());
		metodo.screenShoot("Email Enviado com Sucesso");
		metodo.fecharNavegador(".. Fechando Navegador");
	}
}
