package stepDefinition;

import stepDefinition.Pages.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class E2ETests {

    @Given("The user is on the home page")
    public  void theUserIsOnTheHomePage() throws InterruptedException {
        Login.DriverSetup();
    }

    @When("the user name and password is provided")
    public void theUserNameAndPasswordIsProvided() {
    }


}
