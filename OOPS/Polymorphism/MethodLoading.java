package OOPS.Polymorphism;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class MethodLoading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("The Addition of two numbers is " + c.add(5, 5));
        System.out.println("The Sum of three numbers is " + c.add(5, 5, 5));
        System.out.println("The Addition of two deciamls is " + c.add(1.2, 2.6));
    }
}
