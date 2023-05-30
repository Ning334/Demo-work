package pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class DisappearingElementPage {
	
	private WebDriver driver;
	
	public DisappearingElementPage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//div[@class='example']/ul")
	private List<WebElement> elements;
	
	public int size() {
		return elements.size();
	}

}
