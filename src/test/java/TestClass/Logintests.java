package TestClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import testbase.TestBase;

public class Logintests extends TestBase {

    LoginPage loginPage;
    HomePage homePage;

    Logintests(){
        super();
    }

    @BeforeMethod
    public void setup(){
        initialization();
        homePage = new HomePage(getDriver());
        loginPage = new LoginPage(getDriver());
    }

    @Test
    public void verifyLogin1(){
        SoftAssert softAssert = new SoftAssert();
        loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
        softAssert.assertEquals(homePage.homePageTitle(),"Digital Partners","Digital Partners String should match");
        softAssert.assertAll();
    }

    @Test
    public void verifyLogin2(){
        SoftAssert softAssert = new SoftAssert();
        loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
        softAssert.assertEquals(homePage.homePageTitle(),"Digital Partners","Digital Partners String should match");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown(){
        getDriver().quit();
    }
}
