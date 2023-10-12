package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class invoicePage {

	
	     //Declaration
		//address of invoice page webelement
		@FindBy(xpath="//input[@name='downloadInvoice']")
		private WebElement invoiceBtn;
		
		//initialization 
		public invoicePage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		 //utilization
		public void invoiceButton() {
			invoiceBtn.click();
		}
}
