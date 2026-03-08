package starter.tasks.addTransaction;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.model.TransactionInfo;
import starter.ui.addTransaction.AddTransactionPage;

public class AddTransaction  {

    public static Performable withInfo(TransactionInfo transactionInfo){
        return Task.where(
                Click.on(AddTransactionPage.BUTTON_ADD_TRANSACTION),
                Enter.theValue(transactionInfo.getDate()).into(AddTransactionPage.INPUT_DATE),
                Enter.theValue(transactionInfo.getAmount()).into(AddTransactionPage.INPUT_AMOUNT),
                Enter.theValue(transactionInfo.getDescription()).into(AddTransactionPage.INPUT_DESCRIPTION),
                Click.on(AddTransactionPage.BUTTON_SAVE)
        );
    }

}
