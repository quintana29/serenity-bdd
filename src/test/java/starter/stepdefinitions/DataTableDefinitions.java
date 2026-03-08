package starter.stepdefinitions;

import io.cucumber.java.DataTableType;
import starter.model.LoginCredentials;
import starter.model.TransactionInfo;
import starter.model.User;

import java.util.Map;

public class DataTableDefinitions {
    @DataTableType
    public User userEntry(Map<String, String> entry) {
        return new User(
                entry.get("name"),
                entry.get("last name"),
                entry.get("age"),
                entry.get("email"),
                entry.get("country")
        );
    }

    @DataTableType
    public LoginCredentials loginEntry(Map<String, String> entry) {
        return new LoginCredentials(
                entry.get("userName"),
                entry.get("password")
        );
    }
    @DataTableType
    public TransactionInfo transactionInfoEntry(Map<String, String> entry) {
        return new TransactionInfo(
                entry.get("date"),
                entry.get("amount"),
                entry.get("description")
        );
    }
}
