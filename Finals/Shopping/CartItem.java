public class CartItem {
    private String itemName;
    private int quantity;
    private double pricePerUnit;

    public double getPricePerUnit(){
        return pricePerUnit;
    }
    public int getQuantity(){
        return quantity;
    }
    public String itemName(){
        return this.itemName;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setPricePerUnit(double pricePerUnit){
        this.pricePerUnit = pricePerUnit;
    }

    public double CalculateTotalcost(int quantity,double pricePerUnit){
        return quantity*pricePerUnit;
    }
}
