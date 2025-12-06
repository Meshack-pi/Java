public class Dog extends Animal {
    Dog(String name, int age) {
        super(null, 0);
        this.name = name;
        this.age = age;
    }
    @Override
    void makeSound(){
        System.out.println("Woof woooof!");
    }
    
    public void printInfo(){
        System.out.println("Age of this dog is: " +getAge());
        System.out.println("Name of this dog is : "+getName());
    }

    @Override
    void sleep() {
        super.sleep();
    }
    
    
}
