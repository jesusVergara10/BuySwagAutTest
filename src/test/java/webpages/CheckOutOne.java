package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOne {
    private WebDriver driver;

    @FindBy(xpath = "//span[normalize-space()='Checkout: Your information']")
    private WebElement heading;

    @FindBy(xpath = "//input[@placeholder='First Name'][@type='text']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Last Name'][@type='text']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@placeholder='Zip/Postal Code'][@type='text']")
    private WebElement zipCode;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;

    public CheckOutOne(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isPageOpen(){
        return heading.getText().toString().contains("Checkout: Your Information");
    }

    public void setName(String name){
        firstName.clear();
        firstName.sendKeys(name);
    }

    public void setLastName(String setLastName){
       lastName.clear();
       lastName.sendKeys(setLastName);
    }

    public void setZipC(String zipC){
        zipCode.clear();
        zipCode.sendKeys(zipC);
    }

    public void submitInfo(){
        submitButton.click();
    }


}
