package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id = "txtUsername")
    WebElement username;

    @FindBy(id = "txtPassword")
    WebElement password;

    @FindBy(id = "btnLogin")
    WebElement loginBtn;

   public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void login(String user,String pass){
        username.sendKeys(user);
        password.sendKeys(pass);
        loginBtn.click();
    }
}
