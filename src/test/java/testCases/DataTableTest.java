package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pageObjectModel.DataTablePage;
import pageObjectModel.HomePage;

public class DataTableTest extends BaseTest {
	
	@Test
	public void findMatchingValue() {
		HomePage homepage = new HomePage(driver);
		DataTablePage dataTable = homepage.clickDataTable();
		String name = "John";
		assertTrue(dataTable.elemsIsMatch(name));
		System.out.println(dataTable.getEmail(name));
		
		
		
	}

}
