abstract class PaymentMethod{
    private int amount;
    abstract void processPayment(int amount);
}