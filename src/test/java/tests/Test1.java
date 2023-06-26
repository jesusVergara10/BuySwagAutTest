package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import webpages.*;

import java.time.Duration;

public class Test1 {
    WebDriver driver;

    @BeforeEach
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void buySwag(){
        HomePage home = new HomePage(driver);
        home.setUserName();
        home.setPassword();
        home.clickLogin();

        SignedInHome signedInHome = new SignedInHome(driver);
        signedInHome.isPageOpened();
        signedInHome.addLightsToCart();
        signedInHome.goToCart();

        CartPage cart = new CartPage(driver);
        cart.isCartOpen();
        cart.goToCheckOut();

        CheckOutOne checkout1 = new CheckOutOne(driver);
        checkout1.isPageOpen();
        checkout1.setName("Jesus");
        checkout1.setLastName("Vergara");
        checkout1.setZipC("66677");
        checkout1.submitInfo();

        CheckOutTwo checkout2 = new CheckOutTwo(driver);
        checkout2.isPageOpen();
        checkout2.checkout();
    }

//    @AfterEach
//    public void close(){
//        driver.close();
//    }

}
