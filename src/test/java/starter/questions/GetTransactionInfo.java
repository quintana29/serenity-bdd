package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static starter.ui.addTransaction.AddTransactionPage.TRANSACTION_TABLE_XPATH;

public class GetTransactionInfo {
    public static Question<String> getDescription(String text){
        return Question.about( text ).answeredBy(
                actor -> BrowseTheWeb.as(actor).textOf(TRANSACTION_TABLE_XPATH)
        );
    }
}
