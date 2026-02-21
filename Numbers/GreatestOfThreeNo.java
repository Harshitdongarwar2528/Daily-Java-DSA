package Numbers;
public class GreatestOfThreeNo {
    public static void main(String[] args) {
        double num1 = 8;
        double num2 = 2;
        double num3 = 3;

        if (num1 > num2 && num1 > num3) {
            System.out.println("The greatest of the three numbers is " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The greatest of the three numbers is " + num2);
        } else {
            System.out.println("The greatest of the three numbers is " + num3);
        }
    }
}
