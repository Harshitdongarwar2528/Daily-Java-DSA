package OOPS.Abstraction;

abstract class Animal{

    //abstract class
    abstract void sound();

    //Non-abstract method
    void sleep(){
        System.out.println("Animal is Sleeping");
    }
}

    // child class
    class Dog extends Animal{
        @Override
        void sound(){
            System.out.println("Dog Barks");
        }
    }

public class Abstraction {
    public static void main (String [] args){
        Animal a = new Dog();  //upcasting
        a.sound();             //Dog Barks
        a.sleep();             // Animal is sleeping
    }
}
