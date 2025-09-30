public class MealCard {
    private int balance;
    MealCard(){
        balance = 100;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int amount){
        balance = amount;
    }
    public void purchasePoint(int amount){
        balance +=amount;
    }
    public void purchaseFood(int amount){
        balance-=amount;
    }
}
