package OOPS.Inheritance;

class Animal {
    void mammals() {
        System.out.println("The animal is a mammal");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking");
    }
}

class Puppy extends Dog {
    void run() {
        System.out.println("The puppy is running");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.mammals();
        p.bark();
        p.run();
    }
}
