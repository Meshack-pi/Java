public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("1003", "Meshack", 5.0);
        BankAccount acc2 = new CheckingAccount("1003", "Kevin", 1000.0);
        //both of these are Bank account types but they behave differently!
        acc1.deposit(100);
        acc2.deposit(100);
        acc1.withdraw(200);
        acc2.withdraw(600);
    }
}
