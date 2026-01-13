package OOPS.Polymorphism;

class Carnivore {
    void cub() {
        System.out.println("The tiger is roaring");
    }

}

class Tiger extends Carnivore {
    @Override
    void cub() {
        System.out.println("The cub is trying to roar ");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Carnivore C = new Tiger();
        C.cub();
    }
}
