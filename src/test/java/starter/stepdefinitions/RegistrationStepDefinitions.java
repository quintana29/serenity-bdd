package starter.stepdefinitions;


import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import starter.model.User;
import starter.tasks.registration.CheckNewAccountCreated;
import starter.tasks.registration.DoNotSentAllRequiredInformation;
import starter.tasks.registration.RegisterUser;
import starter.tasks.registration.ShouldSeeAllFieldsAreRequired;
import starter.ui.registration.RegisterPage;

import java.util.List;

public class RegistrationStepDefinitions {
    User user;

    @Given("{actor} wants to sign up in teh application")
    public void wantsToSignUpInTheApplication(Actor actor) {

        actor.attemptsTo(
                Open.browserOn(new RegisterPage()));

    }

    @When("{actor} sends the required information to sign up")
    public void pepitoSendsTheRequiredInformationToSignUp(Actor actor, List<User> userInfo) {
        user = userInfo.get(0);
        actor.attemptsTo(
                new RegisterUser(user)

        );

    }

    @Then("{actor} should have a new account created")
    public void pepitoShouldHaveANewAccountCreated(Actor actor) {
        actor.attemptsTo(
                new CheckNewAccountCreated(user)
        );


    }

    @When("{actor} does not send the required information")
    public void pepitoDoesNotSendTheRequiredInformation(Actor actor) {
        actor.attemptsTo(
                new DoNotSentAllRequiredInformation(new User())
        );

    }

    @Then("{actor} should be told all fields are required")
    public void pepitoShouldBeToldAllFieldsAreRequired(Actor actor) {
        actor.attemptsTo(
                new ShouldSeeAllFieldsAreRequired()
        );

    }


}
