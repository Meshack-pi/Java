



public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber,String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }
    public void deposit(double amount){
        if(amount<0){
            System.out.println("Amount must be greater than zero");
        }else{
            this.balance += amount;
        }
    }
    public void deposit(double amount,String mesage){
        if(amount<0){
            System.out.println("Amount must be greater than zero");
        }else{
            this.balance +=amount;
            System.out.println("Deposted: "+ amount+"Notew: "+mesage);
        }
    }
    public void deposit(int amount,boolean notify){
        if(amount<0){
            System.out.println("Amount must be greater than zero");
        }else{
            this.balance+=amount;
        }
        if(notify){
            System.out.println("User notified for the deposit of amount: "+amount);
        }
    }

    public void withdraw(double amount){
        if(amount>this.balance){
            System.out.println("Insufficient balance to withdraw: "+ amount);
        }else{
            this.balance -=amount;
            System.out.println("You have successfully withdrawn: " + amount);
        }
    }
    public double getBalance(){
        return this.balance;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public String getAccountHolderName(){
        return this.accountHolderName;
    }
    public void setAccountHolderName(String newName){
        if(newName !=null&& !newName.isEmpty()){
            this.accountHolderName = newName;
        }else{
            System.out.println("Name cannot be empty");
        }
    }
    public void transfer(BankAccount toAccount,double amount){
        if(amount>0&&amount<=this.balance){
            this.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transferred "+amount+" to " + toAccount.getAccountNumber());
        }else{
            System.out.println("Transfer failed");
        }
    }
}
