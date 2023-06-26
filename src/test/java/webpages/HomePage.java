package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    private static String PAGE_URL = "https://www.saucedemo.com/";

    @FindBy(xpath = "//input[@class='input_error form_input'][@placeholder='Username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@class='input_error form_input'][@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//input[@type='submit'][@id='login-button']")
    private WebElement logInButton;

    public HomePage(WebDriver driver){
        this.driver=driver;
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void setUserName(){
        userName.sendKeys("standard_user");
    }

    public void setPassword(){
        password.sendKeys("secret_sauce");
    }

    public void clickLogin(){
        logInButton.click();
    }


}
