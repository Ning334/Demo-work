package pageObjectModel;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DataTablePage {
	
	private WebDriver driver;
	
	public DataTablePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH, using = "//table[@id='table1']/thead/following-sibling::tbody/tr/td[1]")
	private List<WebElement> dataRolls;

	@FindBy(how = How.XPATH, using = "//table[@id='table1']/thead/following-sibling::tbody/tr/td")
	private List<WebElement> allData;
	
	//find matching value
	public boolean elemsIsMatch(Object value) {
		for(WebElement data: allData) {
			if(data.getText().equals(value)) {
				return true;
			}
		}
		return false;		
	}
	
	//find the email address of the giving value
	public String getEmail(String value) {
		int index = 0;
		for(int i=0; i <dataRolls.size(); i++) {
			index = i;
			if(dataRolls.get(index).getText()==value) {
				break;
			}
		}
		String xPath = "//table[@id='table1']/thead/following-sibling::tbody/tr["+index+"]/td[3]";
		String email = driver.findElement(By.xpath(xPath)).getText();
		return email;
	}
}
