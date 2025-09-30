public class BankTest {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        a1.deposit(20000);
        a1.withdraw(300);
        a1.displayAccountInfo();
    }
}
