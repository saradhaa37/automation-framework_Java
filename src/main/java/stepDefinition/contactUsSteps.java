package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

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
    public void i_fill_the_first_name() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.cssSelector("[name=\'first_name\']")).sendKeys("Sara");
        //Thread.sleep(3000);
    }

    @And("I enter last name")
    public void i_enter_last_name() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("last_name")).sendKeys("Guru");
        //Thread.sleep(3000);
    }

    @And("I enter email address")
    public void i_enter_email_address() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("email")).sendKeys("saraguru@mailinator.com");
       // Thread.sleep(3000);
    }

    @And("I enter comments")
    public void i_enter_comments() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("message")).sendKeys("sara");
        //Thread.sleep(3000);
    }

    @And("I click submit button")
    public void i_click_submit_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.cssSelector("[value=\"SUBMIT\"]")).click();
        Thread.sleep(3000);
    }

    @Then("I should see successful message")
    public void i_should_see_successful_message() {
        // Write code here that turns the phrase above into concrete actions
        ////div[@id='contact_reply']/h1
        WebElement wbEeleSuccessMessage=driver.findElement(By.xpath("//div[@id='contact_reply']/h1"));
        Assert.assertEquals(wbEeleSuccessMessage.getText(),"Thank You for your Message!");
    }
}
