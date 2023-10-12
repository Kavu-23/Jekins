package scripts;

import org.testng.annotations.Test;

import POM.demoSkillraryAppPage;
import POM.skillraryHomePage;
import POM.testingPage;
import genericLibrary.BaseClass;

public class testCase1 extends BaseClass {

	@Test
	public void tc1() throws Throwable{
		skillraryHomePage s= new skillraryHomePage(driver);
		s.gearsbutton();
		s.skillrarydemoapplink();
		utilities.childBrowser(driver);
		demoSkillraryAppPage dS= new demoSkillraryAppPage(driver);
		utilities.dropDowns(dS.getSelectDd(),pdata.getPropertyData("coursedd"));
		testingPage tP =new testingPage(driver);
		utilities.scrollBar(driver, tP.getFbIcon());
		tP.fbIconWebElement();
	}
}
