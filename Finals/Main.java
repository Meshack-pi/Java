public class Main {
    public static void main(String[] args){
        //Animal a = new Animail(); //This is not possible since Animal is abstract
        //abstract classes are meant to be inherited
        Dog d = new Dog("Buddy",3);
        d.printInfo();
        d.makeSound();

    }
}