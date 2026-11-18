import java.math.BigDecimal;

public class Main {
    public static void main (String[] args) {
        Account sara = new Account("MA-001", "Sara Benali");
        System.out.println("Account created");
        sara.deposit(new BigDecimal("500"));
        System.out.println(sara.getOwnerName() + " has " + sara.getBalance() + " MAD");
    }
}
