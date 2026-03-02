class Persona {
    private int age; // private variable

    public void setAge(int age) { // public setter method
        this.age = age;
    }

    public int getAge() { // public getter method
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setAge(22);
        System.out.println("The age is " + p.getAge());
    }
}