public class Accessors {
    static void myStaticMethod(){
        System.out.println("This is a static method");
    } //static type methods can be accessed directly by within the class
    public void myPublicMethod(){
        System.out.println("Several");
    } //This method is only accesed by objects of the Accessors class
    static void sum(int k){
        System.out.println("The argument passed to parameter k is : " + k);
    }
    public static void main(String[] args) {
        //this si a public main method
        myStaticMethod();
        Accessors myobj = new Accessors();
        myobj.myPublicMethod();
        sum(10);
        
    }
}
