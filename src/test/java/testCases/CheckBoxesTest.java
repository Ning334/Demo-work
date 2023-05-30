package testCases;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.CheckBoxesPage;
import pageObjectModel.HomePage;

public class CheckBoxesTest extends BaseTest {	
	@Test
	public void checkBox() {
		HomePage homePage= new HomePage(driver);
		CheckBoxesPage checkBoxesPage = homePage.clickCheckBox();
		SoftAssert softAssert = new SoftAssert();
		checkBoxesPage.clickBox1();
		softAssert.assertTrue(checkBoxesPage.checkBox1());
		
		checkBoxesPage.clickBox2();
		softAssert.assertFalse(checkBoxesPage.checkBox2());		
		softAssert.assertAll();
	}
}
