package scripts;

import org.testng.annotations.Test;

import POM.demoSkillraryAppPage;
import POM.invoicePage;
import POM.skillraryHomePage;
import genericLibrary.BaseClass;

public class testCase2 extends BaseClass {
	@Test
	public void tc2() {
		skillraryHomePage s= new skillraryHomePage(driver);
		s.gearsbutton();
		s.skillrarydemoapplink();
		utilities.childBrowser(driver);
		demoSkillraryAppPage dS= new demoSkillraryAppPage(driver);
		dS.feedBackButton();
		invoicePage iP= new invoicePage(driver);
		iP.invoiceButton();
	}

}
