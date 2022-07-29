package tests;

import com.github.javafaker.Faker;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.ProductsPage;
import pages.SingleProductPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class BaseTest extends TestBaseRapor {

    //C:\Program Files\apache-maven-3.8.6\bin

    HomePage homePage = new HomePage();
    ProductsPage productsPage = new ProductsPage();
    SingleProductPage singleProductPage = new SingleProductPage();
    Faker faker = new Faker();
    SoftAssert softAssert = new SoftAssert();


    //@BeforeClass
    public void navigateToHomePage() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        //3. Verify that home page is visible successfully
        Driver.getDriver().get(ConfigReader.getProperty("aeUrl"));
        //assertTrue(homePage.logo.isDisplayed());
    }

    //@AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }

}
