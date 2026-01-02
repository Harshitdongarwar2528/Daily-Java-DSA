package OOPS.Inheritance;

class Animal{
    void mammals(){
        System.out.println("The animal is a mamal ");
    }
}
class Dog extends Animal{
    void barks(){
        System.out.println("The Dog is Barking ");
    }
}

public class SingleLevel{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.mammals(); // inherits from Animals
        d.barks(); // Dogs own method 
    }
}