package starter.tasks.addTransaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.By;
import starter.model.TransactionInfo;
import starter.questions.GetTransactionInfo;
import starter.ui.addTransaction.AddTransactionPage;

public class CheckNewTransactionWasAdded implements Task {

    private final TransactionInfo transactionInfo;

    public CheckNewTransactionWasAdded(TransactionInfo transactionInfo) {
        this.transactionInfo = transactionInfo;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(GetTransactionInfo.getDescription(transactionInfo.getDescription()))
                        .contains(transactionInfo.getDescription()),
                Ensure.that(GetTransactionInfo.getDescription(transactionInfo.getAmount()))
                        .contains(transactionInfo.getAmount())
        );

    }
}
