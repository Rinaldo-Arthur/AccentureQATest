package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	WebDriver driver;

	// Método para abrir navegador
	public void abrirNavegador(String appUrl, String descriPasso) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();

	}

	// Método para fechar navegador
	public void fecharNavegador(String descriPasso) {
		driver.quit();
	}

	// Método para preencher
	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	// Método para screenshoot
	public void screenShoot(String printName) throws IOException {
		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination
		File DestFile = new File("./evidencias/" + printName + ".png");
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}

	// M�todo para submit
	public void submit(By elemento, String descriPasso) throws IOException {
		try {
			driver.findElement(elemento).submit();
		} catch (Exception e) {
			Assert.fail(LocalDateTime.now() + " --- erro ao tentar " + descriPasso);
			screenShoot("erros/" + descriPasso);

		}
	}

	// Método para escrever
	public void digitar(String texto, By element) {
		driver.findElement(element).sendKeys(texto);

	}

	// Método para clicar
	public void clicar(By element) {
		driver.findElement(element).click();
	}

	// Método para pausa
	public void pausa(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}

	// Método para rolagem de página
	public void rolarPagina() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scrollBy(0,250)", "");
	}

	// Método Assert
	public void validarMensagem(String textoEsperado, By element) {
		String texto = driver.findElement(element).getText();
		assertEquals(textoEsperado, texto);
	}
}
