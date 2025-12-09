public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accNo, double bal){
        this.accountNumber = accNo;
        this.balance = bal;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public void showDetails(){
        System.out.println("Account number is: " + getAccountNumber());
        System.out.println("Account balance is: "+getBalance());
    }
}



