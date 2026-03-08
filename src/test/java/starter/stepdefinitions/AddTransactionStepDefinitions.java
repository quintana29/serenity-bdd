package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.model.LoginCredentials;
import starter.model.TransactionInfo;
import starter.tasks.addTransaction.AddTransaction;
import starter.tasks.addTransaction.CheckNewTransactionWasAdded;
import starter.tasks.login.Login;
import starter.tasks.navigation.NavigateTo;

import java.util.List;

public class AddTransactionStepDefinitions {

    @Given("{actor} is logged into the aplication")
    public void pepitoIsLoggedIntoTheAplication(Actor actor, List<LoginCredentials> userInfo) {
        LoginCredentials loginCredentials = userInfo.get(0);
        actor.attemptsTo(
                NavigateTo.logingPage(),
                new Login(loginCredentials)
        );
    }

    @When("{actor} enters the required information for the new transaction")
    public void pepitoEntersTheRequiredInformationForTheNewTransaction(Actor actor, List<TransactionInfo>  transactionInfo) {
        TransactionInfo newTransaction = transactionInfo.get(0);
        actor.remember("DATOS_TRANSACCION", newTransaction);
        actor.attemptsTo(
                AddTransaction.withInfo(newTransaction)
        );

    }

    @Then("{actor} should see a new transaction list with correct details")
    public void pepitoShouldSeeANewTransactionListWithCorrectDetails(Actor actor) {
        TransactionInfo transactionInfo = actor.recall("DATOS_TRANSACCION");
        actor.attemptsTo(
                new CheckNewTransactionWasAdded(transactionInfo)
        );

    }
}
