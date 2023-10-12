package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testingPage {

	
	    //Declaration
	//address of facebook webelement
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fbIcon;
	
	//initialization 
	public testingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	 //utilization
	public void fbIconWebElement() {
		fbIcon.click();
	}
	
	public WebElement getFbIcon() {
		return fbIcon;
	}
}

//https://demoapp.skillrary.com/category.php?category=testing