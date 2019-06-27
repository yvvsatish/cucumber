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
public class Gmail1StepDefinition {

	WebDriver driver;
    @Given("^enter valid url for gmail1$")
    public void enter_valid_url_for_gmail1() {
       System.out.println("launch");
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\TO-WDOL-04\\Downloads\\chromedriver_2.41.exe");
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.get("https://www.google.com/");
    }

    @When("^login into the application1$")
    public void login_into_the_application1() {
   	 System.out.println("login");
    }

    @Then("^validate login screen occurance1$")
    public void validate_login_screen_occurance1() {
    	 System.out.println("inbox");
    }

    @And("^enter \"(.*)\" and \"(.*)\"1$")
    public void enter_username_and_password1(String username, String password) throws InterruptedException {
    	 System.out.println("username and pwd");
    	 Thread.sleep(1000);
    	 driver.findElement(By.name("q")).sendKeys(username);
    	 driver.findElement(By.name("q")).sendKeys(password);
    }
}