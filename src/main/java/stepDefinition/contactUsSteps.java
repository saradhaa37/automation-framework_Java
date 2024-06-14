package stepDefinition;

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

public class contactUsSteps {

    private WebDriver driver;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/java/driver/Index_of_126/chromedriver");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }
    @Given("I access the contact us page")
    public void i_access_the_contact_us_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
    }

    @When("I fill the first name")
    public void i_fill_the_first_name() {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("I enter last name")
    public void i_enter_last_name() {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("I enter email address")
    public void i_enter_email_address() {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("I enter comments")
    public void i_enter_comments() {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("I click submit button")
    public void i_click_submit_button() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("I should see successful message")
    public void i_should_see_successful_message() {
        // Write code here that turns the phrase above into concrete actions
    }
}
