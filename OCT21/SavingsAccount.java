public class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(String accountNumber,String accountHolderName,double interestRate){
        super(accountNumber,accountHolderName);
        this.interestRate = interestRate;
    }
    public void addInterest(){
        double interest = getBalance()*interestRate/100;
        deposit(interest);
        System.out.println("Interest added: "+interest);
    }
    @Override
    public void withdraw(double amount){
        System.out.println("Savings Account withdrawal: ");
        super.withdraw(amount);
    }
}