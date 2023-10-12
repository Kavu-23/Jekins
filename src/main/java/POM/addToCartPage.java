package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addToCartPage {

	 //Declaration
		//address of plus icon
		@FindBy(xpath="//i[@class='fa fa-plus']")
		private WebElement plusIcon;
		
		//address to add to cart
		@FindBy(xpath="//button[text()='Add to Cart']")
		private WebElement addtoCart;
		
		//initialization 
		public addToCartPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		 //utilization
		public WebElement getPlusIcon() {
			return plusIcon;
		}
		
		public void addToCart() {
			addtoCart.click();
		}
}

//https://demoapp.skillrary.com/product.php?product=java 