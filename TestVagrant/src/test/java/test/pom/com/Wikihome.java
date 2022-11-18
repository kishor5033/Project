package test.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wikihome {

	@FindBy(xpath = "(//table[@class='infobox vevent']//td)[13]")
	private WebElement wikiCountry;

	@FindBy(xpath = "(//table[@class='infobox vevent']//td)[11]")
	private WebElement wikiDate;

	public Wikihome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String getWcountry() {
		String varWcountry = wikiCountry.getText();
		return varWcountry;
	}

	public String getWdate() {
		String varWdate = wikiDate.getText();
		return varWdate;
	}

}
