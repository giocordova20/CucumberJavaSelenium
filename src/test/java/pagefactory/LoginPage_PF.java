package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {

    @FindBy(id="name")
//    @CacheLookup  // keeps element in the cache so that it is not searched again
    WebElement txt_username;

    @FindBy(id="password")
    WebElement txt_password;

    @FindBy(id="login")
    WebElement btn_login;

    WebDriver driver;

    public LoginPage_PF(WebDriver driver) {     // constructor functions
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        System.out.println("\n** In enterUsername()");
        txt_username.sendKeys(username);
    }

    public void enterPqssword(String password) {
        txt_password.sendKeys(password);
    }

    public void clickOnLogin() {
        btn_login.click();
    }

}
