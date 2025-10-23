public class CheckingAccount extends BankAccount{
    public double overdraftLimit;
    private double transactionFee = 10.0;
    public CheckingAccount(String accountNumber,String accountHolderName,double overdraftLimit){
        super(accountNumber,accountHolderName);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void withdraw(double amount){
        if(amount<=getBalance()+overdraftLimit){
            //using the parent deposit and withdraw logic
            double newBalance = getBalance() -amount;
            System.out.println("Withdrawn: "+amount+" Checking Account");
        }else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
    @Override
    public void deposit(double amount){
        double netAmount = amount -transactionFee;
        System.out.println("Deposti after transaction fee: "+netAmount);
    }
}
