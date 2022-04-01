package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.*;

public class GoogleSearchSteps {

    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("Inside Step - browser is open");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
//        driver.manage().window().maximize();

    }

    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("Inside Step - user is on google search page");
        driver.navigate().to("https://google.com");
    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {
        System.out.println("Inside Step - user enters a text in search box");
        driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
    }

    @And("hits enter")
    public void hits_enter() {
        System.out.println("Inside Step - hits enter");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("user is navigated to the search results")
    public void user_is_navigated_to_the_search_results() {
        System.out.println("Inside Step - user is navigated to the search results");
        driver.getPageSource().contains("Online Courses");

        Assert.assertTrue(driver.getPageSource().contains("Online Courses"));
        driver.close();
        driver.quit();
    }
}
