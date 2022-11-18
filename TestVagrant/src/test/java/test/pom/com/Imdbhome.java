package test.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Imdbhome {

	@FindBy(xpath = "//a[@href='/search/title/?country_of_origin=IN&ref_=tt_dt_cn']")
	private WebElement imdbCountry;

	@FindBy(xpath = "//a[text()='Release date']")
	private WebElement button;

	@FindBy(xpath = "(//td[@class='release-date-item__date'])[6]")
	private WebElement imdbDate;

	public Imdbhome(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public String getImdbCountry() {
		String varcount = imdbCountry.getText();
		return varcount;

	}

	public void button() {
		button.click();
	}

	public String getImdbDate() {
		String varidat = imdbDate.getText();
		return varidat;

	}

}
