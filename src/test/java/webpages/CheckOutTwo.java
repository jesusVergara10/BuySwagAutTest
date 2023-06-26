package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutTwo {
    WebDriver driver;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishButton;

    @FindBy(xpath = "//span[normalize-space()='Checkout: Overview']")
    private WebElement heading;

    public CheckOutTwo(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isPageOpen(){
        return heading.getText().toString().contains("Checkout: Overview");
    }

    public void checkout(){
        finishButton.click();
    }

}
