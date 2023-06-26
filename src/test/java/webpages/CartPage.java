package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    private WebDriver driver;

    @FindBy(xpath = "//span[@class='title'][normalize-space()='Your Cart']")
    private WebElement heading;

    @FindBy(xpath = "//button[@data-test='checkout']")
    private WebElement checkout;

    public CartPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isCartOpen(){
        return heading.getText().toString().contains("Your Cart");
    }

    public void goToCheckOut(){
        checkout.click();
    }

}
