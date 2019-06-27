package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class GmailStepDefinition {

	WebDriver driver;
    @Given("^enter valid url for gmail$")
    public void enter_valid_url_for_gmail() {
       System.out.println("launch");
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\TO-WDOL-04\\Downloads\\chromedriver_2.41.exe");
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.get("https://www.google.com/");
    }

    @When("^login into the application$")
    public void login_into_the_application() {
   	 System.out.println("login");
    }

    @Then("^validate login screen occurance$")
    public void validate_login_screen_occurance() {
    	 System.out.println("inbox");
    }

    @And("^enter username and password$")
    public void enter_username_and_password(DataTable credentials) throws InterruptedException {
    	 System.out.println("username and pwd");
    	 List<List<String>> data = credentials.raw();
    	 Thread.sleep(1000);
    	 driver.findElement(By.name("q")).sendKeys(data.get(0).get(0));
    	 driver.findElement(By.name("q")).sendKeys(data.get(0).get(1));
    }
    @Given("^enter valid url for login$")
    public void enter_valid_url_for_login() {
       System.out.println("launch-login");
    }

}