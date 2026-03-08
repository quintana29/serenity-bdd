package starter.model;

public class TransactionInfo {
    private  String date;
    private  String amount;
    private  String description;

    public TransactionInfo(String date, String amount, String description) {
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}
