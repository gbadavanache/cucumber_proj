package DemoStepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStepDefinition {
	@Given("^Precondion1$")
	public void Precoditions() {
		 System.out.println("Precodition1 is executed");
	}
	@When("^something is done$")
	public void something_is_done() {
		 System.out.println("Something is done");
	}
	@Then("^something should happen at one$")
	public void something_should_happen_at_one() {
		 System.out.println("Something should happen at one");
	}
}


