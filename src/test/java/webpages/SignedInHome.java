package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignedInHome {
    private WebDriver driver;

    @FindBy(xpath = "//div[@class='app_logo']")
    private WebElement heading;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light'][@name='add-to-cart-sauce-labs-bike-light']")
    private WebElement sweetBikeLights;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement cartButton;


    public SignedInHome(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isPageOpened(){
        return heading.getText().toString().contains("Swag Labs");
    }

    public void addLightsToCart(){
        sweetBikeLights.click();
    }

    public void goToCart(){
        cartButton.click();
    }

}
