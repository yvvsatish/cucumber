package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class gmail2StepDefinition {

	WebDriver driver;
    @Given("^enter valid url for gmail2$")
    public void enter_valid_url_for_gmail2() {
       System.out.println("launch");
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\TO-WDOL-04\\Downloads\\chromedriver_2.41.exe");
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.get("https://www.google.com/");
    }

    @When("^login into the application2$")
    public void login_into_the_application2() {
   	 System.out.println("login");
    }

    @Then("^validate login screen occurance2$")
    public void validate_login_screen_occurance2() {
    	 System.out.println("inbox");
    }

    @And("^enter username and password2$")
    public void enter_username_and_password2(DataTable credentials) throws InterruptedException {
    	 System.out.println("username and pwd");
    	 Thread.sleep(1000);
    	 for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
		 driver.findElement(By.name("q")).sendKeys(data.get("username"));
    	 driver.findElement(By.name("q")).sendKeys(data.get("password"));
    	 }
    }
}