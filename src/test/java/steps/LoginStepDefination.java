package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefination extends TestBase{

	// Given User is on the Techfios login page
	LoginPage loginPage;// -- Global Object
	DatabasePage databasePage;
	@Before
	public void beforeRun() {
		initDriver();
		loginPage =PageFactory.initElements(driver, LoginPage.class);
		databasePage = new DatabasePage();
	

	}

	@Given ("User is on the Techfios login page")
	 public void  User_is_on_the_Techfios_login_page() {
			driver.get("https://www.techfios.com/billing/?ng=admin/");

			
	}
	

	@When("^User enters \"([^\"]*)\" from techfios database$")
	public void user_enters_from_techfios_database(String data ) throws Throwable {
	
	switch(data) {
			
			case "Username":
				System.out.println("Username from DB : " + databasePage.getData("username"));
				loginPage.enterUserName(databasePage.getData("username"));
				Thread.sleep(3000);
				break;
				
			case "Password":
				System.out.println("Username from DB : " + databasePage.getData("password"));
				loginPage.enterPassword(databasePage.getData("password"));
				Thread.sleep(3000);
				break;
				
				default:
				System.out.println("unable to enterdata");
		}
	}

	// When User enters username as "demo@techfios.com"

	@When("^User enters username as \"([^\"]*)\"$")
	// @When ("^User enters username as {string}")-- New version

/*	public void user_enters_username_as(String username) throws Exception {

		loginPage.enterUserName(username);
		Thread.sleep(3000);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
		loginPage.enterPassword(password);
		Thread.sleep(3000);
	}*/

	@And("^User clikcks on signin button$")
	public void user_clikcks_on_signin_button() throws Throwable {
		loginPage.clickSignInButton();
		Thread.sleep(3000);
		
	}

	@Then("^user should land on dashboard page$")
	public void user_should_land_on_dashboard_page() throws Throwable {
		String actualTitle = loginPage.getPageTitle();
		String expectedTitle = "Dashboard- iBilling";

		Assert.assertEquals(expectedTitle, actualTitle);
		// Assert.assertEquals(DASHBOAR_HEADER_ELEMENT.getText(), "Dashboard", "Wrong
		// Page!!!");

		takeScreenShot(driver);

	
	
		
	}
	
	
}
