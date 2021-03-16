package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	// ElementosWeb
	// Página 1
	private By make = By.id("make");
	private By mercedes = By.xpath("//*[@id=\"make\"]/option[7]");
	private By model = By.id("model");
	private By scooter = By.xpath("//*[@id=\"model\"]/option[2]");
	private By cilindradas = By.id("cylindercapacity");
	private By engineperfomance = By.id("engineperformance");
	private By dateofmanufacture = By.id("dateofmanufacture");
	private By numberofseats = By.id("numberofseats");
	private By numberofseats2 = By.cssSelector("#numberofseats > option:nth-child(2)");
	private By righthanddriveyes = By.cssSelector(
			"#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(1) > span");
	private By numberofseatsmotorcycle = By.id("numberofseatsmotorcycle");
	private By numberofseatsmotor2 = By.cssSelector("#numberofseatsmotorcycle > option:nth-child(3)");
	private By fuel = By.id("fuel");
	private By fuelpetrol = By.cssSelector("#fuel > option:nth-child(2)");
	private By payload = By.id("payload");
	private By totalweight = By.id("totalweight");
	private By listprice = By.id("listprice");
	private By licenceplate = By.id("licenseplatenumber");
	private By annualmileage = By.id("annualmileage");
	private By nextenterinsurantdata = By.id("nextenterinsurantdata");
	// Página 2
	private By primeironome = By.id("firstname");
	private By segundonome = By.id("lastname");
	private By birthdate = By.id("birthdate");
	private By masculino = By.cssSelector(
			"#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span");
	private By endereço = By.id("streetaddress");
	private By país = By.id("country");
	private By argentina = By.cssSelector("#country > option:nth-child(11)");
	private By CEP = By.id("zipcode");
	private By cidade = By.id("city");
	private By ocupação = By.id("occupation");
	private By empregado = By.cssSelector("#occupation > option:nth-child(2)");
	private By speeding = By.cssSelector(
			"#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");
	private By nextenterproductdata = By.id("nextenterproductdata");
	// Página 3
	private By datadeinicio = By.id("startdate");
	private By insurancesum = By.id("insurancesum");
	private By insurancesumvalue = By.cssSelector("#insurancesum > option:nth-child(4)");
	private By meritrating = By.id("meritrating");
	private By bonus2 = By.cssSelector("#meritrating > option:nth-child(4)");
	private By segurodano = By.id("damageinsurance");
	private By tipodecobertura = By.cssSelector("#damageinsurance > option:nth-child(4)");
	private By euroinsurance = By.cssSelector(
			"#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");
	private By courtesycar = By.id("courtesycar");
	private By courtesycaryes = By.cssSelector("#courtesycar > option:nth-child(3)");
	private By nextselectpriceoption = By.id("nextselectpriceoption");
	// Página 4
	private By ultimateoption = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(4) > span");
	private By nextsendquote = By.id("nextsendquote");
	// Página 5
	private By email = By.id("email");
	private By phone = By.id("phone");
	private By username = By.id("username");
	private By password = By.id("password");
	private By passwordconfirm = By.id("confirmpassword");
	private By sendemail = By.id("sendemail");
	//Página Validação 
	private By sendemailsucess = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2");
	

	// Getter
	public By getMake() {
		return make;
	}

	public By getMercedes() {
		return mercedes;
	}

	public By getEngineperfomance() {
		return engineperfomance;
	}

	public By getDateofmanufacture() {
		return dateofmanufacture;
	}

	public By getNumberofseats() {
		return numberofseats;
	}

	public By getNumberofseats2() {
		return numberofseats2;
	}

	public By getModel() {
		return model;
	}

	public By getScooter() {
		return scooter;
	}

	public By getCilindradas() {
		return cilindradas;
	}

	public By getRighthanddriveyes() {
		return righthanddriveyes;
	}

	public By getNumberofseatsmotorcycle() {
		return numberofseatsmotorcycle;
	}

	public By getNumberofseatsmotor2() {
		return numberofseatsmotor2;
	}

	public By getFuel() {
		return fuel;
	}

	public By getFuelpetrol() {
		return fuelpetrol;
	}

	public By getPayload() {
		return payload;
	}

	public By getTotalweight() {
		return totalweight;
	}

	public By getListprice() {
		return listprice;
	}

	public By getLicenceplate() {
		return licenceplate;
	}

	public By getAnnualmileage() {
		return annualmileage;
	}

	public By getNextenterinsurantdata() {
		return nextenterinsurantdata;
	}

	public By getPrimeironome() {
		return primeironome;
	}

	public By getSegundonome() {
		return segundonome;
	}

	public By getBirthdate() {
		return birthdate;
	}

	public By getMasculino() {
		return masculino;
	}

	public By getEndereço() {
		return endereço;
	}

	public By getPaís() {
		return país;
	}

	public By getArgentina() {
		return argentina;
	}

	public By getCEP() {
		return CEP;
	}

	public By getCidade() {
		return cidade;
	}

	public By getOcupação() {
		return ocupação;
	}

	public By getEmpregado() {
		return empregado;
	}

	public By getNextenterproductdata() {
		return nextenterproductdata;
	}

	public By getSpeeding() {
		return speeding;
	}

	public By getDatadeinicio() {
		return datadeinicio;
	}

	public By getInsurancesum() {
		return insurancesum;
	}

	public By getInsurancesumvalue() {
		return insurancesumvalue;
	}

	public By getMeritrating() {
		return meritrating;
	}

	public By getBonus2() {
		return bonus2;
	}

	public By getSegurodano() {
		return segurodano;
	}

	public By getTipodecobertura() {
		return tipodecobertura;
	}

	public By getEuroinsurance() {
		return euroinsurance;
	}

	public By getCourtesycar() {
		return courtesycar;
	}

	public By getCourtesycaryes() {
		return courtesycaryes;
	}

	public By getNextselectpriceoption() {
		return nextselectpriceoption;
	}

	public By getUltimateoption() {
		return ultimateoption;
	}

	public By getNextsendquote() {
		return nextsendquote;
	}

	public By getEmail() {
		return email;
	}

	public By getPhone() {
		return phone;
	}

	public By getUsername() {
		return username;
	}

	public By getPassword() {
		return password;
	}

	public By getPasswordconfirm() {
		return passwordconfirm;
	}

	public By getSendemail() {
		return sendemail;
	}

	public By getSendemailsucess() {
		return sendemailsucess;
	}

}
