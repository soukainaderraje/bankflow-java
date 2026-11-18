import java.math.BigDecimal;

public class Account {
    private String accountNumber;
    private String ownerName;
    private BigDecimal balance;

    public Account(String accountNumber, String ownerName){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = BigDecimal.ZERO;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("amount must be positive");
        }
        this.balance = this.balance.add(amount);
    }

}




