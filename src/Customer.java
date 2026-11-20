public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String cin;
    private String email;

    public Customer(Long id, String firstName, String lastName, String cin, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cin = cin;
        this.email = email;
    }
}