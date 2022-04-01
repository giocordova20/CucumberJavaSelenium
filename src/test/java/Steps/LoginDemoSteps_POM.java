package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.loginPage_PO;

import java.time.Duration;

public class LoginDemoSteps_POM {

//    WebDriver driver;
//    loginPage_PO loginpage_po;  // declare page object at the global level
//
//
//    @Before()
//    public void setup() {
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//        driver = new ChromeDriver(chromeOptions);
////        driver.manage().window().maximize();
//    }
//
//    @After()
//    public void tearDown() {
//        driver.quit();
//    }
//
//    @Given("user is on login page2")  // The same step is in the LoginSteps.java file
//    public void user_is_on_login_page() {
//        System.out.println("Inside Step - user is on login page");
//
//        driver.navigate().to("https://example.testproject.io/web/");
//    }
//
//    @When("^user enters (.*) and (.*)$")
//    public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//        System.out.println("Inside Step - user enters username and password");
////        Thread.sleep(2000);
//
////        driver.findElement(By.id("name")).sendKeys(username);
////        driver.findElement(By.id("password")).sendKeys(password);
//        loginpage_po = new loginPage_PO(driver);
//
//        loginpage_po.enterUsername(username);
//        loginpage_po.enterPassword(password);
//
//    }
//
//    @And("clicks on login button2")
//    public void clicks_on_login_button() {
//        System.out.println("Inside Step - clicks on login button");
////        driver.findElement(By.id("login")).click();
//
//        loginpage_po.clickLogin();
//    }
//
//    @Then("user is navigated to the home page2") // The same step is in the LoginSteps.java file
//    public void user_is_navigated_to_the_home_page() {
////        Assert.assertEquals(true, driver.findElement(By.id("logout")).isDisplayed());
//        loginpage_po.checkLogOutIsDisplayed();
//    }
}
