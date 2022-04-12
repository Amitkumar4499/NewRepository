package StepDefinitions;

import org.openqa.selenium.By;
import Resources.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends BaseClass {
	@Given("User At Login Page")
	public void user_at_login_page() throws Exception {
		InitiateBrowser("chrome");
		driver.get(prop.getProperty("url"));
	}

	@When("User Provide Id")
	public void user_provide_id() {
		driver.findElement(By.id("email")).sendKeys("amit@gmail.com");
	}

	@When("User Provide Password")
	public void user_provide_password() {
		driver.findElement(By.id("pass")).sendKeys("Pass");
	}

	@When("User Clicked Login")
	public void user_clicked_login() {
		driver.findElement(By.name("login")).click();
	}

	@Then("User Should Login In Facebook")
	public void user_should_login_in_facebook() {
		String title = driver.getTitle();
		System.out.println(title);
	}
}
