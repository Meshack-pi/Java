public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    BankAccount(){
        accountHolder = "FULL NAME";
        balance = 0.00;
        accountNumber = 3993;
    }
    //getter methods
    public String getAccountHolder(){
        return accountHolder;
    }
    public int getAccountNUmber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    //setter methods
    void setBalance(double Mybalance){
        balance = Mybalance;
    }
    void setAccountHolder(String MyName){
        accountHolder = MyName;
    }
    void setAccountNumber(int AccNumber){
        accountNumber = AccNumber;
    }
    //Transaction methods to deposit and withdraw
    void deposit(double amount){
        balance = balance + amount;
    }
    void withdraw(double amount){
        balance = balance - amount;
    }
    void displayAccountInfo(){
        System.out.println("Account Holder: "+ getAccountHolder());
        System.out.println("Account Number: "+ getAccountNUmber());
        System.out.println("Balance: "+ getBalance());
    }
}
