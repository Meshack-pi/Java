public class Bicycle {
    private String ownerName;
    private final String name = "meshack";
    public Bicycle(){
        ownerName = "Uknown";
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String name){
        ownerName = name;
    }
}
