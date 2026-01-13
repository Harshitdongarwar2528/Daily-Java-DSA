package OOPS.Inheritance;

class Animal{
    void mammals(){
        System.out.println("The animal is a mamal ");
    }
}
class Doggy extends Animal{
    void barking(){
        System.out.println("The Dog is Barking ");
    }
}

public class SingleLevel{
    public static void main(String[] args) {
        Doggy d = new Doggy();
        d.mammals(); // inherits from Animals
        d.barking(); // Dogs own method 
    }
}