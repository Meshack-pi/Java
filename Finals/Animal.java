abstract class Animal {
    String name;
    int age;
    Animal(String name, int age){
        this.name = name;
        this.age= age;
    }
    abstract void makeSound();
    //You can also have defined methods in an abstract class
    void sleep(){
        System.out.println("Sleeping....");
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    //this method should not be abstract since abstract means you don't define how it is used only state that this is a method that is already defined
}
//An asbstract class cannot be instantianted by its own and is meant to be inheritted by other classes
//It provides the base structure for the subclasses to folow


//Use abstract classes when you want to provide structure and some common code to subclasses
//Some methods must be implemented differently by each subclass
//You want force sublcasses to follow a certain pattern