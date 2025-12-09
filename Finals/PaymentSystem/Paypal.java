public class Paypal extends PaymentMethod{
    private String email;
    @Override
    public void processPayment(int amount){
        System.out.println("Processing payment with Paypal...");
    }    
}
