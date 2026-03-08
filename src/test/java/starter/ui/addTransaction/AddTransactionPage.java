package starter.ui.addTransaction;


import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddTransactionPage {

    public static Target BUTTON_ADD_TRANSACTION = Target.the("button add transation").located(By.xpath("//button[contains(.,'Añadir transacción')]"));
    public static Target INPUT_DATE = Target.the("input date").located(By.xpath("//input[@type='date']"));
    public static Target INPUT_AMOUNT = Target.the("input amount").located(By.id("amount"));
    public static Target INPUT_DESCRIPTION = Target.the("input description").located(By.id("description"));
    public static Target BUTTON_SAVE = Target.the("button save").located(By.xpath("//button[contains(.,'Guardar')]"));
    public static Target TABLE_TRANSACTION = Target.the("table transaction").located(By.xpath("//tbody[@id='transactions-list']"));

    public static String TRANSACTION_TABLE_XPATH = "//tbody[@id='transactions-list']";

}
