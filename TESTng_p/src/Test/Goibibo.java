package Test;



import java.time.Duration;

import org.bouncycastle.jcajce.provider.symmetric.ARC4.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Goibibo extends Base_Class1 {

	@BeforeMethod
	public void browser_Common() throws Throwable  {
		 driver = new ChromeDriver();
		driver.get("https://www.GOIBIBO.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// close child browser
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		// close pop up
		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();

		// select round trip

		driver.findElement(By.xpath("//p[text()='Round-trip']")).click();

		// From city

		WebElement fromCity = driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]"));

		Actions act = new Actions(driver);
		act.click(fromCity).sendKeys("mum").build().perform();

		// select from city
		driver.findElement(By.xpath("//li[@tabindex='0']")).click();

		// to city
		act.sendKeys("pun").build().perform();

		// select to city
		driver.findElement(By.xpath("//li[@tabindex='0']")).click();

		Thread.sleep(2000);
		// date pick
		// departure date
		driver.findElement(By.xpath("//div[@aria-label='Tue Dec 12 2023']")).click();
		Thread.sleep(2000);
		// return date
		driver.findElement(By.xpath("(//p[@class='fswFld__title'])[2]")).click();
		driver.findElement(By.xpath("//div[@aria-label='Thu Dec 28 2023']")).click();

		// click on done btn
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		Base_Class1.Dipali("goibibo1");
		Base_Class1.Dipali("goibibo2");
		Base_Class1.Dipali("goibibo3");
		Base_Class1.Dipali("goibibo4");
		Base_Class1.Dipali("goibibo5");
		
	}

	@Test
	public void a_regular() throws InterruptedException {
		// Add Adult
		driver.findElement(By.xpath("(//span[@class='sc-12foipm-64 dGRyPm'])[2]")).click();

		// Add childern
		driver.findElement(By.xpath("(//span[@class='sc-12foipm-64 dGRyPm'])[4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='sc-12foipm-64 dGRyPm'])[4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='sc-12foipm-64 dGRyPm'])[3]")).click();
		Thread.sleep(4000);
		// select class
		driver.findElement(By.xpath("//li[text()='premium economy']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[text()='Done']")).click();
		//Add Infants
		//driver.findElement(By.xpath(""))
	}
	
	@Test
	public void b_ArmedForces() throws Throwable {
		// select Armed forces
		driver.findElement(By.xpath("//span[text()='armed forces']")).click();

		// Add Adult
		driver.findElement(By.xpath("(//span[@class='sc-12foipm-64 dGRyPm'])[2]")).click();

		// Add childern
		driver.findElement(By.xpath("(//span[@class='sc-12foipm-64 dGRyPm'])[4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='sc-12foipm-64 dGRyPm'])[4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='sc-12foipm-64 dGRyPm'])[3]")).click();
		Thread.sleep(4000);
		// select class
		driver.findElement(By.xpath("//li[text()='premium economy']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[text()='Done']")).click();
		
		
	}
		
	@Test
	public void c_seniorCitizen() {
		driver.findElement(By.xpath("//span[text()='senior citizen']")).click();
		driver.findElement(By.xpath("(//span[@class='sc-12foipm-64 dGRyPm'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Done']")).click();

		
	}
	@Test
	public void d_student() {
	driver.findElement(By.xpath("//span[text()='student']")).click();
	driver.findElement(By.xpath("(//span[@class='sc-12foipm-64 dGRyPm'])[2]")).click();
	driver.findElement(By.xpath("//a[text()='Done']")).click();
	}
	@Test
	public void e_doctors(){
		driver.findElement(By.xpath("//span[text()='doctors & nurses']")).click();
		driver.findElement(By.xpath("(//span[@class='sc-12foipm-64 dGRyPm'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Done']")).click();
		
	}
	
	
	@AfterMethod
	public void browser_close() throws InterruptedException {
		
		Thread.sleep(4000);
		driver.quit();
		
	}
	}


