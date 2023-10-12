package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demoSkillraryAppPage {

	 //declaration
	//address of course web element
	@FindBy(id="Course")
	private WebElement Coursebtn;
	
	// address of feedback web element
	@FindBy(xpath="//a[text()='FEEDBACK']")
	private WebElement feedBackBtn;
	
	//address of select catagory drop down
	@FindBy(name="addresstype")
	private WebElement selectDd;
	
	////initialization 
	public demoSkillraryAppPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	 //utilization
	public WebElement getCoursebtn() {
		return Coursebtn;
	}
	
	public WebElement getSelectDd() {
		return selectDd;
	}
	
	public void feedBackButton() {
		feedBackBtn.click();
	}
}
