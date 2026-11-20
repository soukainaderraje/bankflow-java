import java.math.BigDecimal;

public class Main {
    public static void main (String[] args) {
        Account sara = new Account("MA-001", "Sara Benali");
        System.out.println("Account created");
        try {
            sara.deposit(new BigDecimal("2000"));

        }catch (IllegalArgumentException e){
            System.out.println("Deposit refused:" +e.getMessage());
        }

        try {
            sara.withdraw(new BigDecimal("800"));
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal refused: " + e.getMessage());
        }
        System.out.println(sara.getOwnerName() + " has " + sara.getBalance() + " MAD");
    }
}
