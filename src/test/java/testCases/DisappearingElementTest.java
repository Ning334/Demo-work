package testCases;


import org.testng.annotations.Test;
import pageObjectModel.DisappearingElementPage;
import pageObjectModel.HomePage;

public class DisappearingElementTest extends BaseTest{
	@Test
	public void disappearingElem() {
		HomePage homePage = new HomePage(driver);
		DisappearingElementPage disappearingElem = homePage.clickDisappearElem();
		int fourCount = 0;
		int fiveCount = 0;
		boolean isDisappearing = false;
		for(int i=0; i<20; i++) {
			driver.navigate().refresh();
			if(disappearingElem.size()==4) {
				fourCount ++;
			}
			else if(disappearingElem.size()>=5) {
				fiveCount ++;
			}	
		}
		System.out.println(fourCount);
		System.out.println(fiveCount);
		if(fiveCount >0) {
			isDisappearing = true;
		}else {
			isDisappearing =false;
	}

	}

	

}
