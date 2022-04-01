package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

import java.time.Duration;

public class LoginDemoSteps_PF {

    WebDriver driver = null;
    LoginPage_PF login;
    HomePage_PF home;

    @Before()
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
//        driver.manage().window().maximize();ß
    }

    @After()
    public void tearDown() {
        driver.quit();
    }

    @Given("user is on login page2")  // The same step is in the LoginSteps.java file
    public void user_is_on_login_page() {

        System.out.println("\n === I am inside LoginDemoSteps_PF ===\n");
        System.out.println("Inside Step - user is on login page");

        driver.navigate().to("https://example.testproject.io/web/");
    }

    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) throws InterruptedException {
        System.out.println("Inside Step - user enters username and password");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("name")));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='name']")));

        // Replace by page factory
//        driver.findElement(By.id("name")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);

        System.out.println("before login = new LoginPage_PF(driver)");
        login = new LoginPage_PF(driver);
        login.enterUsername(username);
        login.enterPqssword(password);
        Thread.sleep(2000);
    }

    @And("clicks on login button2")
    public void clicks_on_login_button() {
        System.out.println("Inside Step - clicks on login button");

        // Replaced by page factory
        //        driver.findElement(By.id("login")).click();
        login.clickOnLogin();
    }

    @Then("user is navigated to the home page2") // The same step is in the LoginSteps.java file
    public void user_is_navigated_to_the_home_page() {
        Assert.assertEquals(true, driver.findElement(By.id("logout")).isDisplayed());
//        Assert.assertEquals(true, home.checkLogoutIsDisplayed());

        home = new HomePage_PF(driver);
        home.checkLogoutIsDisplayed();
    }
}
