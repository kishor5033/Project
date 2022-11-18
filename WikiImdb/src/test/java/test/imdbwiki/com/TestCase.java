package test.imdbwiki.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import org.testng.annotations.Test;


public class TestCase  {

	public static  WebDriver driver;
	
	public static void main(String args[]) {
		
		String varimdbDate,variCountry;
		String varWikDate,varwikiCountry;
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\TestVagrant\\WikiImdb\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.imdb.com/title/tt9389998/?ref_=nv_sr_srsg_0");
		
		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
		


		WebElement imdbCountry = driver.findElement(By.xpath("//a[@href='/search/title/?country_of_origin=IN&ref_=tt_dt_cn']"));
		
		variCountry=imdbCountry.getText();
        
		driver.findElement(By.xpath("//a[text()='Release date']")).click();

		WebElement imdbDate = driver.findElement(By.xpath("(//td[@class='release-date-item__date'])[6]"));

		 varimdbDate = imdbDate.getText();

		driver.navigate().to("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		

		

		WebElement wikiCountry = driver.findElement(By.xpath("(//table[@class='infobox vevent']//td)[13]"));

		 varwikiCountry = wikiCountry.getText();

		WebElement wikiDate = driver.findElement(By.xpath("(//table[@class='infobox vevent']//td)[11]"));

	 varWikDate = wikiDate.getText();

	}

	@AfterClass
	public void endUp() {
		System.out.println("End Test");
		driver.close();
	}
	
	

	@Test(priority = 0)
	public void imdbwikiDate() {

		Assert.assertEquals(varimdbDate, varWikDate);
		System.out.println("The dates are match");
	}

	@Test(priority = 1)
	public void imdbwikiCountry() {
		Assert.assertEquals(variCountry, varwikiCountry);
		System.out.println("The country are match");

	}

}

