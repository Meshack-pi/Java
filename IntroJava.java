class Account{
    //Attributes
    String accountNumber;
    double accountBalance;
    String accountType;

    /*
     *Constructor as a special mehtod
     * this is invoked evertimeyou create a new object or instance of that class
     * It shares the same name as the class
     * It has no return type
     * It is used to initialize the attributes
     */
    public Account(){
        accountNumber = "12292939";
        accountType = "None";
    }

    //MethodsA

    //Methods
    void withdraw(double amount){
        accountBalance = accountBalance - amount;
    }
    void deposit(double amount){
        accountBalance = accountBalance + amount;
    }
    double checkBalance(){
        return accountBalance;
    }
    //Getter for account balance , all getters have no parameter
    public double getAccountBalance(){
        return accountBalance;
    }
    //getter for account type
    public String getAccountType(){
        return accountType;
    }
    //getter for account number
    public String getAccountNumber(){
        return accountNumber;
    }
    //setter method for account
    void setAccountType(String accType){
        accountType = accType;
    }
}
public class IntroJava {
    public static void main(String args[]) {
        Account myAccount;
        myAccount = new Account();
        myAccount.deposit(2000);
        // amount is a parameter
        //2000 is the argument - menaing an argument is the value passed to the parameter
        myAccount.withdraw(600);
        double mybalance = myAccount.checkBalance();
        System.out.println("Your account balance is: "+ mybalance);

    }
}
