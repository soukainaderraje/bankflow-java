import java.math.BigDecimal;

public class Main {
    public static void main (String[] args) {
        Account sara = new Account("MA-001", "Sara Benali");
        System.out.println("Account created");
        try {
            sara.deposit(new BigDecimal("200"));

        }catch (IllegalArgumentException e){
            System.out.println("Deposit refused:" +e.getMessage());
        }
        System.out.println(sara.getOwnerName() + " has " + sara.getBalance() + " MAD");
    }
}
