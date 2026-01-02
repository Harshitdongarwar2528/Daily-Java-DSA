package OOPS.Inheritance;

class Animals{
    void isCarnivorous(){
        System.out.println("I am a Carnivorous animal");
    }
}
class Tiger extends Animals{
    void hunt(){
        System.out.println("I eat Deer for Food");
    }
}
class Cat extends Animals{
    void eat(){
        System.out.println("I eat Fish for Food");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.isCarnivorous();
        t.hunt();

        Cat c = new Cat();
        c.isCarnivorous();
        c.eat();
    }
}
