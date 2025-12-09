public class CreditCard extends PaymentMethod{
    private int cardNUmber;
    private String cardholderName;
    @Override
    public void processPayment(int amount){
        System.out.println("Processing payment via card....");
    }
}
