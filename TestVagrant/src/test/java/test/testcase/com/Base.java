package test.testcase.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import test.pom.com.Imdbhome;
import test.pom.com.Wikihome;

public class Base {

	public static WebDriver driver;

	public String varc, wcountry;
	public String varcdate, wdate;

	@BeforeClass
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\TestVagrant\\TestVagrant\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.imdb.com/title/tt9389998/?ref_=nv_sr_srsg_0");

		driver.manage().window().maximize();

		Imdbhome id = new Imdbhome(driver);

		varc = id.getImdbCountry();

		id.button();

		varcdate = id.getImdbDate();

		driver.navigate().to("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");

		Wikihome wh = new Wikihome(driver);

		wcountry = wh.getWcountry();

		wdate = wh.getWdate();

	}

	@AfterClass
	public void endUp() {
		System.out.println("End Test Case");
		driver.close();
	}

}
