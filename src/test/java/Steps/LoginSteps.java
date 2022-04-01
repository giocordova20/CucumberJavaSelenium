package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginSteps {

    WebDriver driver;

    @Before()
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
//        driver.manage().window().maximize();
    }

    @After()
    public void tearDown() {
        driver.quit();
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
    System.out.println("Inside Step - user is on login page");

    driver.navigate().to("https://example.testproject.io/web/");

    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("Inside Step - user enters username and password");
        driver.findElement(By.id("name")).sendKeys("Gio");
        driver.findElement(By.id("password")).sendKeys("12345");

    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("Inside Step - clicks on login button");
        driver.findElement(By.id("login")).click();

    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
//        Assert.assertFalse(driver.findElement(By.id("logout")).isDisplayed());
        Assert.assertEquals(true, driver.findElement(By.id("logout")).isDisplayed());
    }
}
